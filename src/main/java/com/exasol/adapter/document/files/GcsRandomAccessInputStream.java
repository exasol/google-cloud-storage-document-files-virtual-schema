package com.exasol.adapter.document.files;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStream;
import com.exasol.errorreporting.ExaError;
import com.google.cloud.ReadChannel;
import com.google.cloud.storage.Blob;

/** {@link RandomAccessInputStream} wrapper for {@link ReadChannel}. */
class GcsRandomAccessInputStream extends RandomAccessInputStream {
    private static final Logger LOGGER = Logger.getLogger(GcsRandomAccessInputStream.class.getName());
    private final ReadChannel reader;
    private final long fileSize;
    long position = 0;

    /**
     * Create a new instance of {@link GcsRandomAccessInputStream}.
     * 
     * @param blob     blog
     * @param fileSize file size in bytes
     */
    GcsRandomAccessInputStream(final Blob blob, final long fileSize) {
        this.reader = blob.reader();
        this.fileSize = fileSize;
    }

    @Override
    public void seek(final long position) {
        LOGGER.log(Level.INFO, "Seeked to position {}", position);
        this.position = position;
        try {
            this.reader.seek(position);
        } catch (final IOException exception) {
            throw getReadFailedException(exception);
        }
    }

    private UncheckedIOException getReadFailedException(final IOException exception) {
        return new UncheckedIOException(
                ExaError.messageBuilder("F-VS-GCS-8").message("Failed to read from Google Cloud Storage.").toString(),
                exception);
    }

    @Override
    public long getPos() {
        return this.position;
    }

    @Override
    public long getLength() {
        return this.fileSize;
    }

    @Override
    public int read() {
        LOGGER.info("Performing single read at position.");
        if (this.position < getLength()) {
            final byte[] data = new byte[1];
            try {
                this.reader.read(ByteBuffer.wrap(data, 0, 1));
            } catch (final IOException exception) {
                throw getReadFailedException(exception);
            }
            this.position++;
            return data[0] & 0xFF;
        } else {
            return -1;
        }
    }

    @Override
    public int read(final byte[] targetBuffer, final int offset, final int length) {
        LOGGER.log(Level.INFO, "read length: {}", length);
        if (length == 0) {
            return 0;
        }
        final long remainingBytesInFile = getLength() - this.position;
        final int actualReadLength = (int) Math.min(length, remainingBytesInFile);
        if (actualReadLength > 0) {
            try {
                this.reader.read(ByteBuffer.wrap(targetBuffer, offset, actualReadLength));
            } catch (final IOException exception) {
                throw getReadFailedException(exception);
            }
            this.position += actualReadLength;
        }
        return actualReadLength == 0 ? -1 : actualReadLength;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.reader.close();
    }
}
