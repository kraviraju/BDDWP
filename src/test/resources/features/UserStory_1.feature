Feature: As a Product owner if there is no amount entered and the convert button is clicked then i want to see an error message.
  It should display error message saying that Plese enter the amount you want to convert.

  Scenario: Click Convert with out entering Amount
    Given I am on the home page
    And Navigate to FX, travel & migrant and Click Currency Converter Btn
    When Click Convert Btn
    Then Display error message and Teardown
