package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal {
	
	@Before
	public void beforeScenario() {
		getDriver();
	}
	
	@After
	public void afterScenario(Scenario sc) {
		if(sc.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] byt = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(byt, "images/png");
	}
		
	}
	

}
