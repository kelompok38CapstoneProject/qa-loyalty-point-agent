Feature: Product
  @Product1
  Scenario: as admin I want to see product list
    Given admin on home page
    When admin click product button
    Then admin can see product list