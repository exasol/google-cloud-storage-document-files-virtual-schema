package com.exasol.adapter.document.files.connection;

import java.util.Arrays;
import java.util.Objects;

/**
 * Connection properties for Google Cloud Storage.
 */
public final class GcsConnectionProperties {
    private final boolean useSsl;
    private final String gcHost;
    private final String gcsBucket;
    private final byte[] gcKey;

    private GcsConnectionProperties(final Builder builder) {
        this.useSsl = builder.useSsl;
        this.gcHost = builder.gcHost;
        this.gcsBucket = builder.gcsBucket;
        this.gcKey = builder.gcKey;
    }

    /**
     * Get if this connection overrides the Google Cloud entrypoint.
     *
     * @return {@code true} if it has override entrypoint
     */
    public boolean hasHostOverride() {
        return (this.gcHost != null) && !this.gcHost.isBlank();
    }

    public boolean isUseSsl() {
        return this.useSsl;
    }

    public String getGcHost() {
        return this.gcHost;
    }

    public String getGcsBucket() {
        return this.gcsBucket;
    }

    public byte[] getGcKey() {
        return this.gcKey;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + Arrays.hashCode(this.gcKey);
        result = (prime * result) + Objects.hash(this.gcHost, this.gcsBucket, this.useSsl);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GcsConnectionProperties other = (GcsConnectionProperties) obj;
        return Objects.equals(this.gcHost, other.gcHost) && Arrays.equals(this.gcKey, other.gcKey)
                && Objects.equals(this.gcsBucket, other.gcsBucket) && (this.useSsl == other.useSsl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private boolean useSsl = false;
        private String gcHost;
        private String gcsBucket;
        private byte[] gcKey;

        private Builder() {
        }

        public Builder useSsl(final boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public Builder gcHost(final String gcHost) {
            this.gcHost = gcHost;
            return this;
        }

        public Builder gcsBucket(final String gcsBucket) {
            this.gcsBucket = gcsBucket;
            return this;
        }

        public Builder gcKey(final byte[] gcKey) {
            this.gcKey = gcKey;
            return this;
        }

        public GcsConnectionProperties build() {
            return new GcsConnectionProperties(this);
        }
    }
}
