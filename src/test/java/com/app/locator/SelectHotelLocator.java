package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectHotelLocator extends SearchHotelLocator{
	public static WebElement getSelectHotel(String data) {
		return driver.findElement(By.xpath(data));
		
	}
	

}
