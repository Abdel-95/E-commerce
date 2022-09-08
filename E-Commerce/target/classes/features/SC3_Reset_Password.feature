@Runner
Feature: Reset Password | user could reset his password successfully

  Scenario: user could reset his/her password successfully

    Given user navigate to login page
    And user click on forget password link
    And user fills his Email
    And user click on Recover button
    Then A message is Displayed to user