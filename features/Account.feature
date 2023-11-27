Feature: Accounts Functionality

Scenario: CreateLead-Account


And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
When Click on the Leads tab
And Click on the Create Lead
Given Enter the company name as 'Testleaf'
And Enter the first name as 'Gokul'
And Enter the last name as 'Sekar'
When Click on the submit button
Then Verify Create Lead is successfull
Given Get the lead id


Scenario: EditLead-Account

#Given Launch the browser
#And Load the url
And Enter the username as 'democsr'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
When Click on the Leads tab
And Click the findLead
When Click the phno
Given Enter the phno as '99'
When Click on the find leads
When Click on the first Result ID
And Click on the edit button
Given update the cname as 'TCS'
When click on the update button


Scenario: DeleteLead-Account

And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
When Click on the Leads tab
And Click the findLead
When Click the phno
Given Enter the phno as '99'
When Click on the find leads
When Click on the first Result ID
#Then getID
And Click on the delete
And Click the findLead
Then After Click findLead

