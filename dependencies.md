<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License          |
| ---------------------------------------------- | ---------------- |
| [Virtual Schema for document data in files][0] | [MIT License][1] |
| [error-reporting-java][2]                      | [MIT License][3] |
| [Google Cloud Storage][4]                      | [Apache-2.0][5]  |

## Test Dependencies

| Dependency                                       | License                          |
| ------------------------------------------------ | -------------------------------- |
| [Hamcrest][6]                                    | [BSD-3-Clause][7]                |
| [Virtual Schema for document data in files][0]   | [MIT License][1]                 |
| [JUnit Jupiter Params][8]                        | [Eclipse Public License v2.0][9] |
| [mockito-core][10]                               | [MIT][11]                        |
| [EqualsVerifier \| release normal jar][12]       | [Apache License, Version 2.0][5] |
| [Testcontainers :: JUnit Jupiter Extension][13]  | [MIT][14]                        |
| [Testcontainers wrapper for fake-gcs-server][15] | [Apache 2.0][16]                 |
| [Testcontainers :: Localstack][13]               | [MIT][14]                        |
| [Test Database Builder for Java][17]             | [MIT License][18]                |
| [udf-debugging-java][19]                         | [MIT License][20]                |
| [Matcher for SQL Result Sets][21]                | [MIT License][22]                |
| [exasol-test-setup-abstraction-java][23]         | [MIT License][24]                |
| [Test containers for Exasol on Docker][25]       | [MIT License][26]                |
| [BucketFS Java][27]                              | [MIT License][28]                |
| [Performance Test Recorder Java][29]             | [MIT License][30]                |
| [SLF4J JDK14 Provider][31]                       | [MIT License][32]                |
| [JaCoCo :: Agent][33]                            | [EPL-2.0][34]                    |

## Runtime Dependencies

| Dependency                    | License            |
| ----------------------------- | ------------------ |
| [Protocol Buffers [Core]][35] | [BSD-3-Clause][36] |

## Plugin Dependencies

| Dependency                                              | License                          |
| ------------------------------------------------------- | -------------------------------- |
| [SonarQube Scanner for Maven][37]                       | [GNU LGPL 3][38]                 |
| [Apache Maven Toolchains Plugin][39]                    | [Apache-2.0][5]                  |
| [Apache Maven Compiler Plugin][40]                      | [Apache-2.0][5]                  |
| [Apache Maven Enforcer Plugin][41]                      | [Apache-2.0][5]                  |
| [Maven Flatten Plugin][42]                              | [Apache Software Licenese][5]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][43] | [ASL2][44]                       |
| [Maven Surefire Plugin][45]                             | [Apache-2.0][5]                  |
| [Versions Maven Plugin][46]                             | [Apache License, Version 2.0][5] |
| [duplicate-finder-maven-plugin Maven Mojo][47]          | [Apache License 2.0][48]         |
| [Project Keeper Maven plugin][49]                       | [The MIT License][50]            |
| [Apache Maven Assembly Plugin][51]                      | [Apache-2.0][5]                  |
| [Apache Maven JAR Plugin][52]                           | [Apache-2.0][5]                  |
| [Artifact reference checker and unifier][53]            | [MIT License][54]                |
| [Apache Maven Dependency Plugin][55]                    | [Apache-2.0][5]                  |
| [Maven Failsafe Plugin][56]                             | [Apache-2.0][5]                  |
| [JaCoCo :: Maven Plugin][57]                            | [EPL-2.0][34]                    |
| [error-code-crawler-maven-plugin][58]                   | [MIT License][59]                |
| [Reproducible Build Maven Plugin][60]                   | [Apache 2.0][44]                 |

[0]: https://github.com/exasol/virtual-schema-common-document-files/
[1]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[2]: https://github.com/exasol/error-reporting-java/
[3]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[4]: https://github.com/googleapis/java-storage
[5]: https://www.apache.org/licenses/LICENSE-2.0.txt
[6]: http://hamcrest.org/JavaHamcrest/
[7]: https://raw.githubusercontent.com/hamcrest/JavaHamcrest/master/LICENSE
[8]: https://junit.org/junit5/
[9]: https://www.eclipse.org/legal/epl-v20.html
[10]: https://github.com/mockito/mockito
[11]: https://opensource.org/licenses/MIT
[12]: https://www.jqno.nl/equalsverifier
[13]: https://java.testcontainers.org
[14]: http://opensource.org/licenses/MIT
[15]: https://github.com/Aiven-Open/testcontainers-fake-gcs-server
[16]: http://www.apache.org/licenses/LICENSE-2.0
[17]: https://github.com/exasol/test-db-builder-java/
[18]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[19]: https://github.com/exasol/udf-debugging-java/
[20]: https://github.com/exasol/udf-debugging-java/blob/main/LICENSE
[21]: https://github.com/exasol/hamcrest-resultset-matcher/
[22]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[23]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[24]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[25]: https://github.com/exasol/exasol-testcontainers/
[26]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[27]: https://github.com/exasol/bucketfs-java/
[28]: https://github.com/exasol/bucketfs-java/blob/main/LICENSE
[29]: https://github.com/exasol/performance-test-recorder-java/
[30]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[31]: http://www.slf4j.org
[32]: http://www.opensource.org/licenses/mit-license.php
[33]: https://www.eclemma.org/jacoco/index.html
[34]: https://www.eclipse.org/legal/epl-2.0/
[35]: https://developers.google.com/protocol-buffers/protobuf-java/
[36]: https://opensource.org/licenses/BSD-3-Clause
[37]: http://sonarsource.github.io/sonar-scanner-maven/
[38]: http://www.gnu.org/licenses/lgpl.txt
[39]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[40]: https://maven.apache.org/plugins/maven-compiler-plugin/
[41]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[42]: https://www.mojohaus.org/flatten-maven-plugin/
[43]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[44]: http://www.apache.org/licenses/LICENSE-2.0.txt
[45]: https://maven.apache.org/surefire/maven-surefire-plugin/
[46]: https://www.mojohaus.org/versions/versions-maven-plugin/
[47]: https://basepom.github.io/duplicate-finder-maven-plugin
[48]: http://www.apache.org/licenses/LICENSE-2.0.html
[49]: https://github.com/exasol/project-keeper/
[50]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[51]: https://maven.apache.org/plugins/maven-assembly-plugin/
[52]: https://maven.apache.org/plugins/maven-jar-plugin/
[53]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[54]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[55]: https://maven.apache.org/plugins/maven-dependency-plugin/
[56]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[57]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[58]: https://github.com/exasol/error-code-crawler-maven-plugin/
[59]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[60]: http://zlika.github.io/reproducible-build-maven-plugin
