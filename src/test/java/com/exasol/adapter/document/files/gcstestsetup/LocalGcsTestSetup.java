package com.exasol.adapter.document.files.gcstestsetup;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.logging.Logger;

import org.testcontainers.containers.GenericContainer;

import com.google.cloud.NoCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class LocalGcsTestSetup implements GcsTestSetup {
    private static final Logger LOG = Logger.getLogger(LocalGcsTestSetup.class.getName());
    private static final int PORT_IN_CONTAINER = 4443;
    private final GenericContainer<? extends GenericContainer<?>> container;
    private final InetSocketAddress address;

    public LocalGcsTestSetup() {
        this.container = new GenericContainer<>("fsouza/fake-gcs-server:1.34");
        this.container.addExposedPort(PORT_IN_CONTAINER);
        this.container.withCreateContainerCmdModifier(cmd -> cmd.withEntrypoint("/bin/fake-gcs-server", //
                "-scheme", "http", //
                "-port", String.valueOf(PORT_IN_CONTAINER)));
        this.container.start();
        this.address = new InetSocketAddress(this.container.getHost(), this.container.getMappedPort(PORT_IN_CONTAINER));
    }

    @Override
    public Storage getGcsClient() {
        final String gcsHost = "http://" + this.address.getHostString() + ":" + this.address.getPort();
        LOG.info(() -> "Connecting to GCS at " + gcsHost);
        return StorageOptions.newBuilder() //
                .setHost(gcsHost) //
                .setProjectId("test-project") //
                .setCredentials(NoCredentials.getInstance()) //
                .build() //
                .getService();
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
        return Optional.of(address);
    }
}
