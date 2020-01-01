@account_activity
Feature: Testing Account Activity Page

  Background: Open login page and logged in as a authorized user
    Given User is on main page
    When User click the "signing" button
    Then User enters authorized information


  @account_activity_title
  Scenario: Account Activity page should have the title Zero - Account activity
    When User click the Account activity submodule
    And Page title is "Zero - Account Activity"

    @savings
  Scenario: Default option is Savings
    When User click the Account activity submodule
    And Account drop down default option should be displayed "Savings"

      @all_options
   Scenario: Second option is Checking
     When User click the Account activity submodule
     Then User click the drop-down arrow
     And All options "Savings", "Checking", "Savings", "Loan", "Credit Card", "Brokerage", are displayed