FROM openjdk:11

EXPOSE 8090
ADD target/weather-demo-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
