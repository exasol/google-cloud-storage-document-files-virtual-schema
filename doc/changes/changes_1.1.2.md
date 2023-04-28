# Virtual Schema for document data in files on Google Cloud Storage 1.1.2, released 2022-10-26

Code name: Dependency update

## Summary

Updated dependencies to fix vulnerabilities and renamed error code prefix from `VS-GCS` to `VSGCS`.

## Bug Fixes

* #21: Fixed vulnerabilities
  * [org.apache.hadoop:hadoop-common:jar:3.3.4](https://ossindex.sonatype.org/component/pkg:maven/org.apache.hadoop/hadoop-common@3.3.4?utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1) in compile
    * sonatype-2022-5820: 1 vulnerability (8.2)
  * [org.apache.hadoop:hadoop-hdfs-client:jar:3.3.4](https://ossindex.sonatype.org/component/pkg:maven/org.apache.hadoop/hadoop-hdfs-client@3.3.4?utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1) in compile
  * [org.apache.commons:commons-text:jar:1.9](https://ossindex.sonatype.org/component/pkg:maven/org.apache.commons/commons-text@1.9?utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1) in compile
    * sonatype-2022-5732: 1 vulnerability (8.6)
    * CVE-2022-42889, severity CWE-94: Improper Control of Generation of Code ('Code Injection') (9.8)
  * [com.google.protobuf:protobuf-java:jar:3.21.6](https://ossindex.sonatype.org/component/pkg:maven/com.google.protobuf/protobuf-java@3.21.6?utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1) in compile
    * CVE-2022-3171, severity CWE-400: Uncontrolled Resource Consumption ('Resource Exhaustion') (7.5)

## Refactoring

* #19: Renamed error codes from VS-GCS to VSGCS

## Dependency Updates

### Compile Dependency Updates

* Updated `com.google.cloud:google-cloud-storage:2.12.0` to `2.13.1`

### Test Dependency Updates

* Updated `com.exasol:test-db-builder-java:3.3.4` to `3.4.1`
* Added `org.apache.commons:commons-text:1.10.0`
* Updated `org.mockito:mockito-core:4.8.0` to `4.8.1`
* Updated `org.testcontainers:junit-jupiter:1.17.3` to `1.17.5`
* Updated `org.testcontainers:localstack:1.17.3` to `1.17.5`
