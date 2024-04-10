# Virtual Schema for Document Data in Files on Google Cloud Storage 2.0.3, released 2024-04-10

Code name: Fix permissions for performance tests

## Summary

This release fixes permissions for performance regression tests.

**Excluded vulnerabilities:** This release contains dependency `org.threeten:threetenbp` with the following vulnerabilities:
* CVE-2024-23081 (NULL Pointer Dereference): We assume that `google-cloud-storage` uses the library correctly and does not trigger the NullPointerException.
* CVE-2024-23082 (Integer Overflow or Wraparound): We assume that `google-cloud-storage` uses the library correctly and does not trigger the StringIndexOutOfBoundsException.

## Security

* #52: Exclude CVE-2024-23081 in `org.threeten:threetenbp:jar:1.6.8:compile`
* #53: Exclude CVE-2024-23082 in `org.threeten:threetenbp:jar:1.6.8:compile`
