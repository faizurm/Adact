package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingHotelPOJO extends LibGlobal {
	public BookingHotelPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="first_name")
	private WebElement firstName;
	@FindBy (id="last_name")
	private WebElement lastName;
	@FindBy (id="address")
	private WebElement address;
	@FindBy (id="cc_num")
	private WebElement ccNo;
	@FindBy (id="cc_type")
	private WebElement ccType;
	@FindBy (id="cc_exp_month")
	private WebElement expMonth;
	@FindBy (id="cc_exp_year")
	private WebElement expYear;
	@FindBy (id="cc_cvv")
	private WebElement cvvNumber;
	@FindBy (id="book_now")
	private WebElement bookNow;
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNo() {
		return ccNo;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
}
