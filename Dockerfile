FROM openjdk:17-alpine3.14

EXPOSE 8080

COPY ./build/libs/demo.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "demo.jar"]