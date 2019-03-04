Feature: video feature

  This feature deals with the functionality of video in the application

  Scenario: user able to change the speed of the video

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should be able to see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select video Lesson in syllabus section

    Then user able to play the video

    Then user able to select option to change speed

    Then user able to change the speed of the video

  Scenario: user able to change the quality of the video

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should be able to see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select video Lesson in syllabus section

    Then user able to play the video

    Then user able to select option to change quality

    Then user able to change the quality of the video

  Scenario: user able to view the video in full screen mode

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should be able to see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select video Lesson in syllabus section

    Then user able to play the video

    And user able to see video in full screen view

  Scenario: user able to see the remaining time of the video

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should be able to see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select video Lesson in syllabus section

    Then user able to play the video

    And user able to see the remaining time of the video

  Scenario: user able to play the video in between

    Given I navigate to login page

    And In login page user entered login username and login password

    And I clicked login button

    Then User should be able to see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to select video Lesson in syllabus section

    Then user able to play the video

    Then user able to play video in between

  Scenario: user as a trail user able to play the video after completing payment

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

    And user able to select video Lesson in syllabus section

    Then user able to play the video