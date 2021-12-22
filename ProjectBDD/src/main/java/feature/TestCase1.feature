Feature: Automation Practice Application Test Cases

Scenario Outline: Test Case1: Signin, Update city and state, and Signout
Given Launch the browser
And Enter email
And Enter password
When Click login
And Click my addresses
When Click update
Then Enter city as "<city>"
And Enter state as "<value>"
When Click save
Then Verify city
And Verify state
Then Click signout

Examples:
  | city       | value     |
  | San Diego  | California|


