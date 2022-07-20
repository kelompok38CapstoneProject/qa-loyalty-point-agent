Feature: Users
  @User1
  Scenario: as admin I want to see list of users
    Given admin on home page
    When admin click users button
    Then admin can see list of users