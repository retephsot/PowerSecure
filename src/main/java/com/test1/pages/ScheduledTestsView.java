package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScheduledTestsView extends PageBase
{
	public ScheduledTestsView(WebDriver driver) 
	{
		super(driver);
	}
	
	public boolean isCreateTestbySiteNameSuccessful (String sitename) throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(.,sitename)]")).getText());
		
		Thread.sleep(2000);
		
		boolean testresults;
		
		System.out.println("The sitename is :" + sitename);
		
		testresults = driver.findElement(By.xpath("//div[contains(.,sitename)]")).getText()
				.contains(sitename);
		
        Thread.sleep(3000);
		
		System.out.println(testresults);
		
		Thread.sleep(3000);
		
		return testresults;
	}

	public boolean isCreateTestbyRunGroupSuccessful (String RunGroup) throws InterruptedException
	{
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(.,RunGroup)]")).getText());
		
		Thread.sleep(2000);
		
		boolean testresults;
		
		System.out.println("The run group is :" + RunGroup);
		
		testresults = driver.findElement(By.xpath("//div[contains(.,RunGroup)]")).getText()
				.contains(RunGroup);
		
        Thread.sleep(3000);
		
		System.out.println(testresults);
		
		Thread.sleep(3000);
		
		return testresults;
	}

	
}
