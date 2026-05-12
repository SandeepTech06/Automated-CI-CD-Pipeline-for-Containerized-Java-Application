# Cybersecurity-Themed DevOps Project Version

## Project Title

Log Monitoring and Security Alert Application

## Project Idea

This cybersecurity-themed version reads application logs, detects suspicious keywords, and prints alerts when potential security events are found.

## Problem Statement

Organizations need early detection of suspicious activity in logs to improve security response. Manual log review is inefficient and often misses important indicators.

## Objectives

- Read log files from a defined source.
- Detect suspicious keywords such as `failed login`, `unauthorized`, `error`, and `attack`.
- Print security alerts when suspicious patterns are detected.
- Build the project with Maven.
- Containerize the application with Docker.
- Automate the workflow with GitHub Actions.

## Tools and Technologies

- Java 17
- Maven
- Docker
- GitHub Actions
- GitHub Secrets

## Workflow Diagram

```mermaid
flowchart LR
    A[Log File Input] --> B[Java Log Scanner]
    B --> C[Keyword Detection]
    C --> D[Security Alert Output]
    D --> E[Maven Build]
    E --> F[Docker Image]
    F --> G[GitHub Actions Pipeline]
```

## Expected Outcome

The application highlights suspicious log entries, helps demonstrate basic security monitoring concepts, and shows how DevOps automation can support cybersecurity workflows.

## Conclusion

This version combines DevOps automation with a cybersecurity use case, making it suitable for academic submission and practical demonstration.