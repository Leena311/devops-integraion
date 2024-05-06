FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/devops-integraion.jar devops-integraion.jar
ENTRYPOINT ["java","-jar","/devops-integraion.jar"]