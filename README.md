# Welcome to OrderSys! 

This is a very simple system which aims to create an API using SpringBoot in order to add and consume a queue with RabbitMQ and store data in an H2 database. 



## System Overview

This system manage four entitities: 

1. customers
2. products
3. orders
4. address

These entities are composed by the following attributes:

![OrderSys](https://user-images.githubusercontent.com/13739735/196417927-e3a22ca4-7b7f-4681-be13-c92a66cc7655.png)

## ⚙️ Development

This system is currently under construction and will be developed iteratively following X sprints that are described as it follows:

### Sprint 01 - API building

In this sprint, OrderSys will be configured as a maven project using start.spring.io using the following dependencies:

1. Spring Data JPA
2. Spring Boot DevTools
3. H2 Database
4. Spring for RabbitMQ

Next, the following endpoints should be created:

#### For Customers
- GET - localhost:9000/cliente/lista - List all stored clients
- GET - localhost:9000/cliente/{id} - Display client with such id
- POST - localhost:9000/cliente/ - Add a client
- PUT - localhost:9000/cliente/ - Update or add a client
- DELETE - localhost:9000/cliente/{id} - delete client with such id

#### For Products
- GET - localhost:9000/produto/lista - List all stored products
- GET - localhost:9000/produto/{id} - Display product with such id
- POST - localhost:9000/produto/ - Add a product
- PUT - localhost:9000/produto/ - Update or add a product
- DELETE - localhost:9000/produto/{id} - delete product with such id

#### For Orders
- GET - localhost:9000/pedido/list - List all stored orders
- GET - localhost:9000/pedido/{id} - Display order with such id
- POST - localhost:9000/pedido/ - Add a order
- PUT - localhost:9000/pedido/ - Update or add a order

#### For Deliveries
- GET - localhost:9000/entrega/lista - List all stored deliveries
- GET - localhost:9000/entrega/{id} - Display delivery with such id


For testing these end points, use the following payloads:

```json
"Client": {
  "idClient": 0,
  "clientName": "Name Client"
}
```


```json
"Product": {
  "idProduct": 0,
  "productName": "Name Product",
  "productValue": "10.00"
}
```

```json

"Order": {
  "idClient": 1,
  "idProduct": [1, 2, 3],
  "address": {
    "idAddress": 0,
    "street": "Street Name",
    "establishmentNumber": 123,
    "neighborhood": "Neighborhood Name",
    "complement": "Complement Name",
    "zipCode": "Zip Code"
    }
}
```

### Sprint 02 - RabbitMQ integration

In this step, the RabbitMQ should be used to add and consume a queue.

⚠️ this feature will be detailed soon


### Sprint 03 - Docker

In this step, a docker container should be created to run the application.

⚠️ this feature will be detailed soon

