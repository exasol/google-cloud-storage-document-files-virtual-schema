<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License                          |
| ---------------------------------------------- | -------------------------------- |
| [Virtual Schema for document data in files][0] | [MIT License][1]                 |
| [error-reporting-java][2]                      | [MIT License][3]                 |
| [Google Cloud Storage][4]                      | [Apache-2.0][5]                  |
| [Guava: Google Core Libraries for Java][6]     | [Apache License, Version 2.0][7] |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][8]                                   | [BSD License 3][9]                |
| [Virtual Schema for document data in files][0]  | [MIT License][1]                  |
| [JUnit Jupiter Params][10]                      | [Eclipse Public License v2.0][11] |
| [mockito-core][12]                              | [The MIT License][13]             |
| [EqualsVerifier \| release normal jar][14]      | [Apache License, Version 2.0][5]  |
| [Testcontainers :: JUnit Jupiter Extension][15] | [MIT][16]                         |
| [Testcontainers :: Localstack][15]              | [MIT][16]                         |
| [Test Database Builder for Java][17]            | [MIT License][18]                 |
| [udf-debugging-java][19]                        | [MIT License][20]                 |
| [Matcher for SQL Result Sets][21]               | [MIT License][22]                 |
| [exasol-test-setup-abstraction-java][23]        | [MIT License][24]                 |
| [Performance Test Recorder Java][25]            | [MIT License][26]                 |
| [JaCoCo :: Agent][27]                           | [Eclipse Public License 2.0][28]  |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][29]                       | [GNU LGPL 3][30]                              |
| [Apache Maven Compiler Plugin][31]                      | [Apache-2.0][5]                               |
| [Apache Maven Enforcer Plugin][32]                      | [Apache-2.0][5]                               |
| [Maven Flatten Plugin][33]                              | [Apache Software Licenese][5]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][34] | [ASL2][7]                                     |
| [Maven Surefire Plugin][35]                             | [Apache-2.0][5]                               |
| [Versions Maven Plugin][36]                             | [Apache License, Version 2.0][5]              |
| [duplicate-finder-maven-plugin Maven Mojo][37]          | [Apache License 2.0][38]                      |
| [Project keeper maven plugin][39]                       | [The MIT License][40]                         |
| [Apache Maven Assembly Plugin][41]                      | [Apache-2.0][5]                               |
| [Apache Maven JAR Plugin][42]                           | [Apache License, Version 2.0][5]              |
| [Artifact reference checker and unifier][43]            | [MIT License][44]                             |
| [Apache Maven Dependency Plugin][45]                    | [Apache-2.0][5]                               |
| [Maven Failsafe Plugin][46]                             | [Apache-2.0][5]                               |
| [JaCoCo :: Maven Plugin][47]                            | [Eclipse Public License 2.0][28]              |
| [error-code-crawler-maven-plugin][48]                   | [MIT License][49]                             |
| [Reproducible Build Maven Plugin][50]                   | [Apache 2.0][7]                               |
| [Maven Clean Plugin][51]                                | [The Apache Software License, Version 2.0][7] |
| [Maven Resources Plugin][52]                            | [The Apache Software License, Version 2.0][7] |
| [Maven Install Plugin][53]                              | [The Apache Software License, Version 2.0][7] |
| [Maven Deploy Plugin][54]                               | [The Apache Software License, Version 2.0][7] |
| [Maven Site Plugin 3][55]                               | [The Apache Software License, Version 2.0][7] |

[0]: https://github.com/exasol/virtual-schema-common-document-files/
[1]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[2]: https://github.com/exasol/error-reporting-java/
[3]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[4]: https://github.com/googleapis/java-storage
[5]: https://www.apache.org/licenses/LICENSE-2.0.txt
[6]: https://github.com/google/guava
[7]: http://www.apache.org/licenses/LICENSE-2.0.txt
[8]: http://hamcrest.org/JavaHamcrest/
[9]: http://opensource.org/licenses/BSD-3-Clause
[10]: https://junit.org/junit5/
[11]: https://www.eclipse.org/legal/epl-v20.html
[12]: https://github.com/mockito/mockito
[13]: https://github.com/mockito/mockito/blob/main/LICENSE
[14]: https://www.jqno.nl/equalsverifier
[15]: https://java.testcontainers.org
[16]: http://opensource.org/licenses/MIT
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
[27]: https://www.eclemma.org/jacoco/index.html
[28]: https://www.eclipse.org/legal/epl-2.0/
[29]: http://sonarsource.github.io/sonar-scanner-maven/
[30]: http://www.gnu.org/licenses/lgpl.txt
[31]: https://maven.apache.org/plugins/maven-compiler-plugin/
[32]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[33]: https://www.mojohaus.org/flatten-maven-plugin/
[34]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[35]: https://maven.apache.org/surefire/maven-surefire-plugin/
[36]: https://www.mojohaus.org/versions/versions-maven-plugin/
[37]: https://basepom.github.io/duplicate-finder-maven-plugin
[38]: http://www.apache.org/licenses/LICENSE-2.0.html
[39]: https://github.com/exasol/project-keeper/
[40]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[41]: https://maven.apache.org/plugins/maven-assembly-plugin/
[42]: https://maven.apache.org/plugins/maven-jar-plugin/
[43]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[44]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[45]: https://maven.apache.org/plugins/maven-dependency-plugin/
[46]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[47]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[48]: https://github.com/exasol/error-code-crawler-maven-plugin/
[49]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[50]: http://zlika.github.io/reproducible-build-maven-plugin
[51]: http://maven.apache.org/plugins/maven-clean-plugin/
[52]: http://maven.apache.org/plugins/maven-resources-plugin/
[53]: http://maven.apache.org/plugins/maven-install-plugin/
[54]: http://maven.apache.org/plugins/maven-deploy-plugin/
[55]: http://maven.apache.org/plugins/maven-site-plugin/
