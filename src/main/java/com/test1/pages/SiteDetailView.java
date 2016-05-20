package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteDetailView extends PageBase
{

	
	
	public SiteDetailView (WebDriver driver)
	{
		super(driver);
	}
	

	
	public ConfigurationPage clickGearIconLink()
	{
		//Find the gear icon button and click
		driver.findElement(By.className("icon-config")).click();
		
		return new ConfigurationPage(driver);
	}

}
