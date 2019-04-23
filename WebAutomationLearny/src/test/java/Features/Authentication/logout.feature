Feature: Logout functionality

  This feature deals with the learner's logout functionality of the application

Scenario: Learner able to logout

    Given Learner is already logged in and is on home page

    When Learner clicks on Log out

    Then Learner logs out successfully
