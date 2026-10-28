<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License          |
| ---------------------------------------------- | ---------------- |
| [Virtual Schema for document data in files][0] | [MIT License][1] |
| [error-reporting-java][2]                      | [MIT License][3] |
| [Google Cloud Storage][4]                      | [Apache-2.0][5]  |

## Test Dependencies

| Dependency                                       | License                           |
| ------------------------------------------------ | --------------------------------- |
| [Hamcrest][6]                                    | [BSD-3-Clause][7]                 |
| [Virtual Schema for document data in files][0]   | [MIT License][1]                  |
| [JUnit Jupiter Params][8]                        | [Eclipse Public License v2.0][9]  |
| [mockito-core][10]                               | [MIT][11]                         |
| [Objenesis][12]                                  | [Apache License, Version 2.0][13] |
| [EqualsVerifier \| release normal jar][14]       | [Apache License, Version 2.0][5]  |
| [Testcontainers wrapper for fake-gcs-server][15] | [Apache 2.0][16]                  |
| [Test Database Builder for Java][17]             | [MIT License][18]                 |
| [udf-debugging-java][19]                         | [MIT License][20]                 |
| [Matcher for SQL Result Sets][21]                | [MIT License][22]                 |
| [exasol-test-setup-abstraction-java][23]         | [MIT License][24]                 |
| [Performance Test Recorder Java][25]             | [MIT License][26]                 |
| [SLF4J JDK14 Provider][27]                       | [MIT][28]                         |
| [JaCoCo :: Agent][29]                            | [EPL-2.0][30]                     |

## Plugin Dependencies

| Dependency                                              | License                                        |
| ------------------------------------------------------- | ---------------------------------------------- |
| [SonarQube Scanner for Maven][31]                       | [GNU LGPL 3][32]                               |
| [Apache Maven Toolchains Plugin][33]                    | [Apache-2.0][5]                                |
| [Apache Maven Compiler Plugin][34]                      | [Apache-2.0][5]                                |
| [Apache Maven Enforcer Plugin][35]                      | [Apache-2.0][5]                                |
| [Maven Flatten Plugin][36]                              | [Apache Software License][5]                   |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][37] | [ASL2][13]                                     |
| [Maven Surefire Plugin][38]                             | [Apache-2.0][5]                                |
| [Versions Maven Plugin][39]                             | [Apache License, Version 2.0][5]               |
| [duplicate-finder-maven-plugin Maven Mojo][40]          | [Apache License 2.0][41]                       |
| [Apache Maven Artifact Plugin][42]                      | [Apache-2.0][5]                                |
| [Project Keeper Maven plugin][43]                       | [The MIT License][44]                          |
| [Apache Maven Assembly Plugin][45]                      | [Apache-2.0][5]                                |
| [Apache Maven JAR Plugin][46]                           | [Apache-2.0][5]                                |
| [Artifact reference checker and unifier][47]            | [MIT License][48]                              |
| [spdx-maven-plugin Maven Plugin][49]                    | [The Apache Software License, Version 2.0][13] |
| [Apache Maven Dependency Plugin][50]                    | [Apache-2.0][5]                                |
| [Maven Failsafe Plugin][51]                             | [Apache-2.0][5]                                |
| [JaCoCo :: Maven Plugin][52]                            | [EPL-2.0][30]                                  |
| [error-code-crawler-maven-plugin][53]                   | [MIT License][54]                              |
| [Git Commit Id Maven Plugin][55]                        | [GNU Lesser General Public License 3.0][56]    |
| [Apache Maven Clean Plugin][57]                         | [Apache-2.0][5]                                |
| [Apache Maven Resources Plugin][58]                     | [Apache-2.0][5]                                |
| [Apache Maven Install Plugin][59]                       | [Apache-2.0][5]                                |
| [Apache Maven Site Plugin][60]                          | [Apache-2.0][5]                                |

[0]: https://github.com/exasol/virtual-schema-common-document-files/
[1]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[2]: https://github.com/exasol/error-reporting-java/
[3]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[4]: https://github.com/googleapis/google-cloud-java
[5]: https://www.apache.org/licenses/LICENSE-2.0.txt
[6]: http://hamcrest.org/JavaHamcrest/
[7]: https://raw.githubusercontent.com/hamcrest/JavaHamcrest/master/LICENSE
[8]: https://junit.org/
[9]: https://www.eclipse.org/legal/epl-v20.html
[10]: https://github.com/mockito/mockito
[11]: https://opensource.org/licenses/MIT
[12]: https://objenesis.org/objenesis
[13]: http://www.apache.org/licenses/LICENSE-2.0.txt
[14]: https://www.jqno.nl/equalsverifier
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
[31]: https://docs.sonarsource.com/sonarqube-server/latest/extension-guide/developing-a-plugin/plugin-basics/sonar-scanner-maven/sonar-maven-plugin/
[32]: http://www.gnu.org/licenses/lgpl.txt
[33]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[34]: https://maven.apache.org/plugins/maven-compiler-plugin/
[35]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[36]: https://www.mojohaus.org/flatten-maven-plugin/
[37]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[38]: https://maven.apache.org/surefire/maven-surefire-plugin/
[39]: https://www.mojohaus.org/versions/versions-maven-plugin/
[40]: https://basepom.github.io/duplicate-finder-maven-plugin
[41]: http://www.apache.org/licenses/LICENSE-2.0.html
[42]: https://maven.apache.org/plugins/maven-artifact-plugin/
[43]: https://github.com/exasol/project-keeper/
[44]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[45]: https://maven.apache.org/plugins/maven-assembly-plugin/
[46]: https://maven.apache.org/plugins/maven-jar-plugin/
[47]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[48]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[49]: https://github.com/spdx/spdx-maven-plugin
[50]: https://maven.apache.org/plugins/maven-dependency-plugin/
[51]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[52]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[53]: https://github.com/exasol/error-code-crawler-maven-plugin/
[54]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[55]: https://github.com/git-commit-id/git-commit-id-maven-plugin
[56]: http://www.gnu.org/licenses/lgpl-3.0.txt
[57]: https://maven.apache.org/plugins/maven-clean-plugin/
[58]: https://maven.apache.org/plugins/maven-resources-plugin/
[59]: https://maven.apache.org/plugins/maven-install-plugin/
[60]: https://maven.apache.org/plugins/maven-site-plugin/
