Feature: Detailed analysis functionality

  This feature deals with the learner's detailed analysis functionality of the application

  Scenario: Learner able to see the detailed analysis table with suitable columns

    Given Learner is taking a general Quiz

    And answers all questions in general Quiz

    When Learner submit the general Quiz

    And Learner selects detailed analysis option in result page

    Then Learner able to see the table related to the test

  Scenario: Learner able to see the detailed analysis based on section selected

    Given Learner is taking a general Quiz

    And answers all questions in general Quiz

    When Learner submit the general Quiz

    And Learner selects detailed analysis option in result page

    Then Learner able to see the result based on section selected

  Scenario: Learner able to navigate to a particular question from detailed analysis

    Given Learner is taking a general Quiz

    And answers all questions in general Quiz

    When Learner submit the general Quiz

    And Learner selects detailed analysis option in result page

    And Learner select a question in detailed analysis

    Then Learner able to navigate to a particular question from detailed analysis