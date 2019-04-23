Feature: Signup feature

  This feature deals with the Signup functionality of the application

  Scenario: Signup through email with valid credentials

    Given Learner is on the signup page

    When Learner enters random "email" and "password" and clicks on signup for free

      | 9 | abhi1234 |

    Then Learner should signup or skip the verification

    And Learner is in home page

  Scenario Outline: Signup failure through email with invalid credentials

    Given Learner is on the signup page

    When Learner enters <email> and <password> and clicks on signup for free

    Then Learner should see the message <errorMessage> or skip the verification

    Examples:

      | email                                              | password | errorMessage                                                   |

      |                                                    | abhi1234 | Please enter your email                                        |

      |                                                    |          | Please enter your email                                        |

      | js34fja5n4dfja@gmail.com                           |          | Please enter your password                                     |

      | ABHISHEK.MATCHA@LEARNYST.COM                       | abhi1234 | email is already registered                                    |

      | <script>alert(document.cookie)</script>            | abhi1234 | Please enter valid email                                       |

      | walJ1vypMTzjeJbTVI0yZu5gc4xS5QpUKzLwfs@yopmail.com | abhi1234 | Validation failed: Name is too long (maximum is 35 characters) |

