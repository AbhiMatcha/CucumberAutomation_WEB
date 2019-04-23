Feature: CAT test feature

  This feature deals with the CAT test feature functionality of the application

  Scenario: user able to submit the CAT Test and see the score

    Given Learner is taking a CAT test

    And answers all questions in CAT test

    When Learner submit the CAT test

    Then Learner able to see the score for CAT test