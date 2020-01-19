Feature: Creating and searching new customer account

  @Test
  Scenario: 
    Given user should navigate to url for nopcommerce
    Then user should enter "admin@yourstore.com" in email address
    And user should enter "admin" in Password field
    And user should click the log in button to go to homepage of website
    Given user should click the customer drop down button on the left corner
    Then user should select the customers option from the drop down
    And user should click the add new button on the right top conrner of the page
    When user should should click the drop down button to enter the customer info
    And user should enter "admin@yourstore.com" in email field
    Then user should enter "admin" in password field
    And user should enter "aman" in first name field
    Then user should enter "khan" in last name field
    When user should select gender FROM THE gender radio button
    When user should enter "09/14/1982" in date of birth field
    And user should "woodbridge" in company field
    Then user should the check the check box field for tax exempet field
    And user should check the first check box field from Newsletter field
    Then user should select the role from customer roles drop down
    Then user should selct vendor from manager of vendor drop down
    Given user should check the check box field for active
    Then user should enter "blank" in the admin comment field
    Then user should click the save and continue botton the top right field of the page

  Scenario: 
    Given user should enter "admin@yourstore.com" in the email field
    Then user should click the search button
