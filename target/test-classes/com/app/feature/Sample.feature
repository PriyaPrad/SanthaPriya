Feature: LoginPage Validation two

  @tag1
  Scenario: Validate the valid username invalid password
    When Enter the username "Aiite2345"
    And Enter the password "Airttb3455678"
    And Enter the login Button
    Then Validate the HomePage
