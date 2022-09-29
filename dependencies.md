<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License                                       |
| ---------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                              | [The Apache Software License, Version 2.0][1] |
| [Virtual Schema for document data in files][2] | [MIT License][3]                              |
| [error-reporting-java][4]                      | [MIT License][5]                              |
| [Google Cloud Storage][6]                      | [Apache-2.0][7]                               |
| [Project Lombok][8]                            | [The MIT License][9]                          |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][10]                                  | [BSD License 3][11]               |
| [Virtual Schema for document data in files][2]  | [MIT License][3]                  |
| [JUnit Jupiter Engine][12]                      | [Eclipse Public License v2.0][13] |
| [JUnit Jupiter Params][12]                      | [Eclipse Public License v2.0][13] |
| [mockito-core][14]                              | [The MIT License][15]             |
| [Testcontainers :: JUnit Jupiter Extension][16] | [MIT][17]                         |
| [Testcontainers :: Localstack][16]              | [MIT][17]                         |
| [Test Database Builder for Java][18]            | [MIT License][19]                 |
| [udf-debugging-java][20]                        | [MIT][21]                         |
| [Matcher for SQL Result Sets][22]               | [MIT License][23]                 |
| [exasol-test-setup-abstraction-java][24]        | [MIT License][25]                 |
| [Performance Test Recorder Java][26]            | [MIT License][27]                 |
| [JaCoCo :: Agent][28]                           | [Eclipse Public License 2.0][29]  |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][30]                       | [GNU LGPL 3][31]                              |
| [Apache Maven Compiler Plugin][32]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven Enforcer Plugin][33]                      | [Apache License, Version 2.0][7]              |
| [Maven Flatten Plugin][34]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][35] | [ASL2][1]                                     |
| [Maven Surefire Plugin][36]                             | [Apache License, Version 2.0][7]              |
| [Versions Maven Plugin][37]                             | [Apache License, Version 2.0][7]              |
| [Project keeper maven plugin][38]                       | [The MIT License][39]                         |
| [Apache Maven Assembly Plugin][40]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven JAR Plugin][41]                           | [Apache License, Version 2.0][7]              |
| [Artifact reference checker and unifier][42]            | [MIT][21]                                     |
| [Apache Maven Dependency Plugin][43]                    | [Apache License, Version 2.0][7]              |
| [Lombok Maven Plugin][44]                               | [The MIT License][21]                         |
| [Maven Failsafe Plugin][45]                             | [Apache License, Version 2.0][7]              |
| [JaCoCo :: Maven Plugin][46]                            | [Eclipse Public License 2.0][29]              |
| [error-code-crawler-maven-plugin][47]                   | [MIT License][48]                             |
| [Reproducible Build Maven Plugin][49]                   | [Apache 2.0][1]                               |
| [Maven Clean Plugin][50]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][51]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][52]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][53]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][54]                               | [The Apache Software License, Version 2.0][1] |

[0]: https://github.com/FasterXML/jackson-core
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[2]: https://github.com/exasol/virtual-schema-common-document-files/
[3]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://github.com/googleapis/java-storage
[7]: https://www.apache.org/licenses/LICENSE-2.0.txt
[8]: https://projectlombok.org
[9]: https://projectlombok.org/LICENSE
[10]: http://hamcrest.org/JavaHamcrest/
[11]: http://opensource.org/licenses/BSD-3-Clause
[12]: https://junit.org/junit5/
[13]: https://www.eclipse.org/legal/epl-v20.html
[14]: https://github.com/mockito/mockito
[15]: https://github.com/mockito/mockito/blob/main/LICENSE
[16]: https://testcontainers.org
[17]: http://opensource.org/licenses/MIT
[18]: https://github.com/exasol/test-db-builder-java/
[19]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[20]: https://github.com/exasol/udf-debugging-java/
[21]: https://opensource.org/licenses/MIT
[22]: https://github.com/exasol/hamcrest-resultset-matcher/
[23]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[24]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[25]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[26]: https://github.com/exasol/performance-test-recorder-java/
[27]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[28]: https://www.eclemma.org/jacoco/index.html
[29]: https://www.eclipse.org/legal/epl-2.0/
[30]: http://sonarsource.github.io/sonar-scanner-maven/
[31]: http://www.gnu.org/licenses/lgpl.txt
[32]: https://maven.apache.org/plugins/maven-compiler-plugin/
[33]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[34]: https://www.mojohaus.org/flatten-maven-plugin/
[35]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[36]: https://maven.apache.org/surefire/maven-surefire-plugin/
[37]: http://www.mojohaus.org/versions-maven-plugin/
[38]: https://github.com/exasol/project-keeper/
[39]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[40]: https://maven.apache.org/plugins/maven-assembly-plugin/
[41]: https://maven.apache.org/plugins/maven-jar-plugin/
[42]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[43]: https://maven.apache.org/plugins/maven-dependency-plugin/
[44]: http://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[45]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[46]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[47]: https://github.com/exasol/error-code-crawler-maven-plugin/
[48]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[49]: http://zlika.github.io/reproducible-build-maven-plugin
[50]: http://maven.apache.org/plugins/maven-clean-plugin/
[51]: http://maven.apache.org/plugins/maven-resources-plugin/
[52]: http://maven.apache.org/plugins/maven-install-plugin/
[53]: http://maven.apache.org/plugins/maven-deploy-plugin/
[54]: http://maven.apache.org/plugins/maven-site-plugin/
