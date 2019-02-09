Feature: Notes feature

  This feature deals with the notes page functionality of the application

  Scenario Outline: user should be able to select bold option and enter note

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to select bold option in redactor and enter input

    Then user able to see the input as a note

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |


  Scenario Outline: user should be able to select italic option and enter note

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to select italic option in redactor and enter input

    Then user able to see the input as a note

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user should be able to select underline option and enter note

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to select underline option in redactor and enter input

    Then user able to see the input as a note

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user should be able to select list option

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to select list option in redactor

    Then user able to enter input using ordered list

    And user able to select list option in redactor


    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user should be able to see unlink option

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to select list option in redactor

    Then user able to enter input using ordered list

    And user able to select list option in redactor

    Then user able to enter input using both unordered list

    And user able to select link option in redactor

    Then user able to see unlink option

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user should be able to select insert link option and enter note

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    And user able to select link option in redactor

    And user able to select insert link option

    And user able to use both text and URL link

    And user able to see cancel and confirm option for inserting link

    Then user able to see the input as a note

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |

  Scenario Outline: user should be able to edit and delete the note created

    Given I navigate to login page

    And I entered <username> and <password>

    And I clicked login button

    Then User should login and can see profile

    And user able to select bundle

    And user able to select the courses tab

    And user able to select course 'Fill in the blank'

    And user able to see the purchased message in course details

    Then user should be able to select the Notes tab

    When user able to select create option in notes

    Then user able to see the all fields of the redactor page for notes

    And user able to enter a notes as input

    And user able to select bold option in redactor and enter input

    And user able to select italic option in redactor and enter input

    And user able to select underline option in redactor and enter input

    And user able to select list option in redactor

    Then user able to enter input using ordered list

    And user able to select list option in redactor

    Then user able to enter input using both unordered list

    And user able to select link option in redactor

    Then user able to see unlink option

    And user able to select insert link option

    And user able to use both text and URL link

    And user able to see cancel and confirm option for inserting link

    And user able to post the question

    Then user able to the edit option

    And user able to edit the input and post the question

   And user able to delete the notes

    Examples:

      | username                     | password |

      | abhishek.matcha@learnyst.com | abhi1234 |
