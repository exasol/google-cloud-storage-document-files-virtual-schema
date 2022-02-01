package com.exasol.adapter.document.files;

import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStream;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStreamTestBase;
import com.exasol.adapter.document.files.gcstestsetup.GcsTestSetup;
import com.exasol.adapter.document.files.gcstestsetup.OnlineGcsTestSetup;
import com.google.cloud.storage.Blob;

class GcsRandomAccessInputStreamTest extends RandomAccessInputStreamTestBase {
    private static final String TEST_DATA_KEY = "TEST_DATA";
    long testDataLength;
    private GcsTestSetup testSetup;
    private TestBucket testBucket;
    private Blob blob;

    @Override
    protected void prepareTestSetup(final byte[] bytes) {
        this.testSetup = new OnlineGcsTestSetup();
        this.testBucket = new TestBucket(this.testSetup);
        this.testDataLength = bytes.length;
        this.blob = this.testBucket.getBucket().create(TEST_DATA_KEY, bytes);
    }

    @Override
    protected void cleanupTestSetup() {
        this.testBucket.close();
        this.testSetup.close();
    }

    @Override
    protected RandomAccessInputStream getSeekableInputStream() {
        return new GcsRandomAccessInputStream(this.blob, this.testDataLength);
    }
}