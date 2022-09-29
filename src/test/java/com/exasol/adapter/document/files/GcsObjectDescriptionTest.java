package com.exasol.adapter.document.files;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

class GcsObjectDescriptionTest {
    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(GcsObjectDescription.class).verify();
    }
}
