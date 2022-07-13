@Transaction
  Feature: As a user I want to make transactions

  @Negative
    Scenario: GET- As user I want to see all transaction unauthorized
      Given user set GET transaction api andpoints
      When  user send GET transaction HTTP request
      Then user receive valid HTTP response code 401
      And user receive valid data all transactions Unauthorized
