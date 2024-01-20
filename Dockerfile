FROM openjdk:17-jdk-alpine
ADD target/spring-boot-app.jar spring-boot-app.jar
ENTRYPOINT ["java", "-jar","/spring-boot-app.jar"] 