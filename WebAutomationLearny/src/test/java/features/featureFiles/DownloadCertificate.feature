Feature: Download certificate by taking practise test & payment feature

  This feature deals with validating the details under certificate tab, payment, Download certificate functionality when user is eligible

  Scenario: user able to see the details under cerificate tab

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the course to test certificate

    And user should be able to select the Certificate tab

    And user able to see error message when he/she didnt taken the test

    And user able to see test name under certificate section

    And user able to see the qualifying marks of the test to download certificate

    And user able to see the test status under certificate section


  Scenario: user able to do payment through certificate tab

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user should be able to select the course to test certificate

    And user should be able to select the Certificate tab

    And user able to select the test under certificate tab

    And user able to see and confirm buy pop-up alert on selecting test

    And user able to redirect to payment page and click pay securely button

    And switch frame before selecting payment

    And user able to enter mobile number

    Then user able to select net banking option

    And user able to select any bank

    Then user able to click on paynow button

    Then user able to see the start course option after completing payment

  Scenario: user able to download certificate by taking test

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user should be able to select the course to test certificate

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
