FROM eclipse-temurin:17-jdk-alpine
RUN apk add --no-cache maven
VOLUME /tmp
ADD . .
ADD /target/demoCI-CD-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 5000