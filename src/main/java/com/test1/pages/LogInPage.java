package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends PageBase
{
	//the below is now inherited from PageBase
	//private WebDriver driver;
	
	public LogInPage (WebDriver driver)
	{
		//constructor to get driver instance and pass to PageBase Class
		//super is BaseClass () call the constructor and pass in driver instance
		super(driver);
		//this.driver = driver;
	}
	
//the below is now inherited from PageBase
//	public String getTitle()
//	{
//		return driver.getTitle();
//	}
	

	public DefaultLoadingPage loginAs(String username, String password)
	{
		//Find email field and enter userID
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		// Find password field and clear it
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		//Find password field and enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		//Find Login button and click on it
		driver.findElement(By.cssSelector("input.button.form-submit-button")).click();
		
		return new DefaultLoadingPage(driver);
		
	}
	

}
