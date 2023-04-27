# Virtual Schema for document data in files on Google Cloud Storage 1.1.1, released 2022-09-30

Code name: Fix vulnerabilities in dependencies

## Summary

This release fixes the following vulnerabilities in dependencies:

* ch.qos.reload4j:reload4j:jar:1.2.18.3:compile
  * sonatype-2022-5401
+ org.scala-lang:scala-library:jar:2.13.8:compile
  * CVE-2022-36944
* org.yaml:snakeyaml:jar:1.30:test
  * CVE-2022-25857
  * CVE-2022-38749
  * CVE-2022-38751
  * CVE-2022-38752
  * CVE-2022-38750

## Features

* #17: Fixed vulnerabilities in dependencies

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:error-reporting-java:0.4.1` to `1.0.0`
* Updated `com.exasol:virtual-schema-common-document-files:7.1.0` to `7.1.1`
* Updated `com.fasterxml.jackson.core:jackson-core:2.13.3` to `2.13.4`
* Updated `com.google.cloud:google-cloud-storage:2.8.0` to `2.12.0`

### Test Dependency Updates

* Updated `com.exasol:hamcrest-resultset-matcher:1.5.1` to `1.5.2`
* Updated `com.exasol:performance-test-recorder-java:0.1.0` to `0.1.1`
* Updated `com.exasol:test-db-builder-java:3.3.3` to `3.3.4`
* Updated `com.exasol:virtual-schema-common-document-files:7.1.0` to `7.1.1`
* Added `nl.jqno.equalsverifier:equalsverifier:3.10.1`
* Updated `org.junit.jupiter:junit-jupiter-engine:5.8.2` to `5.9.1`
* Updated `org.junit.jupiter:junit-jupiter-params:5.8.2` to `5.9.1`
* Updated `org.mockito:mockito-core:4.6.1` to `4.8.0`
* Updated `org.testcontainers:junit-jupiter:1.17.2` to `1.17.3`
* Updated `org.testcontainers:localstack:1.17.2` to `1.17.3`
* Removed `org.yaml:snakeyaml:1.30`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:1.1.1` to `1.1.2`
* Updated `com.exasol:project-keeper-maven-plugin:2.4.6` to `2.8.0`
* Updated `org.apache.maven.plugins:maven-enforcer-plugin:3.0.0` to `3.1.0`
* Removed `org.projectlombok:lombok-maven-plugin:1.18.20.0`
