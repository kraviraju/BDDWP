$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/UserStory_1.feature");
formatter.feature({
  "name": "As a Product owner if there is no amount entered and the convert button is clicked then i want to see an error message.",
  "description": "  It should display error message saying that Plese enter the amount you want to convert.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Click Convert with out entering Amount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page on URL \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to FX, travel \u0026 migrant and Click Currency Converter Btn",
  "keyword": "And "
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.step({
  "name": "Display error message and Teardown",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url"
      ]
    },
    {
      "cells": [
        "\"https://westpac.co.nz\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Click Convert with out entering Amount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page on URL \"https://westpac.co.nz\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Navigate to FX, travel \u0026 migrant and Click Currency Converter Btn",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Display error message and Teardown",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/features/UserStory_2.feature");
formatter.feature({
  "name": "As a Product owner i want the feature to Convert Currancy A to B and versa with the currancy converter",
  "description": "  So that the user gets an indiction of the exchange rates and makes an informed decision on thier foriegn transaction.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Click Convert with out entering Amount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page on URL \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to FX, travel \u0026 migrant and Click Currency Converter Btn",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cNZD\u003e from Convert from drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cUSD\u003e from Convert to drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.step({
  "name": "Check success message \u003cSC1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cUSD\u003e from Convert from drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cNZD\u003e from Convert to drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.step({
  "name": "Check success message \u003cSC2\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cPND\u003e from Convert from drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cNZD\u003e from Convert to drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.step({
  "name": "Check success message \u003cSC3\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cSWF\u003e from Convert from drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.step({
  "name": "Select \u003cEUR\u003e from Convert to drop down",
  "keyword": "And "
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.step({
  "name": "Check success message \u003cSC4\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "NZD",
        "USD",
        "PND",
        "SWF",
        "EUR",
        "SC1",
        "SC2",
        "SC3",
        "SC4"
      ]
    },
    {
      "cells": [
        "\"https://westpac.co.nz\"",
        "\"New Zealand Dollar\"",
        "\"United States Dollar\"",
        "\"Pound Sterling\"",
        "\"Swiss Franc\"",
        "\"Euro\"",
        "\"User is able convert 1 USD to NZD successfully\"",
        "\"User is able convert 1 NZD to USD successfully\"",
        "\"User is able convert 1 Pound Sterling to NZD successfully\"",
        "\"User is able convert 1 Swiss Franc to Euro successfully\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Click Convert with out entering Amount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the home page on URL \"https://westpac.co.nz\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Navigate to FX, travel \u0026 migrant and Click Currency Converter Btn",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"New Zealand Dollar\" from Convert from drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"United States Dollar\" from Convert to drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Check success message \"User is able convert 1 USD to NZD successfully\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"United States Dollar\" from Convert from drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"New Zealand Dollar\" from Convert to drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Check success message \"User is able convert 1 NZD to USD successfully\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"Pound Sterling\" from Convert from drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"New Zealand Dollar\" from Convert to drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Check success message \"User is able convert 1 Pound Sterling to NZD successfully\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"Swiss Franc\" from Convert from drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter 1 in Amount field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"Euro\" from Convert to drop down",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Convert Btn",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Check success message \"User is able convert 1 Swiss Franc to Euro successfully\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});