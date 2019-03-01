Feature: coupon feature for GST disabled school

  This feature deals with the coupon functionality of the application

  Scenario: user able to see change in price based on coupon entered for a course

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    And user able to enter the coupon

    And user able to apply the coupon

    Then user able to see error message or change in price after applying coupon

  Scenario: user able to see the change in price or error message after applying coupon for GST enabled school

    Given I navigated to signup page for GST enable school

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select test from GST enabled school

    And user able to see course price is sales page

    And user able to click buy button in sales page

    Then user able to select country in address form

    And user able to enter his/her username in address form

    And user able to enter address in the address form

    And user able to select the city in address form

    And user able to select the state in address form

    And user able to enter the pincode in the address form

    And user able to enter the mobile number in the address form

    And user able to save the details entered in the address form

    And user able to see the GST price of the course/Test in checkout page

    And user able to enter the coupon

    And user able to apply the coupon

    Then user able to see error message or change in price after applying coupon in GST enabled school

    And user able to see the refund policy

  Scenario: user able to apply coupon for a test series

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select test series

    And user able to enter the coupon

    And user able to apply the coupon

  Scenario: user able to apply coupon for a bundle

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select bundle

    And user able to enter the coupon

    And user able to apply the coupon

  Scenario:  user able to apply coupon for a Mock test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select DebugMockTest

    And user able to enter the coupon

    And user able to apply the coupon

  Scenario: user able to see error message on entering invalid coupon

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    And user able to enter the invalid coupon

    And user able to apply the coupon

   Then user able to see error message on entering invalid coupon


  Scenario: user able to see expired message on entering expired coupon

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    And user able to enter the expired coupon

    And user able to apply the coupon

    Then user able to see error message on entering invalid coupon