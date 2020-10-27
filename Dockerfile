FROM openjdk:11-jdk-slim

LABEL maintainer="Eduardo Baldera <20170982@ce.pucmm.edu.do>"

VOLUME /tmp

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "practica1-0.0.1-SNAPSHOT.jar"]
