Feature: Navigation functionality in answer player

  This feature deals with the navigation functionality of the answer player

  Scenario Outline: Learner able to save answer and go to next question

    Given Learner is taking a <test>, <id>

    And Learner answers the question

    When Learner selects save and next option

    Then Learner navigates to next question

    Examples:

      | test | id   |

      | GMAT | 2323 |

  Scenario Outline: Learner able to see error message on selecting save answer option without answering a question for GMAT

    Given Learner is taking a <test>, <id>

    And Learner does not answer the question

    When Learner selects save and next option

    Then Learner should see the <error message>

    Examples:

      | test | id   | error message      |

      | GMAT | 2323 | qwesdadsaxasasdasd |

  Scenario Outline: Learner able to switch from one section to another in CAT

    Given Learner is taking a <test>, <id>

    And Learner answers the question

    When Learner selects another section

    Then Learner navigates to another section

    Examples:

      | test | id   |

      | GMAT | 2323 |

  Scenario Outline: Learner able to save answer and go to next question for practise quiz

    Given Learner is taking a <test>, <id>

    And Learner answers the question

    When Learner selects save option

    And Learner able to see the explanation

    And Learner selects next option

    Then Learner navigates to next question

    Examples:

      | test | id   |

      | GMAT | 2323 |

  Scenario Outline: Learner able to see the result page after submitting the test

    Given Learner is taking a <test>, <id>

    And Learner answers the question

    When Learner selects submit option

    Then Learner navigates to the result page

    Examples:

      | test | id   |

      | GMAT | 2323 |

  Scenario Outline: Learner able to navigate to selected question from quiz map

    Given Learner is taking a <test>, <id>

    And Learner answers the question

    When Learner selects question from quiz map

    Then Learner navigates to the particular question page

    Examples:

      | test | id   |

      | GMAT | 2323 |