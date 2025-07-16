
Feature: login feature
We need validate the login feature of test cases

@reg
  Scenario: Validate the login functionality with valid username and password
    Given User should be login page
    When  user enters valid username "Testing@gmail.com"
    And user enters valid password "P2442"
    And Clicks on submit
    


 Scenario Outline: Validate the login functionality with valid username and password
      Given User should be login page
    When  user enters valid usernameM"<username>"
    And user enters valid passwordM"<password>"
    And Clicks on submit
    And close the browser
    Examples: 
      | username  | password |
      | Testing@gmail.com | P23543|
      | Mahesh@gmail.com |  Pfh3738 |