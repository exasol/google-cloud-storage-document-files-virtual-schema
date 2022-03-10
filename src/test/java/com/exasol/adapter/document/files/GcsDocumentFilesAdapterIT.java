package com.exasol.adapter.document.files;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.*;
import java.nio.file.*;
import java.sql.Statement;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.exasol.adapter.document.files.gcstestsetup.*;
import com.exasol.bucketfs.BucketAccessException;
import com.exasol.dbbuilder.dialects.DatabaseObjectException;
import com.exasol.dbbuilder.dialects.exasol.ConnectionDefinition;
import com.exasol.dbbuilder.dialects.exasol.VirtualSchema;
import com.exasol.exasoltestsetup.ExasolTestSetup;
import com.exasol.exasoltestsetup.ExasolTestSetupFactory;
import com.exasol.exasoltestsetup.testcontainers.ExasolTestcontainerTestSetup;

@Tag("integration")
@Testcontainers
class GcsDocumentFilesAdapterIT extends AbstractDocumentFilesAdapterIT {
    private static IntegrationTestSetup SETUP;
    private static TestBucket testBucket;
    private static GcsTestSetup gcsTestSetup;

    @BeforeAll
    static void beforeAll() throws Exception {
        final ExasolTestSetup exasolTestSetup = new ExasolTestSetupFactory(
                Path.of("cloudSetup/generated/testConfig.json")).getTestSetup();
        gcsTestSetup = getGcsTestSetup(exasolTestSetup);
        testBucket = new TestBucket(gcsTestSetup);
        SETUP = new IntegrationTestSetup(exasolTestSetup, gcsTestSetup, testBucket.getBucket());
    }

    @NotNull
    private static GcsTestSetup getGcsTestSetup(final ExasolTestSetup exasolTestSetup) {
        if (exasolTestSetup instanceof ExasolTestcontainerTestSetup) {
            return new LocalGcsTestSetup();
        } else {
            return new OnlineGcsTestSetup();
        }
    }

    @AfterAll
    static void afterAll() throws Exception {
        testBucket.close();
        SETUP.close();
        gcsTestSetup.close();
    }

    @AfterEach
    void after() {
        testBucket.empty();
        SETUP.dropCreatedObjects();
    }

    @Override
    protected Statement getStatement() {
        return SETUP.getStatement();
    }

    @Override
    protected void uploadDataFile(final Supplier<InputStream> fileContent, final String fileName) {
        try (final InputStream inputStream = fileContent.get()) {
            final Path tempFile = Files.createTempFile("data-file", ".data");
            Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
            uploadDataFile(tempFile, fileName);
            Files.delete(tempFile);
        } catch (final IOException exception) {
            throw new IllegalStateException("Filed to upload test file.", exception);
        }
    }

    @Override
    protected void uploadDataFile(final Path fileContent, final String fileName) {
        try (final FileInputStream fileInputStream = new FileInputStream(fileContent.toFile())) {
            testBucket.getBucket().create(fileName, fileInputStream);
        } catch (final IOException exception) {
            throw new IllegalStateException("Failed to read test-file", exception);
        }
    }

    @Override
    protected void createVirtualSchema(final String schemaName, final String mapping) {
        SETUP.createVirtualSchema(schemaName, mapping);
    }

    @Test
    void testInvalidConnection() throws BucketAccessException, TimeoutException {
        SETUP.getBucket().uploadInputStream(() -> getClass().getClassLoader().getResourceAsStream("simpleMapping.json"),
                "mapping.json");
        final ConnectionDefinition connection = SETUP.getExasolObjectFactory()
                .createConnectionDefinition("EMPTY_GCS_CONNECTION", "", "", "{");
        final VirtualSchema.Builder virtualSchemaBuilder = SETUP
                .getPreconfiguredVirtualSchemaBuilder("EMPTY_CONNECTION_SCHEMA").connectionDefinition(connection)
                .properties(Map.of("MAPPING", "/bfsdefault/default/mapping.json"));
        final DatabaseObjectException exception = assertThrows(DatabaseObjectException.class,
                virtualSchemaBuilder::build);
        assertThat(exception.getCause().getMessage(), containsString(
                "E-VSD-94: Invalid connection. The connection definition has a invalid syntax. Please check the user-guide at: https://github.com/exasol/google-cloud-storage-document-files-virtual-schema/blob/main/doc/user_guide/user_guide.md."));
    }
}
