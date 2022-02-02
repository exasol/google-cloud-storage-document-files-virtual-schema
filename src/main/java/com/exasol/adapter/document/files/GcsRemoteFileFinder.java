package com.exasol.adapter.document.files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import com.exasol.adapter.document.documentfetcher.files.RemoteFile;
import com.exasol.adapter.document.documentfetcher.files.RemoteFileFinder;
import com.exasol.adapter.document.files.connection.GcsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.StringFilter;
import com.exasol.adapter.document.iterators.*;
import com.exasol.errorreporting.ExaError;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.NoCredentials;
import com.google.cloud.storage.*;

/**
 * File finder for files on Google Cloud Storage.
 */
public class GcsRemoteFileFinder implements RemoteFileFinder {
    private final StringFilter filePattern;
    private final Bucket bucket;

    /**
     * Create a new instance of {@link GcsRemoteFileFinder}.
     *
     * @param filePattern          pattern to search for
     * @param connectionProperties connection information
     */
    public GcsRemoteFileFinder(final StringFilter filePattern, final GcsConnectionProperties connectionProperties) {
        final Storage storage = buildGcsClient(connectionProperties);
        this.bucket = storage.get(connectionProperties.getGcsBucket());
        this.filePattern = filePattern;
    }

    private Storage buildGcsClient(final GcsConnectionProperties connectionProperties) {
        final Credentials googleCredentials = getCredentials(connectionProperties);
        final StorageOptions.Builder clientBuilder = StorageOptions.newBuilder().setCredentials(googleCredentials);
        if (connectionProperties.hasHostOverride()) {
            final String protocol = connectionProperties.isUseSsl() ? "https://" : "http://";
            clientBuilder.setHost(protocol + connectionProperties.getGcHost());
        }
        return clientBuilder.build().getService();
    }

    private Credentials getCredentials(final GcsConnectionProperties connectionProperties) {
        final byte[] gcKey = connectionProperties.getGcKey();
        if (Arrays.equals(gcKey, "null".getBytes(StandardCharsets.UTF_8))) {
            return NoCredentials.getInstance();
        } else {
            try (final ByteArrayInputStream inputStream = new ByteArrayInputStream(gcKey);) {
                return GoogleCredentials.fromStream(inputStream);
            } catch (final IOException exception) {
                throw new IllegalArgumentException(
                        ExaError.messageBuilder("E-VS-GCS-9").message("Failed to read Google key definition.")
                                .mitigation("Please check the value of gcKey.").toString(),
                        exception);
            }
        }
    }

    @SuppressWarnings("java:S2095") // executorServiceFactory is closed by CloseInjectIterator
    @Override
    public CloseableIterator<RemoteFile> loadFiles() {
        final com.exasol.adapter.document.files.stringfilter.matcher.Matcher filePatternMatcher = this.filePattern
                .getDirectoryIgnoringMatcher();
        final CloseableIterator<GcsObjectDescription> objectKeys = getQuickFilteredObjectKeys();
        final FilteringIterator<GcsObjectDescription> filteredObjectKeys = new FilteringIterator<>(objectKeys,
                s3Object -> filePatternMatcher.matches(s3Object.getName()));
        final ExecutorServiceFactory executorServiceFactory = new ExecutorServiceFactory();
        final CloseableIterator<RemoteFile> loadedFiles = new TransformingIterator<>(filteredObjectKeys,
                description -> this.loadFile(description, executorServiceFactory));
        return new CloseInjectIterator<>(loadedFiles, executorServiceFactory::close);
    }

    /**
     * Get a list of object keys.
     *
     * <p>
     * This method only applies the filters that can be applied on GCS. So you have to filter the output once again with
     * a more featured matcher.
     * </p>
     *
     * @return partially filtered list of object keys
     */
    private CloseableIterator<GcsObjectDescription> getQuickFilteredObjectKeys() {
        final String globFreeKey = this.filePattern.getStaticPrefix();
        final CloseableIterator<Blob> files = new CloseableIteratorWrapper<>(
                this.bucket.list(Storage.BlobListOption.prefix(globFreeKey)).iterateAll().iterator());
        return new TransformingIterator<>(files, file -> new GcsObjectDescription(file.getName(), file.getSize()));
    }

    private RemoteFile loadFile(final GcsObjectDescription fileDescription,
            final ExecutorServiceFactory executorServiceFactory) {
        return new RemoteFile(fileDescription.getName(), fileDescription.getSize(),
                new GcsRemoteFileContent(this.bucket, fileDescription, executorServiceFactory));
    }
}
