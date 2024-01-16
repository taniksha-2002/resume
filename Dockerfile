FROM openjdk:17
VOLUME /tmp
COPY build/libs/*.jar resume-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/resume-0.0.1-SNAPSHOT.jar"]