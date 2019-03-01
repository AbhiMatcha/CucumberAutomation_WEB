Feature: mock test details feature

  This feature deals with the sales page functionality of mock test in the application

  Scenario: user able to enroll in mock test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the CAT MockTest

    And user able to click enrol for free course button


  Scenario: user able to see take test option in mock test

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user should be able to select the CAT MockTest

    And user able to see take test button


  Scenario: user able to see test marks, minutes and live status of mock test

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user should be able to select the CAT MockTest

    And user able to see live status of the test

    And user able to see the test marks

    Then Verify test marks contains some value

    And user able to see the test minutes

    Then verify test minutes contains some value

    And user able to see the test level

    Then verify test level contains some value