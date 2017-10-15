@regression;@current
Feature: Customer Payment submission
Scenario: Validate Cust info set up and payment submission
Given cust navigates to "http://www.practiceselenium.com/check-out.html"
When cust pass in parameters "email" "name" "address" into cust info fields
And cust pass in cardtype param1  "CardType"
And cust pass in card detail param2  "custNumber" "cardHolderName" "verificationCode"
And cust click on placeOrder
Then cust views page title
And cust logs out of the AUT








