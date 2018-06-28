#Dockerfile
FROM alpine/git as clone-stage
ENV giturl https://github.com/rajesh-raja/rest-basis.git
WORKDIR /app
RUN git clone $giturl

FROM maven:3.5-jdk-8-alpine as build-stage
ENV projectname rest-basis
WORKDIR /app
COPY --from=clone-stage /app/$projectname /app
RUN mvn install

FROM openjdk:8-jre-alpine
ENV artifact rest-basis-0.0.1-SNAPSHOT.jar
WORKDIR /app
COPY --from=build-stage /app/target/$artifact /app
EXPOSE 8080
CMD ["java -jar $artifact"]
