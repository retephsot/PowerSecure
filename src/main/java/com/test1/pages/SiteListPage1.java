package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteListPage1 extends PageBase
{

	//private WebDriver driver;
	
	public SiteListPage1 (WebDriver driver)
	{
		super(driver);
	}
	
//	public String getTitle()
//	{
//		return driver.getTitle();
//	}
	
	public SiteListPage2 clickNextPageLink() throws InterruptedException
	{
		
		//Find Next Page button and click on it
		driver.findElement(By.xpath(".//*[@id='content-body']/div[2]/site-list-view/div/div[2]/button[2]")).click();
				
		Thread.sleep(2000);
		
		return new SiteListPage2(driver);
	}

	
//	public String getWidgetTitle()
//	{
//		
//		System.out.println(driver.findElement(By.cssSelector("h3.widget-title")).getText());
//		
//		return driver.findElement(By.cssSelector("h3.widget-title")).getText().contains(expectedWidgetTitle);
//	}
	
}
