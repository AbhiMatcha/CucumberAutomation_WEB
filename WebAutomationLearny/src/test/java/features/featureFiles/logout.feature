Feature: logout feature

  This feature deals with the logout functionality of the application

Scenario: user able to logout

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select profile

    Then  user should be able to logout