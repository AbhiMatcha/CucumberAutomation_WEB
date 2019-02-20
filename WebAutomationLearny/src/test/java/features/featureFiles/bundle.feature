Feature: bundle feature

  This feature deals with the bundle feature functionality of the application

  Scenario: user able to access all options in pdf

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select pdf Lesson in syllabus section

    And switch frame to access pdf lesson

    Then user able to click zoom in option

    Then user able to click zoom out option

    Then user able to click bookmark option

    Then user able to click toggle option

    Then user able to click thumbnail option

    Then user able to see total pages

    Then user able to click find option

  Scenario:  user able to access all options in slide and move to next lesson on selecting mark as complete option

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select slide Lesson in syllabus section

    And user able to select previous button

    And user able to select next button

    Then user able to select next slide button

    Then user able to select previous slide button

    Then user able to select first slide button

    Then user able to select last slide button

    Then user able to select next slide button

    Then user able to see mark as complete and revise options

    And user able to select mark as complete option

    Then user able to move to next lesson on selecting mark as complete

  Scenario: user able to take test in bundle

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select second lesson under syllabus tab

    And user able to select test Lesson in syllabus section

    And user able to click take test button

    And user able to click start test button

    And user able to see mark for review option

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the fill in the blank question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    Then user able to answer the multiple choice question

    And user should be able to save the answered question

    And user able to confirm the submit

    And user able to click final submit

    And user able to solutions button after completing test

  Scenario: user as a trail user able to access the lesson after completing payment

    Given I navigated to signup page

    And entered email with signup_email and Signup_Password

    And I tapped on signUp for free button

    Then user should signup or skip the verification

    Given user navigated to offered courses

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    And user able to click buy button in sales page

    And user able to redirect to payment page and click pay securely button

    And switch frame before selecting payment

    And user able to enter mobile number

    Then user able to select net banking option

    And user able to select any bank

    Then user able to click on paynow button

    Then user able to see the start course option after completing payment

    And user able to navigate to sales page on clicking start course

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

  Scenario: user able to change the play and change the speed of the video

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

    Then user able to select option to change speed

    Then user able to change the speed of the video

  Scenario: user able to view the video in full screen mode

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

    And user able to see video in full screen view

  Scenario: user able to see the remaining time of the video

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

    And user able to see the remaining time of the video

  Scenario: user able to send report in lesson player

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

    Then user able to send report through lesson player

    And user able to confirm the alert