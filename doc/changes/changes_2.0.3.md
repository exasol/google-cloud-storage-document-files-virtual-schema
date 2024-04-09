# Virtual Schema for Document Data in Files on Google Cloud Storage 2.0.3, released 2024-04-09

Code name: Fix permissions for performance tests

## Summary

This release fixes permissions for performance regression tests.

**Excluded vulnerabilities:** This release contains dependency `org.threeten:threetenbp` with vulnerability CVE-2024-23081. We assume that `google-cloud-storage` uses the library correctly and does not trigger the NullPointerException.
