Feature: IBPS PO test feature

  This feature deals with the IBPS PO test feature functionality of the application

  Scenario: user able to submit the IBPS PO Test and see the score

    Given Learner is taking a IBPS PO test

    And answers all questions in IBPS PO test

    When Learner submit the IBPS PO test

    Then Learner able to see the score for IBPS PO test