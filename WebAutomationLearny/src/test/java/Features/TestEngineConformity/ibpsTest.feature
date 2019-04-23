Feature: IBPS test feature

  This feature deals with the IBPS test feature functionality of the application

  Scenario: user able to submit the IBPS Test and see the score

    Given Learner is taking a IBPS test

    And answers all questions in IBPS test

    When Learner submit the IBPS test

    Then Learner able to see the score for IBPS test