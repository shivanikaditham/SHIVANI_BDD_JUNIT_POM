Feature: click on register button
  In order to click on register button
  As a guest
  I should go to url click on register link then click on register button

  Scenario: verify register button
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to home page
    When i click on register link from the nav bar
    Then i go to registration page
    When i click on register button
    Then i get error messages






