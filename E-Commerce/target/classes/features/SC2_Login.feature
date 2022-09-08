@Runner
Feature: Login | user could be able to log in with valid email and password

  Scenario: user could log in with valid credentials

    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
