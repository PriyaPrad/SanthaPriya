Feature: LoginPage Validation

  

  @tag1
  Scenario: Validate the valid username and password
    When Enter the username "Aiite"
    And Enter the password "Airttb345"
    And Enter the login Button
    Then Validate the HomePage

  @tag1
  Scenario: Validate the invalid username and password
    When Enter the username "Aiite12345"
    And Enter the password "Atyuintyu"
    And Enter the login Button
    Then Validate the HomePage

  @tag2
  Scenario Outline: Validate the username and password
    When Enter the username "<username>"
    And Enter the password "<password>"
    And Enter the login Button
    Then Validate the HomePage

    Examples: 
      | username | password      |
      | Aiite1   | AA345678      |
      | Aiite2   | Artyui345678  |
      | Aiite2   | AAfghjk345678 |

  @asList
  Scenario: Validate the valid username and password
    When Update the practise form
      | Yuvaraj               |
      | Sekar                 |
      | yuvi.sekar3@gmail.com |
      | Mob9551411603         |

  #And Enter the password "Airttb345"
  # And Enter the login Button
  #Then Validate the HomePage
  @asMap
  Scenario: Validate the valid username and password
    When Update the practise form
      | Firstname | Yuvaraj               |
      | LastName  | Sekar                 |
      | Email     | yuvi.sekar3@gmail.com |
      | Mobile    | Mob9551411603         |
    #And Enter the password "Airttb345"
   # And Enter the login Button
    #Then Validate the HomePage
