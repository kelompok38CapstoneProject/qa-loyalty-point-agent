@LoginAdmin
Feature: As admin I want to login

  @Login
  Scenario: POST- As admin I want to login with valid url
    Given Admin set POST api endpoint for login
    When Admin send POST HTTP request
    Then  Admin receive status code 200 and success login





