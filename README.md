# Kafka Contracts

Shared Kafka event contracts for the banking pet project.

The package contains:

- Avro schemas in `src/main/avro`
- Shared Java constants and enums in `src/main/java`
- Maven configuration for publishing to GitHub Packages

## Requirements

- Java 17
- Maven 3.9+
- GitHub token with `read:packages` for consuming the package
- GitHub token with `write:packages` for publishing the package

## Build

```bash
mvn clean package
```

The built JAR is created in `target/`.

## Publish To GitHub Packages

Before publishing locally, configure Maven credentials in `~/.m2/settings.xml`:

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>ABurov30</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

Publish:

```bash
mvn clean deploy
```

GitHub Packages does not allow overwriting an existing release version. Increase the version in `pom.xml` before every release publish.

## GitHub Actions Publish

The package can also be published from GitHub Actions using `.github/workflows/publish.yml`.

The workflow requires:

```yaml
permissions:
  contents: read
  packages: write
```

The Maven `artifactId` must stay lowercase. GitHub Packages rejects uppercase artifact IDs with `422 Unprocessable Entity`.

## Usage

Add the GitHub Packages repository to a consumer service:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/aburov30/bankkafkacontracts</url>
    </repository>
</repositories>
```

Add the dependency:

```xml
<dependency>
    <groupId>com.burov</groupId>
    <artifactId>kafka-contracts</artifactId>
    <version>0.0.3</version>
</dependency>
```

Consumer services also need Maven credentials with access to GitHub Packages.
