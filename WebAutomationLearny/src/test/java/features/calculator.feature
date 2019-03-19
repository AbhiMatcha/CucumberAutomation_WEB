Feature: calculator feature

  This feature deals with the calculator feature functionality of the application

  Scenario: user able to use calculator while taking test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    And save the user name from profile

    Given user navigated to offered courses

    And user should be able to select the CAT MockTest

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    And user able to cancel the restoring answer option if it displays

    Then user able to select calculator while taking the test

    And user able to perform multiplication of two values

    And user able to close the calculator

    And user able to answer the first question in section one of CAT test