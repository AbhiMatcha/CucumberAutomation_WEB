Feature: GATE test feature

  This feature deals with the GATE test feature functionality of the application

  Scenario: user able to submit the GATE Test and see the score

    Given Learner is taking a GATE test

    And answers all questions in GATE test

    When Learner submit the GATE test

    Then Learner able to see the score for GATE test