Feature: Login to Application
  Scenario Outline: login to application
    Given I am on home page
    When I enter <username> and <Password>
    Then I successfully login to application
    Examples:
    |username|Password|
    |JAKEDEP |Smile123|
