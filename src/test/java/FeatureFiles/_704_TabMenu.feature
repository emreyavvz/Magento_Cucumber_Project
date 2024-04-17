Feature: TAB Menu Functionality

  Scenario: Tab Menu check

    Given Navigate to Magneto
    When The user should be able to see Tab Menu
    And Hover To Element
      | Women |
      | Men |
      | Gear |
      | Training |
      | Sale |

    And Hover To Element
      | Women |
      | womenTops |
      | womenBottoms |

    Then The user should be able to see the WOMEN Top and Bottom Categories

    And Hover To Element
      | Men |
      | menTops |
      | menBottoms |

    Then The user should be able to see the Men Top and Bottom Categories










