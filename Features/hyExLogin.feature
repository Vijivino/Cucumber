Feature: Login with excel data in POM

Scenario: Login with registered credentials
When Click login link
And Enter email and password from excelsheet "<sheetname>" and rownumber <rownumber>
And Click login button
Then Validate the login functionality

Examples:
|sheetname|rownumber|
|book1|2|






