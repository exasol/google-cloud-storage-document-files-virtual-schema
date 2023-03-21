package com.exasol.adapter.document.files.gcstestsetup;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Optional;

import org.testcontainers.containers.GenericContainer;

import com.google.cloud.NoCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class LocalGcsTestSetup implements GcsTestSetup {
    private static final int PORT_IN_CONTAINER = 4443;
    private final GenericContainer<? extends GenericContainer<?>> container;
    private final String host;
    private final int port;

    public LocalGcsTestSetup() {
        this.container = new GenericContainer<>("fsouza/fake-gcs-server:1.34");
        this.container.addExposedPort(PORT_IN_CONTAINER);
        this.container
                .withCreateContainerCmdModifier(cmd -> cmd.withEntrypoint("/bin/fake-gcs-server", "-scheme", "http"));
        this.container.start();
        this.port = Objects.requireNonNull(this.container.getMappedPort(PORT_IN_CONTAINER));
        this.host = this.container.getHost();
    }

    @Override
    public Storage getGcsClient() {
        return StorageOptions.newBuilder().setHost("http://" + this.host).setProjectId("test-project")
                .setCredentials(NoCredentials.getInstance()).build().getService();
    }

    @Override
    public byte[] getKeyFileAsJson() {
        final String json = "null";
        return json.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public void close() {
        this.container.stop();
    }

    @Override
    public boolean useSsl() {
        return false;
    }

    @Override
    public Optional<InetSocketAddress> getHostOverride() {
        return Optional.of(new InetSocketAddress(this.host, this.port));
    }
}
