Feature: profile feature functionality

  This feature deals with the profile page functionality in the application

  Scenario: Learner able to upload proflie picture in profile page

    Given Learner is already logged in and is on home page

    And Learner goes to profile page

    When Learner selects upload button

    And Learner uploads an image

    Then Learner able to see the uploaded image

  Scenario: Learner able to change student name and mobile number in profile page

    Given Learner is already logged in and is on home page

    And Learner goes to profile page

    When Learner enters new name and mobile number

    And Learner clicks on save button

    Then Learner able to see the updated name and mobile number

  Scenario: Learner able to change notification preferences in profile page

    Given Learner is already logged in and is on home page

    And Learner goes to profile page

    When Learner enables notification preferences

    And Learner clicks on save button

    Then notification preferences option is enabled for the learner

  Scenario: Learner able to signout in profile page

    Given Learner is already logged in and is on home page

    And Learner goes to profile page

    When Learner clicks on signout button in profile page

    Then Learner logs out successfully