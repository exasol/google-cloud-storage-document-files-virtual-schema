# Virtual Schema for Document Data in Files on Google Cloud Storage 2.1.0, released 2024-06-17

Code name: Configure column names for automatic mapping inference

## Summary

This release allows configuring the mapping of column names for the automatic mapping inference in Parquet and CSV files. Before, the virtual schema always converted source column names to `UPPER_SNAKE_CASE` to create the Exasol column names. This is now configurable with EDML property `autoInferenceColumnNames`. This property supports the following values:
* `CONVERT_TO_UPPER_SNAKE_CASE`: Convert column names to `UPPER_SNAKE_CASE` (default).
* `KEEP_ORIGINAL_NAME`: Do not convert column names, use column name from source.

See the [EDML user guide](https://github.com/exasol/virtual-schema-common-document/blob/main/doc/user_guide/edml_user_guide.md#column-name-conversion) for details.

## Features

* #58: Added option to keep original column name for auto inference

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:8.0.4` to `8.1.0`
* Updated `com.google.cloud:google-cloud-storage:2.36.1` to `2.40.0`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.2` to `2.1.4`
* Updated `com.exasol:udf-debugging-java:0.6.12` to `0.6.13`
* Updated `com.exasol:virtual-schema-common-document-files:8.0.4` to `8.1.0`
* Updated `org.mockito:mockito-core:5.11.0` to `5.12.0`
* Updated `org.testcontainers:junit-jupiter:1.19.7` to `1.19.8`
* Updated `org.testcontainers:localstack:1.19.7` to `1.19.8`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.3.2` to `4.3.3`
