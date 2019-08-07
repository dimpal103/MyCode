feature: Free CRM Login feature
Scenario: Free CRM Login Test scenario
Given user is already on Login page
when title is Free CRM
then user enters user name and password
And user clicks on login button
And user is on home page
