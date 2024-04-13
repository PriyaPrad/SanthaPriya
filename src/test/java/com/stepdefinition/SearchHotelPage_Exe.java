package com.stepdefinition;

import com.app.pageexe.SearchHotelPageExe;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelPage_Exe extends SearchHotelPageExe{
	@When("Enter the Location {string}")
	public void enter_the_location(String location) {
		location(location);
		System.out.println(location);
	   
	}
	@When("Enter the Hotels {string}")
	public void enter_the_hotels(String hotel) {
	    hotel(hotel);
	    System.out.println(hotel);
	    
	}
	@When("Enter the Room Type {string}")
	public void enter_the_room_type(String room) {
		roomType(room);
	    System.out.println(room);
	}
	@When("Enter the Number of Rooms {string}")
	public void enter_the_number_of_rooms(String number) {
		numberOfRooms(number);
	    System.out.println(number);
	}
	@When("Enter the Check In Date {string}")
	public void enter_the_check_in_date(String indate) {
	    checkInDate(indate);
	    System.out.println(indate);
	}
	@When("Enter the Check Out Date {string}")
	public void enter_the_check_out_date(String outdate) {
		checkOutDate(outdate);
	    System.out.println(outdate);
	}
	@When("Enter the Adults per Room {string}")
	public void enter_the_adults_per_room(String adults) {
		adultsPerRoom(adults);
	    System.out.println(adults);
	}
	@When("Enter the Children per Room {string}")
	public void enter_the_children_per_room(String child) {
		childrenPerRoom(child);
	    System.out.println(child);
	}
	@When("Enter the Search Button")
	public void enter_the_search_button() {
	    searchButton();
	    
	    System.out.println("SearchButton");
	}
	@Then("Validate SearchHotelPage")
	public void validate_search_hotel_page() {
		System.out.println("Search Hotel Page");
	}


}
