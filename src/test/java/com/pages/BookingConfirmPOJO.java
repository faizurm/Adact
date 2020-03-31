package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingConfirmPOJO extends LibGlobal{
	
	public BookingConfirmPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="order_no")
	private WebElement orderNo;
	@FindBy (xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedIternary;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	public WebElement getBookedIternary() {
		return bookedIternary;
	}

	
	

}
