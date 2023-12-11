FROM openjdk:21-jdk-slim
LABEL maintainer="Henry <dogfootmaster@gmail.com>"
LABEL type="application"
LABEL jdk="21"
LABEL gradle="8.5"
LABEL title="arc-sample-app"
LABEL version="1.0"

WORKDIR /apps
# copy app jar.
COPY build/libs/*.jar /apps/app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/apps/app.jar"]