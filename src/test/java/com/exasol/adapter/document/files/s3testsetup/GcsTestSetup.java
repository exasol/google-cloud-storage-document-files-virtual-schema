package com.exasol.adapter.document.files.s3testsetup;

import java.util.Optional;

import com.google.cloud.storage.Storage;

public interface GcsTestSetup extends AutoCloseable {
    Storage getGcsClient();

    byte[] getKeyFile();

    @Override
    void close();

    Optional<String> getHostOverride();
}
