# Virtual Schema for Document Data in Files on Google Cloud Storage 3.1.0, released 2026-08-04

Code name: `TIMESTAMP` Precision Support

## Summary

This release adds support for `TIMESTAMP` precision. This means you can use `TIMESTAMP(0)` to `TIMESTAMP(9)` in your EDML mapping for all supported data types CSV, JSON and Parquet.

Please note that JSON files only support timestamps for number fields, interpreting the number as milliseconds since epoch. To enable this conversion, you need to set `notTimestampBehavior=CONVERT_OR_ABORT` for that column in the EDML definition file.

## Features

* #55: Added `TIMESTAMP` precision support

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:9.0.2` to `9.1.0`
* Updated `com.google.cloud:google-cloud-storage:2.70.0` to `2.71.0`

### Test Dependency Updates

* Updated `com.exasol:test-db-builder-java:4.0.1` to `4.0.2`
* Updated `com.exasol:virtual-schema-common-document-files:9.0.2` to `9.1.0`
