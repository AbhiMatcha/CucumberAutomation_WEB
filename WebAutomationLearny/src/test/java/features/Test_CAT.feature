Feature: CAT test feature

  This feature deals with the CAT test feature functionality of the application

  Scenario: user able to take the CAT Test by using calculator

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

    And user able to answer the first question in section one of CAT test

    And user should be able to save the answered question

    And user able to answer the second question in section one of CAT test

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to confirm the submit

    And user able to answer the first question in second section of CAT test

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to confirm the submit

    Then user able to select calculator while taking the test

    And user able to perform multiplication of two values

    And user able to close the calculator

    And user able to answer the first question in third section of CAT test

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to confirm the submit

    Then collect the details the top ten students in result page under leaderboard section
