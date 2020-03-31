package com.managers;

import com.pages.BookingConfirmPOJO;
import com.pages.BookingHotelPOJO;
import com.pages.LoginPagePOJO;
import com.pages.SearchHotelPagePOJO;
import com.pages.SelectHotelPagePOJO;

public class PageObjectManager {

	private LoginPagePOJO loginPagePOJO;
	private SelectHotelPagePOJO selectHotelPagePOJO;
	private SearchHotelPagePOJO searchHotelPagePOJO;
	private BookingHotelPOJO bookingHotelPOJO;
	private BookingConfirmPOJO bookingConfirmPOJO;
	
	
	public LoginPagePOJO getLoginPagePOJO() {
		return (loginPagePOJO==null)?loginPagePOJO= new LoginPagePOJO():loginPagePOJO;
	}
	public SelectHotelPagePOJO getSelectHotelPagePOJO() {
		return (selectHotelPagePOJO==null)?selectHotelPagePOJO= new SelectHotelPagePOJO():selectHotelPagePOJO;
	}
	public SearchHotelPagePOJO getSearchHotelPagePOJO() {
		return (searchHotelPagePOJO==null)?searchHotelPagePOJO= new SearchHotelPagePOJO():searchHotelPagePOJO;
	}
	public BookingHotelPOJO getBookingHotelPOJO() {
		return (bookingHotelPOJO==null)?bookingHotelPOJO= new BookingHotelPOJO(): bookingHotelPOJO;
	}
	public BookingConfirmPOJO getBookingConfirmPOJO() {
		return (bookingConfirmPOJO==null)?bookingConfirmPOJO= new BookingConfirmPOJO():bookingConfirmPOJO;
	}
	
	
	
	
	
}
