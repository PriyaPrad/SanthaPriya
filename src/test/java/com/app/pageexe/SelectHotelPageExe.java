package com.app.pageexe;

import com.app.locator.SelectHotelLocator;
import com.base.BaseClass;

public class SelectHotelPageExe extends SearchHotelPageExe{
	public void radioButton() {
		BaseClass.click_value(SelectHotelLocator.getSelectHotel("//input[@id='radiobutton_0' and @type='radio']"));
	}
	
	public void continueButton() {
		BaseClass.click_value(SelectHotelLocator.getSelectHotel("//input[@id='continue' and @type='submit']"));
	}

}
