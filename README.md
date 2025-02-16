# DigiProducts-Application
Microservices application built using Spring Boot

As part of this project, I have covered the below implementations:

1.Built 3 microservices - ProductService, OrderService and Inventory Service
2.MongoDB - using Docker container
3.MySQL - using Docker container
4.Spring Data JPA
5.REST APIs
6.Flyway for DB migration
7.Integration Tests for each microservice
8.Spring Cloud OpenFeign - for REST calls from OrderService to InventoryService (OpenFeign is not being updated anymore, so later in project refactoring is done to remove it, and "REST Clients" is used instead)
9.WireMock - to test the external API communication in Integration test (as APIs can be paid and we don't want to hit paid requests each time we run Integration tests!)
10.Spring Cloud Gateway - API Gateway
11.Keycloak authentication
12.Circuit Breaker using Resilience4j
