# Virtual Schema for Document Data in Files on Google Cloud Storage 2.0.2, released 2024-04-09

Code name: Fix CVE-2024-29025, CVE-2024-29133 & CVE-2024-29131 in dependencies

## Summary

This release fixed vulnerabilities CVE-2024-29025, CVE-2024-29133 & CVE-2024-29131 in dependencies.

## Security

* #49: Fixed CVE-2024-29025 in `io.netty:netty-codec-http:jar:4.1.107.Final:test`
* #48: Fixed CVE-2024-29133 in `org.apache.commons:commons-configuration2:jar:2.8.0:compile`
* #47: Fixed CVE-2024-29131 in `org.apache.commons:commons-configuration2:jar:2.8.0:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.google.cloud:google-cloud-storage:2.35.0` to `2.36.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.1` to `2.1.2`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.15.8` to `3.16.1`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.0.1` to `2.0.2`
* Updated `com.exasol:project-keeper-maven-plugin:4.2.0` to `4.3.0`
* Updated `org.apache.maven.plugins:maven-assembly-plugin:3.6.0` to `3.7.1`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.12.1` to `3.13.0`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.11` to `0.8.12`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:3.10.0.2594` to `3.11.0.3922`
