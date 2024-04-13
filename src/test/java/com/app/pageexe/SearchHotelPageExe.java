package com.app.pageexe;


import com.app.locator.SearchHotelLocator;

import com.base.BaseClass;

public class SearchHotelPageExe extends LoginPageExe{
	public void location(String location) {
		BaseClass.dropDown_Value(SearchHotelLocator.getSearchHotel("location"), location);
	}

	public void hotel(String hotel) {
		BaseClass.dropDown_Value(SearchHotelLocator.getSearchHotel("hotels"), hotel);
	}

	public void roomType(String room) {
		BaseClass.dropDown_Value(SearchHotelLocator.getSearchHotel("room_type"), room);
		}

	public void numberOfRooms(String number) {
		BaseClass.dropDown_VisbleText(SearchHotelLocator.getSearchHotels("(//select[@class='search_combobox'])[4]"),number);
	}

	public void checkInDate(String indate) {
//		BaseClass.clear_value(SearchHotelLocator.getSearchHotels(indate));
		BaseClass.input_text(SearchHotelLocator.getSearchHotels("//input[@id='datepick_in' and @type='text']"), indate);
	}

	public void checkOutDate(String outdate) {
//		BaseClass.clear_value(SearchHotelLocator.getSearchHotels(outdate));
		BaseClass.input_text(SearchHotelLocator.getSearchHotels("//input[@id='datepick_out' and @type='text']"), outdate);
	}

	public void adultsPerRoom(String adults) {
		BaseClass.dropDown_VisbleText(SearchHotelLocator.getSearchHotel("adult_room"), adults);
	}
	public void childrenPerRoom(String child) {
		BaseClass.dropDown_VisbleText(SearchHotelLocator.getSearchHotels("//select[@name='child_room']"), child);
	}

	public void searchButton() {
		BaseClass.click_value(SearchHotelLocator.getSearchHotels("//input[@id='Submit']"));
	}


}
