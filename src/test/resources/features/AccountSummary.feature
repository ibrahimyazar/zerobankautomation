@Account_summary
Feature: Account summary

  Background: Open login page and logged in as a authorized user
    Given I am on the login page
    When User logs in as an authorized user

  @account_summary_title
Scenario: Account summary page title
#  Given I am on the login page
#  When User logs in as an authorized user
  Then Account summary page should be displayed
  And Verifies that Account Summary page should have the title "Zero - Account Summary"


@account_types
Scenario: Account summary page have following account types: Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts.
  Then User Should see "Cash Accounts", "Investment Accounts", "Credit Accounts", "Loan Accounts"

  @account_types2
  Scenario: Verifies that account types
    Then User Should see that account types are displayed
    | Cash Accounts       |
    | Investment Accounts |
    | Credit Accounts     |
    | Loan Accounts       |






  Scenario: Credit Accounts table must have columns Account, Credit Card and Balance.