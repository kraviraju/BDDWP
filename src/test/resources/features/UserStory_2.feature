Feature: As a Product owner i want the feature to Convert Currancy A to B and versa with the currancy converter
  So that the user gets an indiction of the exchange rates and makes an informed decision on thier foriegn transaction.

  Scenario Outline: Click Convert with out entering Amount
    Given I am on the home page on URL <url>
    And Navigate to FX, travel & migrant and Click Currency Converter Btn
    And Select <NZD> from Convert from drop down
    And Enter 1 in Amount field
    And Select <USD> from Convert to drop down
    When Click Convert Btn
    And Check success message <SC1>
    And Select <USD> from Convert from drop down
    And Enter 1 in Amount field
    And Select <NZD> from Convert to drop down
    When Click Convert Btn
    And Check success message <SC2>
    And Select <PND> from Convert from drop down
    And Enter 1 in Amount field
    And Select <NZD> from Convert to drop down
    When Click Convert Btn
		And Check success message <SC3>
		And Select <SWF> from Convert from drop down
    And Enter 1 in Amount field
    And Select <EUR> from Convert to drop down
    When Click Convert Btn
		And Check success message <SC4>
		
		
    Examples: 
      | url                     | NZD                  | USD                    | PND              | SWF           | EUR    | SC1																							| SC2																							| SC3																													| SC4 																											|	
      | "https://westpac.co.nz" | "New Zealand Dollar" | "United States Dollar" | "Pound Sterling" | "Swiss Franc" | "Euro" | "User is able convert 1 USD to NZD successfully"| "User is able convert 1 NZD to USD successfully"| "User is able convert 1 Pound Sterling to NZD successfully" | "User is able convert 1 Swiss Franc to Euro successfully" |
