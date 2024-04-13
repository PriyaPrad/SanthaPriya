Feature: HotelBookPageValidation
Background:
Given HotelBookPage Application
@tag1
Scenario: Validate HotelBook Page
When Enter the firstname "Santha Priya"
And Enter the lastname "KG"
And Enter the billingAddress "4/635 H Muthu Street. Vandiyur, Madurai - 20."
And Enter the creditCardNumber "1234567890123456"
And Enter the creditCardType "VISA"
And Enter the Expiry Month "March"
And Enter the Expiry Year "2025"
And Enter the cvv number "345"
And Enter the Book Now Button
And get the Order Number
Then Validate HotelBookPage