package com.app.pageexe;

import com.app.locator.LoginPageLocator;


import com.base.BaseClass;

public class LoginPageExe extends LoginPageLocator{
	public static void username(String user) {
		BaseClass.input_text(LoginPageLocator.getLoginDetails("username"), user );
	}

	public static void password(String user) {
		BaseClass.input_text(LoginPageLocator.getLoginDetails("password"), user);
	}
	
	public static void loginButton() {
		BaseClass.click_value(LoginPageLocator.getLoginDetails("login"));
	}


}
