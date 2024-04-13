package com.stepdefinition;

import com.app.pageexe.SelectHotelPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotelPage_Exe extends SelectHotelPageExe{
	@Given("Select Hotel Application")
	public void select_hotel_application() {
	    System.out.println("Select Hotel Page Application");
	}
	@When("Enter the Select Button")
	public void enter_the_select_button() {
		radioButton();
	    
	    System.out.println("SearchButton");
	}
	
	@When("Enter the Continue Button")
	public void enter_the_continue_button() {
	    continueButton();
	}
	
	@Then("Validate the Select Page")
	public void validate_the_select_page() {
		System.out.println("Validate the Select Page");
	   
	}

	

}
