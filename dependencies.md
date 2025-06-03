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
| [Performance Test Recorder Java][25]             | [MIT License][26]                |
| [SLF4J JDK14 Provider][27]                       | [MIT][28]                        |
| [JaCoCo :: Agent][29]                            | [EPL-2.0][30]                    |

## Runtime Dependencies

| Dependency                    | License            |
| ----------------------------- | ------------------ |
| [Protocol Buffers [Core]][31] | [BSD-3-Clause][32] |

## Plugin Dependencies

| Dependency                                              | License                                     |
| ------------------------------------------------------- | ------------------------------------------- |
| [Apache Maven Clean Plugin][33]                         | [Apache-2.0][5]                             |
| [Apache Maven Install Plugin][34]                       | [Apache-2.0][5]                             |
| [Apache Maven Resources Plugin][35]                     | [Apache-2.0][5]                             |
| [Apache Maven Site Plugin][36]                          | [Apache-2.0][5]                             |
| [SonarQube Scanner for Maven][37]                       | [GNU LGPL 3][38]                            |
| [Apache Maven Toolchains Plugin][39]                    | [Apache-2.0][5]                             |
| [Apache Maven Compiler Plugin][40]                      | [Apache-2.0][5]                             |
| [Apache Maven Enforcer Plugin][41]                      | [Apache-2.0][5]                             |
| [Maven Flatten Plugin][42]                              | [Apache Software Licenese][5]               |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][43] | [ASL2][44]                                  |
| [Maven Surefire Plugin][45]                             | [Apache-2.0][5]                             |
| [Versions Maven Plugin][46]                             | [Apache License, Version 2.0][5]            |
| [duplicate-finder-maven-plugin Maven Mojo][47]          | [Apache License 2.0][48]                    |
| [Apache Maven Artifact Plugin][49]                      | [Apache-2.0][5]                             |
| [Project Keeper Maven plugin][50]                       | [The MIT License][51]                       |
| [Apache Maven Assembly Plugin][52]                      | [Apache-2.0][5]                             |
| [Apache Maven JAR Plugin][53]                           | [Apache-2.0][5]                             |
| [Artifact reference checker and unifier][54]            | [MIT License][55]                           |
| [Apache Maven Dependency Plugin][56]                    | [Apache-2.0][5]                             |
| [Maven Failsafe Plugin][57]                             | [Apache-2.0][5]                             |
| [JaCoCo :: Maven Plugin][58]                            | [EPL-2.0][30]                               |
| [Quality Summarizer Maven Plugin][59]                   | [MIT License][60]                           |
| [error-code-crawler-maven-plugin][61]                   | [MIT License][62]                           |
| [Git Commit Id Maven Plugin][63]                        | [GNU Lesser General Public License 3.0][64] |

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
[25]: https://github.com/exasol/performance-test-recorder-java/
[26]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[27]: http://www.slf4j.org
[28]: https://opensource.org/license/mit
[29]: https://www.eclemma.org/jacoco/index.html
[30]: https://www.eclipse.org/legal/epl-2.0/
[31]: https://developers.google.com/protocol-buffers/protobuf-java/
[32]: https://opensource.org/licenses/BSD-3-Clause
[33]: https://maven.apache.org/plugins/maven-clean-plugin/
[34]: https://maven.apache.org/plugins/maven-install-plugin/
[35]: https://maven.apache.org/plugins/maven-resources-plugin/
[36]: https://maven.apache.org/plugins/maven-site-plugin/
[37]: http://docs.sonarqube.org/display/PLUG/Plugin+Library/sonar-scanner-maven/sonar-maven-plugin
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
[49]: https://maven.apache.org/plugins/maven-artifact-plugin/
[50]: https://github.com/exasol/project-keeper/
[51]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[52]: https://maven.apache.org/plugins/maven-assembly-plugin/
[53]: https://maven.apache.org/plugins/maven-jar-plugin/
[54]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[55]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[56]: https://maven.apache.org/plugins/maven-dependency-plugin/
[57]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[58]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[59]: https://github.com/exasol/quality-summarizer-maven-plugin/
[60]: https://github.com/exasol/quality-summarizer-maven-plugin/blob/main/LICENSE
[61]: https://github.com/exasol/error-code-crawler-maven-plugin/
[62]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[63]: https://github.com/git-commit-id/git-commit-id-maven-plugin
[64]: http://www.gnu.org/licenses/lgpl-3.0.txt
