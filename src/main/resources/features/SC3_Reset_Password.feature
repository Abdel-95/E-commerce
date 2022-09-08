@Runner
Feature: Reset Password | user could reset his password successfully

  Background:user could log in with valid credentials
    Given user navigate to log in page
    And user click on log in link
    When user fills email with valid data
    And user fills  password with valid data
    And user clicks on log in button
    Then user logged in successfully


  Scenario: user could reset his/her password successfully

    Given user navigate to login page
    And user click on forget password link
    And user fills his Email
    And user click on Recover button
    Then A message is Displayed to user