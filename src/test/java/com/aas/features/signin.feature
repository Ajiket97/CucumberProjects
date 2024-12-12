Feature: Login Functionality

Scenario Outline: Verify login page using valid credentials
Given User is on login page
And User click on Sign in button
When User enter valid email id <id> and  click on Continue button
And User enter the valid password <pass> and click on Keep me logged in checkbox
And Click on Log in button 
Then User is on landing page 
Examples: 
|id |pass| 
|"atish.zoting@gmail.com"|"Rudra@2211"| 
