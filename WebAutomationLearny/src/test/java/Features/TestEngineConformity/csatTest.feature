Feature: CSAT test feature

  This feature deals with the CSAT test feature functionality of the application

  Scenario: user able to submit the CSAT Test and see the score

    Given Learner is taking a CSAT test

    And answers all questions in CSAT test

    When Learner submit the CSAT test

    Then Learner able to see the score for CSAT test