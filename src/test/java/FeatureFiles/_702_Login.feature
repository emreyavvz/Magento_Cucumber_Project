Feature: Login functionality

  Scenario: Successful login
    Given User wants to access the Magento website
    And user wants to login with correct username as "seikox@gmail.com"and password as "1q2w3e4raA."
    When User clicks on the login button
    Then User is successfully redirected to the account dashboard



  Scenario: Login with invalid username
    Given User wants to access the Magento website
    And user wants to login with an invalid username as "serkan1@gmail.com" and correct password as "1q2w3e4raA."
    When User clicks on the login button
    Then User receives an error message and stays on the login page


  Scenario: Login with invalid password
    Given User wants to access the Magento website
    And user wants to login with correct username as "seikox@gmail.com" and an invalid password as "1q2w3e4raA.1"
    When User clicks on the login button
    Then User receives an error message and stays on the login page

  Scenario: Login with empty fields
    Given User wants to access the Magento website
    And user wants to login with empty username and password fields
    When User clicks on the login button
    Then User receives an error message

  Scenario: Forget Password
    Given User wants to access the Magento website
    When User clicks on the Forget Your Password button
    And User enters username as "seikox@gmail.com"
    And User clicks on the ResetMyPassword button