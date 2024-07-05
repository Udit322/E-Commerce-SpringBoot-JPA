# E-Commerce-SpringBoot-JPA 


### Repository Documentation

## Overview
This is an e-commerce application built using Spring Boot and JPA. The application supports functionalities such as managing customers, products, orders, carts, reviews, and wishlists.

## Features
- Customer Management
- Product Management
- Order Management
- Cart Management
- Review Management
- Wishlist Management

## Technologies Used
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate
- JSON

## Prerequisites
- Java 11 or higher
- Maven
- MySQL

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/Udit322/E-Commerce-SpringBoot-JPA.git
cd E-Commerce-SpringBoot-JPA
```

### Setup MySQL Database
1. Create a new MySQL database:
```sql
CREATE DATABASE ecommerce_db;
```
2. Update the database configuration in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints

### Customer
- **Create Customer**: `POST /api/customers/create`
- **Get All Customers**: `GET /api/customers`
- **Get Customer by ID**: `GET /api/customers/{customerId}`
- **Update Customer**: `PUT /api/customers/update/{customerId}`
- **Delete Customer**: `DELETE /api/customers/delete/{customerId}`

### Product
- **Create Product**: `POST /api/products/create`
- **Get All Products**: `GET /api/products`
- **Get Product by ID**: `GET /api/products/{productId}`
- **Update Product**: `PUT /api/products/update/{productId}`
- **Delete Product**: `DELETE /api/products/delete/{productId}`

### Order
- **Create Order**: `POST /api/orders/create`
- **Get All Orders**: `GET /api/orders`
- **Get Order by ID**: `GET /api/orders/{orderId}`
- **Update Order**: `PUT /api/orders/update/{orderId}`
- **Delete Order**: `DELETE /api/orders/delete/{orderId}`

### Cart
- **Add to Cart**: `POST /api/cart/add`
- **Get Cart by Customer ID**: `GET /api/cart/{customerId}`
- **Remove from Cart**: `DELETE /api/cart/remove/{cartId}`

### Review
- **Create Review**: `POST /api/reviews/create`
- **Get Reviews by Product ID**: `GET /api/reviews/product/{productId}`

### Wishlist
- **Add to Wishlist**: `POST /api/wishlist/create`
- **Get Wishlist by Customer ID**: `GET /api/wishlist/customer/{customerId}`
- **Remove from Wishlist**: `DELETE /api/wishlist/remove/{wishlistId}`

## Example JSON Payloads

### Customer
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "mobileNo": "1234567890",
  "emailId": "john.doe@example.com",
  "password": "password123",
  "createdOn": "2024-01-01T12:00:00",
  "cardNumber": "1234-5678-9012-3456"
}
```

### Product
```json
{
  "productName": "Laptop",
  "price": 1000.0,
  "description": "A high-end laptop",
  "manufacturer": "Brand",
  "quantity": 10,
  "category": "ELECTRONICS",
  "status": "AVAILABLE",
  "seller": {
    "sellerId": 1
  }
}
```

### Order
```json
{
  "orderDate": "2024-01-01",
  "orderStatus": "PENDING",
  "totalAmount": 1500.0,
  "customer": {
    "customerId": 1
  },
  "orderItems": [
    {
      "productId": 1,
      "quantity": 1,
      "price": 1000.0
    }
  ]
}
```

### Review
```json
{
  "reviewContent": "Great product!",
  "rating": 5,
  "product": {
    "productId": 1
  },
  "customer": {
    "customerId": 1
  }
}
```

### Wishlist
```json
{
  "customer": {
    "customerId": 1
  },
  "product": {
    "productId": 1
  }
}
```

## Troubleshooting
- Ensure the database is running and the configuration is correct.
- Check the logs for detailed error messages.

## Contributing
Feel free to submit issues or pull requests.



---

Copy this template into your `README.md` file in your repository root. Adjust any sections or details specific to your implementation.
