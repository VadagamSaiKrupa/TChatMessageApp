FROM openjdk:17
EXPOSE 8080
ADD target/tchatmessageappspringboot.jar tchatmessageappspringboot.jar
ENTRYPOINT [ "java","-jar","/tchatmessageappspringboot.jar" ]