Feature: Bundle details functionality

  This feature deals with the sales page functionality of bundle in the application

  Scenario: Learner able to purchase a paid bundle

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid bundle

    Then Learner should be able to see purchased message

  Scenario: Learner able to enroll to a free bundle

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a free bundle

    Then Learner should be able to enroll into the free bundle

  Scenario: Learner able to see the expiry details of the bundle

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid bundle

    Then Learner should be able to see expiry details of the bundle