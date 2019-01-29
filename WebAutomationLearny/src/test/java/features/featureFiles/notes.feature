Feature: Notes feature

  This feature deals with the notes page functionality of the application

  Scenario Outline: Verifying the functionality of Notes feature

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle in MY COURSES section

    And user able to select the courses tab

    And user able to select course 'Fill in the blank' to verify discussion module

    And user able to see the purchased message in course details

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    Then user able to see the all fields of the redactor page for notes

    And user able to enter a notes as input

    And user able to select bold option in redactor and enter input

    And user able to select italic option in redactor and enter input

    And user able to select underline option in redactor and enter input

    And user able to select list option in redactor

    Then user able to enter input using ordered list

    And user able to select list option in redactor

    Then user able to enter input using both unordered list

    And user able to select link option in redactor

    Then user able to see unlink option

    And user able to select insert link option

    And user able to use both text and URL link

    And user able to see cancel and confirm option for inserting link

    And user able to post the question in the discussion

    Then user able to the edit option

    And user able to edit the input and post the question

   And user able to delete the notes

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |
