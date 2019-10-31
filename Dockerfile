# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="bessrour.rayene@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9899 available to the world outside this container
EXPOSE 9899

# The application's jar file
ARG JAR_FILE=target/test-automation.jar

# Add the application's jar to the container
ADD ${JAR_FILE} test-automation.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/test-automation.jar"]