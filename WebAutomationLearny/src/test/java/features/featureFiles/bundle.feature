Feature: bundle feature

  This feature deals with the bundle feature functionality of the application

  Scenario Outline: user able to see expiry date for bundle

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to see course expiry

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user able to see courses tab for  bundle

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user able to play video

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte video Lesson in syllabus section

    Then user able to play the video

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |


  Scenario Outline: user able to view pdf

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Verify_CourseVideo_Test'

    Then user able to select first lesson under syllabus tab

    And user able to selecte pdf Lesson in syllabus section

    And switch frame to access pdf lesson

    Then user able to click zoom in option

    Then user able to click zoom out option

    Then user able to click bookmark option

    Then user able to click toggle option

    Then user able to click thumbnail option

    Then user able to see total pages

    Then user able to click find option

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user able to view slides

    Given I navigate to login page

    And I entered <username> and <password>

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

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user able to take test in bundle

    Given I navigate to login page

    And I entered <username> and <password>

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

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |


  Scenario Outline: user able to access the lesson after completing payment

    Given I navigated to signup page

    And entered email with length <signup_email_length> and <Signup_Password>

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

    Examples:

      | signup_email_length | Signup_Password |

      | 7                   | abhi1234        |

