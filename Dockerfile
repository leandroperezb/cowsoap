FROM openjdk:8-jdk-alpine

EXPOSE 8080
ARG JAR_FILE=demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} soap.example.jar
CMD ["java", "-jar", "/soap.example.jar"]
