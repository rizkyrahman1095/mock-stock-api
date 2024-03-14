FROM openjdk:17-alpine

ADD target/mock-bitpods-stock-service-0.0.1-SNAPSHOT.jar mock-api.jar

CMD ["java", "-jar", "mock-api.jar"]