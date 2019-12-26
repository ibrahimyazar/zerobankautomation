@login_page
Feature: Login to the application

  As a authorized user should be able to login to the application
  under with valid credentials.

  @login
  Scenario: Login as authorized user
    Given I am on the login page
    Then User logs in as an authorized user
    And Account summary page should be displayed

    @wrong_userName
  Scenario: Login with wrong username
    Given I am on the login page
    Then User enters "wrong" username and "password" password
    And User verifies that "Login and/or password are wrong." message is displayed

    @blank_userName
  Scenario: Login with blank username
    Given I am on the login page
    Then User enter "password" password
    And User verifies that "Login and/or password are wrong." message is displayed

  @blank_password
  Scenario: Login with blank password
    Given I am on the login page
    Then User enters "username" in username box
    And User verifies that "Login and/or password are wrong." message is displayed

  @blank_username_and_password
  Scenario: Login with blank username and blank password
    Given I am on the login page
    Then User is not enters username and password
    And User verifies that "Login and/or password are wrong." message is displayed

   @keep_me_signed_in
  Scenario: Select the keep me signed in box
    Given  I am on the login page
    Then Click the Keep me signed in box
    And User verifies that Keep me signed in box is clicked

   @forget_your_password
   Scenario: Click the forget your password link
     Given I am on the login page
     Then Click the forget your password link
     And Verifies that "Zero - Forgotten Password" page subtitle is displayed
