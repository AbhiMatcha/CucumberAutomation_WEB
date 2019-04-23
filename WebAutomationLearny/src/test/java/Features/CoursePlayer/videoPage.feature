Feature: Video functionality

  This feature deals with the functionality of video in the application

  Scenario: Learner able to change the speed of the learnyst video

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects video Lesson in syllabus section

    And Learner play the video

    And Learner selects option to change speed

    Then Learner able to change the speed of the video

  Scenario: user able to change the quality of the learnyst video

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects video Lesson in syllabus section

    And Learner play the video

    And Learner selects option to change quality

    Then Learner able to change the quality of the video

  Scenario: Learner able to view the video in full screen mode

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects video Lesson in syllabus section

    And Learner play the video

    And  Learner selects fullscreen option

    Then Learner able to see video in full screen view

  Scenario: Learner able to see the remaining time of the video

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects video Lesson in syllabus section

    And Learner play the video

    Then Learner able to see the remaining time of the video

  Scenario: Learner able to play the video in between

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects video Lesson in syllabus section

    And Learner play the video

    Then Learner able to play video in between
