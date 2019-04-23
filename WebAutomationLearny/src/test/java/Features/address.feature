Feature: Address functionality for GST enabled school

  This feature deals with the address functionality of the application

  Scenario: Learner is able to fill the address after he/she signs up

    Given Learner signs up for the GST enabled school

    When The address form appears and learner fills all the details

    Then Learner can save the address form

  Scenario: Learner is able to save the information of address to complete purchase

    Given Learner signs up for the GST enabled school

    And Learner skips the address verification

    When Learner selects a course

    And clicks on Buy now

    And Learner fills all the details in address form

    Then Learner can save the address form

