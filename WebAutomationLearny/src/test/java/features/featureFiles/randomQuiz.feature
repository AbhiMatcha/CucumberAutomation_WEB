Feature: Random quiz feature

  This feature deals with the random quiz functionality in the application

  Scenario Outline: Verify Random quiz

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the random quiz

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    And user able to see the question in random quiz while doing first attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing first attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing first attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing first attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing first attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to confirm the submit

    And user able to retake the test

    And user able to see the question in random quiz while doing second attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing second attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing second attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing second attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to see the question in random quiz while doing second attempt

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to confirm the submit

    Then verify user able to see the shuffled questions while retaking the test




    Examples:

      | signup_email_length | Signup_Password |

      | 9                   | abhi1234        |

