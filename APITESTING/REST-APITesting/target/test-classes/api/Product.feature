@Product
Feature: As user I want to see Product List
  Scenario: GET - As user I have be able to get detail product
    Given user set endpoint for get product
    When user send POST product HTTP request
    Then user see status code product 200
    And user success get detail product
