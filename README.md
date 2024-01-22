# D-Baesics - Ecommerce and Inventory Management System

D'Baesic Apparel's Ecommerce and Inventory Management System, powered by Java Spring Boot and Thymeleaf, integrates the Stripe API. Launched successfully, it doubled sales to 10k orders, featuring an admin dashboard for 50% increased productivity by tracking sales, costs, and product performance. A game-changer in online retail.

## Overview

D'Baesics Ecommerce and Inventory Management System is a Java Spring Boot-based application designed to streamline online shopping and inventory management processes. With integrated features such as secure user authentication, seamless payment processing through the Stripe API, and a user-friendly admin dashboard, this system aims to enhance the overall online retail experience.

## Key Features

- **User Authentication**: Secure login/signup functionality for users.
- **Shopping Cart**: Add, view, update, and remove items with ease.
- **Checkout and Payment**: Seamless payment processing using the Stripe API.
- **Inventory Management**: Admin dashboard for efficient inventory control.
- **Real-time Shipping Updates**: Track order status and receive timely shipping updates.

## User Stories

### For the Shopper:

#### Add Items to Shopping Cart

**Acceptance Criteria**
- Select an item and click the "Add to Cart" button.
- Verify that the selected item is successfully added to the cart.

#### View Shopping Cart

**Acceptance Criteria**
- Add items to the cart.
- Navigate to the "View Cart" section.
- Confirm that the added items are displayed.

### For the Business Owner:

#### Efficient Inventory Management

**Acceptance Criteria**
- Add new products with details such as name, category, price, and quantity.
- Update product information, including price and quantity.
- Mark products as out of stock or remove them from the inventory.
- Receive real-time updates on product availability.

## System Architecture

### Backend (Java Spring Boot)

1. **Controllers**: Create controllers to handle different functionalities.
2. **Service Layer**: Implement services to encapsulate business logic.
3. **Data Access Layer**: Utilize Spring Data JPA for database access.
4. **Models**: Define Java classes for entities like Product, User, Cart, Order, and Inventory.
5. **Security**: Implement security features using Spring Security if required.

### Frontend (Thymeleaf with HTML/CSS/Bootstrap)

- Develop frontend interfaces for end-users and business owners using HTML, CSS, and Bootstrap.

## Database Design

### Entity Relationship Diagram (ERD)

1. **Product**: ID, Name, Description, Price, Quantity, Category, Image URL.
2. **User**: ID, Username, Password (hashed), Email.
3. **Cart**: ID, User ID.
4. **Order**: ID, User ID, Order Date, Status (e.g., Pending, Shipped).
5. **CartItem**: ID, Product ID, Quantity.
6. **Inventory**: ID, Product ID, Purchase Cost, Sale Price.

## Development Milestones

- **January 15, 2024**: Initial navigation setup and Product table creation.

## Testing

- Perform comprehensive testing of each feature to ensure functionality and security.

## Deployment

- Deploy the application to a suitable server for public access.

## Maintenance

- Regularly update dependencies and address any reported issues.
