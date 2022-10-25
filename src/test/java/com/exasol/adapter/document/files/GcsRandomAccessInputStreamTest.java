package com.exasol.adapter.document.files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.UncheckedIOException;

import org.junit.jupiter.api.Test;

import com.google.cloud.ReadChannel;
import com.google.cloud.storage.Blob;

class GcsRandomAccessInputStreamTest {

    @Test
    void seekFailed() throws IOException {
        final ReadChannel reader = mock(ReadChannel.class);
        doThrow(new IOException()).when(reader).seek(anyLong());
        verifyException(reader, testee -> testee.seek(1));
    }

    @Test
    void readFailed() throws IOException {
        final ReadChannel reader = mock(ReadChannel.class);
        doThrow(new IOException()).when(reader).read(any());
        verifyException(reader, testee -> testee.read());
    }

    @Test
    void readWithArgsFailed() throws IOException {
        final ReadChannel reader = mock(ReadChannel.class);
        doThrow(new IOException()).when(reader).read(any());
        verifyException(reader, testee -> testee.read(new byte[100], 1, 1));
    }

    @Test
    void close() throws IOException {
        final ReadChannel reader = mock(ReadChannel.class);
        final Blob blob = mock(Blob.class);
        when(blob.reader()).thenReturn(reader);
        final GcsRandomAccessInputStream testee = new GcsRandomAccessInputStream(blob, 100);
        testee.close();
        verify(reader).close();
    }

    private void verifyException(final ReadChannel reader, final TestCase testcase) throws IOException {
        final Blob blob = mock(Blob.class);
        when(blob.reader()).thenReturn(reader);
        try (final GcsRandomAccessInputStream testee = new GcsRandomAccessInputStream(blob, 100)) {
            final Exception e = assertThrows(UncheckedIOException.class, () -> testcase.run(testee));
            assertThat(e.getMessage(), startsWith("F-VSGCS-8"));
        }
    }

    @FunctionalInterface
    interface TestCase {
        void run(GcsRandomAccessInputStream testee);
    }
}
