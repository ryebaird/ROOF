# ROOF 

## Project Description

ROOF application serves customers to create orders for pickup from the restaurant if it is within their radius. It will keep them updated with messages/emails of the status of their order and inform them when their food is ready to be picked up. It uses Google Maps to determine the radius applicable for ordering.

## Technologies Used

### Language: 

* Java 8  
* Spring Boot 

### Persistence: 

* MySQL DB 

### Testing: 

* JUnit 
* Spring Test 
* Mockito 

### Deployment & Automation: 

* Docker 
* Kubernetes (GKE)

### Monitoring & Log Aggregation: 

* Prometheus  
* Grafana  

### 3rd Party Integrations: 

* Google Distance Matrix API 

### CI/CD: 

* Jenkins  

### Version Control: 

* Git/Github

## Features

List of features ready and TODOs for future development
* Customer focused API that accepts customer orders and utilizes the Google Maps directions api to limit orders to within 25 miles of location
* Resteraunt focused API that allows the order status to be updated and notifies the customer of each change either via email or text utilising the Twillio messaging API
* Hosted in a kubernetes pod

To-do list:
* Implement an online payment process utilizing a third party API.
* Allow for better menu item selection and ordering

## Getting Started


## Contributors
Ryan Baird
Zufishan Ali
Amandeep Kaur Aulakh

## License

This project uses the following license: [BSD](LICENSE).
