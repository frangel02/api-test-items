

<!-- GETTING STARTED -->
## Getting Started

Documentation Of Api project Test

### Prerequisites

* java 8
* IntelliJ IDea
* Maven
* Postman
  

### Yest Api

Endpoints

* To see documentation api with swagger
   ```sh 
   http://localhost:8080/swagger-ui.html
   ```


* You can import the json file collections request made in postman
   ```sh 
   filesPostmantRequest/ApplaudoApi.postman_collection.json
   ```


1. Create an Item make a Post request
   ```sh
   
   localhost:8080/app/api/v1/item
   
    {
    
    "itemName": "Frangel rodriguez",
    "itemBuyingPrice": 25,
    "itemSellingPrice": 30,
    "itemEnteredByUser":"User Root",
    "itemLastModifiedByUser":"admin"
    
    }
   ```


2. list all Items request
   ```sh 
   localhost:8080/app/api/v1/item
   ```
   
   
   
3. Load detail an Item by id request
   ```sh 
   localhost:8080/app/api/v1/item/1
   ```


3. Search Items by status and Name
   ```sh 
   
   Example:
   localhost:8080/app/api/v1/item/items?itemStatus=AVAILABLE&itemName=Frangel rodriguez
   ```



