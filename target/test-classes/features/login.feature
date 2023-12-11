@Login
Feature: This feature will be used to login into Simplilearn Website

  Background: 
    Given I have launched the application URL
    And I click on the Login link

  Scenario: Validate Login success scenario
    When I enter the username
    And I enter the password
    And I click on the login button
    Then I should land on the home page

  @Sanity
  Scenario: Validate Login failure scenario by using data parameters
    When I enter the username as "abcsd"
    And I enter the password as "ajdas"
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."
	
	@WIP
  Scenario Outline: Validate Login failure scenario using Examples
    When I enter the username as "<Username>"
    And I enter the password as "<Pass>"
    Then I should get the error message as "<Errormsg>"

    Examples: 
      | UserName | Pass | Errormsg                                           |
      | adasdasf | 1233 | The email or password you have entered is invalid. |
      | aaaaaa   | 12s1 | The email or password you have entered is invalid. |

  @Sanity @Regression
  Scenario: Validate the other login options on the screen
    Then I should see below login options on the screen
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
