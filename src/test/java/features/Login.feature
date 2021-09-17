Feature: Login to nop commerce
  In order to login to nop commerce
  As a user
  I should provide email and password

  Scenario: Verify login functionality with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to home page
    When  i click on log in link from the nav bar
    Then  i should be navigated to login page
    When  i enter email as "shivani1@nop.com"
    And   i enter password as "shivani1@123"
    And   i click on log in button
    Then  i should be logged in successfully