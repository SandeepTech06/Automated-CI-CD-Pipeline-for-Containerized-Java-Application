# Viva Questions and Answers

## Docker Concepts

**Q1. What is Docker?**  
Docker is a containerization platform that packages an application with its dependencies into a portable image.

**Q2. Why is Docker used in this project?**  
Docker ensures the Java application runs consistently across different machines and environments.

**Q3. What is the difference between an image and a container?**  
An image is a read-only template. A container is a running instance of that image.

## CI/CD Concepts

**Q4. What is CI/CD?**  
CI/CD stands for Continuous Integration and Continuous Deployment or Delivery. It automates build, test, and release processes.

**Q5. Why is CI/CD important?**  
It reduces manual effort, catches errors early, and improves release reliability.

**Q6. What does the pipeline do in this project?**  
It builds the Maven project, packages the JAR, creates a Docker image, and can push the image to Docker Hub.

## Maven Concepts

**Q7. What is Maven?**  
Maven is a build automation and dependency management tool for Java projects.

**Q8. Why use Maven here?**  
Maven manages compilation, testing, and packaging in a standardized way.

**Q9. What is an executable JAR?**  
It is a JAR file that contains a manifest entry specifying the main class so it can run with `java -jar`.

## GitHub Actions Concepts

**Q10. What is GitHub Actions?**  
GitHub Actions is a workflow automation platform integrated into GitHub repositories.

**Q11. Why use GitHub Actions in this project?**  
It automates build and container publishing whenever code is pushed to the main branch.

**Q12. What are GitHub Secrets used for?**  
They store sensitive values such as Docker Hub credentials securely.

## Pipeline Explanation

**Q13. Why does the workflow use Java 17?**  
Because the project targets Java 17 for source and runtime compatibility.

**Q14. Why is the Docker image lightweight?**  
It uses an OpenJDK 17 slim base image to reduce size and improve efficiency.

**Q15. Why run `mvn clean package` before Docker build?**  
The Dockerfile copies the generated JAR, so the JAR must exist before building the image.

## Real-World Usage

**Q16. Where is this type of pipeline used?**  
It is used in enterprise software delivery, microservices platforms, and cloud deployments.

**Q17. What happens if the Docker Hub secrets are missing?**  
The workflow can still build the project, but it will skip the push step.

## Common Interview Questions

**Q18. What is the advantage of containerization?**  
It provides consistent runtime behavior and easier deployment.

**Q19. How does Maven improve productivity?**  
It standardizes builds, manages dependencies, and automates packaging.

**Q20. What is the role of Git in CI/CD?**  
Git stores source code and triggers automated workflows through repository events.