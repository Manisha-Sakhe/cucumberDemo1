 Feature: Validate the login credentials

 

Scenario Outline: Test the validate login

 

Given user is in loginpage

When user enters <username> and  <password>

And Click the login button

Then user should land on Homepage

@Postive

Examples:

|username|password|

|Admin|admin123|

|abc|adm12|

 

@Negative

Examples:

|username|password|

|abc|adm12|


 