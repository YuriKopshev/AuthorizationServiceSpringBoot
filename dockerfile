FROM openjdk:11
EXPOSE 8080
ADD build/libs/AutoService-0.0.1-SNAPSHOT.jar authorities.jar
ENTRYPOINT ["java","-jar","authorities.jar"]