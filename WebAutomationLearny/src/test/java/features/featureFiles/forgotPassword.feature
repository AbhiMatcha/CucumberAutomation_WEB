Feature: forgot password feature

  This feature deals with the forgot password functionality of the application

  Scenario: user able to use forgot password option in login page

    Given I navigate to login page

    Then selected forgot password

    And enter email to send reset password link

    When send button and cancel button should be displayed

    Then click on send button and verify message displayed


  Scenario: user able to see error message when user enter invalid email

    Given I navigate to login page

    Then selected forgot password

    And enter invalid email to send reset password link

    When send button and cancel button should be displayed

    Then error email not found pop up should be displayed on tapping send option


