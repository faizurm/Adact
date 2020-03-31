package com.stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;
import com.managers.PageObjectManager;
import com.pages.BookingConfirmPOJO;
import com.pages.BookingHotelPOJO;
import com.pages.LoginPagePOJO;
import com.pages.SearchHotelPagePOJO;
import com.pages.SelectHotelPagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStep extends LibGlobal {
	PageObjectManager pageObjectManager;
	public static String orderId;

	@Given("user navigated to adact application")
	public void user_navigated_to_adact_application() {

		loadUrl("https://www.adactin.com/HotelApp/");

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {

		pageObjectManager = new PageObjectManager();
		type(pageObjectManager.getLoginPagePOJO().getTxtUSer(), s1);
		type(pageObjectManager.getLoginPagePOJO().getTxtPass(), s2);

	}

	@When("user whould click logIn button")
	public void user_whould_click_logIn_button() {
		btnClick(pageObjectManager.getLoginPagePOJO().getLiBtnLogIn().get(0));
	}

	@When("user should verify he has entered into Welcome page")
	public void user_should_verify_he_has_entered_into_Welcome_page() {
		Assert.assertTrue("verify search Hotel page", getUrl().contains("SearchHotel"));
	}

	@Then("User Selects the {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_Selects_the(String s1, String s2, String s3, String s4, String s5, String s6, String s7,
			String s8) {

		selectValueByText(pageObjectManager.getSearchHotelPagePOJO().getLocation(), s1);
		selectValueByText(pageObjectManager.getSearchHotelPagePOJO().getHotel(), s2);
		selectValueByText(pageObjectManager.getSearchHotelPagePOJO().getRoomType(), s3);
		selectValueByText(pageObjectManager.getSearchHotelPagePOJO().getNoOfRooms(), s4);
		type(pageObjectManager.getSearchHotelPagePOJO().getCheckInDate(), s5);
		type(pageObjectManager.getSearchHotelPagePOJO().getCheckOutDate(), s6);
		selectValueByText(pageObjectManager.getSearchHotelPagePOJO().getAdulPerRoom(), s7);
		selectValueByText(pageObjectManager.getSearchHotelPagePOJO().getChildPerRoom(), s8);
		btnClick(pageObjectManager.getSearchHotelPagePOJO().getSearch());
	}

	@Then("user should verify he is in select hotel page")
	public void user_should_verify_he_is_in_select_hotel_page() {
		Assert.assertTrue("verify select hotel page", getUrl().contains("SelectHotel"));
	}

	@When("user selects the hotel")
	public void user_selects_the_hotel() {

		btnClick(pageObjectManager.getSelectHotelPagePOJO().getCheBoc());
		btnClick(pageObjectManager.getSelectHotelPagePOJO().getContin());

	}

	@When("user should verify he entered in book a hotel page")
	public void user_should_verify_he_entered_in_book_a_hotel_page() {
		Assert.assertTrue("verify booking hotel page", getUrl().contains("BookHotel"));
	}

	@When("user enters his personnel details {string}, {string}, {string}, {string}, {string}, {string},  {string}, {string}")
	public void user_enters_his_personnel_details(String s1, String s2, String s3, String s4, String s5, String s6,
			String s7, String s8) {

		type(pageObjectManager.getBookingHotelPOJO().getFirstName(), s1);
		type(pageObjectManager.getBookingHotelPOJO().getLastName(), s2);
		type(pageObjectManager.getBookingHotelPOJO().getAddress(), s3);
		type(pageObjectManager.getBookingHotelPOJO().getCcNo(), s4);
		selectValueByText(pageObjectManager.getBookingHotelPOJO().getCcType(), s5);
		selectValueByText(pageObjectManager.getBookingHotelPOJO().getExpMonth(), s6);
		selectValueByText(pageObjectManager.getBookingHotelPOJO().getExpYear(), s7);
		type(pageObjectManager.getBookingHotelPOJO().getCvvNumber(), s8);
	}

	@When("user click book now")
	public void user_click_book_now() {

		btnClick(pageObjectManager.getBookingHotelPOJO().getBookNow());
	}

	@Then("User is getting order no")
	public void user_is_getting_order_no() {

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		orderId = getAttributeValue(pageObjectManager.getBookingConfirmPOJO().getOrderNo());
		btnClick(pageObjectManager.getBookingConfirmPOJO().getBookedIternary());
	}

	@Then("User cancels his booking")
	public void user_cancels_his_booking() {

		WebElement checkBoxx = driver
				.findElement(By.xpath("//input[@value='" + orderId + "']/parent::td/preceding-sibling::td"));
		btnClick(checkBoxx);
		WebElement cancel = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		btnClick(cancel);
		confirmAlertaccept();
	}

}
