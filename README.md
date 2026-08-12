# Kafka Contracts

Shared Kafka event contracts for the banking pet project.

This module publishes a Maven package with:

- Avro schemas from `src/main/avro`
- Generated Avro Java classes
- Shared topic constants and event type enums from `src/main/java`

## Documentation

- [Project overview](docs/overview.md)
- [Development and CI](docs/development.md)
- [Publishing and consumption](docs/publishing.md)
- [Agent guide](AGENTS.md)

## Quick Start

Requirements:

- Java 17
- Maven 3.9+

Run local verification:

```bash
mvn --batch-mode spotless:check
mvn --batch-mode verify
```

Build the package:

```bash
mvn clean package
```

The built JAR is created in `target/`.

## Maven Coordinates

```xml
<dependency>
    <groupId>com.burov</groupId>
    <artifactId>kafka-contracts</artifactId>
    <version>0.0.9</version>
</dependency>
```

Consumer services also need access to the GitHub Packages repository:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/aburov30/bankkafkacontracts</url>
    </repository>
</repositories>
```

See [Publishing and consumption](docs/publishing.md) for credentials and release details.
