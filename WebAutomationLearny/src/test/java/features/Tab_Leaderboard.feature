Feature: download tab feature

  This feature deals with the download tab functionality of the application

  Scenario: user able to see the student, rank and score columns

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the CAT MockTest

    Then user should be able to select the Leader board tab

    And user able to see student name under leader board section

    And user able to see Rank under leader board section

    And user able to see score under leader board section
