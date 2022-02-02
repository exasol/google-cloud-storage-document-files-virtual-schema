package com.exasol.adapter.document.files.gcstestsetup;

import java.util.Optional;

import com.google.cloud.storage.Storage;

public interface GcsTestSetup extends AutoCloseable {
    Storage getGcsClient();

    byte[] getKeyFile();

    @Override
    void close();

    boolean useSsl();

    Optional<String> getHostOverride();
}
