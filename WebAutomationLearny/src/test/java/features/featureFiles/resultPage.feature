Feature: Result page feature

  This feature deals with result page functionality of the application

  Scenario Outline: user able to see all the options in result page

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