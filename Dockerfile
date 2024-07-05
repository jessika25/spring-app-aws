FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
COPY target/spring_app_aws.jar spring_app_aws.jar
ENTRYPOINT ["java","-jar","/spring_app_aws.jar"]