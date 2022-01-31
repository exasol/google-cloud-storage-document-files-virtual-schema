package com.exasol.adapter.document.files.connection;

import com.exasol.adapter.document.connection.ConnectionPropertiesReader;

public class GcsConnectionPropertiesReader {

    /**
     * Read the {@link GcsConnectionProperties} from file.
     * 
     * @param reader connection properties reader
     * @return read {@link GcsConnectionProperties}
     */
    public GcsConnectionProperties read(final ConnectionPropertiesReader reader) {
        return GcsConnectionProperties.builder()//
                .useSsl(reader.readBooleanWithDefault("useSsl", true))//
                .gcKey(reader.readRequiredJsonProperty("gcKey"))//
                .gcHost(reader.readString("gcHost").orElse(null))//
                .gcsBucket(reader.readRequiredString("gcsBucket"))//
                .build();
    }
}
