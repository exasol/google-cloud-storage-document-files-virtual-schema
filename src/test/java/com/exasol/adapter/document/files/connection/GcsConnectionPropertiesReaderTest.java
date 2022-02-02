package com.exasol.adapter.document.files.connection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.exasol.adapter.document.connection.ConnectionPropertiesReader;

class GcsConnectionPropertiesReaderTest {
    @Test
    void testReadOnlyRequired() {
        final GcsConnectionProperties properties = runReader(
                "{\"gcKey\": {\"type\": \"service_account\"}, \"gcsBucket\": \"my-bucket\" }");
        assertAll(//
                () -> assertThat(new String(properties.getGcKey()), equalTo("{\"type\":\"service_account\"}")),
                () -> assertThat(properties.getGcsBucket(), equalTo("my-bucket")),
                () -> assertThat(properties.getGcHost(), equalTo(null)),
                () -> assertThat(properties.isUseSsl(), equalTo(true)));
    }

    private GcsConnectionProperties runReader(final String json) {
        return new GcsConnectionPropertiesReader().read(new ConnectionPropertiesReader(json, ""));
    }

    @Test
    void testReadAll() {
        final GcsConnectionProperties properties = runReader(
                "{\"gcKey\": {\"type\": \"service_account\"}, \"gcsBucket\": \"my-bucket\", "
                        + "\"gcHost\": \"gcs.my-company.com\", \"useSsl\": false }");
        assertAll(() -> assertThat(properties.getGcsBucket(), equalTo("my-bucket")),
                () -> assertThat(properties.getGcHost(), equalTo("gcs.my-company.com")),
                () -> assertThat(properties.isUseSsl(), equalTo(false)));
    }

    @Test
    void testMissingRequired() {
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> runReader("{ }"));
        assertThat(exception.getMessage(), startsWith(
                "E-VSD-93: Invalid connection. The connection definition does not specify the required property 'gcKey'. Please check the user-guide at:"));
    }
}