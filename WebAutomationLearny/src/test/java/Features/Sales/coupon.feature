Feature: Coupon functionality

  This feature deals with the coupon functionality of the application

  Scenario Outline: Learner able to apply coupon successfully for GST enabled school

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a course from GST enabled school

    When Learner enters a <valid coupon>

    And clicks on Apply button

    Then Learner has successfully applied the coupon

    And Learner should see change in price for GST enabled school

    Examples:

      | valid coupon |

      | fifty        |

      | sixty        |

  Scenario Outline: Learner able to apply coupon successfully for GST disabled school

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a course from GST disabled school

    When Learner enters a <valid coupon>

    And clicks on Apply button

    Then Learner has successfully applied the coupon

    And Learner should see change in price for GST disabled school

    Examples:

      | valid coupon |

      | fifty        |

      | sixty        |

  Scenario Outline: Learner not able to apply coupon for GST enabled school

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a course from GST enabled school

    When Learner enters a <invalid coupon>

    And clicks on Apply button

    Then Learner gets an <error message> for GST enabled school

    Examples:

      | invalid coupon | error message               |

      | yeast          | Coupon entered is not valid |

      | expired        | Coupon code has expired     |

  Scenario Outline: Learner not able to apply coupon for GST disabled school

    Given Learner is on home page

    And Learner goes to offered courses

    And Learner selects a course from GST disabled school

    When Learner enters a <invalid coupon>

    And clicks on Apply button

    Then Learner gets an <error message> for GST disabled school

    Examples:

      | invalid coupon | error message               |

      | yeast          | Coupon entered is not valid |

      | expired        | Coupon code has expired     |