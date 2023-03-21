package com.exasol.adapter.document.files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.exasol.adapter.document.files.connection.GcsConnectionProperties;
import com.exasol.adapter.document.files.gcstestsetup.GcsTestSetup;
import com.exasol.adapter.document.files.gcstestsetup.LocalGcsTestSetup;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;

@Tag("integration")
class GcsRemoteFileFinderIT {
    private static final GcsTestSetup TEST_SETUP = new LocalGcsTestSetup();
    private static final String CONTENT_1 = "content-1";
    private static final String CONTENT_2 = "content-2";
    private static final String CONTENT_OTHER = "other";
    private static GcsConnectionProperties connectionInformation;
    private static TestBucket testBucket;

    @BeforeAll
    static void beforeAll() {
        testBucket = new TestBucket(TEST_SETUP);
        testBucket.getBucket().create("file-1.json", CONTENT_1.getBytes());
        testBucket.getBucket().create("file-2.json", CONTENT_2.getBytes());
        testBucket.getBucket().create("other.json", CONTENT_OTHER.getBytes());
        connectionInformation = GcsConnectionProperties.builder().gcsBucket(testBucket.getBucket().getName())
                .gcKey(TEST_SETUP.getKeyFileAsJson())
                .gcHost(TEST_SETUP.getHostOverride().map(InetSocketAddress::toString).orElse(null))
                .useSsl(TEST_SETUP.useSsl()).build();
    }

    @AfterAll
    static void afterAll() {
        testBucket.close();
    }

    @Test
    void testReadFile() {
        final GcsRemoteFileFinder gcsFileLoader = new GcsRemoteFileFinder(
                WildcardExpression.forNonWildcardString("file-1.json"), connectionInformation);
        assertThat(runAndGetFirstLines(gcsFileLoader), containsInAnyOrder(CONTENT_1));
    }

    private List<String> runAndGetFirstLines(final GcsRemoteFileFinder gcsFileLoader) {
        final List<String> result = new ArrayList<>();
        gcsFileLoader.loadFiles()
                .forEachRemaining(file -> result.add(readFirstLine(file.getContent().getInputStream())));
        return result;
    }

    @CsvSource({ //
            "file-*.json", //
            "file*.json", //
            "file-?.json" //
    })
    @ParameterizedTest
    void testReadFilesWithWildcard(final String fileGlob) {
        final WildcardExpression filePattern = WildcardExpression.fromGlob(fileGlob);
        final GcsRemoteFileFinder gcsFileLoader = new GcsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(gcsFileLoader), containsInAnyOrder(CONTENT_1, CONTENT_2));
    }

    @Test
    void testReadAllFiles() {
        final WildcardExpression filePattern = WildcardExpression.fromGlob("*");
        final GcsRemoteFileFinder gcsRemoteFileFinder = new GcsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(gcsRemoteFileFinder), containsInAnyOrder(CONTENT_1, CONTENT_2, CONTENT_OTHER));
    }

    private String readFirstLine(final InputStream stream) {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            return reader.readLine();
        } catch (final IOException exception) {
            throw new IllegalArgumentException("", exception);
        }
    }
}