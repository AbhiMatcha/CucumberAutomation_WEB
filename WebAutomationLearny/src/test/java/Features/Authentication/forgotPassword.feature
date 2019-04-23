Feature: forgot password functionality

  This feature deals with the forgot password functionality of the application

  Scenario: Learner able to use forgot password option in login page

    Given Learner is on the login page

    When Learner selects forgot password button

    And Learner enters valid email to request reset password

    Then Learner able to see the reset password link in his email

  Scenario: Learner able to see error message when Learner enters invalid email

    Given Learner is on the login page

    When Learner selects forgot password button

    And Learner enters invalid email to request reset password

    Then Learner should see error message for invalid email input


