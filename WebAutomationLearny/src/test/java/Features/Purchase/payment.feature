Feature: payment functionality

  This feature deals with the payment functionality of the application

  Scenario: Learner able to buy a course using razorPay payment method

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid course

    And Learner selects razorpay method

    Then Learner bought a course using razorpay payment method

  Scenario: Learner able to buy a course using PayU payment method

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid course

    And Learner selects PayU method

    Then Learner bought a course using payU payment method

  Scenario: Learner able to buy a course using Instamojo payment method

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid course

    And Learner selects Instamojo method

    Then Learner bought a course using Instamojo payment method

  Scenario: Learner able to buy a course using CC-Avenue payment method

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a paid course

    And Learner selects CC-Avenue method

    Then Learner bought a course using CC-Avenue payment method