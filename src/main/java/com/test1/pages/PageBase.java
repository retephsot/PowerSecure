package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase 
{
	//change to protected so it can be inherited by other class
    //private WebDriver driver;
	protected WebDriver driver;
	
	public PageBase (WebDriver driver)
	{
		this.driver = driver;
	}
	

	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public LogInPage logOut() throws InterruptedException
	{
		//find My Account link and click
		driver.findElement(By.xpath("//*[@id='page-box']/div[1]/div[2]/div/ul/div[1]/a/span[2]")).click();
				
		Thread.sleep(3000);
				
		//Find Edit Profile dropdown link and click logout
		driver.findElement(By.linkText("Logout")).click();
		
		return new LogInPage(driver);
	}
	
	public TestingDashboardView clickTestingLink() throws InterruptedException
	{
		
		Thread.sleep(1000);
		
		//find the Add LM button and click
		driver.findElement(By.linkText("Testing")).click();
		
		Thread.sleep(5000);
		
		return new TestingDashboardView(driver);
		
	}

}
