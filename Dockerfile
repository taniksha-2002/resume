FROM openjdk:17
VOLUME /tmp
COPY build/libs/*.jar resume-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]