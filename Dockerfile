FROM openjdk:11
ADD target/GlobeHopper-0.0.1-SNAPSHOT.jar globehopper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "globehopper.jar"]
