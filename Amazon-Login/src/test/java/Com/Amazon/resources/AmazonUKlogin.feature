Feature: Amazon Login Functionality

  As an user
  I want to login
  So that I can login successfully

  @smoke
  Scenario Outline: Login - Happy path

    Given I'm in homepage
    When I clicks on login button
    And I enters data with name "<Username>" and "<Password>"
    Then  user should login successfully


    Examples:
      |Username          |Password|
      |harinignanam2305@gmail.com|Lillypotter123|

