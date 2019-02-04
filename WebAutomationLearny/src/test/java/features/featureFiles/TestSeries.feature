Feature: Test series feature

  This feature deals with validating Test series functionality in the application

  Scenario Outline: Validating Test series details in sales page

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

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

    And user able to enter the coupon

    And user able to apply the coupon

    Then user able to see error message or change in price after applying coupon for test series

    Then user able to see the buy button

    Examples:

      | signup_email_length | Signup_Password |

      | 9                   | abhi1234        |

  Scenario Outline: Validating payment for Test series

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

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

    Examples:

      | signup_email_length | Signup_Password |

      | 9                   | abhi1234        |


    Scenario Outline: Validating by taking test through syllabus for Test series

      Given I navigated to signup page

      And entered email with length <signup_email_length> and <Signup_Password>

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

      Then user should be able to select the syllabus tab

      And user able to select Math test under syllabus

      And user able to select take test button under math test section in syllabus

      And user able to click start test button

      Then user able to answer the multiple choice question

      And user should be able to save the answered question

      Then user able to answer the fill in the blank question

      And user should be able to save the answered question

      And user able to confirm the alert

      And user able to click final submit

      And user able to navigate back

      And user able to select Chemsitry test under syllabus

      And user able to select take test button under chemistry test section in syllabus

      And user able to click start test button

      Then user able to answer the multiple choice question

      And user should be able to save the answered question

      And user should be able to tap on next after saving the answer

      Then user able to answer the multiple choice question

      And user should be able to save the answered question

      And user should be able to tap on next after saving the answer

      And user able to confirm the alert

      And user able to navigate back

      Then user should be able to select the syllabus tab

      And user able to select take test button under physics test section in syllabus

      And user able to click start test button

      Then user able to answer the multiple choice question

      And user should be able to save the answered question

      And user able to confirm the alert

      And user able to click final submit

      And user able to confirm the alert

      Then user able to answer the multiple choice question

      And user should be able to save the answered question

      And user able to confirm the alert

      And user able to click final submit

      And user able to confirm the alert

      Then user able to answer the multiple choice question

      And user should be able to save the answered question

      And user able to confirm the alert

      And user able to click final submit

      And user able to solutions button after completing test

      And user able to see score report

      And user able to see distribution section

      And user able to see the analysis based on the section selected

      And user able to see comparision section

      And user able to see time heat chart

      And user able to navigate back

      And user should be able to select the analytics tab

      And user able to see the information of each section under analytics tab

      Examples:

        | signup_email_length | Signup_Password |

        | 9                   | abhi1234        |