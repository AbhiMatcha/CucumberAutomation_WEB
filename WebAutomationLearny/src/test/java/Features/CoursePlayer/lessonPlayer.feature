Feature: Lesson player functionality

  This feature deals with the Lesson player functionality in the application

  Scenario: Learner able to select back option in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects back option in lesson player

    Then Learner navigates to sales page

  Scenario: Learner able to select report option in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects report option in lesson player

    And Learner select send report option

    Then Learner can see the success message after reporting

  Scenario: Learner able to select full screen option in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects full screen option in lesson player

    Then Learner views lesson in full screen

  Scenario: Learner able to select mark as complete option in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects mark as complete option in lesson player

    Then Learner mark the lesson as completed
