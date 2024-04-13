package com.app.locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotelLocator extends LoginPageLocator{
//	public static WebElement getLocation() {
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//		return driver.findElement(By.id("location"));
//		
//	}
//	
//	public static WebElement getHotel() {
//		return driver.findElement(By.id("hotels"));
//		
//	}
//	public static WebElement getRoomType() {
//		return driver.findElement(By.id("room_type"));
//	}
//	public static WebElement getNumberOfRooms() {
//		return driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
//	}
//	
//	public static WebElement getCheckInDate() {
//		return driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	}
//	public static WebElement getCheckOutDate() {
//		return driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//	}
//	public static WebElement getAdultsPerRoom() {
//		return driver.findElement(By.id("adult_room"));
//	}
//	public static WebElement getChildrenPerRoom() {
//		return driver.findElement(By.xpath("//select[@name='child_room']"));
//	}
//	public static WebElement getSearchButton() {
//		return driver.findElement(By.xpath("//input[@id='Submit']"));
//	}
	public static WebElement getSearchHotel(String data) {
		return driver.findElement(By.id(data));
		
	}
	public static WebElement getSearchHotels(String data) {
		return driver.findElement(By.xpath(data));
		
	}


}
