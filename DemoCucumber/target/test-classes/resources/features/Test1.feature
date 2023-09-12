 Feature: Validating the login functionality for orangehrm
 Scenario: Validating the login with  user name and password
 
 Given user should be on login page
 When  user enters  user name and password
 And  click on login button
 Then  validate whether user successfully logged  in 
 