# Virtual Schema for Document Files in Google Cloud Storage

[![Build Status](https://github.com/exasol/google-cloud-storage-document-files-virtual-schema/actions/workflows/ci-build.yml/badge.svg)](https://github.com/exasol/google-cloud-storage-document-files-virtual-schema/actions/workflows/ci-build.yml)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)

[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=security_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=sqale_index)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=code_smells)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=coverage)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema&metric=ncloc)](https://sonarcloud.io/dashboard?id=com.exasol%3Agoogle-cloud-storage-document-files-virtual-schema)

This Virtual Schemas allows you to access document files stored in Google Cloud Storage like any regular Exasol table. For different file systems sources check the [files Virtual Schema][files-vs]

This Virtual Schema is built for and tested with the official Google Cloud Storage. Third-party API compatible products are expected to work as well. It is highly recommended to thoroughly test 3rd party products used in combination with Exasol, especially regarding sufficient google-cloud-storage API compatibility.

For supported document file formats, see [Files Virtual Schema][files-vs]

## Information for Users

* [User Guide](doc/user_guide/user_guide.md)
* [Changelog](doc/changes/changelog.md)

## Information for Developers

* [Dependencies](dependencies.md)
* [Developers Guide](doc/developers_guide/developers_guide.md)

[files-vs]: https://github.com/exasol/virtual-schema-common-document-files
