Feature: Course details functionality

  This feature deals with the sales page functionality of course in the application

  Scenario: Learner able to purchase a paid course

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid course

    Then Learner should be able to see purchased message

  Scenario: Learner able to enroll to a free course

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a free course

    Then Learner should be able to enroll into the free course

  Scenario: Learner able to see the details of scheduled course

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a scheduled course

    Then Learner should be able to see the scheduled time

  Scenario: Learner able to see the expiry details of the course

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid course

    Then Learner should be able to see expiry details of the course