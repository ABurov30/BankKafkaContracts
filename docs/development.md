# Development and CI

## Requirements

- Java 17
- Maven 3.9+

## Java Version

The project is compiled with `maven.compiler.release=17`, so local builds should run on JDK 17.
Newer JDKs can fail during Lombok annotation processing with errors like:

```text
java.lang.ExceptionInInitializerError: com.sun.tools.javac.code.TypeTag :: UNKNOWN
```

On macOS, switch the current terminal session to Java 17:

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
export PATH="$JAVA_HOME/bin:$PATH"
```

Check the active Java version:

```bash
java -version
mvn -v
```

Use `java -version`, not `java -v`.

To make Java 17 the default for new `zsh` sessions, add the exports to `~/.zshrc`:

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
export PATH="$JAVA_HOME/bin:$PATH"
```

Then reload the shell configuration:

```bash
source ~/.zshrc
```

## Common Commands

Format Java sources:

```bash
mvn --batch-mode spotless:apply
```

Check formatting:

```bash
mvn --batch-mode spotless:check
```

Run the full local verification:

```bash
mvn --batch-mode verify
```

`verify` compiles Avro schemas, compiles Java sources, builds the JAR, and runs Checkstyle.

## Style

Java formatting is handled by Spotless with Google Java Format.
Checkstyle uses `config/checkstyle/checkstyle.xml` and is bound to the Maven `verify` phase.

## CI

CI is configured in `.github/workflows/ci.yml` and runs on pushes and pull requests targeting
`main`.

The CI job runs:

```bash
mvn --batch-mode spotless:check
mvn --batch-mode verify
```

## Changing Contracts

1. Add or update Avro schemas in `src/main/avro`.
2. Update `KafkaTopics` and the matching domain enum in `src/main/java/kafkacontracts`.
3. Run `mvn --batch-mode spotless:apply` if Java files changed.
4. Run `mvn --batch-mode verify`.
5. Bump the package version only when preparing a publishable release.
