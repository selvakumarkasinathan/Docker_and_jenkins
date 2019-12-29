FROM openjdk:8
ADD /target/Dockerwar.jar Dockerwar.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "Dockerwar.jar"]