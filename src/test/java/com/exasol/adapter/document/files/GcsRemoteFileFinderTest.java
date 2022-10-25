package com.exasol.adapter.document.files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.exasol.adapter.document.files.connection.GcsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;

class GcsRemoteFileFinderTest {
    @Test
    void testInvalidGcKeyException() {
        final var connectionInformation = GcsConnectionProperties.builder().gcsBucket("my-bucket")
                .gcKey("{ invalid JSON".getBytes()).build();
        final WildcardExpression filter = WildcardExpression.fromGlob("*");
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new GcsRemoteFileFinder(filter, connectionInformation));
        assertThat(exception.getMessage(),
                equalTo("E-VSGCS-9: Failed to read Google key definition. Please check the value of gcKey."));
    }
}