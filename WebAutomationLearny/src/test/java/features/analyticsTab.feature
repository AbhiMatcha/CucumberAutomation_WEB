Feature: Analytics tab feature

  This feature deals with the analytics page functionality of the application

  Scenario: user as visitor accessing analytics tab

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select test series

    And user should be able to select the analytics tab

    Then user able to see the message before he/she buy the course
