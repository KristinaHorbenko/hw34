FROM openjdk:17
MAINTAINER K.Horbenko
EXPOSE 8080
COPY target/restServer-spring-boot.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]