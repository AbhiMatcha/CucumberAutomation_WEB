Feature: Quiz Information

  This feature deals with the information of the quiz

  - Instruction
  - All Questions
  - Legends

  Scenario: Learner sees instruction before starting quiz

    Given Learner selects {} quiz

    When Learner takes {} quiz

    Then Learner able to see the instructions

  Scenario: Learner can go to instruction screen in middle of Quiz

    Given Learner starts {} quiz

    When Learner select read instructions option

    Then Learner go to instruction screen

  Scenario: Learner can see all questions at once

    Given Learner starts {} quiz

    When Learner select all Questions option

    Then Learner go to instruction screen

  Scenario: Learner can see Question legends

    Given Learner starts {} quiz

    When Learner is in question player

    Then Learner see {legend} with {colour}

  Scenario: Learner can use calculator

    Given Learner selects {} quiz

    When Learner takes {} quiz

    Then Learner able to use the calculator

