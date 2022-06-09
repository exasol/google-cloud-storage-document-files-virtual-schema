<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License                                       |
| ---------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                              | [The Apache Software License, Version 2.0][1] |
| [Virtual Schema for document data in files][2] | [MIT License][3]                              |
| [error-reporting-java][4]                      | [MIT][5]                                      |
| [Google Cloud Storage][6]                      | [Apache-2.0][7]                               |
| [Project Lombok][8]                            | [The MIT License][9]                          |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][10]                                  | [BSD License 3][11]               |
| [Virtual Schema for document data in files][2]  | [MIT License][3]                  |
| [JUnit Jupiter Engine][14]                      | [Eclipse Public License v2.0][15] |
| [JUnit Jupiter Params][14]                      | [Eclipse Public License v2.0][15] |
| [mockito-core][18]                              | [The MIT License][19]             |
| [Testcontainers :: JUnit Jupiter Extension][20] | [MIT][21]                         |
| [Testcontainers :: Localstack][20]              | [MIT][21]                         |
| [Test Database Builder for Java][24]            | [MIT License][25]                 |
| [udf-debugging-java][26]                        | [MIT][5]                          |
| [Matcher for SQL Result Sets][28]               | [MIT][5]                          |
| [exasol-test-setup-abstraction-java][30]        | [MIT License][31]                 |
| [SnakeYAML][32]                                 | [Apache License, Version 2.0][1]  |
| [JaCoCo :: Agent][34]                           | [Eclipse Public License 2.0][35]  |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][36]                       | [GNU LGPL 3][37]                              |
| [Apache Maven Compiler Plugin][38]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven Enforcer Plugin][40]                      | [Apache License, Version 2.0][7]              |
| [Maven Flatten Plugin][42]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][44] | [ASL2][1]                                     |
| [Reproducible Build Maven Plugin][46]                   | [Apache 2.0][1]                               |
| [Maven Surefire Plugin][48]                             | [Apache License, Version 2.0][7]              |
| [Versions Maven Plugin][50]                             | [Apache License, Version 2.0][7]              |
| [Project keeper maven plugin][52]                       | [The MIT License][53]                         |
| [Apache Maven Assembly Plugin][54]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven JAR Plugin][56]                           | [Apache License, Version 2.0][7]              |
| [Artifact reference checker and unifier][58]            | [MIT][5]                                      |
| [Apache Maven Dependency Plugin][60]                    | [Apache License, Version 2.0][7]              |
| [Lombok Maven Plugin][62]                               | [The MIT License][5]                          |
| [Maven Failsafe Plugin][64]                             | [Apache License, Version 2.0][7]              |
| [JaCoCo :: Maven Plugin][66]                            | [Eclipse Public License 2.0][35]              |
| [error-code-crawler-maven-plugin][68]                   | [MIT][5]                                      |
| [Maven Clean Plugin][70]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][72]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][74]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][76]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][78]                               | [The Apache Software License, Version 2.0][1] |

[34]: https://www.eclemma.org/jacoco/index.html
[4]: https://github.com/exasol/error-reporting-java
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[8]: https://projectlombok.org
[48]: https://maven.apache.org/surefire/maven-surefire-plugin/
[70]: http://maven.apache.org/plugins/maven-clean-plugin/
[5]: https://opensource.org/licenses/MIT
[18]: https://github.com/mockito/mockito
[42]: https://www.mojohaus.org/flatten-maven-plugin/
[50]: http://www.mojohaus.org/versions-maven-plugin/
[52]: https://github.com/exasol/project-keeper/
[11]: http://opensource.org/licenses/BSD-3-Clause
[38]: https://maven.apache.org/plugins/maven-compiler-plugin/
[25]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[30]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[35]: https://www.eclipse.org/legal/epl-2.0/
[37]: http://www.gnu.org/licenses/lgpl.txt
[66]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[19]: https://github.com/mockito/mockito/blob/main/LICENSE
[9]: https://projectlombok.org/LICENSE
[28]: https://github.com/exasol/hamcrest-resultset-matcher
[46]: http://zlika.github.io/reproducible-build-maven-plugin
[31]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[36]: http://sonarsource.github.io/sonar-scanner-maven/
[26]: https://github.com/exasol/udf-debugging-java/
[14]: https://junit.org/junit5/
[32]: https://bitbucket.org/snakeyaml/snakeyaml
[2]: https://github.com/exasol/virtual-schema-common-document-files/
[6]: https://github.com/googleapis/java-storage
[10]: http://hamcrest.org/JavaHamcrest/
[72]: http://maven.apache.org/plugins/maven-resources-plugin/
[58]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[0]: https://github.com/FasterXML/jackson-core
[56]: https://maven.apache.org/plugins/maven-jar-plugin/
[24]: https://github.com/exasol/test-db-builder-java/
[64]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[62]: http://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[21]: http://opensource.org/licenses/MIT
[53]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[60]: https://maven.apache.org/plugins/maven-dependency-plugin/
[7]: https://www.apache.org/licenses/LICENSE-2.0.txt
[40]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[15]: https://www.eclipse.org/legal/epl-v20.html
[74]: http://maven.apache.org/plugins/maven-install-plugin/
[44]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[3]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[20]: https://testcontainers.org
[76]: http://maven.apache.org/plugins/maven-deploy-plugin/
[78]: http://maven.apache.org/plugins/maven-site-plugin/
[68]: https://github.com/exasol/error-code-crawler-maven-plugin
[54]: https://maven.apache.org/plugins/maven-assembly-plugin/
