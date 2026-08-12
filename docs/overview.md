# Project Overview

`KafkaContracts` is the shared contract package for Kafka events in the banking pet project.
It is published as a Maven artifact and consumed by microservices that produce or consume
Kafka messages.

## Package

- Group ID: `com.burov`
- Artifact ID: `kafka-contracts`
- Current version: `0.0.9`
- Java release: `17`

## Source Layout

- `src/main/avro`: Avro schemas for event envelopes and payloads.
- `src/main/java/kafkacontracts/common`: shared Kafka topic constants.
- `src/main/java/kafkacontracts/*`: event type enums grouped by business domain.
- `config/checkstyle/checkstyle.xml`: Checkstyle rules based on Google Java Style.
- `.github/workflows/ci.yml`: pull request and main branch verification.
- `.github/workflows/publish.yml`: GitHub Packages publish workflow.

## Contract Flow

Avro schemas are compiled by `avro-maven-plugin` during `generate-sources`.
The generated sources are placed in `target/generated-sources/avro` and compiled into the JAR.

When adding a new event, update the Avro schema set and the matching Java topic/event type
constants together so consumers can use one package for both serialization contracts and topic
metadata.
