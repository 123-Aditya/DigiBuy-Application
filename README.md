# DigiProducts-Application

Microservices application built using Spring Boot

High level diagram:


<img width="1204" alt="Screenshot 2024-11-03 at 5 42 33 PM" src="https://github.com/user-attachments/assets/770ed49f-0044-457d-82d2-c4c73cf056ac" />



As part of this project, I have covered the below implementations:

1. Built 3 microservices - ProductService, OrderService and Inventory Service
   

<img width="1470" alt="Screenshot 2024-11-03 at 5 33 53 PM" src="https://github.com/user-attachments/assets/2e93bd39-219f-44dc-aff0-0f1aae4cefc3" />



2. MongoDB - using Docker container

3. MySQL - using Docker container

4. Spring Data JPA

5. REST APIs

6. Flyway for DB migration

7. Integration Tests for each microservice

8. Spring Cloud OpenFeign - for REST calls from OrderService to InventoryService (OpenFeign is not being updated anymore, so later in project refactoring is done to remove it, and "REST Clients" is used instead)


<img width="1458" alt="Screenshot 2025-01-04 at 12 01 25 PM" src="https://github.com/user-attachments/assets/37ed527c-49c4-42f3-9ec5-5efabe0c18e3" />



9. WireMock - to test the external API communication in Integration test (as APIs can be paid and we don't want to hit paid requests each time we run Integration tests!)


<img width="1458" alt="Screenshot 2025-01-04 at 11 03 20 AM" src="https://github.com/user-attachments/assets/b3da9d6b-03a4-4641-9366-c560b560ae7d" />



10. Spring Cloud Gateway - API Gateway


<img width="1464" alt="Screenshot 2025-01-04 at 12 04 03 PM" src="https://github.com/user-attachments/assets/89425f7b-333c-4bdd-ab4a-799ae81f08bc" />



11. Keycloak authentication


<img width="1465" alt="Screenshot 2025-01-11 at 4 17 02 PM" src="https://github.com/user-attachments/assets/8eda724c-f066-4882-9ebe-4a9b177fcc40" />



12. Circuit Breaker using Resilience4j
