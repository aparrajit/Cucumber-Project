Feature: This feature will help to develop a calculator

  Background: 
    Given I have the calculator

  Scenario: To add two numbers
    When I add 11 and 4
    Then I should get the result as 15

  Scenario: To subtract two numbers
    Given I have the calculator
    When I subtract 11 and 4
    Then I should get the result as 7

  Scenario Outline: To add two numbers with multiple data sets
    When I add <num1> and <num2>
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    5 |    6 |     11 |
      |    2 |    7 |      9 |
      |   -8 |   18 |     10 |

  Scenario: To add multiple numbers
    When I add multiple numbers
      | 10 |
      | 10 |
      | 30 |
      | 40 |
    Then I should get the result as 90

  Scenario: To calculate the total bill of all the items
    When I buy the items below
      | Apple   | 50 |
      | orange  | 30 |
      | penicil | 20 |
    Then I should get the result as 100

  Scenario: To calculate the total bill of all items with different quantity
    When I buy below items with given price and quantity
      | Apple  | 2 | 10 |
      | orange | 3 | 10 |
      | grapes | 6 | 10 |
    Then I should get the result as 110
