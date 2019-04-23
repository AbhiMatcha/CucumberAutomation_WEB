Feature: Download certificate functionality

  This feature deals with Download certificate functionality when learner is eligible

  Scenario: Learner is able to download the certificate after course completion

    Given Learner takes a course

    And Learner completes the course

    When Learner selects the certificate tab

    Then Learner should be able to download the certificate

  Scenario: Learner is not able to download the certificate before course completion

    Given Learner takes a course

    And Learner does not complete the course

    When Learner selects the certificate tab

    Then Learner should not be able to the download the certificate and see the error message