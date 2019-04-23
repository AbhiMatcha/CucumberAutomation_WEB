Feature: Auto save functionality

  This feature deals with the Auto save functionality of the application while taking test

  Scenario: Learner able to exit and continue the test with auto saved answers

    Given Learner is taking a test

    And answers few questions

    When Learner exits the test without submitting

    And Learner chooses to continue the same test

    Then Learner should be able to continue the test with auto saved answers