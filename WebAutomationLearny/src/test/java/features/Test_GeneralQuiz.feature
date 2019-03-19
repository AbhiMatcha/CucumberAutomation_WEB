Feature: general quiz feature

  This feature deals with the general quiz feature functionality of the application

  Scenario: user able to take general quiz

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the general quiz

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user able to confirm the submit

    And user able to click final submit

    And user able to solutions button after completing test