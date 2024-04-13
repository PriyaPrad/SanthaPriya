Feature: SearchHotelPageValidation

Background: Given Search Hotel Application

@tag1
Scenario: Validate Search Hotel
When Enter the Location "Melbourne"
And Enter the Hotels "Hotel Sunshine"
And Enter the Room Type "Super Deluxe"
And Enter the Number of Rooms "2 - Two"
And Enter the Check In Date "31/03/2024"
And Enter the Check Out Date "04/04/2024"
And Enter the Adults per Room "2 - Two"
And Enter the Children per Room "2 - Two"
And Enter the Search Button
Then Validate SearchHotelPage