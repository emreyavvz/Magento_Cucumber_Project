Feature: Register functionality

  Scenario Outline: Successful user registration
    Given the user is on the Magento registration page
    When the user enters their personal information
      | firstName   | lastName   |
      | <firstName> | <lastName> |
    And the user enters their login credentials
      | email   | password   | confirmPassword   |
      | <email> | <password> | <confirmPassword> |
    And the user clicks on Create an Account button
    And the user should receive a confirmation message

    Examples:
      | firstName | lastName | email              | password  | confirmPassword |
      | John      | Doe      | john.d12oes2@email.com | p@ssw0rd1 | p@ssw0rd1       |
      | Emre      | deneme      | john.12ee@email.com | p@ssw0rd1 | p@ssw0rd1       |


