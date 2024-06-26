# Magento Cucumber Test Automation Project

This project aims to automate testing for various user stories in a Magento-based e-commerce platform using Cucumber and Selenium. The test scenarios cover essential functionalities such as user registration, login, address management, shopping cart operations, product ordering, search functionality, and wish list management.

## User Stories

### User Registration

- **Scenario 1:** Creating a New User Account
  - Verify that a new user can successfully create an account with valid information.

### Login Functionality

- **Scenario 1:** User Login
  - Verify that a registered user can log in to their account using valid credentials.
 
- **Scenario 2:** Login with invalid username
  - Verify that a registered user can't log in to their account using invalid credentials.

- **Scenario 3:** Login with invalid password
  - Verify that a registered user can't log in to their account using invalid credentials.

- **Scenario 4:** Login with empty fields
  - Verify that a registered user can't log in to their account using invalid credentials.

### Address Addition

- **Scenario 1:** Adding an Address
  - Verify that a logged-in user can add a new address to their account.

### TAB Menu

- **Scenario 1:** Navigation through TAB Menu
  - Verify that the TAB menu navigation works correctly across different sections of the website.

### Shopping Cart Operations

- **Scenario 1:** Adding Items to the Cart
  - Verify that users can add items to their shopping cart.
- **Scenario 2:** Removing Items from the Cart
  - Verify that users can remove items from their shopping cart.

### Product Ordering

- **Scenario 7:** Placing an Order
  - Verify that users can successfully place an order for items in their shopping cart.

### Search Functionality

- **Scenario 1:** Product Search
  - Verify that the search functionality returns relevant results based on user input.

### Wish List Management

- **Scenario 1:** Adding Items to Wish List
  - Verify that users can add items to their wish list.
- **Scenario 2:** Removing Items from Wish List
  - Verify that users can remove items from their wish list.

## Technologies Used

- **Cucumber:** Used for writing and executing behavior-driven test scenarios.
- **Selenium:** Used for automating web browser interactions.
- **Java:** Programming language used for writing the automation code.
- **Maven:** Dependency management and build tool for the project.

## Getting Started

1. Clone this repository to your local machine.
2. Ensure you have Java and Maven installed.
3. Install the necessary dependencies using Maven.
4. Configure your test environment settings such as browser type and URL in the configuration file.
5. Run the tests using Maven or your preferred test execution method.







