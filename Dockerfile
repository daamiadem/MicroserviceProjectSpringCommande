FROM openjdk:8
EXPOSE 8092
ADD /target/commande-0.0.1-SNAPSHOT.jar commande.jar
ENTRYPOINT ["java" , "-jar" , "commande.jar"]
