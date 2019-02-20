Feature: Support feature

  This feature deals with the support functionality of the application

  Scenario: User able to raise a support ticket

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to see the support option

    And user able to select the support option

    And user able to see the field for subject

    And user able to enter the title of ticket in subject field

    And user able to see the field for description

    And user able to enter the description of the ticket in description field

    And user should be able to select the checkbox

    And user able to submit the ticket

    And user should be able to confrim the submission of the raised ticket

    Then User should login and can see profile