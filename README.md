# Spring-Boot-Web-Client-Implementation

# Spring Boot Web Client Implementation

We have many ways to establish microservices communication in spring boot.
Some of them are 

    1. Web Client
    2. Rest Template
    3. Open Feign
In this example I used Web Client to establish communication between two services web client producer and web client consumer.

### Web Client Producer:
 This will perform CRUD operations on a Book Store.

### Web Client Consumer: 
This will invoke Web Client producer Controllers via Web Client.




## API Reference

### Payload
 ```
 {
        "bookName": "Harry potter and the Goblet of Fire",
        "auotherName": "J.K Rowling",
        "price": 500.0,
        "rating": 4.0
  }
```    
#### Endpoint URL's


| Endpoint       | parameters          | Description                |
| :------------- | :----------------   | :------------------------- |
| `/saveBook`    | `above payload`     | `To save a new book`       |
| `/getAllBooks` | `NA`                | `To get all books`       |
| `/getBookById` | `id`                | `To get a specific book`       |
| `/deleteBookById` | `id`   | `To delete a specific book`       |



