Feature: visitor functionality

  This feature deals with the functionality of trail user in the application

  Scenario: Learner as visitor accessing login button in home page

    Given Learner navigated to homepage of the school

    And Learner able to see login button in homescreen

    When Learner clicks on login button in homescreen

    Then Learner should be navigated to login page

#    And user able to search for course

  Scenario: Learner as visitor accessing over view tab

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner selects the overview tab

    Then Learner able to see the course description of test series


  Scenario: Learner as visitor accessing analytics tab

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner selects the analytics tab

    Then Learner able to see the message before he/she buy the course

  Scenario: Learner as visitor accessing notes tab

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner selects the Notes tab

    And Learner select create option in notes

    Then Learner able to see pop-up message with confirm and cancel button

    And Learner selects confirm button

    And Learner should be navigated to login page

  Scenario: Learner as visitor accessing discussion tab

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner selects the discussion tab

    And Learner select ask option in discussion

    Then Learner able to see pop-up message with confirm and cancel button

    And Learner selects confirm button

    And Learner should be navigated to login page

  Scenario: Learner as visitor accessing syllabus tab

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner selects the syllabus tab

    And Learner selects the test under syllabus

    Then Learner should not able to select take test button under math test section in syllabus

  Scenario: Learner as visitor accessing review tab

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner selects the review tab

    And Learner able to selects your review option in review

    Then Learner able to see pop-up message with confirm and cancel button

    And Learner able to confirm button

    And Learner should be navigated to login page

  Scenario: Learner as visitor tapping buy button in sales pages

    Given Learner navigated to homepage of the school

    And Learner able to select test series

    When Learner clicks on buy button

    And Learner should be navigated to login page

  Scenario: Learner as visitor accessing newsfeed

    Given Learner navigated to homepage of the school

    When Learner selects the newsfeed option

    Then Learner able to see newsfeeds

  Scenario: Learner as visitor accessing help

    Given Learner navigated to homepage of the school

    When Learner selects Help option

    Then Learner should navigate to help page

  Scenario: Learner as visitor accessing offered course tab

    Given Learner navigated to homepage of the school

    When Learner selects offered courses tab

    Then Learner should see all the offerec courses
