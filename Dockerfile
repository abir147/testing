FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/timesheet-3.3-SNAPSHOT.jar timesheet-3.3-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/timesheet-3.3-SNAPSHOT.jar"]
