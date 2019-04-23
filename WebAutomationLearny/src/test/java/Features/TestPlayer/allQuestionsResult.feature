Feature: All questions result

  This feature deals with all type of question results

  Scenario: Learner able to answer MCQ question

    Given Learner is taking a test

    When Learner answer a MCQ question by selecting option

    And Learner selects save and next option

    Then Learner navigates to next question

  Scenario: Learner able to answer MCQ question with multiple answer

    Given Learner navigated to MCQ question which have multiple options

    When Learner answer a MCQ question by selecting multiple options

    And Learner selects save and next option

    Then Learner navigates to next question

  Scenario: Learner able to answer Fill in the blank question

    Given Learner navigated to fill in the blank question

    When Learner answer a fill in the blank question

    And Learner selects save and next option

    Then Learner navigates to next question

  Scenario: Learner able to answer Essay question

    Given Learner navigated to essay type question

    When Learner answer a essay question by entering long text

    And Learner selects save and next option

    Then Learner navigates to next question

  Scenario: Learner able to answer Numeric type question

    Given Learner navigated to numerical question

    When Learner answer a Numeric question by entering numberic value

    And Learner selects save and next option

    Then Learner navigates to next question

#  Scenario: Learner able to submit the test after answering all question types
#
#    Given Learner is taking a test
#
#    When Learner answer all questions
#
#    Then Learner able to submit the test
