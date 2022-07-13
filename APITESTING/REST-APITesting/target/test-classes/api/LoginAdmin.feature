@LoginAdmin
Feature: As admin I want to login

  @Login
  Scenario: POST- As admin I input valid password and valid username
    Given Admin set POST api endpoint for login
    When Admin send POST HTTP request
    Then  Admin receive status code 200 and success login





