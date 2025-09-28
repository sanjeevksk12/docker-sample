FROM openjdk:17

COPY target/sampleapp.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sampleapp.jar"]