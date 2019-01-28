Feature: Syllabus feature

  This feature deals with the syllabus functionality of the application

  Scenario Outline: Verify syllabus tab in course details

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle in MY COURSES section

    And user able to select the courses tab

    And user able to select course 'Fill in the blank' to verify discussion module

    And user able to see the purchased message in course details

    Then user should be able to select the syllabus tab

    And user able to see the status of test completion

    And user able to see course title in syllabus section

    And user able to see Lesson title in syllabus section

    Then verifu user navigated to take test page

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |