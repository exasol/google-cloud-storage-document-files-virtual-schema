package com.exasol.adapter.document.files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import com.exasol.adapter.document.files.connection.GcsConnectionProperties;
import com.exasol.adapter.document.files.gcstestsetup.GcsTestSetup;
import com.exasol.adapter.document.files.gcstestsetup.OnlineGcsTestSetup;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;

@Tag("integration")
class GcsRemoteFileFinderOnlineIT {
    private static final GcsTestSetup TEST_SETUP = new OnlineGcsTestSetup();
    private static final String CONTENT_1 = "content-1";
    private static GcsConnectionProperties connectionInformation;
    private static TestBucket testBucket;

    @BeforeAll
    static void beforeAll() {
        testBucket = new TestBucket(TEST_SETUP);
        testBucket.getBucket().create("file-1.json", CONTENT_1.getBytes());
        connectionInformation = GcsConnectionProperties.builder().gcsBucket(testBucket.getBucket().getName())
                .gcKey(TEST_SETUP.getKeyFileAsJson()) //
                .gcHost(getHostOverride()) //
                .useSsl(TEST_SETUP.useSsl()).build();
    }

    private static String getHostOverride() {
        return TEST_SETUP.getHostOverride() //
                .map(address -> address.getHostString() + ":" + address.getPort()) //
                .orElse(null);
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

    private String readFirstLine(final InputStream stream) {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            return reader.readLine();
        } catch (final IOException exception) {
            throw new IllegalArgumentException("", exception);
        }
    }
}