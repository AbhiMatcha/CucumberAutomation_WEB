Feature: CLAT test feature

  This feature deals with the CLAT test feature functionality of the application

  Scenario: user able to submit the CLAT Test and see the score

    Given Learner is taking a CLAT test

    And answers all questions in CLAT test

    When Learner submit the CLAT test

    Then Learner able to see the score for CLAT test