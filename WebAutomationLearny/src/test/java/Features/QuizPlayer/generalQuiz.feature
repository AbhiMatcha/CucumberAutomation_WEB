Feature: general Quiz feature

  This feature deals with the general Quiz feature functionality of the application

  Scenario: user able to submit the general Quiz and see the score

    Given Learner is taking a general Quiz

    And answers all questions in general Quiz

    When Learner submit the general Quiz

    Then Learner able to see the score for general Quiz