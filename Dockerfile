# For Java 11,
FROM adoptopenjdk/openjdk11:alpine-jre
LABEL MAINTAINER="andrearru@hotmail.com"

RUN mkdir /app

COPY  target/*.jar /app/

WORKDIR /app

ENTRYPOINT ["java","-jar","cash-account-management.jar"]