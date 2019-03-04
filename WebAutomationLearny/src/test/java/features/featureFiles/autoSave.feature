Feature: Auto save feature

  This feature deals with the Auto save functionality of the application whike taking test

  Scenario: user able to exit and continue the test when the auto save option is enabled

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select IITjee test

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    When user navigated to test he/she should be able to see read instructions

    And user able to click on read instructions

    And user able to go back to test on tapping back button

    And user able to see the timer displayed

    And user able to see all questions button

    Then user able to see all questions by tapping all questions button

    And user able to go back to test on tapping back button

    Then user able to answer the multiple choice question

    And user able to see mark for review option

    And user should be able to click mark for review option

    And user able to switch chemsitry section

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to exit from the test by tapping back button

    And user able to click take test button

    And user able to click start test button

    Then user able to restore the answered questions

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question
