@Runner

Feature: Different_Tags | user could select different tags
  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully

  Scenario:
    Given user navigate to computer category page
    When user select cool from popular tags
    And  user select digital from popular tags
    And user select game from popular tags
    And user select computer from popular tags