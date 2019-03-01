Feature: pdf feature

  This feature deals with the pdf feature functionality of the application

  Scenario: user able to access all options in pdf

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select pdf Lesson in syllabus section

    And switch frame to access pdf lesson

    Then user able to click zoom in option

    Then user able to click zoom out option

    Then user able to click bookmark option

    Then user able to click toggle option

    Then user able to click thumbnail option

    Then user able to see total pages

    Then user able to click find option