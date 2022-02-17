# Exasol – Google Cloud Storage Integration

Google Cloud Storage is a service that allows you to simply store files. On this page we’ll describe how you can integrate the data from these files into your Exasol database.

## Overview of our Integrations

* [Builtin IMPORT / EXPORT](https://docs.exasol.com/db/latest/loading_data/load_data_google_cloud_storage_buckets.htm)
    * Supported file types: [CSV](https://docs.exasol.com/db/latest/loading_data/file_formats.htm#CSV_Data_Format), [FBV](https://docs.exasol.com/db/latest/loading_data/file_formats.htm#Fixblock_Data_format_)
* [Cloud Storage Extensions](https://github.com/exasol/cloud-storage-extension/)
    * Supported file types for importing: Parquet, Avro, Orc, Delta
    * Supported file types for exporting: Parquet
* [Virtual Schema: Virtual Schema for document files on Google Cloud Storage](https://github.com/exasol/google-cloud-storage-document-files-virtual-schema/)
    * Supported file types: Parquet, JSON, JSON-lines
    * Import only
    * Predicate pushdown: Select which files to load based on the query

## What is a Virtual Schema?

A Virtual Schema integrates the data from the files on Google-Cloud storage virtually into your Exasol database. That means that the data is not replicated into the Exasol database but only transferred on demand. So whenever you access the data in a query Exasol will connect to Google Cloud Storage and transfer the requested data.

The Virtual Schema for files on Google-Cloud-Storage allows you to filter the files you want to load in the query. You can use that for example to load only new files. For details on filtering check the [user-guide](https://github.com/exasol/virtual-schema-common-document-files/blob/main/doc/user_guide/user_guide.md#filtering).

Typical use cases for a Virtual Schema are:

* Integrating constantly changing data: If you want to integrate data that changes constantly you would need to reimport all the time. A Virtual Schema will query the data directly and give you always the most recent data.
* You have huge amounts of data and don't need all of it.
* You want to use the Virtual Schema as a staging area for trying out the integration and then import it by copying the rows to a regular Exasol table.
* You have new data each day. You use the Virtual Schema to query the new data and build a job that copies the data from the Virtual Schema to a regular table each day.
 
