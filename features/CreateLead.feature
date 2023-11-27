Feature: Leads Functionality
#Background:
#Given Launch the browser
#And Load the url

Scenario: CreateLead testcase with possitive Credentials

#Given Launch the browser
#And Load the url
And Enter the username as 'demosalesmanager'
And Enter the password
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
When Click on the Leads tab
And Click on the Create Lead
Given Enter the company name
And Enter the first name
And Enter the last name
When Click on the submit button
Then Verify Create Lead is successfull
Given Get the lead id
#Then Close the browser

Scenario: EditLead-Multiple

#Given Launch the browser
#And Load the url
And Enter the uName
And Enter the password
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
When Click on the Leads tab
And Click the findLead
When Click the phno
Given Enter the phno
When Click on the find leads

#Then Close the browser


