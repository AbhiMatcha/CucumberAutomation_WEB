Feature: LoginFeature

  This feature deals with the login functionality of the application

  Scenario: Validating Facebook login

    Given I navigate to login page

    And user completed facebook login

    Then navigated to homepage after login

  Scenario: Validating forgot password in login page

    Given I navigate to login page

    Then selected forgot password

    And enter email to send reset password link

    When send button and cancel button should be displayed

    Then click on send button and verify message displayed

  Scenario Outline: Login with valid details

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |


  Scenario Outline: Validating error messages in login page

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

  Scenario Outline: Validating logout functionality

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    Then  user should be able to logout

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |










