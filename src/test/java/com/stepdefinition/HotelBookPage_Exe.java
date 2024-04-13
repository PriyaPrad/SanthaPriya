package com.stepdefinition;

import com.app.pageexe.HotelBookPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBookPage_Exe extends HotelBookPageExe{
	@Given("HotelBookPage Application")
	public void hotel_book_page_application() {
	    System.out.println("HotelBookPage Application");
	}
	@When("Enter the firstname {string}")
	public void enter_the_firstname(String firstName) {
	    firstName(firstName);
	    System.out.println(firstName);
	}
	@When("Enter the lastname {string}")
	public void enter_the_lastname(String lastName) {
	    lastName(lastName);
	    System.out.println(lastName);
	}
	@When("Enter the billingAddress {string}")
	public void enter_the_billing_address(String billAdd) {
	    billingAddress(billAdd);
	    System.out.println(billAdd);
	}
	@When("Enter the creditCardNumber {string}")
	public void enter_the_credit_card_number(String ccno) {
	    creditCardNumber(ccno);
	    System.out.println(ccno);
	}
	@When("Enter the creditCardType {string}")
	public void enter_the_credit_card_type(String cctype) {
	    creditCardType(cctype);
	    System.out.println(cctype);
	    
	}
	@When("Enter the Expiry Month {string}")
	public void enter_the_expiry_month(String expmonth) {
	    expiryMonth(expmonth);
	    System.out.println(expmonth);
	}
	@When("Enter the Expiry Year {string}")
	public void enter_the_expiry_year(String expyr) {
	    expiryYear(expyr);
	    System.out.println(expyr);
	    
	}
	@When("Enter the cvv number {string}")
	public void enter_the_cvv_number(String cvvno) {
	    cvvNumber(cvvno);
	    System.out.println(cvvno);
	}
	@When("Enter the Book Now Button")
	public void enter_the_book_now_button() {
		bookNowButton();
		
	}
	@When("Get the Order Number")
	public void get_the_order_number(String orderNo) {
		orderNo();
		System.out.println(orderNo);
	}
	
	
	@Then("Validate HotelBookPage")
	public void validate_hotel_book_page() {
	    System.out.println("HotelBookPageValidation");
	}

}
