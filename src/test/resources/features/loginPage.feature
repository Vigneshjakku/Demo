Feature: Validating facebook page
Scenario: Login page Validation with invalid credential
Given User is on loginpage
When User enters username and password
And User clicks on loginpage
Then User verify the error message

