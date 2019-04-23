Feature: GRE test feature

  This feature deals with the GRE test feature functionality of the application

  Scenario: user able to submit the GRE Test and see the score

    Given Learner is taking a GRE test

    And answers all questions in GRE test

    When Learner submit the GRE test

    Then Learner able to see the score for GRE test