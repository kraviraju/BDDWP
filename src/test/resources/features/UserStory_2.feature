Feature: As a Product owner i want the feature to Convert Currancy A to B and vice versa with the currancy converter
  So that the user gets an indiction of the exchange rates and makes an informed decision on thier foriegn transaction.

  Scenario: Click Convert with out entering Amount
    Given I am on the home page
    And Navigate to FX, travel & migrant and Click Currency Converter Btn
    Then User is able convert 1 NZD to USD  and Check success message
    Then User is able convert 1 USD to NZD  and Check success message
    Then User is able convert 1 Pound Sterling  to NZD  and Check success message
    Then User is able convert 1 Swiss Franc to Euro and Check success message
