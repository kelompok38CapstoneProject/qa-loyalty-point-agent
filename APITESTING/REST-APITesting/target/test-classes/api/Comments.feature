@Comments
Feature: As user I want to get products comment
  Scenario: GET - As user I have be able to get products comment
    Given user set endpoint for get products comment
    When user send GET products comment HTTP request
    Then user see status code product comment 200