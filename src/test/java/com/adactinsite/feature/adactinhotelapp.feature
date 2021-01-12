Feature: Hotel Booking Functionality in Adactin application

Scenario: User login to the Adactin Application

Given User launch the Adactin Application
When User enter valid "username" in the username field
And User enter  valid "password" in the password field
And User clicks the login button
Then it navigates to the search hotel page

Scenario: User is filling the details to book a room

When user selects the location
And user select the hotel  
And user selects the room type
And user selects number of rooms
And user selects the checkin date
And user selects the checkout date
And user selects adults per room
And user selects number of children per room
And user clicks the search icon 
Then it navigates to the next page

Scenario: Selecting the order page of hotel booking

When user selects the radio button 
And user clicks the continue button 
Then it navigates to the next page

Scenario: User enters the personal details

When User enters the name
And User enters the last name
And user enters the Billing address
And user adds Credit card number
And user selects the CC type
And user selects the Expiry date
And user gives the CVV number
And user clicks the continue button
Then user cliks logout
