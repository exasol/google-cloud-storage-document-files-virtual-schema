# Virtual Schema for Document Data in Files on Google Cloud Storage 1.3.2, released 2023-07-04

Code name: Update dependencies on top of 1.3.1

## Summary

This release fixes vulnerabilities in the following dependencies:

* `org.xerial.snappy:snappy-java` (compile dependency)
  * CVE-2023-34453, severity CWE-190: Integer Overflow or Wraparound (7.5)
  * CVE-2023-34454, severity CWE-190: Integer Overflow or Wraparound (7.5)
  * CVE-2023-34455, severity CWE-770: Allocation of Resources Without Limits or Throttling (7.5)
* `com.google.guava:guava:jar:31.1-jre` (compile dependency)
  * CVE-2023-2976, severity CWE-552: Files or Directories Accessible to External Parties (7.1)
* `io.netty:netty-handler` (test dependency)
  * CVE-2023-34462, severity CWE-770: Allocation of Resources Without Limits or Throttling (6.5)

## Security

* #35: Updated dependencies

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:7.3.2` to `7.3.3`
* Updated `com.google.cloud:google-cloud-storage:2.22.1` to `2.23.0`
* Added `com.google.guava:guava:32.1.1-jre`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.0.1` to `2.0.2`
* Updated `com.exasol:udf-debugging-java:0.6.8` to `0.6.9`
* Updated `com.exasol:virtual-schema-common-document-files:7.3.2` to `7.3.3`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.14.1` to `3.14.3`
* Updated `org.mockito:mockito-core:5.3.1` to `5.4.0`
* Updated `org.testcontainers:junit-jupiter:1.18.0` to `1.18.3`
* Updated `org.testcontainers:localstack:1.18.0` to `1.18.3`
