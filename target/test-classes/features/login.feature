Feature: Login into application

Scenario Outline: positive testcases validation
Given initialize the browser chrome
And Navigate to "http://www.newtours.demoaut.com/" site
And click  on login button to naivgate homepage
When user enteers <username> and <password> and logsin
Then Verify that user successfully login
And close the browser


Examples:
|username     |password|
|mercuary     |mercuary|
  
Scenario: Register new user
Given initialize the browser chrome
And Navigate to "http://www.newtours.demoaut.com/" site
When user click on registration link
Then registration page should be open
And Fill the form
And click on submit button
And close the browser

 