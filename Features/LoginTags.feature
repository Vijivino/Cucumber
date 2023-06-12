Feature: Login test with tags

@valid
Scenario: Check login with valid credentials
Given launch the demo web shop 
When enter the email and  password
Then user should see the logout button

@invalid
Scenario: Check login with invalid credentials
Given launch the demo browser
When enter the invalid email and  password
But user should see error message

@smoke
Scenario: Verify title of the page
Given launch the demo web shop 
Then should validate title
