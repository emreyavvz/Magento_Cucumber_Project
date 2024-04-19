Feature:Adding / removing items from the shopping cart

  Scenario:Adding a Product to the Cart
    Given The user is logged into their account
    When The user browses the homepage
    And The user clicks on shop
    And The user adds a randomly selected product to the cart
    Then The product should be added successfully