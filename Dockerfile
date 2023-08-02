FROM openjdk:17

EXPOSE 8080

ADD target/bookstoreAws-0.0.1-SNAPSHOT.jar bookstoreaws.jar

ENTRYPOINT [ "java", "-jar", "bookstoreaws.jar" ]