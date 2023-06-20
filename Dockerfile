FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} simplewebapp.jar
ENTRYPOINT ["java","-jar","/simplewebapp.jar"]
EXPOSE 9090