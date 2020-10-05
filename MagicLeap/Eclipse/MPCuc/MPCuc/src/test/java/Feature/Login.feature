#Author: Firooz Yazdi
#Keywords Summary : Magic Leap Quality Engineer Assignment
#Background: List of steps run before each of the scenarios

Feature: Verify "Magic Leap One CREATOR EDITION” exists and fill out contact form

  Scenario: Verify feature element exists and fill out contact form
    Given user is on Magic Leap homepage
    When  user fills out contact form and clicks on Submit button
    Then  the message Thanks See ya soon is displayed
    And   refresh homepage
    And   user looks for Calling all developers