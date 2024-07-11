FROM openjdk:17-jre-alpine

EXPOSE 8080

COPY ./build/libs/demo.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "demo.jar"]