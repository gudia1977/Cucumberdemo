Feature: Login scenario test

Scenario: Login with valid credentials
Given User is in login page
When User enter username  and pwd
And User click on login button
Then User navigate to homepage