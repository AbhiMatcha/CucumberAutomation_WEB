Feature: Analytics tab functionality

  This feature deals with the analytics tab functionality under test series of the application

  Scenario: Learner able to access analytics tab

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a test series

    And clicks on Buy now

    When Learner clicks on Analytics tab

    Then Learner should see the content under the analytics tab