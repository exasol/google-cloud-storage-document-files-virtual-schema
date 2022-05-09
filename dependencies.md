<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                     | License                                       |
| ---------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                              | [The Apache Software License, Version 2.0][1] |
| [Virtual Schema for document data in files][2] | [MIT][3]                                      |
| [error-reporting-java][4]                      | [MIT][3]                                      |
| [Google Cloud Storage][6]                      | [Apache-2.0][7]                               |
| [Project Lombok][8]                            | [The MIT License][9]                          |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][10]                                  | [BSD License 3][11]               |
| [Virtual Schema for document data in files][2]  | [MIT][3]                          |
| [JUnit Jupiter Engine][14]                      | [Eclipse Public License v2.0][15] |
| [JUnit Jupiter Params][14]                      | [Eclipse Public License v2.0][15] |
| [mockito-core][18]                              | [The MIT License][19]             |
| [JUnit][20]                                     | [Eclipse Public License 1.0][21]  |
| [Testcontainers :: JUnit Jupiter Extension][22] | [MIT][23]                         |
| [Testcontainers :: Localstack][22]              | [MIT][23]                         |
| [Test Database Builder for Java][26]            | [MIT License][27]                 |
| [JaCoCo :: Agent][28]                           | [Eclipse Public License 2.0][29]  |
| [JaCoCo :: Core][28]                            | [Eclipse Public License 2.0][29]  |
| [udf-debugging-java][32]                        | [MIT][3]                          |
| [Matcher for SQL Result Sets][34]               | [MIT][3]                          |
| [exasol-test-setup-abstraction-java][36]        | [MIT][3]                          |
| [SnakeYAML][38]                                 | [Apache License, Version 2.0][1]  |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][40]                       | [GNU LGPL 3][41]                              |
| [Apache Maven Compiler Plugin][42]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven Enforcer Plugin][44]                      | [Apache License, Version 2.0][7]              |
| [Maven Flatten Plugin][46]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][48] | [ASL2][1]                                     |
| [Reproducible Build Maven Plugin][50]                   | [Apache 2.0][1]                               |
| [Maven Surefire Plugin][52]                             | [Apache License, Version 2.0][7]              |
| [Versions Maven Plugin][54]                             | [Apache License, Version 2.0][7]              |
| [Apache Maven Assembly Plugin][56]                      | [Apache License, Version 2.0][7]              |
| [Apache Maven JAR Plugin][58]                           | [Apache License, Version 2.0][7]              |
| [Artifact reference checker and unifier][60]            | [MIT][3]                                      |
| [Apache Maven Dependency Plugin][62]                    | [Apache License, Version 2.0][7]              |
| [Lombok Maven Plugin][64]                               | [The MIT License][3]                          |
| [Maven Failsafe Plugin][66]                             | [Apache License, Version 2.0][7]              |
| [JaCoCo :: Maven Plugin][68]                            | [Eclipse Public License 2.0][29]              |
| [Project keeper maven plugin][70]                       | [The MIT License][71]                         |
| [error-code-crawler-maven-plugin][72]                   | [MIT][3]                                      |
| [Maven Clean Plugin][74]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][76]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][78]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][80]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][82]                               | [The Apache Software License, Version 2.0][1] |

[28]: https://www.eclemma.org/jacoco/index.html
[4]: https://github.com/exasol/error-reporting-java
[2]: https://github.com/exasol/virtual-schema-common-document-files
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[8]: https://projectlombok.org
[52]: https://maven.apache.org/surefire/maven-surefire-plugin/
[74]: http://maven.apache.org/plugins/maven-clean-plugin/
[3]: https://opensource.org/licenses/MIT
[18]: https://github.com/mockito/mockito
[54]: http://www.mojohaus.org/versions-maven-plugin/
[70]: https://github.com/exasol/project-keeper/
[11]: http://opensource.org/licenses/BSD-3-Clause
[42]: https://maven.apache.org/plugins/maven-compiler-plugin/
[27]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[20]: http://junit.org
[29]: https://www.eclipse.org/legal/epl-2.0/
[41]: http://www.gnu.org/licenses/lgpl.txt
[68]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[19]: https://github.com/mockito/mockito/blob/main/LICENSE
[9]: https://projectlombok.org/LICENSE
[34]: https://github.com/exasol/hamcrest-resultset-matcher
[50]: http://zlika.github.io/reproducible-build-maven-plugin
[40]: http://sonarsource.github.io/sonar-scanner-maven/
[14]: https://junit.org/junit5/
[38]: https://bitbucket.org/snakeyaml/snakeyaml
[46]: https://www.mojohaus.org/flatten-maven-plugin/flatten-maven-plugin
[6]: https://github.com/googleapis/java-storage
[10]: http://hamcrest.org/JavaHamcrest/
[76]: http://maven.apache.org/plugins/maven-resources-plugin/
[60]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[36]: https://github.com/exasol/exasol-test-setup-abstraction-java
[0]: https://github.com/FasterXML/jackson-core
[58]: https://maven.apache.org/plugins/maven-jar-plugin/
[26]: https://github.com/exasol/test-db-builder-java/
[66]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[64]: http://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[23]: http://opensource.org/licenses/MIT
[21]: http://www.eclipse.org/legal/epl-v10.html
[62]: https://maven.apache.org/plugins/maven-dependency-plugin/
[71]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[7]: https://www.apache.org/licenses/LICENSE-2.0.txt
[44]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[15]: https://www.eclipse.org/legal/epl-v20.html
[78]: http://maven.apache.org/plugins/maven-install-plugin/
[48]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[22]: https://testcontainers.org
[32]: https://github.com/exasol/udf-debugging-java
[80]: http://maven.apache.org/plugins/maven-deploy-plugin/
[82]: http://maven.apache.org/plugins/maven-site-plugin/
[72]: https://github.com/exasol/error-code-crawler-maven-plugin
[56]: https://maven.apache.org/plugins/maven-assembly-plugin/
