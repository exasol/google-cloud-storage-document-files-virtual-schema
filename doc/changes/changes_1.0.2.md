# Virtual Schema for document data in files on Google Cloud Storage 1.0.2, released 2022-??-??

Code name: Upgrade dependencies on 1.0.1

## Summary

This release upgrades dependencies and adapts the collection of regression tests results.

## Refactoring

* #14: Adapted to new regression test result database

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:7.0.1` to `7.0.2`
* Updated `com.fasterxml.jackson.core:jackson-core:2.13.2` to `2.13.3`
* Updated `com.google.cloud:google-cloud-storage:2.6.1` to `2.8.0`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:0.3.1` to `0.3.2`
* Updated `com.exasol:virtual-schema-common-document-files:7.0.1` to `7.0.2`
* Removed `junit:junit:4.13.2`
* Updated `org.mockito:mockito-core:4.5.1` to `4.6.1`
* Updated `org.testcontainers:junit-jupiter:1.17.1` to `1.17.2`
* Updated `org.testcontainers:localstack:1.17.1` to `1.17.2`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:1.1.0` to `1.1.1`
* Updated `com.exasol:project-keeper-maven-plugin:2.3.2` to `2.4.6`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.9.0` to `3.10.1`
* Updated `org.apache.maven.plugins:maven-dependency-plugin:3.2.0` to `3.3.0`
* Updated `org.apache.maven.plugins:maven-jar-plugin:3.2.0` to `3.2.2`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.8.1` to `2.10.0`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.7` to `0.8.8`
* Updated `org.sonatype.ossindex.maven:ossindex-maven-plugin:3.1.0` to `3.2.0`
