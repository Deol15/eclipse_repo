Feature: reset the functionality of login page
Description: This is the details of feature
background: 
Given: launch the application
Scenario: with valid
When enter the username "manjot"
Then enter the password "13234"

Scenario: invalid data
When enter the username in "sahib"
Then enter the password in "13234"