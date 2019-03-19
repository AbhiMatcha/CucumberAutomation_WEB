Feature: Download certificate by taking test

  This feature deals with Download certificate functionality when user is eligible

  Scenario: user able to download certificate test

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should be able to see profile

    And user should be able to select the course

    And user able to select the resume button in sales page

    And user able to click take test button

    And user able to click start test button

#    When cancel restore answer option if it display

    And user able to answer the first question in section one of practise test

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to answer the second question in section one of practise test

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to submit

    And user able to retake the test

    And user able to answer the first question in section one of practise test

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to answer the second question in section one of practise test

    And user should be able to save the answered question

    And user should be able to tap on next after saving the answer

    And user able to submit

    And user able to solutions button after completing test

    Then user should navigate back to testplayer from result page

    And user able to view result

    And user able to see take test button

    And user able to see retake count

    And user should be navigated to sales page and select certificate tab

    Then user able to download the certificate if he is eligible


