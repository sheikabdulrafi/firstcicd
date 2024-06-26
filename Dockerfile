FROM openjdk:17
EXPOSE 8080
ADD target/dev-0.0.1-SNAPSHOT.jar dev-0.0.1-SNAPSHOT.jar 
ENTRYPOINT [ "java", "-jar","/dev-0.0.1-SNAPSHOT.jar" ]