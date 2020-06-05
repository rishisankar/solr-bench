# Solr Bench

A comprehensive Solr performance benchmark and stress test framework.

Benchmarking & stress test for standard operations (indexing, querying) for a Solr build
 
## Running

### Prerequisites

In the coordinator VM, check out the solr-benchmarking repo.

The VM should have the following installed:
* apt install wget unzip zip ant ivy lsof git netcat make openjdk-11-jdk jq maven
* wget https://releases.hashicorp.com/terraform/0.12.26/terraform_0.12.26_linux_amd64.zip; sudo unzip terraform_0.12.26_linux_amd64.zip -d /usr/local/bin

### Running the suite

     1. mvn clean compile assembly:single
     2. ./start.sh <config-file>

(Example: config.json, config-local.json)

### Results

* Results are available after the benchmark in results.json file.