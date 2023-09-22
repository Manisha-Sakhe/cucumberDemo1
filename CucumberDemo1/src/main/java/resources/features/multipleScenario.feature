Feature: Validating Admin functionality of orange hrm
 
 Scenario: Validating login with username and password
 Given user should open "https://opensource-demo.orangehrmlive.com/"
 When  user enters Admin and admin123
 And click on login button
 Then validates whether the user successfully logged in
 
 Scenario: Validating login with username and password
 Given user should open "https://opensource-demo.orangehrmlive.com/"
 When  user enters Admin1 and admin@123
 And click on login button
 

