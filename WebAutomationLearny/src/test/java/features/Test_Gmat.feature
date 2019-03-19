Feature: Gmat test feature

  This feature deals with the GMAT test feature functionality of the application

  Scenario: user able to take Gmat test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select Gmat test

    And user able to click the enroll free course button

    And user able to click take test button

    And user able to click start test button

    And user able to see error message when user save the question without answering

    And user able to confirm the alert

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to confirm the alert

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user able to confirm the alert

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to see refresh button after submitting the test

    And user able to navigate back and see the mock test status as evaluation pending