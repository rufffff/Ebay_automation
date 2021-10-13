Feature: Buy Product Functionality


Scenario: To verify the user is able to Provide quantity
Given User is in the particular product page
When  User Click on the Quantity field
And  User Enter the valid number of quantity
Then  Number of quantity appeared



Scenario: To verify the user is able to add items in to Add cart
Given User is in the particular product page
When  User Click on the Quantity field
And  User Enter the valid number of quantity
And  User click on the Add to Cart button
Then  The page navigated to the Shopping cart page


Scenario: To verify the user is able to buy the particular Product
Given User is in the particular product page
When  User Click on the Quantity field
And  User Enter the valid number of quantity
And  User Click on the Buy It Now Button
Then  The page navigated to the Checkout page


Scenario: To verify the user is able to provide shipping address
Given User is in the check out page
When  User enters the details
Then  User reaches the Checkout page with the product details