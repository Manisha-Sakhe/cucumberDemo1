 
Feature: Validating login functionality of Orange HRM

Scenario: Validating login with username and password

 
Given user should be on login page
When user enters username and password
And Click on login button
Then validates whether the user successfully logged in