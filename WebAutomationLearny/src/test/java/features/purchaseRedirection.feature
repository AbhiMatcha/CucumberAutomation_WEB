Feature: Redirection feature when user access without purchasing

  This feature deals with the redirection to purchase page when user tries to access without buying in the application

  Scenario: user able to redirect to payment page after confirming buy option in syllabus section

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the syllabus tab

    And user able to see course title in syllabus section

    And user able to see Lesson title in syllabus section

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    Then user tapping on confirm button should navigate to payment page

    And user should navigate back to sales page from payment page

  Scenario: user able to redirect to payment page after confirming buy option in discussion section

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    Then user tapping on confirm button should navigate to payment page

  Scenario: user able to redirect to payment page after confirming buy option in notes section

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    Then user tapping on confirm button should navigate to payment page

  Scenario: user able to redirect to payment page after confirming buy option in certificate section

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the Certificate tab

    When user able to select download certificate option in certificate section

    And user able to see buy pop-up message with confirm and cancel button when clicks on test under certificate section

    Then user tapping on confirm button should navigate to payment page
