package com.exasol.adapter.document.files;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;

import org.junit.jupiter.api.*;

import com.exasol.adapter.document.documentfetcher.files.RemoteFileContent;
import com.exasol.adapter.document.files.gcstestsetup.GcsTestSetup;
import com.exasol.adapter.document.files.gcstestsetup.LocalGcsTestSetup;

class GcsRemoteFileContentTest {
    private static final String TEST_DATA_VALUE = "test content";
    private static final String TEST_DATA_KEY = "TEST_DATA";
    private static GcsTestSetup testSetup;
    private static RemoteFileContent remoteFileContent;
    private static TestBucket testBucket;
    private static ExecutorServiceFactory executorServiceFactory;

    @BeforeAll
    static void beforeAll() {
        testSetup = new LocalGcsTestSetup();
        testBucket = new TestBucket(testSetup);
        testBucket.getBucket().create(TEST_DATA_KEY, TEST_DATA_VALUE.getBytes());
        executorServiceFactory = new ExecutorServiceFactory();
        remoteFileContent = new GcsRemoteFileContent(testBucket.getBucket(),
                new GcsObjectDescription(TEST_DATA_KEY, TEST_DATA_VALUE.length()), executorServiceFactory);
    }

    @AfterAll
    static void afterAll() throws Exception {
        executorServiceFactory.close();
        testBucket.close();
        testSetup.close();
    }

    @Test
    void testGetInputStream() throws IOException {
        assertThat(remoteFileContent.getInputStream().readAllBytes(),
                equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testGetRandomAccessInputStream() throws IOException {
        assertThat(remoteFileContent.getRandomAccessInputStream().readAllBytes(),
                equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testLoadAsync() throws ExecutionException, InterruptedException {
        final byte[] byteArray = remoteFileContent.loadAsync().get();
        assertThat(byteArray, equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testLoadAsyncWithTimeout() throws ExecutionException, InterruptedException, TimeoutException {
        final byte[] byteArray = remoteFileContent.loadAsync().get(10, TimeUnit.SECONDS);
        assertThat(byteArray, equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testCancelAsyncLoading() {
        final Future<byte[]> future = remoteFileContent.loadAsync();
        future.cancel(true);
        assertTrue(future.isCancelled());
    }
}