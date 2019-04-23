Feature: Syllabus tab functionality

  This feature deals with syllabus tab functionality when learner is eligible

  Scenario: Learner able to access video lesson under syllabus tab

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner clicks on syllabus tab and select video lesson

    Then Learner should see video lesson in lesson player

  Scenario: Learner able to access pdf lesson under syllabus tab

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner clicks on syllabus tab and select pdf lesson

    Then Learner should see pdf lesson in lesson player


  Scenario: Learner able to access html lesson under syllabus tab

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner clicks on syllabus tab and select html lesson

    Then Learner should see html lesson in lesson player

  Scenario: Learner able to access audio lesson under syllabus tab

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner clicks on syllabus tab and select audio lesson

    Then Learner should see audio lesson in lesson player

  Scenario: Learner able to access quiz lesson under syllabus tab

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner clicks on syllabus tab and select quiz lesson

    Then Learner should see quiz lesson in lesson player

  Scenario: Learner able to access video lesson under syllabus tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    And Learner clicks on syllabus tab and select video lesson in lesson player

    Then Learner should see video lesson in lesson player

  Scenario: Learner able to access pdf lesson under syllabus tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    And Learner clicks on syllabus tab and select pdf lesson in lesson player

    Then Learner should see pdf lesson in lesson player


  Scenario: Learner able to access html lesson under syllabus tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    And Learner clicks on syllabus tab and select html lesson in lesson player

    Then Learner should see html lesson in lesson player

  Scenario: Learner able to access audio lesson under syllabus tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    And Learner clicks on syllabus tab and select audio lesson in lesson player

    Then Learner should see audio lesson in lesson player

  Scenario: Learner able to access quiz lesson under syllabus tab in lesson player

    Given Learner is on home page

    And Learner goes to offered courses

    When Learner selects a course

    And clicks on enroll now

    And Learner selects a lesson under course and clicks resume option

    And Learner clicks on syllabus tab and select quiz lesson in lesson player

    Then Learner should see quiz lesson in lesson player