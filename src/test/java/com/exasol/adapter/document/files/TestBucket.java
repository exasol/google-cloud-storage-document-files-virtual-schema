package com.exasol.adapter.document.files;

import com.exasol.adapter.document.files.gcstestsetup.GcsTestSetup;
import com.google.cloud.storage.*;

public class TestBucket implements AutoCloseable {

    private final Bucket bucket;

    public TestBucket(final GcsTestSetup testSetup) {
        final String bucketName = "gcs-document-vs-test-" + System.currentTimeMillis();
        final Storage gcsClient = testSetup.getGcsClient();
        this.bucket = gcsClient.create(BucketInfo.newBuilder(bucketName).build());
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void empty() {
        for (final Blob file : this.bucket.list().iterateAll()) {
            file.delete();
        }
    }

    @Override
    public void close() {
        empty();
        this.bucket.delete();
    }
}
