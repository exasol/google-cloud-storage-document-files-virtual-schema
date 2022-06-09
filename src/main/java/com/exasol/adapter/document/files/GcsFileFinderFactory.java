package com.exasol.adapter.document.files;

import com.exasol.adapter.document.connection.ConnectionPropertiesReader;
import com.exasol.adapter.document.documentfetcher.files.FileFinderFactory;
import com.exasol.adapter.document.documentfetcher.files.RemoteFileFinder;
import com.exasol.adapter.document.files.connection.GcsConnectionPropertiesReader;
import com.exasol.adapter.document.files.stringfilter.StringFilter;

/**
 * Factory for {@link GcsRemoteFileFinder}s.
 */
public class GcsFileFinderFactory implements FileFinderFactory {

    private static final long serialVersionUID = 4218381681812205674L;

    @Override
    public RemoteFileFinder getFinder(final StringFilter filePattern,
            final ConnectionPropertiesReader connectionInformation) {
        return new GcsRemoteFileFinder(filePattern, new GcsConnectionPropertiesReader().read(connectionInformation));
    }

    @Override
    public String getUserGuideUrl() {
        return GcsVsConstants.USER_GUIDE_URL;
    }
}
