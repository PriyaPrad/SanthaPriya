package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPageLocator extends BaseClass{
	public static WebElement getLoginDetails(String data) {
		return driver.findElement(By.id(data));
		
	}
	

}
