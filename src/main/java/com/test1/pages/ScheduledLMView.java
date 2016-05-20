package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScheduledLMView extends PageBase
{
	public ScheduledLMView(WebDriver driver) 
	{
		super(driver);
	}
	
	public boolean isCreateLMbyUtilitySuccessful (String UtilityCompany1) throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(.,UtilityCompany1)]")).getText());
		
		Thread.sleep(2000);
		
		boolean testresults;
		
		testresults = driver.findElement(By.xpath("//div[contains(.,UtilityCompany1)]")).getText()
				.contains(UtilityCompany1);
		
        Thread.sleep(3000);
		
		System.out.println(testresults);
		
		Thread.sleep(3000);
		
		return testresults;
	}

	public boolean isCreateLMbyRunGroupSuccessful (String RunGroup) throws InterruptedException
	{
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(.,RunGroup)]")).getText());
		
		Thread.sleep(2000);
		
		boolean testresults;
		
		testresults = driver.findElement(By.xpath("//div[contains(.,RunGroup)]")).getText()
				.contains(RunGroup);
		
        Thread.sleep(3000);
		
		System.out.println(testresults);
		
		Thread.sleep(3000);
		
		return testresults;
	}

	
}
