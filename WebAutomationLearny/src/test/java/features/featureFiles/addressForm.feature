Feature: address form feature in checkout page for GST enabled

  This feature deals with the checkout page functionality of the application

  Scenario: user able to save the information of address form

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
