Feature: Mock test details functionality

  This feature deals with the sales page functionality of mock test in the application

  Scenario: Learner able to purchase a paid mock test

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid mock test

    Then Learner should be able to see purchased message

  Scenario: Learner able to enroll to a free mock test

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a free mock test

    Then Learner should be able to enroll into the free mock test

  Scenario: Learner able to see the details of scheduled mock test

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a scheduled mock test

    Then Learner should be able to see the scheduled time

  Scenario: Learner able to see the expiry details of the mock test

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid mock test

    Then Learner should be able to see expiry details of the mock test