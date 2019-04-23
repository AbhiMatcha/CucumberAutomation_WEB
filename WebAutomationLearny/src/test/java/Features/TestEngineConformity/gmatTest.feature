Feature: GMAT test feature

  This feature deals with the GMAT test feature functionality of the application

  Scenario: user able to submit the GMAT Test and see the score

    Given Learner is taking a GMAT test

    And answers all questions in GMAT test

    When Learner submit the GMAT test

    Then Learner able to see the score for GMAT test