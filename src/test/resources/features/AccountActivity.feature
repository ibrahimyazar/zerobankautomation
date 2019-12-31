Feature: Testing Account Activity Page

  Background: Open login page and logged in as a authorized user
    Given User is on main page
    When User click the "signing" button
    Then User enters authorized information


  @account_activity_title
  Scenario: Account Activity page should have the title Zero - Account activity
    Given  Login as authorized user
    When User click the Account activity submodule
    Then Account activity page should be displayed
    And Page title is "Zero - Account Activity"

    @savings
  Scenario: Default option is Savings
    Given I am on the login page
    Then  Login as authorized user
    When User click the Account activity submodule
    And Account drop down default option should be "Savings"