Feature: LoginFeature

  This feature deals with the login functionality of the application

  Scenario: user able to do Facebook login

    Given I navigate to login page

    And user completed facebook login

    Then navigated to homepage after login

  Scenario: user able to use forgot password option in login page

    Given I navigate to login page

    Then selected forgot password

    And enter email to send reset password link

    When send button and cancel button should be displayed

    Then click on send button and verify message displayed

  Scenario: user able to Login with valid details

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

  Scenario Outline: user able to see error messages in login page on entering invalid inputs

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then <errorMessage> message should be displayed

    Examples:

      | username                     | password  | errorMessage                         |

      |                              |           | Please enter your email              |

      |                              | abhi12345 | Please enter your email              |

      | abho@yopmail.com             |           | Please enter your password           |

      | abhishek.matcha@learnyst.com | abh345    | Wrong email and password combination |

      | 23344555                     | abh345    | Please enter valid email             |

  Scenario: user able to logout

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select profile

    Then  user should be able to logout











