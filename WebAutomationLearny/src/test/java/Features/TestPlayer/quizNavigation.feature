Feature: Quiz Navigation

  This feature deals with the all types of navigations supported in quiz

  Scenario: Learner can navigate to next question

    Given Learner starts {} quiz

    When Learner answers {MCQ} question with {} option

    Then Learner navigates to next question

  Scenario: Learner can go directly to question from Quiz Map

    Given Learner starts {} quiz

    When Learner selects question in quiz map

    Then Learner navigates to question

  Scenario: Learner can clear already answered question

    Given Learner starts {} quiz

    When Learner answers {MCQ} question with {} option

    Then Learner able to clear the answer

  Scenario: Learner sees Not visited question in gray

    Given Learner starts {} quiz

    When Learner selects question in quiz map

    Then Learner able to see {Not visited} question in {gray}

  Scenario: Learner sees Unanswered question in red

    Given Learner starts {} quiz

    When Learner wont answer {} question

    Then Learner able to see {unanswered} question in {red}

  Scenario: Learner sees Mark for review in purple

    Given Learner starts {} quiz

    When Learner mark the answered question for review

    Then Learner able to see {marked} question in {purple}

  Scenario: Learner sees Answered in green

    Given Learner starts {} quiz

    When Learner answer {} question

    Then Learner able to see {answered} question in {green}

  Scenario: Learner sees Answered & Mark for review in green & purple

    Given Learner starts {} quiz

    When Learner mark the unanswered question for review

    Then Learner able to see {answered} question in {green_purple}

  Scenario: Learner can switch sections

    Given Learner starts {} quiz

    When Learner selects {} section

    Then Learner switch to {} section

  Scenario: Learner goes to next section by Next Navigation

    Given Learner starts {} quiz

    When Learner answer the question and select next button

    Then Learner switch to {} section

  Scenario: Learner can exit Quiz

    Given Learner starts {} quiz

    When Learner selects exit option

    Then Learner exits the quiz

  Scenario: Learner can back Quiz

    Given Learner starts {} quiz

    When Learner selects back option

    Then Learner exits the quiz
