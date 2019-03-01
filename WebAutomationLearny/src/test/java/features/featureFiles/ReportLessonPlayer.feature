Feature: report feature in lesson player

  This feature deals with the functionality of report in the lesson player

  Scenario: user able to send report in lesson player

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

    Then user able to send report through lesson player

    And user able to confirm the alert