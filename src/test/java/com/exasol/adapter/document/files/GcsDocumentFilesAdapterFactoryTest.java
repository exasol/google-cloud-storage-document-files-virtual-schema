package com.exasol.adapter.document.files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.jupiter.api.Test;

import com.exasol.adapter.VirtualSchemaAdapter;
import com.exasol.adapter.document.DocumentAdapter;

class GcsDocumentFilesAdapterFactoryTest {
    private static final GcsDocumentFilesAdapterFactory FACTORY = new GcsDocumentFilesAdapterFactory();

    @Test
    void createAdapterReturnsDocumentAdapter() {
        final VirtualSchemaAdapter adapter = FACTORY.createAdapter(null);

        assertThat(adapter, instanceOf(DocumentAdapter.class));
    }

    @Test
    void getAdapterVersionReturnsVersionCollectorResult() {
        // Version only available in built artifacts
        assertThat(FACTORY.getAdapterVersion(), equalTo("UNKNOWN"));
    }

    @Test
    void getAdapterNameReturnsAdapterName() {
        assertThat(FACTORY.getAdapterName(), equalTo(GcsDocumentFilesAdapterFactory.ADAPTER_NAME));
    }

    @Test
    void getAdapterProjectShortTagReturnsShortTag() {
        assertThat(FACTORY.getAdapterProjectShortTag(), equalTo("VSGCS"));
    }
}
