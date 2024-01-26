FROM openjdk
EXPOSE 8080
ADD target/spring-boot-jenkins-docker-k8s.jar spring-boot-jenkins-docker-k8s.jar
ENTRYPOINT ["java","-jar","spring-boot-jenkins-docker-k8s.jar"]