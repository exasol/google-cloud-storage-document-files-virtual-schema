package com.exasol.adapter.document.files;

import static com.exasol.adapter.document.GenericUdfCallHandler.*;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

import org.jetbrains.annotations.NotNull;

import com.exasol.adapter.document.UdfEntryPoint;
import com.exasol.adapter.document.files.gcstestsetup.GcsTestSetup;
import com.exasol.bucketfs.Bucket;
import com.exasol.bucketfs.BucketAccessException;
import com.exasol.dbbuilder.dialects.DatabaseObject;
import com.exasol.dbbuilder.dialects.exasol.*;
import com.exasol.dbbuilder.dialects.exasol.udf.UdfScript;
import com.exasol.exasoltestsetup.ExasolTestSetup;
import com.exasol.udfdebugging.UdfTestSetup;

import jakarta.json.*;

public class IntegrationTestSetup implements AutoCloseable {
    private static final Logger LOG = Logger.getLogger(IntegrationTestSetup.class.getName());

    private static final String ADAPTER_JAR = "document-files-virtual-schema-dist-8.1.7-google-cloud-storage-2.1.5.jar";
    private final ExasolTestSetup exasolTestSetup;
    private final Connection connection;
    private final Statement statement;
    private final ExasolObjectFactory exasolObjectFactory;
    private final AdapterScript adapterScript;
    private final Bucket bucket;
    private final List<DatabaseObject> createdObjects = new LinkedList<>();
    private final GcsTestSetup gcsTestSetup;
    private final com.google.cloud.storage.Bucket gcsBucket;
    private final UdfTestSetup udfTestSetup;
    private ConnectionDefinition connectionDefinition;

    public IntegrationTestSetup(final ExasolTestSetup exasolTestSetup, final GcsTestSetup gcsTestSetup,
            final com.google.cloud.storage.Bucket gcsBucket)
            throws SQLException, BucketAccessException, TimeoutException, FileNotFoundException {
        this.exasolTestSetup = exasolTestSetup;
        this.gcsTestSetup = gcsTestSetup;
        this.gcsBucket = gcsBucket;
        this.connection = this.exasolTestSetup.createConnection();
        this.statement = this.connection.createStatement();
        this.statement.executeUpdate("ALTER SESSION SET QUERY_CACHE = 'OFF';");
        this.bucket = this.exasolTestSetup.getDefaultBucket();
        this.udfTestSetup = new UdfTestSetup(this.exasolTestSetup, this.connection);
        final List<String> jvmOptions = new ArrayList<>(Arrays.asList(this.udfTestSetup.getJvmOptions()));
        this.exasolObjectFactory = new ExasolObjectFactory(this.connection,
                ExasolObjectConfiguration.builder().withJvmOptions(jvmOptions.toArray(String[]::new)).build());
        final ExasolSchema adapterSchema = this.exasolObjectFactory.createSchema("ADAPTER");
        this.connectionDefinition = createConnectionDefinition();
        this.adapterScript = createAdapterScript(adapterSchema);
        createUdf(adapterSchema);
    }

    private static void createUdf(final ExasolSchema adapterSchema) {
        adapterSchema.createUdfBuilder("IMPORT_FROM_GOOGLE_CLOUD_STORAGE_DOCUMENT_FILES")
                .language(UdfScript.Language.JAVA).inputType(UdfScript.InputType.SET)
                .parameter(PARAMETER_DOCUMENT_FETCHER, "VARCHAR(2000000)")
                .parameter(PARAMETER_SCHEMA_MAPPING_REQUEST, "VARCHAR(2000000)")
                .parameter(PARAMETER_CONNECTION_NAME, "VARCHAR(500)").emits()
                .bucketFsContent(UdfEntryPoint.class.getName(), "/buckets/bfsdefault/default/" + ADAPTER_JAR).build();
    }

    private ConnectionDefinition createConnectionDefinition() {
        final JsonObjectBuilder configJson = getConnectionConfig();
        return createConnectionDefinition(configJson);
    }

    public ConnectionDefinition getConnectionDefinition() {
        return connectionDefinition;
    }

    public void setConnectionDefinition(final ConnectionDefinition connectionDefinition) {
        this.connectionDefinition = connectionDefinition;
    }

    public JsonObjectBuilder getConnectionConfig() {
        final byte[] json = this.gcsTestSetup.getKeyFileAsJson();
        final JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        final Optional<String> hostOverride = getHostOverride();
        hostOverride.ifPresent(s -> objectBuilder.add("gcHost", s));
        return objectBuilder//
                .add("gcsBucket", this.gcsBucket.getName())//
                .add("gcKey", readJson(json)).add("useSsl", this.gcsTestSetup.useSsl());
    }

    private JsonValue readJson(final byte[] json) {
        try (final ByteArrayInputStream inputStream = new ByteArrayInputStream(json);
                final JsonReader jsonReader = Json.createReader(inputStream);) {
            return jsonReader.readValue();
        } catch (final IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }

    public ConnectionDefinition createConnectionDefinition(final JsonObjectBuilder details) {
        final String json = toJson(details.build());
        LOG.info(() -> "Using connection definition " + json);
        return this.exasolObjectFactory.createConnectionDefinition("GCS_CONNECTION_" + System.currentTimeMillis(), "",
                "", json);
    }

    private String toJson(final JsonObject configJson) {
        try (final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                final JsonWriter writer = Json.createWriter(outputStream)) {
            writer.write(configJson);
            return outputStream.toString(StandardCharsets.UTF_8);
        } catch (final IOException exception) {
            throw new UncheckedIOException("Failed to serialize connection settings", exception);
        }
    }

    private Optional<String> getHostOverride() {
        return this.gcsTestSetup.getHostOverride().map(address -> {
            final InetSocketAddress newAddress = this.exasolTestSetup.makeTcpServiceAccessibleFromDatabase(address);
            return newAddress.getHostString() + ":" + newAddress.getPort();
        });
    }

    private AdapterScript createAdapterScript(final ExasolSchema adapterSchema)
            throws BucketAccessException, TimeoutException, FileNotFoundException {
        this.bucket.uploadFile(Path.of("target", ADAPTER_JAR), ADAPTER_JAR);
        return adapterSchema.createAdapterScriptBuilder("FILES_ADAPTER")
                .bucketFsContent("com.exasol.adapter.RequestDispatcher", "/buckets/bfsdefault/default/" + ADAPTER_JAR)
                .language(AdapterScript.Language.JAVA).build();
    }

    @Override
    public void close() {
        try {
            this.udfTestSetup.close();
            this.statement.close();
            this.connection.close();
            this.exasolTestSetup.close();
        } catch (final SQLException exception) {
            // at least we tried to close it
        }
    }

    public Statement getStatement() {
        return this.statement;
    }

    protected VirtualSchema createVirtualSchema(final String schemaName, final String mapping) {
        return createVirtualSchema(schemaName, mapping, this.connectionDefinition);
    }

    protected VirtualSchema createVirtualSchema(final String schemaName, final String mapping,
            final ConnectionDefinition connection) {
        final VirtualSchema virtualSchema = getPreconfiguredVirtualSchemaBuilder(schemaName)
                .connectionDefinition(connection)//
                .properties(getVirtualSchemaProperties(mapping)).build();
        this.createdObjects.add(virtualSchema);
        return virtualSchema;
    }

    @NotNull
    private Map<String, String> getVirtualSchemaProperties(final String mapping) {
        final Map<String, String> properties = new HashMap<>(Map.of("MAPPING", mapping));
        final String debugProperty = System.getProperty("test.debug", "");
        final String profileProperty = System.getProperty("test.jprofiler", "");
        if (!debugProperty.isBlank() || !profileProperty.isBlank()) {
            properties.put("MAX_PARALLEL_UDFS", "1");
        }
        properties.putAll(debugProperties());
        return properties;
    }

    private Map<String, String> debugProperties() {
        final String debugHost = System.getProperty("com.exasol.log.host", null);
        if (debugHost == null) {
            return Collections.emptyMap();
        }
        final String debugPort = System.getProperty("com.exasol.log.port", "3000");
        final String logLevel = System.getProperty("com.exasol.log.level", "ALL");
        final String address = debugHost + ":" + debugPort;
        return Map.of("DEBUG_ADDRESS", address, "LOG_LEVEL", logLevel);
    }

    public void dropCreatedObjects() {
        for (final DatabaseObject createdObject : this.createdObjects) {
            createdObject.drop();
        }
        this.createdObjects.clear();
    }

    public Bucket getBucket() {
        return this.bucket;
    }

    public ExasolObjectFactory getExasolObjectFactory() {
        return this.exasolObjectFactory;
    }

    public VirtualSchema.Builder getPreconfiguredVirtualSchemaBuilder(final String schemaName) {
        return this.exasolObjectFactory.createVirtualSchemaBuilder(schemaName)
                .connectionDefinition(this.connectionDefinition).adapterScript(this.adapterScript);
    }
}
