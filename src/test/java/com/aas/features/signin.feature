Feature: Login Functionality

#Scenario Outline: Verify login page using valid credentials
#Given User is on login page
#And User click on Sign in button
#When User enter valid email id <id> and  click on Continue button
#And User enter the valid password <pass> and click on Keep me logged in checkbox
#And Click on Log in button 
#Then User is on landing page 


Scenario Outline: Verify login page using valid credentials
Given User is on login page
And User click on Sign in button
When I fetch data from "<ExcelFile>" at row "<RowNumber>"
When User enter valid email id and click on Continue button
And User enter the valid password and click on Keep me logged in checkbox
And Click on Log in button 
Then User is on landing page 

Examples:
|ExcelFile|RowNumber|
|advance|1|
