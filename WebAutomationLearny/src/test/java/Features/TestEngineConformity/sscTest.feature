Feature: SSC test feature

  This feature deals with the SSC test feature functionality of the application

  Scenario: user able to submit the SSC Test and see the score

    Given Learner is taking a SSC test

    And answers all questions in SSC test

    When Learner submit the SSC test

    Then Learner able to see the score for SSC test