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
| [Apache Commons Text][27]                       | [Apache License, Version 2.0][7]  |
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
| [Artifact reference checker and unifier][42]            | [MIT][20]                                     |
| [Apache Maven Dependency Plugin][43]                    | [Apache License, Version 2.0][7]              |
| [Maven Failsafe Plugin][44]                             | [Apache License, Version 2.0][7]              |
| [JaCoCo :: Maven Plugin][45]                            | [Eclipse Public License 2.0][29]              |
| [error-code-crawler-maven-plugin][46]                   | [MIT License][47]                             |
| [Reproducible Build Maven Plugin][48]                   | [Apache 2.0][1]                               |
| [Maven Clean Plugin][49]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][50]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][51]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][52]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][53]                               | [The Apache Software License, Version 2.0][1] |

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
[27]: https://commons.apache.org/proper/commons-text
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
[44]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[45]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[46]: https://github.com/exasol/error-code-crawler-maven-plugin/
[47]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[48]: http://zlika.github.io/reproducible-build-maven-plugin
[49]: http://maven.apache.org/plugins/maven-clean-plugin/
[50]: http://maven.apache.org/plugins/maven-resources-plugin/
[51]: http://maven.apache.org/plugins/maven-install-plugin/
[52]: http://maven.apache.org/plugins/maven-deploy-plugin/
[53]: http://maven.apache.org/plugins/maven-site-plugin/
