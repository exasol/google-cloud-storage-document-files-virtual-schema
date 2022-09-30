package com.exasol.adapter.document.files;

import java.util.Objects;

/**
 * This class represents a reference to a GCS object.
 */
final class GcsObjectDescription {
    private final String name;
    private final long size;

    public GcsObjectDescription(final String name, final long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.size);
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
        final GcsObjectDescription other = (GcsObjectDescription) obj;
        return Objects.equals(this.name, other.name) && (this.size == other.size);
    }
}
