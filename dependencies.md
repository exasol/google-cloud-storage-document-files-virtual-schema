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
| [Performance Test Recorder Java][23]            | [MIT License][24]                |
| [SLF4J JDK14 Provider][25]                      | [MIT License][26]                |
| [JaCoCo :: Agent][27]                           | [EPL-2.0][28]                    |

## Runtime Dependencies

| Dependency                    | License            |
| ----------------------------- | ------------------ |
| [Protocol Buffers [Core]][29] | [BSD-3-Clause][30] |

## Plugin Dependencies

| Dependency                                              | License                          |
| ------------------------------------------------------- | -------------------------------- |
| [SonarQube Scanner for Maven][31]                       | [GNU LGPL 3][32]                 |
| [Apache Maven Toolchains Plugin][33]                    | [Apache-2.0][5]                  |
| [Apache Maven Compiler Plugin][34]                      | [Apache-2.0][5]                  |
| [Apache Maven Enforcer Plugin][35]                      | [Apache-2.0][5]                  |
| [Maven Flatten Plugin][36]                              | [Apache Software Licenese][5]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][37] | [ASL2][38]                       |
| [Maven Surefire Plugin][39]                             | [Apache-2.0][5]                  |
| [Versions Maven Plugin][40]                             | [Apache License, Version 2.0][5] |
| [duplicate-finder-maven-plugin Maven Mojo][41]          | [Apache License 2.0][42]         |
| [Project Keeper Maven plugin][43]                       | [The MIT License][44]            |
| [Apache Maven Assembly Plugin][45]                      | [Apache-2.0][5]                  |
| [Apache Maven JAR Plugin][46]                           | [Apache-2.0][5]                  |
| [Artifact reference checker and unifier][47]            | [MIT License][48]                |
| [Apache Maven Dependency Plugin][49]                    | [Apache-2.0][5]                  |
| [Maven Failsafe Plugin][50]                             | [Apache-2.0][5]                  |
| [JaCoCo :: Maven Plugin][51]                            | [EPL-2.0][28]                    |
| [error-code-crawler-maven-plugin][52]                   | [MIT License][53]                |
| [Reproducible Build Maven Plugin][54]                   | [Apache 2.0][38]                 |

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
[23]: https://github.com/exasol/performance-test-recorder-java/
[24]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[25]: http://www.slf4j.org
[26]: http://www.opensource.org/licenses/mit-license.php
[27]: https://www.eclemma.org/jacoco/index.html
[28]: https://www.eclipse.org/legal/epl-2.0/
[29]: https://developers.google.com/protocol-buffers/protobuf-java/
[30]: https://opensource.org/licenses/BSD-3-Clause
[31]: http://sonarsource.github.io/sonar-scanner-maven/
[32]: http://www.gnu.org/licenses/lgpl.txt
[33]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[34]: https://maven.apache.org/plugins/maven-compiler-plugin/
[35]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[36]: https://www.mojohaus.org/flatten-maven-plugin/
[37]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[38]: http://www.apache.org/licenses/LICENSE-2.0.txt
[39]: https://maven.apache.org/surefire/maven-surefire-plugin/
[40]: https://www.mojohaus.org/versions/versions-maven-plugin/
[41]: https://basepom.github.io/duplicate-finder-maven-plugin
[42]: http://www.apache.org/licenses/LICENSE-2.0.html
[43]: https://github.com/exasol/project-keeper/
[44]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[45]: https://maven.apache.org/plugins/maven-assembly-plugin/
[46]: https://maven.apache.org/plugins/maven-jar-plugin/
[47]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[48]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[49]: https://maven.apache.org/plugins/maven-dependency-plugin/
[50]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[51]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[52]: https://github.com/exasol/error-code-crawler-maven-plugin/
[53]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[54]: http://zlika.github.io/reproducible-build-maven-plugin
