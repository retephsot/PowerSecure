package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfigurationPage extends PageBase
{
	
	//private WebDriver driver;
	
	public ConfigurationPage (WebDriver driver)
	{
		super(driver);
	}
	
//	public String getTitle()
//	{
//		return driver.getTitle();
//	}
	
	public ScheduledTests clickScheduledTestsLink() throws InterruptedException
	{
				
		//Find the Scheduled Tests button and click
		driver.findElement(By.linkText("Scheduled Tests")).click();
		Thread.sleep(3000);
		
		
		return new ScheduledTests(driver);
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
