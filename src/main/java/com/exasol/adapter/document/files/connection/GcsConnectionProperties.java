package com.exasol.adapter.document.files.connection;

import lombok.Builder;
import lombok.Data;

/**
 * Connection properties for google-cloud-storage.
 */
@Data
@Builder
public class GcsConnectionProperties {
    @Builder.Default
    private final boolean useSsl = true;
    private final String gcHost;
    private final String gcsBucket;
    private final byte[] gcKey;

    /**
     * Get if this connection overrides the Google Cloud entrypoint.
     * 
     * @return {@code true} if hat has
     */
    public boolean hasHostOverride() {
        return this.gcHost != null && !this.gcHost.isBlank() && !this.gcHost.equals("amazonaws.com");
    }
}
