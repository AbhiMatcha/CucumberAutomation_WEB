Feature: Change password functionality in profile page

  This feature deals with the change password functionality in the application

  Scenario Outline: Learner able to change the password by giving valid inputs

    Given Learner is on home page

    And Learner goes to profile page

    When Learner clicks on 'Change Password'

    And Learner enters invalid inputs for <old password> , <new passpword> and <confirm password>

    Then The Learner's password is updated

    Examples:

      | old password | new passpword | confirm password |

      | abhi1234     | abhi12345     | abhi12345        |


  Scenario Outline: Learner able to see error message when invalid inputs are given

    Given Learner is on home page

    And Learner goes to profile page

    When Learner clicks on 'Change Password'

    And Learner enters invalid inputs for <old password> , <new passpword> and <confirm password>

    Then Learner should see an <error message>

    Examples:

      | old password | new passpword | confirm password | error message                  |

      | abhi12345    | abhi12345     | abhi1234         | New passwords are not matching |

      | abhi12345    | abhi12345     | abhi12345        | Please choose new password     |

      | abhi12345    | abhi1234      | abhi12345        | New passwords are not matching |

      | abhi12345    | abhi12345     | abhi1234         | New passwords are not matching |

      | abhi12345    | abhi12345     | abhi12345        | Please choose new password     |

      | abhi12345    | abhi1234      | abhi12345        | New passwords are not matching |
