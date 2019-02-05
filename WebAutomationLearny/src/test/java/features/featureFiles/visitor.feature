Feature: visitor user feature

  This feature deals with the functionality of trail user in the application

  Scenario: user as visitor accessing newsfeed

    Given user navigated to homepage of the school

    And user able to see newsfeed option

    And user able to see newsfeeds on click newsfeed option

  Scenario: user as visitor accessing login button in home page

    Given user navigated to homepage of the school

    And user able to see login button in homescreen

    And user able to click on login button in homescreen

    And user should be navigated to login page

  Scenario: user as visitor accessing help

    Given user navigated to homepage of the school

    And user able to see Help option in home screen

  Scenario: user as visitor accessing offered course tab

    Given user navigated to homepage of the school

    And user able to see offered courses tab for trail user

  Scenario: user as visitor accessing school name in footer

    Given user navigated to homepage of the school

    And user able to see the school name at the footer

#    And user able to search for course

  Scenario: user as visitor accessing over view tab

    Given user navigated to homepage of the school

    And user able to select test series

    Then user should be able to select the overview tab

    And user able to see the course description of test series

    And user able to see the school name at the footer

  Scenario: user as visitor accessing analytics tab

    Given user navigated to homepage of the school

    And user able to select test series

    And user should be able to select the analytics tab

    Then user able to see the message before he/she buy the course

  Scenario: user as visitor accessing notes tab

    Given user navigated to homepage of the school

    And user able to select test series

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    And user able to confirm buy in popup message

    And user should be navigated to login page

  Scenario: user as visitor accessing discussion tab

    Given user navigated to homepage of the school

    And user able to select test series

    Then user should be able to select the discussion tab

    When user able to select ask option in discussion

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    And user able to confirm buy in popup message

    And user should be navigated to login page

  Scenario: user as visitor accessing syllabus tab

    Given user navigated to homepage of the school

    And user able to select test series

    Then user should be able to select the syllabus tab

    And user able to select Math test under syllabus

    And user should not able to select take test button under math test section in syllabus

    And user able to select Chemsitry test under syllabus

    And user should not able to select take test button under chemistry test section in syllabus

    And user should not able to select take test button under physics test section in syllabus

  Scenario: user as visitor accessing review tab

    Given user navigated to homepage of the school

    And user able to select test series

    Then user should be able to select the review tab

    And user able to select your review option in review

    And user able to see buy pop-up message with confirm and cancel button when clicks on lesson

    And user able to confirm buy in popup message

    And user should be navigated to login page

  Scenario: user as visitor tapping buy button in sales pages

    Given user navigated to homepage of the school

    And user able to select test series

    And user able to click buy button in sales page

    And user should be navigated to login page









