# Virtual Schema for Document Data in Files on Google Cloud Storage 2.1.2, released 2024-??-??

Code name: Fixed vulnerability CVE-2024-7254 in com.google.protobuf:protobuf-java:jar:3.25.3:compile

## Summary

This release fixes the following vulnerability:

### CVE-2024-7254 (CWE-20) in dependency `com.google.protobuf:protobuf-java:jar:3.25.3:compile`
Any project that parses untrusted Protocol Buffers dataÂ containing an arbitrary number of nested groups / series of SGROUPÂ tags can corrupted by exceeding the stack limit i.e. StackOverflow. Parsing nested groups as unknown fields with DiscardUnknownFieldsParser or Java Protobuf Lite parser, or against Protobuf map fields, creates unbounded recursions that can be abused by an attacker.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-7254?component-type=maven&component-name=com.google.protobuf%2Fprotobuf-java&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-7254
* https://github.com/advisories/GHSA-735f-pc8j-v9w8

## Security

* #63: Fixed vulnerability CVE-2024-7254 in dependency `com.google.protobuf:protobuf-java:jar:3.25.3:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.google.cloud:google-cloud-storage:2.40.1` to `2.43.0`

### Test Dependency Updates

* Updated `com.exasol:hamcrest-resultset-matcher:1.6.5` to `1.7.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.16.1` to `3.16.2`
* Updated `org.hamcrest:hamcrest:2.2` to `3.0`
* Updated `org.junit.jupiter:junit-jupiter-params:5.10.3` to `5.11.0`
* Updated `org.mockito:mockito-core:5.12.0` to `5.13.0`
* Updated `org.slf4j:slf4j-jdk14:2.0.13` to `2.0.16`
* Updated `org.testcontainers:junit-jupiter:1.20.0` to `1.20.1`
* Updated `org.testcontainers:localstack:1.20.0` to `1.20.1`
