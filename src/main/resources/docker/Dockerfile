
docker search java:java8

#FROM dockerfile/java:oracle-java8

ADD spring-boot-jersey-docker.jar /opt/spring-boot-jersey-docker/

EXPOSE 8080

WORKDIR /opt/spring-boot-jersey-docker/

CMD ["java", "-jar", "spring-boot-jersey-docker.jar"]