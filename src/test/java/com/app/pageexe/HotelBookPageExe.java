package com.app.pageexe;

import com.app.locator.HotelBookLocator;

import com.base.BaseClass;

public class HotelBookPageExe extends SelectHotelPageExe{
	public void firstName(String firstName) {
		BaseClass.input_text(HotelBookLocator.getHotelBooks("//input[@id='first_name']"), firstName);
	}
	public void lastName(String lastName) {
		BaseClass.input_text(HotelBookLocator.getHotelBooks("//input[@id='last_name']"), lastName);
	}
	public void billingAddress(String billAdd) {
		BaseClass.input_text(HotelBookLocator.getHotelBooks("//textarea[@id='address']"), billAdd);
	}
	public void creditCardNumber(String ccno) {
		BaseClass.input_text(HotelBookLocator.getHotelBooks("//input[@id='cc_num']"), ccno);
	}
	public void creditCardType(String cctype) {
		BaseClass.dropDown_VisbleText(HotelBookLocator.getHotelBooks("//select[@id='cc_type']"), cctype);
	}
	public void expiryMonth(String expmon) {
		BaseClass.dropDown_VisbleText(HotelBookLocator.getHotelBook("cc_exp_month"), expmon);
	}
	public void expiryYear(String expyr) {
		BaseClass.dropDown_VisbleText(HotelBookLocator.getHotelBook("cc_exp_year"), expyr);
	}
public void cvvNumber(String cvv) {
	BaseClass.input_text(HotelBookLocator.getHotelBooks("//input[@id='cc_cvv']"), cvv);
}
public void bookNowButton() {
	BaseClass.click_value(HotelBookLocator.getHotelBook("book_now"));
}
public void orderNo() {
BaseClass.get_values(HotelBookLocator.getHotelBooks("//input[@id='order_no']"),"value");
}

}
