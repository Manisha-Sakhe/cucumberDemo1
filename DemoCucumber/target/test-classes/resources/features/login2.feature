 Feature: Validating the login functionality for orangehrm
 Scenario: Validating the login with  user name and password
 
 Given user should be on  "https://opensource-demo.orangehrmlive.com/"
 When  user enters  Admin and admin123
 And  click on login button
 Then  validate whether user successfully logged  in 
 