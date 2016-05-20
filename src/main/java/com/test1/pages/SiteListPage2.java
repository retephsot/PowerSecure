package com.test1.pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteListPage2 extends PageBase
{
	

	
	public SiteListPage2 (WebDriver driver)
	{
		super(driver);
	}
	
	
	public SiteDetailView clickSiteNameLink(String sitename)
	{
		//Find the link for site name and click
		driver.findElement(By.partialLinkText(sitename)).click();
		
		//to get the window count after clicking on Arby's 30
		System.out.println("Window count after " + sitename + ": " + driver.getWindowHandles().size());
		
        Iterator<String> whs = driver.getWindowHandles().iterator();
		
		String mainWin = whs.next();
		String detailViewWin = whs.next();
		//String Publix30 = whs.next();
		
		
		driver.switchTo().window(detailViewWin);

		return new SiteDetailView(driver);
	}

}
