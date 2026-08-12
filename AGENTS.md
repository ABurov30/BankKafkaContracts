# Agent Guide

This file is for coding agents working in this repository.

## Start Here

- Read [Project overview](docs/overview.md) before changing contracts.
- Read [Development and CI](docs/development.md) before editing Java, Avro, Maven, or CI files.
- Read [Publishing and consumption](docs/publishing.md) before changing package metadata or release behavior.

## Working Rules

- Treat `src/main/avro` as the source of truth for Avro payload contracts.
- Keep generated Avro Java files under `target/generated-sources/avro`; do not commit generated `target` output.
- Keep Java topic constants and event type enums aligned with schema additions.
- Preserve the Maven coordinates unless the task explicitly requires a package rename.
- Do not publish or change package versions unless the user asks for a release change.

## Validation

Before finishing code or contract changes, run:

```bash
mvn --batch-mode spotless:check
mvn --batch-mode verify
```

Use `mvn --batch-mode spotless:apply` when Java formatting needs to be fixed.
