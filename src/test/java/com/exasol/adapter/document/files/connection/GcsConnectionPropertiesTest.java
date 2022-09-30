package com.exasol.adapter.document.files.connection;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

class GcsConnectionPropertiesTest {
    @Test
    void test() {
        EqualsVerifier.forClass(GcsConnectionProperties.class).verify();
    }
}
