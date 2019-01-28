Feature:  Discussion feature

  This feature deals with the discussion page functionality of the application

  Scenario Outline: Verifying the functionality of disucssion feature

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle in MY COURSES section

    And user able to select the courses tab

    And user able to select course 'Fill in the blank' to verify discussion module

    And user able to see the purchased message in course details

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    Then user able to see the all fields of the redactor page

    And user able to enter a question as input

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

    And user able to see the reply option

    And user able to reply to the question posted

    Then user able to view the replies posted

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |


  Scenario Outline: Verifying the posted question can be viewd by another user

    Given I navigated to signup page

    And entered <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select bundle in MY COURSES section

    And user able to select the courses tab

    And user able to select course 'Fill in the blank' to verify discussion module

    Then user should be able to select the discussion tab

    And another user able to see the posted question

    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |


  Scenario Outline: Verifying the user able to delete the posted question in disucssion

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle in MY COURSES section

    And user able to select the courses tab

    And user able to select course 'Fill in the blank' to verify discussion module

    Then user should be able to select the discussion tab

    And user able to see the delete button in discussion

    And user able to delete the posted question


    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |