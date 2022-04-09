FROM adoptopenjdk/openjdk11:alpine
WORKDIR /app
COPY target/section23-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
