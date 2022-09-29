<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License                                       |
| ---------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                              | [The Apache Software License, Version 2.0][1] |
| [Virtual Schema for document data in files][2] | [MIT License][3]                              |
| [error-reporting-java][4]                      | [MIT License][5]                              |
| [Google Cloud Storage][6]                      | [Apache-2.0][7]                               |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][8]                                   | [BSD License 3][9]                |
| [Virtual Schema for document data in files][2]  | [MIT License][3]                  |
| [JUnit Jupiter Engine][10]                      | [Eclipse Public License v2.0][11] |
| [JUnit Jupiter Params][10]                      | [Eclipse Public License v2.0][11] |
| [mockito-core][12]                              | [The MIT License][13]             |
| [EqualsVerifier | release normal jar][14]       | [Apache License, Version 2.0][7]  |
| [Testcontainers :: JUnit Jupiter Extension][15] | [MIT][16]                         |
| [Testcontainers :: Localstack][15]              | [MIT][16]                         |
| [Test Database Builder for Java][17]            | [MIT License][18]                 |
| [udf-debugging-java][19]                        | [MIT][20]                         |
| [Matcher for SQL Result Sets][21]               | [MIT License][22]                 |
| [exasol-test-setup-abstraction-java][23]        | [MIT License][24]                 |
| [Performance Test Recorder Java][25]            | [MIT License][26]                 |
| [JaCoCo :: Agent][27]                           | [Eclipse Public License 2.0][28]  |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][29]                       | [GNU LGPL 3][30]                              |
| [Apache Maven Compiler Plugin][31]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven Enforcer Plugin][32]                      | [Apache License, Version 2.0][7]              |
| [Maven Flatten Plugin][33]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][34] | [ASL2][1]                                     |
| [Maven Surefire Plugin][35]                             | [Apache License, Version 2.0][7]              |
| [Versions Maven Plugin][36]                             | [Apache License, Version 2.0][7]              |
| [Project keeper maven plugin][37]                       | [The MIT License][38]                         |
| [Apache Maven Assembly Plugin][39]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven JAR Plugin][40]                           | [Apache License, Version 2.0][7]              |
| [Artifact reference checker and unifier][41]            | [MIT][20]                                     |
| [Apache Maven Dependency Plugin][42]                    | [Apache License, Version 2.0][7]              |
| [Maven Failsafe Plugin][43]                             | [Apache License, Version 2.0][7]              |
| [JaCoCo :: Maven Plugin][44]                            | [Eclipse Public License 2.0][28]              |
| [error-code-crawler-maven-plugin][45]                   | [MIT License][46]                             |
| [Reproducible Build Maven Plugin][47]                   | [Apache 2.0][1]                               |
| [Maven Clean Plugin][48]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][49]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][50]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][51]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][52]                               | [The Apache Software License, Version 2.0][1] |

[0]: https://github.com/FasterXML/jackson-core
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[2]: https://github.com/exasol/virtual-schema-common-document-files/
[3]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://github.com/googleapis/java-storage
[7]: https://www.apache.org/licenses/LICENSE-2.0.txt
[8]: http://hamcrest.org/JavaHamcrest/
[9]: http://opensource.org/licenses/BSD-3-Clause
[10]: https://junit.org/junit5/
[11]: https://www.eclipse.org/legal/epl-v20.html
[12]: https://github.com/mockito/mockito
[13]: https://github.com/mockito/mockito/blob/main/LICENSE
[14]: https://www.jqno.nl/equalsverifier
[15]: https://testcontainers.org
[16]: http://opensource.org/licenses/MIT
[17]: https://github.com/exasol/test-db-builder-java/
[18]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[19]: https://github.com/exasol/udf-debugging-java/
[20]: https://opensource.org/licenses/MIT
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
[36]: http://www.mojohaus.org/versions-maven-plugin/
[37]: https://github.com/exasol/project-keeper/
[38]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[39]: https://maven.apache.org/plugins/maven-assembly-plugin/
[40]: https://maven.apache.org/plugins/maven-jar-plugin/
[41]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[42]: https://maven.apache.org/plugins/maven-dependency-plugin/
[43]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[44]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[45]: https://github.com/exasol/error-code-crawler-maven-plugin/
[46]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[47]: http://zlika.github.io/reproducible-build-maven-plugin
[48]: http://maven.apache.org/plugins/maven-clean-plugin/
[49]: http://maven.apache.org/plugins/maven-resources-plugin/
[50]: http://maven.apache.org/plugins/maven-install-plugin/
[51]: http://maven.apache.org/plugins/maven-deploy-plugin/
[52]: http://maven.apache.org/plugins/maven-site-plugin/
