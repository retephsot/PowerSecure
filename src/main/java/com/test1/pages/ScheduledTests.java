package com.test1.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ScheduledTests extends PageBase
{
	//private WebDriver driver;
	
	public ScheduledTests (WebDriver driver)
	{
		super(driver);
	}
	
//	public String getTitle()
//	{
//		return driver.getTitle();
//	}
	
	public ScheduledTests clickAddNewTestLink()
	{
		
		//Find the Add New Test button and click
		driver.findElement(By.xpath("//*[@id='content-body']/div/div[7]/div/div[1]/button")).click();
		return new ScheduledTests(driver);
	}
	
	public ScheduledTests addScheduledTest(String testduration, String testhour, String testminute, String testnotes) 
			throws InterruptedException, IOException
	{
		
		//Find the Add New Test button and click
		driver.findElement(By.xpath("//*[@id='content-body']/div/div[7]/div/div[1]/button")).click();
		Thread.sleep(1000);
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.className("modal-header")).getText());
						
		Thread.sleep(1000);
		
		//Find the Site radio button and click
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[2]/label[2]/span")).click();
		Thread.sleep(1000);
		
		//Find the Test Mode radio button and click on it
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[6]/label[5]/span")).click();
		
		Thread.sleep(1000);
		
		//Find the Single radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[8]/label[1]/span")).click();
				
		Thread.sleep(1000);
		
		//Find the AM/PM box and click on it
		driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
				
		Thread.sleep(2000);
		
		//Find the start time hour and increment by 1 hr
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a/span")).click();
				
		//allow for double click ability
		Actions action = new Actions(driver);
				
		//Find the Start Time hour block and enter test hour
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[20]"))).doubleClick().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[20]")).sendKeys(testhour);
				
		Thread.sleep(1000);
				
		//Find the Start Time minute block and enter testminute
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[21]"))).doubleClick().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[21]")).sendKeys(testminute);
				
		Thread.sleep(1000);
				
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//option[@value='6'])[6]")).click();
		
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
		//		+ "/div/div[1]/div[2]/select")).click();
		
		Thread.sleep(1000);
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[9]"
				+ "/div[2]/div/div[2]/div/div[2]/input"))).doubleClick().perform();
				
		Thread.sleep(2000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(testduration);
				
		Thread.sleep(2000);
		
				
		//Find the Generator 30 radio button and click on it
		//driver.findElement(By.cssSelector("span.radio-label.ng-binding")).click();
		
		//html/body/div[3]/div/div/test-modal/div[2]/form/div[11]/label[1]/span
		
		//Find the All Generator radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[11]/label[1]/span")).click();
						
		Thread.sleep(1000);
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(testnotes);
				
		Thread.sleep(2000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(1000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\testadded1.png"));

		
		return new ScheduledTests(driver);
	}
	
	
	public ScheduledTests addScheduledTestsRunNowTest(String testduration, String testnotes) 
			throws InterruptedException, IOException
	{
		
		//Find the Add New Test button and click
		driver.findElement(By.xpath("//*[@id='content-body']/div/div[7]/div/div[1]/button")).click();
		Thread.sleep(1000);
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.className("modal-header")).getText());
						
		Thread.sleep(1000);
		
		//Find the Test Mode radio button and click on it
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[6]/label[5]/span")).click();
		
		Thread.sleep(1000);
		
		//Find the Single radio button and click on it
		driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[8]/label[1]/span")).click();
				
		Thread.sleep(1000);
		
		//Find the AM/PM box and click on it
		//driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
				
		Thread.sleep(1000);
		
		//Find the start time minute and increment by 4 minutes
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
				
						
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//option[@value='6'])[6]")).click();
		
		
		Thread.sleep(1000);
		
		//allow for double click ability
		Actions action = new Actions(driver);
						
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
				
		Thread.sleep(2000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(testduration);
				
		Thread.sleep(2000);
				
		
		//Find the All Generator radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[11]/label[1]/span")).click();
						
		Thread.sleep(1000);
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(testnotes);
				
		Thread.sleep(2000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(1000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\testadded1.png"));

		
		return new ScheduledTests(driver);
	}
	
	
	
	public boolean isAddTestSuccessful() throws InterruptedException
	{
		
		//Try xpath //*[@id='toast-container']/div/div this works
//		System.out.println("isAddTestSuccessful method is running, the success toast message is: " 
//		+ driver.findElement(By.xpath("//*[@id='toast-container']/div/div")).getText());

		//Try cssSelector div.toast-message this works too
		System.out.println("isAddTestSuccessful method is running, the success toast message is: " 
		+ driver.findElement(By.cssSelector("div.toast-message")).getText());
		
		Thread.sleep(4000);
		
		
		return driver.findElement(By.xpath("//*[@id='toast-container']/div/div")).getText().equals("Test Created");
		
	}
	
	
	
	
}
