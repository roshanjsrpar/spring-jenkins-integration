FROM eclipse-temurin:17-jdk


COPY target/*.jar spring-jenkins-integration.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","spring-jenkins-integration.jar"]
