# Virtual Schema for document data in files on Google Cloud Storage 1.0.1, released 2022-??-??

Code name:

## Summary

The CVEs fixed in #10 did only affect test code and had no impact on the product.

## Bug Fixes

* #10: Upgraded dependencies to fix security issue in Postgres JDBC driver

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:6.0.0` to `6.0.2`
* Updated `com.fasterxml.jackson.core:jackson-core:2.13.1` to `2.13.2`
* Updated `com.google.cloud:google-cloud-storage:2.2.3` to `2.6.1`

### Test Dependency Updates

* Updated `com.exasol:test-db-builder-java:3.2.2` to `3.3.2`
* Updated `com.exasol:udf-debugging-java:0.5.0` to `0.6.0`
* Updated `com.exasol:virtual-schema-common-document-files:6.0.0` to `6.0.2`
* Updated `org.jacoco:org.jacoco.agent:0.8.7` to `0.8.8`
* Updated `org.jacoco:org.jacoco.core:0.8.7` to `0.8.8`
* Updated `org.mockito:mockito-core:4.1.0` to `4.5.1`
* Updated `org.testcontainers:junit-jupiter:1.16.2` to `1.17.1`
* Updated `org.testcontainers:localstack:1.16.2` to `1.17.1`
* Updated `org.yaml:snakeyaml:1.29` to `1.30`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:1.3.4` to `2.3.2`
* Updated `org.apache.maven.plugins:maven-dependency-plugin:2.8` to `3.2.0`
* Added `org.codehaus.mojo:flatten-maven-plugin:1.2.7`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.7` to `0.8.8`
* Added `org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184`
