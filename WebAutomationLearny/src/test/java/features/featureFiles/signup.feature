Feature: Signup feature

  This feature deals with the Signup functionality of the application

  Scenario Outline: user able to signup with valid details

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Examples:

      | signup_email_length | Signup_Password |

      | 9                   | abhi1234        |


  Scenario Outline: user able to signup with invalid details

    Given I navigated to signup page

    And user entered <signup_email> and <Signup_Password>

    And I tapped on signUp for free button

    Then user should see the message <errorMessage> or skip the verification

    Examples:

      | signup_email                                       | Signup_Password | errorMessage                                                   |

      |                                                    | abhi1234        | Please enter your email                                        |

      |                                                    |                 | Please enter your email                                        |

      | js34fja5n4dfja@gmail.com                           |                 | Please enter your password                                     |

      | ABHISHEK.MATCHA@LEARNYST.COM                       | abhi1234        | email is already registered                                    |

      | <script>alert(document.cookie)</script>            | abhi1234        | Please enter valid email                                       |

      | walJ1vypMTzjeJbTVI0yZu5gc4xS5QpUKzLwfs@yopmail.com | abhi1234        | Validation failed: Name is too long (maximum is 35 characters) |