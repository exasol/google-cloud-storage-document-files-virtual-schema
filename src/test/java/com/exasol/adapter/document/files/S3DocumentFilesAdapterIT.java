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

import org.junit.jupiter.api.*;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.exasol.adapter.document.files.s3testsetup.GcsTestSetup;
import com.exasol.adapter.document.files.s3testsetup.OnlineGcsTestSetup;
import com.exasol.bucketfs.BucketAccessException;
import com.exasol.dbbuilder.dialects.DatabaseObjectException;
import com.exasol.dbbuilder.dialects.exasol.ConnectionDefinition;
import com.exasol.dbbuilder.dialects.exasol.VirtualSchema;

@Tag("integration")
@Testcontainers
class S3DocumentFilesAdapterIT extends AbstractDocumentFilesAdapterIT {
    private static final GcsTestSetup GCS_TEST_SETUP = new OnlineGcsTestSetup();
    private static final String CACHE_BUCKET_NAME = "persistent-s3-vs-test-file-cache";
    private static final String SMALL_JSON_FILES_FIXTURE_BUCKET = "persistent-small-json-files-test-fixture";
    private static IntegrationTestSetup SETUP;
    private static TestBucket testBucket;

    @BeforeAll
    static void beforeAll() throws Exception {
        testBucket = new TestBucket(GCS_TEST_SETUP);
        SETUP = new IntegrationTestSetup(GCS_TEST_SETUP, testBucket.getBucket());
    }

    @AfterAll
    static void afterAll() throws Exception {
        testBucket.close();
        SETUP.close();
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
                .createConnectionDefinition("EMPTY_S3_CONNECTION", "", "", "{");
        final VirtualSchema.Builder virtualSchemaBuilder = SETUP
                .getPreconfiguredVirtualSchemaBuilder("EMPTY_CONNECTION_SCHEMA").connectionDefinition(connection)
                .properties(Map.of("MAPPING", "/bfsdefault/default/mapping.json"));
        final DatabaseObjectException exception = assertThrows(DatabaseObjectException.class,
                virtualSchemaBuilder::build);
        assertThat(exception.getCause().getMessage(), containsString(
                "E-VSD-94: Invalid connection. The connection definition has a invalid syntax. Please check the user-guide at: https://github.com/exasol/s3-document-files-virtual-schema/blob/main/doc/user_guide/user_guide.md."));
    }

    // TODO add small JSON files test
}
