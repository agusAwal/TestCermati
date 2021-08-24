Feature: feature to test signup
Scenario: check signup successfully

Given user is on signup page
When user enters email, password, confirmPassword, firstName, lastName, phoneNumber and city
And click on signup button
Then user succesfully signup
