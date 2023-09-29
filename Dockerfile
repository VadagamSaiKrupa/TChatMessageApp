FROM openjdk:8
EXPOSE 8080
ADD target/tchatmessageappspringboot.jar tchatmessageappspringboot.jar
ENTRYPOINT [ "java","-jar","/tchatmessageappspringboot.jar" ]