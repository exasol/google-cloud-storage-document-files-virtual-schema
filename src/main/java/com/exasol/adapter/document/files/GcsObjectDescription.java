package com.exasol.adapter.document.files;

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
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + (int) (this.size ^ (this.size >>> 32));
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
        final GcsObjectDescription other = (GcsObjectDescription) obj;
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        return true;
    }
}
