Feature: change password feature in profile page

  This feature deals with the change password functionality in the application

  Scenario Outline: user able to see the error messages in profile page while changing the password by giving invalid inputs

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
