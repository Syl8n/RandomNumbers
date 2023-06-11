FROM openjdk:11-jre-slim
COPY build/libs/RandomNumbers-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]