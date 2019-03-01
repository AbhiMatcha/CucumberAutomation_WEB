Feature:  Discussion feature

  This feature deals with the discussion page functionality of the application

  Scenario: user should be post the question using all options in redactor

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

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

    And user able to post the question

  Scenario: user able to edit the posted question in discussion

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    Then user able to the edit option

    And user able to edit the input and post the question

  Scenario: user able to reply to the posted question in discussion

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    And user able to see the reply option

    And user able to reply to the question posted

    Then user able to view the replies posted

  Scenario: user able to view the posted question by another user

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the discussion tab

    And another user able to see the posted question

  Scenario: user able to delete the posted question in discussion

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the discussion tab

    And user able to see the delete button in discussion

    And user able to delete the posted question

  Scenario: user able to do payment through discussion tab

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select ask option in discussion

    And user able to see and confirm buy pop-up alert on selecting test

    And user able to redirect to payment page and click pay securely button

    And switch frame before selecting payment

    And user able to enter mobile number

    Then user able to select net banking option

    And user able to select any bank

    Then user able to click on paynow button

    Then user able to see the start course option after completing payment
