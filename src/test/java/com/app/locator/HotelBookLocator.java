package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelBookLocator extends SelectHotelLocator{
	public static WebElement getHotelBook(String data) {
		return driver.findElement(By.id(data));
		
	}
	public static WebElement getHotelBooks(String data) {
		return driver.findElement(By.xpath(data));
		
	}

}
