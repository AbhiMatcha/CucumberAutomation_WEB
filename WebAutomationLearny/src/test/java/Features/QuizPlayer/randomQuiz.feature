Feature: Random quiz functionality

  This feature deals with the random quiz functionality of the application

  Scenario: Learner able to take the Random quiz and questions should not get repeated in the same order while retaking the quiz

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner starts taking random quiz under mocktest

    And Learner submit the quiz by answering all questions

    When Learner retakes the same test

    Then Verify learner able to see the shuffled questions while retaking the test

