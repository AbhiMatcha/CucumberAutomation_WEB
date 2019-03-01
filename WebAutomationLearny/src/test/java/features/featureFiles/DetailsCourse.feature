Feature: Course details feature

  This feature deals with the sales page functionality of course in the application

  Scenario: user able to see description of the course

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the overview tab

    And user able to see description of the course

  Scenario: user able to see actual and discount price for course

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should see the actual and discount price for course

  Scenario: user should be able to see purchased message in course details

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    And user able to see the purchased message in course details

  Scenario: user able to see expiry date for bundle

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to see course expiry

  Scenario: user able to see the details scheduled course

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the scheduled mock test

    And user able to see the scheduled time for particular mock test

  Scenario: user able to see the details of expired course

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the expired mock test

    And user able to see the expired message for particular mock test

  Scenario: user able to see the school name at the bottom of the page

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    And user able to see the school name at the footer
