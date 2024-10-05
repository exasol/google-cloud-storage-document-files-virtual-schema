# Virtual Schema for Document Data in Files on Google Cloud Storage 2.1.3, released 2024-??-??

Code name: Fixed vulnerability CVE-2024-47561 in org.apache.avro:avro:jar:1.11.3:compile

## Summary

This release fixes the following vulnerability:

### CVE-2024-47561 (CWE-502) in dependency `org.apache.avro:avro:jar:1.11.3:compile`
Schema parsing in the Java SDK of Apache Avro 1.11.3 and previous versions allows bad actors to execute arbitrary code.
Users are recommended to upgrade to version 1.11.4Â  or 1.12.0, which fix this issue.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-47561?component-type=maven&component-name=org.apache.avro%2Favro&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-47561
* https://lists.apache.org/thread/c2v7mhqnmq0jmbwxqq3r5jbj1xg43h5x

## Security

* #65: Fixed vulnerability CVE-2024-47561 in dependency `org.apache.avro:avro:jar:1.11.3:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.google.cloud:google-cloud-storage:2.43.0` to `2.43.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.4` to `2.1.5`
* Updated `com.exasol:test-db-builder-java:3.5.4` to `3.6.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.16.2` to `3.17.1`
* Updated `org.junit.jupiter:junit-jupiter-params:5.11.0` to `5.11.2`
* Updated `org.mockito:mockito-core:5.13.0` to `5.14.1`
* Updated `org.testcontainers:junit-jupiter:1.20.1` to `1.20.2`
* Updated `org.testcontainers:localstack:1.20.1` to `1.20.2`
