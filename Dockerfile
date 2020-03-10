#FROM java:11
#FROM balenalib/raspberry-pi-debian-openjdk:latest
FROM openjdk:11
EXPOSE 8081
ADD /target/mydemo-0.0.1.jar mydemo-0.0.1.jar
ENTRYPOINT ["java","-jar","mydemo-0.0.1.jar"]
