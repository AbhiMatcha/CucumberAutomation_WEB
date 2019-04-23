Feature: All supported question types

  This feature deals with the all types of questions supported in quiz

  - Single Option MCQ
  - Multi Option MCQ
  - Numerical
  - Fill in Blanks
  - Essay Question

  Scenario: Learner able to view instruction in question

    Given Learner starts {} quiz

    When Learner view

    Then Learner able to see the instructions in question


  Scenario Outline: Learner able to answer single option MCQ question

    Given Learner starts {} quiz

    When Learner answers <QuestionType> question with <answer> option for <QuizTtype>

    Then Learner scores {}
    Examples:

      | QuestionType | answer | QuizTtype |
      | MCQ           | 1      | GMAt      |

  Scenario: Learner able to answer multiple option MCQ question

    Given Learner starts {} quiz

    When Learner answers {MCQ} question with {} option for <Quiz type>

    Then Learner scores {}

  Scenario: Learner able to answer Fill in Blank question

    Given Learner starts {} quiz

    When Learner answers {fill in the blank} question with {answer} for <Quiz type>

    Then Learner scores {}

  Scenario: Learner able to answer Numerical question

    Given Learner starts {} quiz

    When Learner answers {numerical} question with {answer} for <Quiz type>

    Then Learner scores {}

  Scenario: Learner able to answer Essay question

    Given Learner starts {} quiz

    When Learner answers {essay} question with {answer} for <Quiz type>

    Then Learner scores {}

#  Scenario: Learner able to view mathjax in question

  Scenario: Learner able to view images in question

    Given Learner starts {} quiz

    When Learner navigates to question which have images

    Then Learner able to view images in the question

  Scenario Outline: Learner able to submit the test with all question types

    Given Learner starts <QUIZ> quiz

    When Learner answer <ae> question with <lat> answer for <lon>

    And  Learner submit the test

    Then Learner able to see the score

    Examples:
      | ae   | lat       | lon         |
      | KMSY | 29.993333 | -90.258056  |
      | KSFO | 37.618889 | -122.375000 |
      | KSEA | 47.448889 | -122.309444 |
      | KJFK | 40.639722 | -73.778889  |