#FROM java:8
#FROM balenalib/raspberry-pi-debian-openjdk:latest
FROM openjdk:8
EXPOSE 8080
ADD /target/mydemo-0.0.1.jar mydemo-0.0.1.jar
ENTRYPOINT ["java","-jar","mydemo-0.0.1.jar"]
