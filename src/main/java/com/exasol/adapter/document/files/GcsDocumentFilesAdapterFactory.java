package com.exasol.adapter.document.files;

import com.exasol.adapter.AdapterFactory;
import com.exasol.adapter.VirtualSchemaAdapter;
import com.exasol.adapter.document.DocumentAdapter;
import com.exasol.logging.VersionCollector;

/**
 * Factory for the S3 virtual schema adapter.
 * 
 * <p>
 * This factory is loaded via a service loader (resources/services/com.exasol.adapter.AdapterFactory).
 * </p>
 */
public class GcsDocumentFilesAdapterFactory implements AdapterFactory {
    /** Name of the adapter */
    public static final String ADAPTER_NAME = "GOOGLE_CLOUD_STORAGE_DOCUMENT_FILES";

    @Override
    public VirtualSchemaAdapter createAdapter() {
        return new DocumentAdapter(new DocumentFilesAdapter(ADAPTER_NAME, new GcsFileFinderFactory()));
    }

    @Override
    public String getAdapterVersion() {
        final VersionCollector versionCollector = new VersionCollector(
                "META-INF/maven/com.exasol/google-cloud-storage-document-files-virtual-schema/pom.properties");
        return versionCollector.getVersionNumber();
    }

    @Override
    public String getAdapterName() {
        return ADAPTER_NAME;
    }
}
