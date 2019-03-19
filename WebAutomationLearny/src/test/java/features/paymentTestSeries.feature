Feature: payment feature in Test series

  This feature deals with payment functionality for Test series in the application

  Scenario: user able to do payment for Test series

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select test series

    And user able to click buy button in sales page

    And user able to redirect to payment page and click pay securely button

    And switch frame before selecting payment

    And user able to enter mobile number

    Then user able to select net banking option

    And user able to select any bank

    Then user able to click on paynow button

    Then user able to see the start course option after completing payment

    And user should navigate back to sales page from payment page and select syllabus tab
