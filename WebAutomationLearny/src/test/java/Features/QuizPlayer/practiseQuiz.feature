Feature: practise Quiz feature

  This feature deals with the practise Quiz feature functionality of the application

  Scenario: user able to submit the practise Quiz and see the score

    Given Learner is taking a practise Quiz

    And answers all questions in practise Quiz

    When Learner submit the practise Quiz

    Then Learner able to see the score for practise Quiz