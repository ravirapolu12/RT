Feature: Place an Order

Scenario: User should be able to place an order

Given open browser
When user is on homepage
Then user enters username and password
Then user clicks on signin button
Then search for the product
Then click on buy now
Then choose the delivery address
Then choose the mode of payment
Then Place an order