FROM openjdk:11

EXPOSE 8090
ARG JAR_FILE
ADD ${JAR_FILE} app.jar

USER app

ENTRYPOINT ["/run-java.sh",  "/app.jar"]
