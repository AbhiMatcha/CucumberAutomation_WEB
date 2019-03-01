Feature: certificate tab feature

  This feature deals with the certificate page functionality of the application

  Scenario: user able to see the error message if test is not taken by student

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the course

    And user should be able to select the Certificate tab

    And user able to see error message when he/she didnt taken the test

  Scenario: user able to see the qualifying marks

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the course

    And user should be able to select the Certificate tab

    And user able to see test name under certificate section

    And user able to see the qualifying marks of the test to download certificate

  Scenario: user able to see the test status

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the course

    And user should be able to select the Certificate tab

    And user able to see test name under certificate section

    And user able to see the test status under certificate section

  Scenario: user able to do payment through certificate tab

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the course

    And user should be able to select the Certificate tab

    And user able to select the test under certificate tab

    And user able to see and confirm buy pop-up alert on selecting test

    And user able to redirect to payment page and click pay securely button

    And switch frame before selecting payment

    And user able to enter mobile number

    Then user able to select net banking option

    And user able to select any bank

    Then user able to click on paynow button

    Then user able to see the start course option after completing payment