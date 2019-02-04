Feature: profile feature

  This feature deals with the profile page functionality in the application

  Scenario Outline: Validating error messages in profile page while changing the password

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    And user able to select profile

    And user able to select settings button

    Then user able to select change password button in profile page

    And user able to select show password option

    And user able to enter old password <old password> in profile page

    And user able to enter new password <new passpword> in profile page

    And user able to enter confirm password <confirm password> in profile page

    Then user able to save the updated password

    And user able to see the <error message> when he/she give wrong inputs

    Examples:

      | signup_email_length | Signup_Password | old password | new passpword | confirm password | error message                  |

      | 9                   | abhi1234        | abhi12345    | abhi12345     | abhi1234         | New passwords are not matching |

      | 9                   | abhi1234        | abhi12345    | abhi12345     | abhi12345        | Please choose new password     |

      | 9                   | abhi1234        | abhi12345    | abhi1234      | abhi12345        | New passwords are not matching |

      | 9                   | abhi1234        | abhi12345    | abhi12345     | abhi1234         | New passwords are not matching |

      | 9                   | abhi1234        | abhi12345    | abhi12345     | abhi12345        | Please choose new password     |

      | 9                   | abhi1234        | abhi12345    | abhi1234      | abhi12345        | New passwords are not matching |


  Scenario Outline: Validating profile page

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
