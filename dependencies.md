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

## Plugin Dependencies

| Dependency                                              | License                                     |
| ------------------------------------------------------- | ------------------------------------------- |
| [Apache Maven Clean Plugin][31]                         | [Apache-2.0][5]                             |
| [Apache Maven Install Plugin][32]                       | [Apache-2.0][5]                             |
| [Apache Maven Resources Plugin][33]                     | [Apache-2.0][5]                             |
| [Apache Maven Site Plugin][34]                          | [Apache-2.0][5]                             |
| [SonarQube Scanner for Maven][35]                       | [GNU LGPL 3][36]                            |
| [Apache Maven Toolchains Plugin][37]                    | [Apache-2.0][5]                             |
| [Apache Maven Compiler Plugin][38]                      | [Apache-2.0][5]                             |
| [Apache Maven Enforcer Plugin][39]                      | [Apache-2.0][5]                             |
| [Maven Flatten Plugin][40]                              | [Apache Software Licenese][5]               |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][41] | [ASL2][42]                                  |
| [Maven Surefire Plugin][43]                             | [Apache-2.0][5]                             |
| [Versions Maven Plugin][44]                             | [Apache License, Version 2.0][5]            |
| [duplicate-finder-maven-plugin Maven Mojo][45]          | [Apache License 2.0][46]                    |
| [Apache Maven Artifact Plugin][47]                      | [Apache-2.0][5]                             |
| [Project Keeper Maven plugin][48]                       | [The MIT License][49]                       |
| [Apache Maven Assembly Plugin][50]                      | [Apache-2.0][5]                             |
| [Apache Maven JAR Plugin][51]                           | [Apache-2.0][5]                             |
| [Artifact reference checker and unifier][52]            | [MIT License][53]                           |
| [Apache Maven Dependency Plugin][54]                    | [Apache-2.0][5]                             |
| [Maven Failsafe Plugin][55]                             | [Apache-2.0][5]                             |
| [JaCoCo :: Maven Plugin][56]                            | [EPL-2.0][30]                               |
| [Quality Summarizer Maven Plugin][57]                   | [MIT License][58]                           |
| [error-code-crawler-maven-plugin][59]                   | [MIT License][60]                           |
| [Git Commit Id Maven Plugin][61]                        | [GNU Lesser General Public License 3.0][62] |

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
[31]: https://maven.apache.org/plugins/maven-clean-plugin/
[32]: https://maven.apache.org/plugins/maven-install-plugin/
[33]: https://maven.apache.org/plugins/maven-resources-plugin/
[34]: https://maven.apache.org/plugins/maven-site-plugin/
[35]: http://docs.sonarqube.org/display/PLUG/Plugin+Library/sonar-scanner-maven/sonar-maven-plugin
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
[47]: https://maven.apache.org/plugins/maven-artifact-plugin/
[48]: https://github.com/exasol/project-keeper/
[49]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[50]: https://maven.apache.org/plugins/maven-assembly-plugin/
[51]: https://maven.apache.org/plugins/maven-jar-plugin/
[52]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[53]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[54]: https://maven.apache.org/plugins/maven-dependency-plugin/
[55]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[56]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[57]: https://github.com/exasol/quality-summarizer-maven-plugin/
[58]: https://github.com/exasol/quality-summarizer-maven-plugin/blob/main/LICENSE
[59]: https://github.com/exasol/error-code-crawler-maven-plugin/
[60]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[61]: https://github.com/git-commit-id/git-commit-id-maven-plugin
[62]: http://www.gnu.org/licenses/lgpl-3.0.txt
