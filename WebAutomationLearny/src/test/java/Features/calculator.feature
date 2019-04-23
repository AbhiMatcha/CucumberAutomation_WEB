Feature: Calculator functionality

  This feature deals with the calculator feature functionality of the application

  Scenario: Learner is able to use calculator while taking a test

    Given Learner is taking a test

    When Learner selects the calculator while taking the test

    Then Learner should be able to use the calculator functionality

    And Learner should be able to close the calculator