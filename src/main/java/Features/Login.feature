Feature: Fee CRM Login Feature

Background:
Given learn bg

@Regression
Scenario: Fee CRM login scenario
Given User is already on login page
When Title of login page is "Free CRM"
Then user enters username and password
Then user clicks on login button
And user is on home page
