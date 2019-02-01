Feature: Result page, IITjee Test, mark for review and section navigation feature

  This feature deals with the all options while taking the IITjee test and result page functionality of the application

  Scenario Outline: Verify all options(section naviagation, mark for review, Read instructions) while taking IITjee test

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

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

    Examples:

      | signup_email_length | Signup_Password |

      | 9                   | abhi1234        |


  Scenario Outline: Verify all options in result page

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select IITjee test

    And user able to view result

    Then user able to click view result button

    And user able to solutions button after completing test

    And user able to click solutions button in result page

    Then user able to see the explanation of the answer

    And user able to navigate back

    And user able to see the count of correct section

    And user able to see the count of correct answers

    And user able to see the count of incorrect section

    And user able to see the count of incorrect answers

    And user able to see the count of skipped section

    And user able to see the count of skipped aquestions

    And user able to see the total marks section

    And user able to see the total marks in result page

    And user able to see the detailed analysis button

    And user able to click detailed analysis button

    And user able to navigate back

    And user able to solutions button after completing test

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |