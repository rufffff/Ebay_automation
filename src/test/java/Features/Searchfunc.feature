Feature: Search Functionality
Scenario: To verify the user is able to search for an item in the application
Given  User in home page
When  User click on the Search edit box
And  User enter the item name in Search edit box
And  User click the Search button
Then  Products will appear


Scenario: To verify the user is able to search for an unrelated item in the application
Given User in home page
When User click on the Search edit box
And User enter the unrelated item name in Search edit box
And User click the Search button
Then User got the message like error



Scenario: To verify the user is able to view the daily deals
Given User in home page
When User click on the  link Daily Deals
Then User reaches the daily deals page




Scenario: To verify the user is able to select the different categories
Given User in home page
When User click on the link Shop by category
And Select the different categories
Then Display the selected the product


Scenario: To verify the user is able to filter the products
Given User in home page
When User is in product page
And User click on the More filters
And Select the different Specifications
And Click on the Apply
Then Displayed the Product with given Specificatons


#Scenario: To verify the user is able to search for multiple items in the list
#Given User in home page
#When User click on the Watchlist
#And Select the multiple products 
#And Click on the Add to list
#Then Display the product list



Scenario: To verify that user is able to Add items to the cart
Given User in home page
When User click on the Search edit box
And Enter the product name in Search edit box
And  Click on the Add to cart button
Then Product will  be Add to cart