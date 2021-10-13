Feature: Sign in functionality
#Scenario: To verify that the user redirects to the sign up page
#Given User is in home page
#When User click on the Sign in
#Then Application navigates to Sign in page
#
#
#
#
#Scenario: To verify that user able to login
#Given User is in the Sign up page
#When User entering details
#Then User reaches the home page
#
#
#Scenario: To verify that the user enters the valid gmail or facebook or Apple accounts
#Given User is in home page
#When User click on the Sign in
#And User click on Continue with Facebook
#And User enters Facebook username or email
#And User Enter Facebook password
#And User click on Log In
#Then Signed up succesfully by Facebook account
#
#Scenario: To verify that the user enters the valid gmail or facebook or Apple accounts
#Given User is in home page
#When User click on the Sign in
#And User click on Continue with Apple
#And User enters Apple userId
#And User enters Apple password
#And User click on sign in arrow
#Then Signed up succesfully by Apple account 
#
#Scenario: To verify that the user able to switch accounts
#Given User is in home page
#When User click on the Sign in
#And User mistakely enters wrong Email or username
#And User click on Continue
#And User click on Switch account link
#And User enter correct  Email or username
#Then user account is changed

Scenario: To verify the user is able to get OTP on register email and phone number
Given User is in home page
When User click on the Sign in
And User enters the Email or username
And User click on Continue
And User clicks on Need help signing in?
And in Email Click on Receive email
And Enter OTP received on registered email
And Ater entering opt recieved in email and click Continue
Then User reached the home page

#
#Scenario: To verify the user is able to get OTP on register email and phone number
#Given User is in home page
#When User click on the Sign in
#And User enters the Email or username
#And User click on Continue
#And User clicks on Need help signing in?
#And in Text Click on Receive text
#And Enter OTP received on registered Phone number
#And Ater entering opt recieved in phone number and click Continue
#Then User reached the home page