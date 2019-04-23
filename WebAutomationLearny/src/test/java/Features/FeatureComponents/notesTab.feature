Feature: Notes tab functionality

  This feature deals with Notes tab functionality when learner is eligible

  Scenario: Learner able to create a note under notes tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on notes tab and create a note

    Then Learner should see created note under the notes tab

  Scenario: Learner able to see the created note under notes tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    When Learner clicks on notes tab in lesson player

    Then Learner should see the created note under notes tab in lesson player

  Scenario: Learner able to edit a note under notes tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on discussion tab and edit a question

    Then Learner should see the editied note under the notes tab

  Scenario: Learner able to delete a note under notes tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on notes tab and delete the created note

    Then Learner should not be able to see the created note under the notes tab



