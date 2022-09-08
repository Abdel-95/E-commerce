@Runner
Feature: Registration | user should be able to sign up with new account

  Scenario: user could sign up with valid credentials

    And user navigate to home page
    And user click on register link
    When user fills your personal details with valid data
    And user fills your password with valid data
    And user clicks on register button
    Then success message is displayed

