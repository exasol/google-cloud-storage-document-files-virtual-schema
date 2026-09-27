# Virtual Schema for Document Data in Files on Google Cloud Storage 3.1.1, released 2026-??-??

Code name: Fixed vulnerabilities CVE-2026-93451, CVE-2026-93452, CVE-2026-89407, CVE-2026-89425

## Summary

This release fixes the following 4 vulnerabilities:

### CVE-2026-93451 (CWE-787) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.7:compile`
snappy-java through 1.1.10.8 contains a buffer overflow vulnerability in typed Snappy.uncompress*Array methods that allocate output arrays by dividing uncompressed length by element size but pass the undivided length to native code. Attackers controlling compressed input can cause misaligned length values to write past array bounds with attacker-controlled bytes, corrupting heap memory.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-93451?component-type=maven&component-name=org.xerial.snappy%2Fsnappy-java&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-93451
* https://github.com/xerial/snappy-java/issues/729

### CVE-2026-93452 (CWE-787) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.7:compile`
snappy-java through 1.1.10.8 contains a buffer overflow vulnerability in Snappy.compress(ByteBuffer, ByteBuffer) that writes past the end of the destination buffer. Attackers can supply incompressible data that exceeds the destination buffer's remaining capacity, corrupting off-heap memory and causing JVM termination.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-93452?component-type=maven&component-name=org.xerial.snappy%2Fsnappy-java&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-93452
* https://github.com/xerial/snappy-java/issues/732

### CVE-2026-89407 (CWE-1333) in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:compile`
NumberInput.looksLikeValidNumber() in FasterXML jackson-core pre-validates "stringified numbers" with two regular expressions: PATTERN_FLOAT ([+-]?[0-9]*[\.]?[0-9]+([eE][+-]?[0-9]+)?), present since 2.17.0, and PATTERN_FLOAT_TRAILING_DOT, added in 2.17.2. PATTERN_FLOAT places adjacent quantifiers over the same character class -- an optional [0-9]* run, an optional dot, then a required [0-9]+ run -- so input that ultimately fails to match forces Java's backtracking engine to retry every possible split point of the digit run.Â 

Matching cost therefore grows with the square of the input length.Â 

An attacker who can supply JSON that an application deserializes into a numeric target type reaches this method through jackson-databind's default String-to-number coercion (StdDeserializer and NumberDeserializers for BigDecimal, BigInteger, Double and Float).Â 

Because StreamReadConstraints.maxStringLength defaults to 20,000,000 characters, no constraint bounds the input before it reaches the regex.Â 

Testing by the reporter confirmed O(n^2) growth across five consecutive input-size doublings, with a single 160,000-character string consuming roughly 74 seconds in one call; a small number of concurrent requests of ordinary body size can therefore exhaust a server's request-handling thread pool.Â 

The affected method does not exist before 2.17.0, so 2.16.x and earlier releases are not affected.Â 

The fix replaces both regular expressions with a hand-rolled single-pass scan.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-89407?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-core&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-89407
* https://github.com/FasterXML/jackson-core/security/advisories/GHSA-p6pp-m3f8-5c89

### CVE-2026-89425 (CWE-400) in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:compile`
UTF8DataInputJsonParser._reportInvalidToken() in FasterXML jackson-core builds the offending-token text for its error message by appending Java identifier characters to a StringBuilder in a loop that has no upper bound. Unlike the three sibling parser implementations, including UTF8StreamJsonParser, it never consults ErrorReportConfiguration.getMaxErrorTokenLength() (default 256). A malformed token supplied to a parser created through JsonFactory.createParser(DataInput) is therefore accumulated in full. No StreamReadConstraints setting mitigates this: maxDocumentLength cannot be applied to DataInput sources at all, and maxStringLength does not cover this path because the accumulation bypasses ReadConstrainedTextBuffer. The reporter measured a 20,000,109-character exception message from a 20-million-character malformed token on the DataInput path, against 367 characters for identical input on the InputStream path. Scaling the payload drives the StringBuilder, which also incurs byte-to-char expansion and internal array doubling, to many times the raw payload size and can trigger OutOfMemoryError for the whole JVM. UTF8DataInputJsonParser was introduced in 2.8.0 together with createParser(DataInput); releases before 2.8.0 do not contain the affected class.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-89425?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-core&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-89425
* https://github.com/FasterXML/jackson-core/security/advisories/GHSA-7hhh-6rmp-j9qf

## Security

* #111: Fixed vulnerability CVE-2026-93451 in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.7:compile`
* #112: Fixed vulnerability CVE-2026-93452 in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.7:compile`
* #113: Fixed vulnerability CVE-2026-89407 in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:compile`
* #114: Fixed vulnerability CVE-2026-89425 in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `9.1.1`
* Updated `com.google.cloud:google-cloud-storage:2.71.0` to `2.74.0`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:3.0.0` to `3.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `9.1.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5.2`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.4` to `6.1.3`
* Updated `org.mockito:mockito-core:5.23.0` to `5.24.0`
* Updated `org.slf4j:slf4j-jdk14:2.0.18` to `2.0.20`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.7.6`
