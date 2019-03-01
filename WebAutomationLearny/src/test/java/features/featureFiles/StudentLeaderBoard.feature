Feature: LeaderBoard feature

  This feature deals with leaderboard information is same both in result page and leader board tab after taking test

  Scenario: user able to see his/her name in the leaderboard based on marks acquired after completing the Test

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

    And user able to see his/her name in the leader board section in result page

    And user able to navigate back to leaderBoard page in sales page

    And collect the details the top ten students in leaderboard section

#    Then the details of top ten students should match both in result page and sales page



