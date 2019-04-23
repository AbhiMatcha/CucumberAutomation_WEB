Feature: Result page functionality

  This feature deals with the result page functionality of the application

  Scenario: Learner able to see the solutions in result page

    Given Learner is on result page

    When Learner clicks on solutions button

    Then Learner able to see the solutions of all questions

  Scenario: Learner able to retake the test in result page

    Given Learner is on result page

    When Learner clicks on retake button

    Then Learner able to take the test again

  Scenario: Learner able to see the detailed analysis of all questions

    Given Learner is on result page

    When Learner clicks on detailed analysis button

    Then Learner able to see the detailed analysis of all questions

  Scenario: Learner able to exit the test from result page

    Given Learner is on result page

    When Learner clicks on exit button

    Then Learner able to navigate to sales page by exiting the test from result page

  Scenario: Learner able to see the score report of the test in result page

    Given Learner is on result page

    When Learner scroll to score report section in result page

    Then Learner able to see the score for each section

  Scenario: Learner able to see the score report of the test in result page

    Given Learner is on result page

    When Learner scroll to distribution section in result page

    Then Learner able to see the results based on filter applied

  Scenario: Learner able to see the percentile of the test in result page

    Given Learner is on result page

    When Learner scroll to percentila section in result page

    Then Learner able to see the precentile results in percentile section

  Scenario: Learner able to see the topic analysis of the test in result page

    Given Learner is on result page

    When Learner scroll to topic analysis section in result page

    Then Learner able to see the results based on section selected

  Scenario: Learner able to see the leaderboard standing's in result page

    Given Learner is on result page

    When Learner scroll to leaderboard section in result page

    Then Learner able to see the score in leader board section
