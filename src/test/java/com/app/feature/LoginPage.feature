Feature: LoginPage Validation

  Background: 
    Given Login to application

  @tag1
  Scenario: Validate the valid username and password
    When Enter the username "Anandha1997"
    And Enter the password "Serv@456kl"
    And Enter the login Button
    Then Validate the HomePage