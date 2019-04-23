Feature: Discussion tab functionality

  This feature deals with discussion tab functionality when learner is eligible

  Scenario: Learner able to ask a question under discussion tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on discussion tab and ask a question

    Then Learner should see posted question under the discussion tab

  Scenario: Learner able to see the question posted by another user under discussion tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on discussion tab

    Then Learner should see the question posted by another user under the discussion tab

  Scenario: Learner able to see the posted question under discussion tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    When Learner clicks on discussion tab in lesson player

    Then Learner should see the posted question under discussion tab in lesson player

  Scenario: Learner able to edit a question under discussion tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on discussion tab and edit a question

    Then Learner should see the editied question under the discussion tab

  Scenario: Learner able to reply to a question under discussion tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on discussion tab and reply to a question

    Then Learner should see the reply under the discussion tab

  Scenario: Learner able to delete a question under discussion tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on enroll now

    When Learner clicks on discussion tab and delete the posted question

    Then Learner should not be able to see the posted question under the discussion tab



