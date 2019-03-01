Feature: Notes feature

  This feature deals with the notes page functionality of the application

  Scenario: user should be able create a note using all options

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

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

    And user able to post the question

  Scenario: user should be able edit the note

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    And user able to see the purchased message in course details

    Then user should be able to select the Notes tab

    Then user able to the edit option

    And user able to edit the input and post the question

  Scenario: user should be able delete the note

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    And user able to see the purchased message in course details

    Then user should be able to select the Notes tab

    And user able to delete the notes


  Scenario: user able to do payment through notes tab

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    And user able to see and confirm buy pop-up alert on selecting test

    And user able to redirect to payment page and click pay securely button

    And switch frame before selecting payment

    And user able to enter mobile number

    Then user able to select net banking option

    And user able to select any bank

    Then user able to click on paynow button

    Then user able to see the start course option after completing payment

