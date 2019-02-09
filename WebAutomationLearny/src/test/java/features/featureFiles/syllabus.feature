Feature: Syllabus feature

  This feature deals with the syllabus functionality of the application

  Scenario Outline: user able to navigate to take test on selecting lesson in syllabus tab

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the syllabus tab

    And user able to see the status of test completion

    And user able to see course title in syllabus section

    And user able to see Lesson title in syllabus section

    Then user should navigate to take test page

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |