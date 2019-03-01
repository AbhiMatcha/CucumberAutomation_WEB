Feature: Test series details feature

  This feature deals with the sales page functionality of test series in the application

  Scenario: user able to see the Test series details in sales page

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select test series

    Then user should be able to select the overview tab

    And user able to see the course description of test series

    And user able to see the school name at the footer

    And user should be able to select the analytics tab

    Then user able to see the message before he/she buy the course

    Then user should be able to select the Notes tab

    Then user should be able to select the discussion tab

    Then user should be able to select the review tab

    Then user should be able to select the overview tab

    And user able to scroll down to see the pricing details of test series

    And user should see the actual and discount price for Test series

    And user able to see course expiry

    Then user able to see the buy button