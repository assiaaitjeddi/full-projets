<h1>Activit Pratique N2 : Mise en oeuvre d'une architecture micro services</h1>


## Description

Ce projet vise à démontrer la mise en œuvre d'une architecture micro-services en utilisant Spring Boot, Angular, et d'autres technologies pertinentes. 
Il comprend la gestion de factures, des clients, et des produits à travers divers micro-services.

## Technologies Utilisées

### Backend :
  - Spring Boot<br>
  - Spring Cloud<br>
  - Spring Data JPA<br>
  - Eureka <br>
  - H2/MySQL (base de données)<br>
  - Feign Client pour la communication entre micro-services<br>

### Frontend :
  - Angular
  - Bootstrap

## Structure du Projet

- **billing-service**: Micro-service pour la gestion des factures.
  - Responsabilité: Création, mise à jour, et récupération des factures.
  
- **customer-service**: Micro-service pour la gestion des clients.
  - Responsabilité: Gestion des informations des clients, y compris la création et la mise à jour des profils clients.

- **product-service**: Micro-service pour la gestion des produits.
  - Responsabilité: Gestion des informations sur les produits, y compris l'ajout, la mise à jour, et la suppression des produits.

- **gateway**: Point d'entrée unique pour toutes les requêtes. Gère le routage des requêtes vers les services appropriés.
  
- **Eureka Discovery**: Service de découverte qui permet aux micro-services de se trouver et de communiquer entre eux facilement.

![Architecture Diagram](pictures/1.png)
![Architecture Diagram](pictures/2.png)
![Architecture Diagram](pictures/database_3.png)
![Architecture Diagram](pictures/products_4.png)
![Architecture Diagram](pictures/customers_5.png)
![Architecture Diagram](pictures/6.png)
![Architecture Diagram](pictures/eureka_dynamic_method_6.png)
![Architecture Diagram](pictures/7.png)
![Architecture Diagram](pictures/8.png)
![Architecture Diagram](pictures/9.png)
![Architecture Diagram](pictures/10.png)
![Architecture Diagram](pictures/11.png)
![Architecture Diagram](pictures/12.png)
![Architecture Diagram](pictures/13.png)
![Architecture Diagram](pictures/14.png)




