<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License          |
| ---------------------------------------------- | ---------------- |
| [Virtual Schema for document data in files][0] | [MIT License][1] |
| [error-reporting-java][2]                      | [MIT License][3] |
| [Google Cloud Storage][4]                      | [Apache-2.0][5]  |

## Test Dependencies

| Dependency                                      | License                          |
| ----------------------------------------------- | -------------------------------- |
| [Hamcrest][6]                                   | [BSD-3-Clause][7]                |
| [Virtual Schema for document data in files][0]  | [MIT License][1]                 |
| [JUnit Jupiter Params][8]                       | [Eclipse Public License v2.0][9] |
| [mockito-core][10]                              | [MIT][11]                        |
| [EqualsVerifier \| release normal jar][12]      | [Apache License, Version 2.0][5] |
| [Testcontainers :: JUnit Jupiter Extension][13] | [MIT][14]                        |
| [Testcontainers :: Localstack][13]              | [MIT][14]                        |
| [Test Database Builder for Java][15]            | [MIT License][16]                |
| [udf-debugging-java][17]                        | [MIT License][18]                |
| [Matcher for SQL Result Sets][19]               | [MIT License][20]                |
| [exasol-test-setup-abstraction-java][21]        | [MIT License][22]                |
| [Test containers for Exasol on Docker][23]      | [MIT License][24]                |
| [BucketFS Java][25]                             | [MIT License][26]                |
| [Performance Test Recorder Java][27]            | [MIT License][28]                |
| [SLF4J JDK14 Provider][29]                      | [MIT License][30]                |
| [JaCoCo :: Agent][31]                           | [EPL-2.0][32]                    |

## Runtime Dependencies

| Dependency                    | License            |
| ----------------------------- | ------------------ |
| [Protocol Buffers [Core]][33] | [BSD-3-Clause][34] |

## Plugin Dependencies

| Dependency                                              | License                          |
| ------------------------------------------------------- | -------------------------------- |
| [SonarQube Scanner for Maven][35]                       | [GNU LGPL 3][36]                 |
| [Apache Maven Toolchains Plugin][37]                    | [Apache-2.0][5]                  |
| [Apache Maven Compiler Plugin][38]                      | [Apache-2.0][5]                  |
| [Apache Maven Enforcer Plugin][39]                      | [Apache-2.0][5]                  |
| [Maven Flatten Plugin][40]                              | [Apache Software Licenese][5]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][41] | [ASL2][42]                       |
| [Maven Surefire Plugin][43]                             | [Apache-2.0][5]                  |
| [Versions Maven Plugin][44]                             | [Apache License, Version 2.0][5] |
| [duplicate-finder-maven-plugin Maven Mojo][45]          | [Apache License 2.0][46]         |
| [Project Keeper Maven plugin][47]                       | [The MIT License][48]            |
| [Apache Maven Assembly Plugin][49]                      | [Apache-2.0][5]                  |
| [Apache Maven JAR Plugin][50]                           | [Apache-2.0][5]                  |
| [Artifact reference checker and unifier][51]            | [MIT License][52]                |
| [Apache Maven Dependency Plugin][53]                    | [Apache-2.0][5]                  |
| [Maven Failsafe Plugin][54]                             | [Apache-2.0][5]                  |
| [JaCoCo :: Maven Plugin][55]                            | [EPL-2.0][32]                    |
| [error-code-crawler-maven-plugin][56]                   | [MIT License][57]                |
| [Reproducible Build Maven Plugin][58]                   | [Apache 2.0][42]                 |

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
[15]: https://github.com/exasol/test-db-builder-java/
[16]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[17]: https://github.com/exasol/udf-debugging-java/
[18]: https://github.com/exasol/udf-debugging-java/blob/main/LICENSE
[19]: https://github.com/exasol/hamcrest-resultset-matcher/
[20]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[21]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[22]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[23]: https://github.com/exasol/exasol-testcontainers/
[24]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[25]: https://github.com/exasol/bucketfs-java/
[26]: https://github.com/exasol/bucketfs-java/blob/main/LICENSE
[27]: https://github.com/exasol/performance-test-recorder-java/
[28]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[29]: http://www.slf4j.org
[30]: http://www.opensource.org/licenses/mit-license.php
[31]: https://www.eclemma.org/jacoco/index.html
[32]: https://www.eclipse.org/legal/epl-2.0/
[33]: https://developers.google.com/protocol-buffers/protobuf-java/
[34]: https://opensource.org/licenses/BSD-3-Clause
[35]: http://sonarsource.github.io/sonar-scanner-maven/
[36]: http://www.gnu.org/licenses/lgpl.txt
[37]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[38]: https://maven.apache.org/plugins/maven-compiler-plugin/
[39]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[40]: https://www.mojohaus.org/flatten-maven-plugin/
[41]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[42]: http://www.apache.org/licenses/LICENSE-2.0.txt
[43]: https://maven.apache.org/surefire/maven-surefire-plugin/
[44]: https://www.mojohaus.org/versions/versions-maven-plugin/
[45]: https://basepom.github.io/duplicate-finder-maven-plugin
[46]: http://www.apache.org/licenses/LICENSE-2.0.html
[47]: https://github.com/exasol/project-keeper/
[48]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[49]: https://maven.apache.org/plugins/maven-assembly-plugin/
[50]: https://maven.apache.org/plugins/maven-jar-plugin/
[51]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[52]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[53]: https://maven.apache.org/plugins/maven-dependency-plugin/
[54]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[55]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[56]: https://github.com/exasol/error-code-crawler-maven-plugin/
[57]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[58]: http://zlika.github.io/reproducible-build-maven-plugin
