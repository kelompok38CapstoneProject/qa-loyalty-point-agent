@Roleadmin
Feature: As admin I want to get all users role admin
  Scenario: GET - As admin I want to get all users role admin
    Given Admin set GET endpoint role admin
    When  send GET HTTP request role admin
    Then Admin receive status code 200
    And Admin receive valid url