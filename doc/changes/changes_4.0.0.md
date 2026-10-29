# Virtual Schema for Document Data in Files on Google Cloud Storage 4.0.0, released 2026-10-29

Code name: Fix vulnerabilities

## Summary

This release upgrades `virtual-schema-common-document-files` to version 10.0.1 and updates the Google Cloud Storage dependency chain, fixing known security vulnerabilities. Java 17 is now required to build and run this Virtual Schema.

Exasol 8 is no longer supported.

## Security

* #96: Fixed CVE-2026-19032 (unrestricted URI schemes) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`.
* #97: Fixed CVE-2026-68497 (unbounded allocation) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`.
* #99: Fixed CVE-2026-73334 (untrusted KMS URL) in `org.apache.parquet:parquet-hadoop:1.17.1`.
* #100: Fixed CVE-2026-86231 (certificate-revocation bypass) in `com.github.mwiede:jsch:2.28.4`.
* #101, #102, #103: Fixed CVE-2026-87795, CVE-2026-87823, and CVE-2026-89045 (native bounds and loop flaws) in `com.github.luben:zstd-jni:1.5.7-3`.
* #105, #106, #107, #131: Fixed CVE-2026-91776, CVE-2026-91777, CVE-2026-83557, and CVE-2026-110879 (deserialization resource exhaustion) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`.
* #108, #111, #112, #118, #119: Fixed CVE-2026-90559, CVE-2026-93451, CVE-2026-93452, CVE-2026-108104, and CVE-2026-108106 (native buffer and allocation flaws) in `org.xerial.snappy:snappy-java:1.1.10.7`.
* #109, #113, #114: Fixed CVE-2026-68498, CVE-2026-89407, and CVE-2026-89425 (parser resource exhaustion) in `com.fasterxml.jackson.core:jackson-core:2.22.1`.
* #116: Fixed CVE-2026-104880 (CSV interpretation conflict) in `de.siegmar:fastcsv:3.7.0`.
* #121, #122: Fixed CVE-2026-110262 and CVE-2026-110270 (bytecode memory exhaustion) in `org.ow2.asm:asm-commons:9.10.1`.
* #123, #124, #125, #126, #127, #128: Fixed CVE-2026-110257, CVE-2026-110258, CVE-2026-110259, CVE-2026-110260, CVE-2026-110261, and CVE-2026-110263 (crafted-bytecode denial of service) in `org.ow2.asm:asm:9.10.1`.
* #129: Fixed CVE-2026-102554 (unbounded deserialization allocation) in `com.google.guava:guava:33.6.0-jre`.

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `10.0.1`
* Updated `com.google.cloud:google-cloud-storage:2.71.0` to `2.76.0`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:3.0.0` to `3.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `com.exasol:udf-debugging-java:0.6.20` to `0.6.22`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `10.0.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5.2`
* Updated `org.jacoco:org.jacoco.agent:0.8.15` to `0.8.16`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.4` to `6.1.3`
* Updated `org.mockito:mockito-core:5.23.0` to `5.24.0`
* Added `org.objenesis:objenesis:3.6`
* Updated `org.slf4j:slf4j-jdk14:2.0.18` to `2.0.20`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.1.0` to `2.1.3`
* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.8.2`
* Updated `io.github.git-commit-id:git-commit-id-maven-plugin:10.0.0` to `10.0.1`
* Updated `org.apache.maven.plugins:maven-artifact-plugin:3.6.1` to `3.7.0`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.15.0` to `3.16.0`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.6` to `3.6.1`
* Updated `org.apache.maven.plugins:maven-install-plugin:3.1.4` to `3.2.0`
* Updated `org.apache.maven.plugins:maven-jar-plugin:3.5.0` to `3.5.1`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.6` to `3.6.1`
* Updated `org.apache.maven.plugins:maven-toolchains-plugin:3.2.0` to `3.3.0`
* Updated `org.codehaus.mojo:flatten-maven-plugin:1.7.3` to `1.8.0`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.21.0` to `2.23.0`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.15` to `0.8.16`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:5.7.0.6970` to `5.8.0.7211`
