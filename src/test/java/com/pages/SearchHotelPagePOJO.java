package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.base.LibGlobal;

public class SearchHotelPagePOJO extends LibGlobal {
	
	public SearchHotelPagePOJO()  {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="location")
	private WebElement location;
	@FindBy (id="hotels")
	private WebElement hotel;
	@FindBy (id="room_type")
	private WebElement roomType;
	@FindBy (id="room_nos")
	private WebElement noOfRooms;
	@FindBy (id="datepick_in")
	private WebElement checkInDate;
	@FindBy (id="datepick_out")
	private WebElement checkOutDate;
	@FindBy (id="adult_room")
	private WebElement adulPerRoom;
	@FindBy (id="child_room")
	private WebElement childPerRoom;
	@FindBy (id="Submit")
	private WebElement search;
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdulPerRoom() {
		return adulPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	

}
