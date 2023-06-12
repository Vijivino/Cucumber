Feature: Login Test

Scenario: Check Login with data table
Given launch the login page
When User enter the credentials as email and password
|vijiraja@gmail.com|viji123| 
Then User should validate the login 