Feature: Login
@Login1
  Scenario: as admin I want to Login using valid data
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin  click login button
    Then admin success login


@Login2
  Scenario: as admin I want to Login using invalid data
    Given admin on login page
    When admin input invalid username
    And admin input invalid password
    And admin  click login button
    Then admin success login