Feature: slide feature

  This feature deals with the slide feature functionality of the application

  Scenario:  user able to access all options in slide and move to next lesson on selecting mark as complete option

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select slide Lesson in syllabus section

    And user able to select previous button

    And user able to select next button

    Then user able to select next slide button

    Then user able to select previous slide button

    Then user able to select first slide button

    Then user able to select last slide button

    Then user able to select next slide button

    Then user able to see mark as complete and revise options

    And user able to select mark as complete option

    Then user able to move to next lesson on selecting mark as complete
