Feature: profile feature

  This feature deals with the profile page functionality in the application

  Scenario Outline: user able to edit and save the changes in profile page

    When get the email when user signup's in the application

    And user able to select profile

    And user able to select settings button

    Then user able to see upload photo button

    And user able to enter student name in profile page

    And user able to enter mobile number in profile page

    And user able to see the email that he signedup in email address section

    And user able to enable the checkbox in profile page

    Then user able to select change password button in profile page

    And user able to select show password option

    And user able to enter old password <old password> in profile page

    And user able to enter new password <new passpword> in profile page

    And user able to enter confirm password <confirm password> in profile page

    Then user able to save the updated password

#    And user able to see the password changed message

    And user able to see signout button in profile page

    And user able to tap on save button in the profile page

    Then user able to see the changes made based on success/error message

    Examples:

      | old password | new passpword | confirm password |

      | abhi1234     | abhi12345     | abhi12345        |
