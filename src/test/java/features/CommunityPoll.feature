Feature: enter into nopcommerce website as a guest and click on community poll
  In order to click on community poll
  As a guest
  I should provide website url
  Scenario: verify community poll function
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to home page
    When i click on community poll and select excellent option
    Then the radio button of excellent should be selected
    When  i click on Vote button
    Then  error message should be displayed
    And i should be printing error message into console