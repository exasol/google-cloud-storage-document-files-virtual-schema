# Virtual Schema for Document Data in Files on Google Cloud Storage 2.0.3, released 2024-??-??

Code name: Fixed vulnerabilities CVE-2024-23081, CVE-2024-23082

## Summary

This release fixes the following 2 vulnerabilities:

### CVE-2024-23081 (CWE-476) in dependency `org.threeten:threetenbp:jar:1.6.8:compile`
ThreeTen Backport v1.6.8 was discovered to contain a NullPointerException via the component org.threeten.bp.LocalDate::compareTo(ChronoLocalDate).
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-23081?component-type=maven&component-name=org.threeten%2Fthreetenbp&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-23081
* https://gist.github.com/LLM4IG/3cc9183dcd887020368a0bafeafec5e3

### CVE-2024-23082 (CWE-190) in dependency `org.threeten:threetenbp:jar:1.6.8:compile`
ThreeTen Backport v1.6.8 was discovered to contain an integer overflow via the component org.threeten.bp.format.DateTimeFormatter::parse(CharSequence, ParsePosition).
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-23082?component-type=maven&component-name=org.threeten%2Fthreetenbp&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-23082
* https://gist.github.com/LLM4IG/d2618f5f4e5ac37eb75cff5617e58b90

## Security

* #52: Fixed vulnerability CVE-2024-23081 in dependency `org.threeten:threetenbp:jar:1.6.8:compile`
* #53: Fixed vulnerability CVE-2024-23082 in dependency `org.threeten:threetenbp:jar:1.6.8:compile`

## Dependency Updates

### Test Dependency Updates

* Updated `com.exasol:udf-debugging-java:0.6.12` to `0.6.13`
