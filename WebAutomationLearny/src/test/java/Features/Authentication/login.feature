Feature: Login Functionality

  This feature deals with learner's login functionality of the application

  Scenario: Learner able to login through Email with valid credentials

    Given Learner is on the login page

    When Learner login using email and password

    Then Learner is on home page

  Scenario Outline: Learner not able to login with invalid credentials

    Given Learner is on the login page

    When Learner enters invalid <email> and <password> and clicks on Login

    Then Learner should get an <errorMessage> for login

    Examples:

      | email                        | password  | errorMessage                         |

      |                              |           | Please enter your email              |

      |                              | abhi12345 | Please enter your email              |

      | abho@yopmail.com             |           | Please enter your password           |

      | abhishek.matcha@learnyst.com | abh345    | Wrong email and password combination |

      | 23344555                     | abh345    | Please enter valid email             |

  Scenario: Learner able to login through Google with valid credentials

    Given Learner is on the login page

    And Learner clicks on Login with Google

    When Learner enters Google credentials and clicks on Login

    Then Learner is on home page

  Scenario: Learner able to login through Facebook with valid credentials

    Given Learner is on the login page

    And Learner clicks on Login with Facebook

    When Learner enters Facebook credentials and clicks on Login

    Then Learner is on home page












