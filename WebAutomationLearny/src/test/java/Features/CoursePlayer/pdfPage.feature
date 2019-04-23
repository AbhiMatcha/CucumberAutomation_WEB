Feature: PDF functionality

  This feature deals with the functionality of PDF in the application

  Scenario: Learner able to zoom in and zoom out the PDF page

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    And Learner clicks on zoom in and zoom out option

    Then Learner is able to zoomin and zoomout the pdf

  Scenario: Learner able to use find option in PDF

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    And Learner clicks on find option and searches a keyword

    Then Learner is able to find the keyword in the pdf

  Scenario: Learner able to scroll up and down in the PDF

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    And Learner scrolls up and down in the pdf

    Then Learner is able to view different pages

  Scenario: Learner able to toggle between pages in the PDF

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    And Learner selects the toggle option in the pdf

    Then Learner is able to toggle between different pages

  Scenario: Learner able to rotate a page in the PDF

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    And Learner selects the rotate option in the pdf

    Then Learner is able to rotate the page in the pdf

  Scenario: Learner able to go to first/last page from Tools in the PDF

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    And Learner selects the go to first page/last page option in the pdf

    Then Learner is able to go directly to the first/last page

  Scenario: Learner able to see the total pages in the PDF

    Given Learner is already logged in and is on home page

    And Learner goes to offered courses

    And Learner selects a lesson under course and clicks resume option

    When Learner selects pdf Lesson in syllabus section

    Then Learner is able to see the total pages in the pdf