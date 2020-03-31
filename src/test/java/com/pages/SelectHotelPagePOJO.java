package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelPagePOJO extends LibGlobal{
	
	public SelectHotelPagePOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="radiobutton_0")
	private WebElement cheBoc;
	@FindBy (id="continue")
	private WebElement contin;
	
	
	public WebElement getCheBoc() {
		return cheBoc;
	}
	public WebElement getContin() {
		return contin;
	}

	
	
}
