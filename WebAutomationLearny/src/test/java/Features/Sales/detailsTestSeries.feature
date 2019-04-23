Feature: Test Series details functionality

  This feature deals with the sales page functionality of Test Series in the application

  Scenario: Learner able to purchase a paid test series

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid test series

    Then Learner should be able to see purchased message

  Scenario: Learner able to enroll to a free test series

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a free test series

    Then Learner should be able to enroll into the free test series

  Scenario: Learner able to see the details of scheduled test series

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a scheduled test series

    Then Learner should be able to see the scheduled time

  Scenario: Learner able to see the expiry details of the test series

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid test series

    Then Learner should be able to see expiry details of the test series