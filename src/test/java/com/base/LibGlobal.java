package com.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver"
				, "C:\\Users\\faizur\\eclipse-cucumberr\\AdacBasePojo\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public static void loadUrl(String s1) {
		driver.get(s1);
		
	}
	
	public static void btnClick(WebElement ele) {
		ele.click();
		
	}
	
	public static void type(WebElement ele, String s1) {
		ele.sendKeys(s1);
		
	}
	
	public static String getUrl() {
		return driver.getCurrentUrl();
		
	}
	
	public static void selectValueByText(WebElement ele, String s1) {
		Select s= new Select(ele);
		s.selectByVisibleText(s1);
		
	}
	
	public static String getAttributeValue(WebElement ele) {
		String attribute = ele.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		
	}
	
	public static void confirmAlertaccept() {
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}
	
	public static String generateRandomDate() {
		return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss").format(new Date());
		
	}
	
	public static void screenShot() {
		TakesScreenshot tk= (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\faizur\\eclipse-cucumberr\\AdacBasePojo\\Screenshot\\"+generateRandomDate()+".png");
		try {
			FileUtils.copyFile(s, d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
