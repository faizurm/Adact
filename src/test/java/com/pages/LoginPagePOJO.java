package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPagePOJO extends LibGlobal {
	public LoginPagePOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUSer;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(xpath="//input[@class='login_button']")
	private List<WebElement> liBtnLogIn;
	public WebElement getTxtUSer() {
		return txtUSer;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public List<WebElement> getLiBtnLogIn() {
		return liBtnLogIn;
	}
	
}
