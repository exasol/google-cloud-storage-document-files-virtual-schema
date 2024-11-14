# Virtual Schema for Document Data in Files on Google Cloud Storage 2.1.3, released 2024-??-??

Code name: Fixed vulnerability CVE-2024-47535 in io.netty:netty-common:jar:4.1.108.Final:compile

## Summary

This release fixes the following vulnerability:

### CVE-2024-47535 (CWE-400) in dependency `io.netty:netty-common:jar:4.1.108.Final:compile`
Netty is an asynchronous event-driven network application framework for rapid development of maintainable high performance protocol servers & clients. An unsafe reading of environment file could potentially cause a denial of service in Netty. When loaded on an Windows application, Netty attempts to load a file that does not exist. If an attacker creates such a large file, the Netty application crashes. This vulnerability is fixed in 4.1.115.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-47535?component-type=maven&component-name=io.netty%2Fnetty-common&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-47535
* https://github.com/advisories/GHSA-xq3w-v528-46rv

## Security

* #67: Fixed vulnerability CVE-2024-47535 in dependency `io.netty:netty-common:jar:4.1.108.Final:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:8.1.3` to `8.1.4`
* Updated `com.google.cloud:google-cloud-storage:2.43.0` to `2.44.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.4` to `2.1.5`
* Updated `com.exasol:test-db-builder-java:3.5.4` to `3.6.0`
* Updated `com.exasol:virtual-schema-common-document-files:8.1.3` to `8.1.4`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.16.2` to `3.17.3`
* Updated `org.junit.jupiter:junit-jupiter-params:5.11.0` to `5.11.3`
* Updated `org.mockito:mockito-core:5.13.0` to `5.14.2`
* Updated `org.testcontainers:junit-jupiter:1.20.1` to `1.20.3`
* Updated `org.testcontainers:localstack:1.20.1` to `1.20.3`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.3.3` to `4.4.0`
