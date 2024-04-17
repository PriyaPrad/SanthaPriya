package com.app.pageexe;


import com.app.locator.LoginPage_Locator;

import base.BaseClass;

public class LoginPageExe extends LoginPage_Locator  {
	
	public static void username(String user) {
		BaseClass.input_text(LoginPage_Locator.getLoginDetails("username"), user );
	}

	public static void password(String user) {
		BaseClass.input_text(LoginPage_Locator.getLoginDetails("password"), user);
	}
	
	public static void loginButton() {
		BaseClass.click_value(LoginPage_Locator.getLoginDetails("login"));
	}
}
