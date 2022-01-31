package com.exasol.adapter.document.files;

import java.io.InputStream;
import java.nio.channels.Channels;
import java.util.concurrent.Future;

import com.exasol.adapter.document.documentfetcher.files.RemoteFileContent;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStream;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStreamCache;
import com.google.cloud.ReadChannel;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;

/**
 * {@link RemoteFileContent} for google-cloud-storage.
 */
class GcsRemoteFileContent implements RemoteFileContent {
    /** Exception message used by S3 if there were too many API requests. */
    private static final int SIZE_1_MB = 1000000;
    private final Bucket bucket;
    private final GcsObjectDescription fileToRead;
    private final ExecutorServiceFactory executorServiceFactory;

    /**
     * Create a new instance of {@link GcsRemoteFileContent}.
     * 
     * @param bucket     GCS client for the bucket
     * @param fileToRead file to read
     */
    public GcsRemoteFileContent(final Bucket bucket, final GcsObjectDescription fileToRead,
            final ExecutorServiceFactory executorServiceFactory) {
        this.bucket = bucket;
        this.fileToRead = fileToRead;
        this.executorServiceFactory = executorServiceFactory;
    }

    @Override
    public InputStream getInputStream() {
        final ReadChannel reader = getFile().reader();
        return Channels.newInputStream(reader);
    }

    private Blob getFile() {
        return this.bucket.get(this.fileToRead.getName());
    }

    @Override
    public RandomAccessInputStream getRandomAccessInputStream() {
        return new RandomAccessInputStreamCache(new GcsRandomAccessInputStream(getFile(), this.fileToRead.getSize()),
                SIZE_1_MB);
    }

    @Override
    public Future<byte[]> loadAsync() {
        return this.executorServiceFactory.getExecutorService().submit(() -> getFile().getContent());
    }
}
