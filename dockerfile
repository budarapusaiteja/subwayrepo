FROM openjdk:11
ADD target/sample-data-0.0.1-SNAPSHOT.war sample-data-0.0.1-SNAPSHOT.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","sample-data-0.0.1-SNAPSHOT.war"]