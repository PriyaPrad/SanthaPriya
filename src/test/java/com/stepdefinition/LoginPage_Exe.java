package com.stepdefinition;

import com.app.pageexe.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Exe extends LoginPageExe{
	@Given("Login to application")
	public void login_to_application() {
		browser("https://adactinhotelapp.com/");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		username(user);
		System.out.println(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		password(pass);
		System.out.println(pass);
	}
	@When("Enter the login Button")
	public void enter_the_login_button() {
		loginButton();
		System.out.println("login button");
	}
	@Then("Validate the HomePage")
	public void validate_the_home_page() {
		System.out.println("Home Page");
	}


}
