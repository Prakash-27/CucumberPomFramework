Feature: Login page feature

@login
Scenario: Login Page title 
Given user is on login page
When user gets the title of the page 
Then page title should be "Login - My Store"

@login
Scenario: Forget Password link 
Given user is on login page 
Then forget your password link should be displayed

@login
Scenario: Login with correct credentials
Given user is on login page
When user enters username "prakashs23007@gmail.com"
And user enters password "test123"
And user clicks on login button 
Then user gets the title of the page 
And page title should be "My account - My Store"