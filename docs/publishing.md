# Publishing and Consumption

## GitHub Packages

The package is published to:

```text
https://maven.pkg.github.com/aburov30/bankkafkacontracts
```

GitHub Packages does not allow overwriting an existing release version. Increase the version in
`pom.xml` before publishing a release that already exists remotely.

The Maven `artifactId` must stay lowercase. GitHub Packages rejects uppercase artifact IDs.

## Local Publishing

Configure Maven credentials in `~/.m2/settings.xml`:

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

The token needs `write:packages` for publishing.

Publish locally:

```bash
mvn clean deploy
```

## GitHub Actions Publishing

`.github/workflows/publish.yml` publishes the package on:

- release creation
- manual `workflow_dispatch`

The workflow uses `GITHUB_TOKEN` and needs:

```yaml
permissions:
  contents: read
  packages: write
```

## Consumer Configuration

Consumer services need Maven credentials with `read:packages` access and this repository entry:

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
    <version>0.0.9</version>
</dependency>
```
