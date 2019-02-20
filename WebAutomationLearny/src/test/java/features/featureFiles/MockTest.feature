Feature: Mock test feature

  This feature deals with the all test functionality of the application

  Scenario: user able to take general quiz

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the general quiz

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user able to confirm the submit

    And user able to click final submit

    And user able to solutions button after completing test

  Scenario: user able to take Gmat test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select Gmat test

    And user able to click the enroll free course button

    And user able to click take test button

    And user able to click start test button

    And user able to see error message when user save the question without answering

    And user able to confirm the alert

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to confirm the alert

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user able to confirm the alert

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    And user able to confirm the alert

    And user able to confirm the alert

    Then user able to see refresh button after submitting the test

    And user able to navigate back and see the mock test status as evaluation pending

  Scenario: user able to take the practise quiz

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select the practise quiz

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to confirm the submit

    And user able to solutions button after completing test

  Scenario: user able to take the Random quiz and questions should not get repeat in same order while retaking the test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

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

  Scenario: user able to use all options(section naviagation, mark for review, Read instructions) while taking IITjee test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select IITjee test

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    When user navigated to test he/she should be able to see read instructions

    And user able to click on read instructions

    And user able to go back to test on tapping back button

    And user able to see the timer displayed

    And user able to see all questions button

    Then user able to see all questions by tapping all questions button

    And user able to go back to test on tapping back button

    Then user able to answer the multiple choice question

    And user able to see mark for review option

    And user should be able to click mark for review option

    And user able to switch chemsitry section

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to exit from the test by tapping back button

    And user able to click take test button

    And user able to click start test button

    Then user able to restore the answered questions

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user able to switch mathematics section

    Then user able to answer the multiple choice question

    And user able to switch physics section

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the feedback question

    And user should be able to save the answered question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to solutions button after completing test

  Scenario: user able to take the CAT Test

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    And save the user name from profile

    Given user navigated to offered courses

    And user should be able to select the CAT MockTest

    And user able to click enrol for free course button

    And user able to click take test button

    And user able to click start test button

    And user able to cancel the restoring answer option if it displays

    And user able to answer the first question in section one of CAT test

    And user should be able to save the answered question

    And user able to answer the second question in section one of CAT test

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to confirm the submit

    And user able to answer the first question in second section of CAT test

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to confirm the submit

    Then user able to select calculator while taking the test

    And user able to perform multiplication of two values

    And user able to close the calculator

    And user able to answer the first question in third section of CAT test

    And user should be able to save the answered question

    And user able to submit

    And user able to click final submit

    And user able to confirm the submit

    Then collect the details the top ten students in result page under leaderboard section
