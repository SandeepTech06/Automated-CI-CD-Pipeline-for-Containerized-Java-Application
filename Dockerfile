# Lightweight runtime image based on Eclipse Temurin 17.
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory for the container.
WORKDIR /app

# Create a non-root user to run the application securely.
RUN adduser --no-create-home --disabled-password --shell /sbin/nologin appuser

# Copy the executable JAR produced by Maven into the image.
COPY target/*.jar /app/app.jar

# Make the application file owned by the non-root user.
RUN chown appuser:appuser /app/app.jar

# Switch to the non-root user before starting the process.
USER appuser

# Automatically start the Java application when the container runs.
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
