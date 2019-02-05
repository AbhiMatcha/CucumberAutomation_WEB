Feature: Course details feature

  This feature deals with the sales page functionality of the application

  Scenario Outline: user able to access overview tab in course details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should see the actual and discount price for course

    And user able to see the school name at the footer

    Then user should be able to select the overview tab

    And user able to see description of the course

    And user able to see course expiry

    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |

  Scenario Outline: user able to access syllabus tab in course details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

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

    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |

  Scenario Outline: user able to access discussion tab in course details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    Then user tapping on confirm button should navigate to payment page

    And user should navigate back to sales page from payment page


    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |

  Scenario Outline: user able to access Notes tab in course details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    Then user tapping on confirm button should navigate to payment page

    And user should navigate back to sales page from payment page


    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |


  Scenario Outline: user able to access certificate tab in course details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user should be able to select the Certificate tab

    When user able to select download certificate option in certificate section

    And user able to see buy pop-up message with confirm and cancel button when clicks on test under certificate section

    Then user tapping on confirm button should navigate to payment page

    And user should navigate back to sales page from payment page


    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |


  Scenario Outline: user able to see course details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the course

    Then user able to see the buy button

    And user able to enter the coupon

    And user able to apply the coupon

    Then user able to see error message or change in price after applying coupon

    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |
