package com.test1.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingDashboardView extends PageBase
{
	public TestingDashboardView (WebDriver driver)
	{
		super(driver);
	}
	
	
	public TestingDashboardView scheduleTestNowbySiteName(String sitename, String testduration, 
			String testnotes, String TestAddedBySiteName) throws InterruptedException, IOException
	{
		
		//find the Add Test button and click
		driver.findElement(By.cssSelector("button.button.widget-heading-button.dash-add-test-btn")).click();
		
		Thread.sleep(2000);
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[1]/h3")).getText());
						
		Thread.sleep(2000);
		
		//Find the Site radio button and click
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[2]/label[2]/span")).click();
		Thread.sleep(2000);
		
		
		//Find the Utility text box and enter UtilityCompany1 string
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]"))
		.sendKeys(sitename);
		
		Thread.sleep(2000);
		
		//Select the first SiteName from drop down   
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[4]/div/type-ahead/div/div/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		//Find the Test Mode radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[6]/label[5]/span")).click();
				
		Thread.sleep(2000);
		
		//Find the Single radio button and click
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[8]/label[1]/span")).click();
		
		Thread.sleep(1000);
		
		//Find the AM/PM box and click on it
		//driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
				
		
		//Find the start time minute and increment by 4 minutes
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
				
		//enable double click
		Actions action = new Actions(driver);
				
		//Find the Start Time hour block and enter test hour
		//action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[3]"))).doubleClick().perform();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LMhour);
				
		Thread.sleep(2000);
				
		//Find the Start Time minute block and enter LMminute
		//action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[4]"))).doubleClick().perform();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(LMminute);
				
		//Thread.sleep(1000);
				
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
		//		+ "/div/div[1]/div[2]/select")).click();
		
		Thread.sleep(1000);
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
				
		Thread.sleep(1000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(testduration);
				
		Thread.sleep(1000);
		
		
		//Find the All Gens radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[11]/label[1]/span")).click();		
			
		Thread.sleep(1000);
		
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(testnotes);
				
		Thread.sleep(1000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(4000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
				+ "LoadMgmtFor " + TestAddedBySiteName + " Added.png"));

		Thread.sleep(2000);
		
		return new TestingDashboardView(driver);
		
	}
	
//	public TestingDashboardView scheduleTestbyUtilityNow(String UtilityCompany1, String testduration, 
//			String testnotes, String TestAddedByUtility) throws InterruptedException, IOException
//	{
//		
//		//find the Add Test button and click
//				driver.findElement(By.cssSelector("button.button.widget-heading-button.dash-add-test-btn")).click();
//				
//				Thread.sleep(2000);
//				
//				//Find the dialog title and print it out	
//				System.out.println("Modal title is: " +
//				driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[1]/h3")).getText());
//								
//				Thread.sleep(2000);
//				
//				//Find the Site radio button and click
//				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[2]/label[2]/span")).click();
//				Thread.sleep(2000);
//				
//				
//				//Find the Utility text box and enter UtilityCompany1 string
//				//driver.findElement(By.xpath("//label[8]/span")).click();
//				
//				driver.findElement(By.xpath("(//input[@type='text'])[2]"))
//				.sendKeys(UtilityCompany1);
//				
//				Thread.sleep(2000);
//				
//				//Select the first SiteName from drop down   
//				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[4]/div/type-ahead/div/div/ul/li[1]/span")).click();
//				
//				Thread.sleep(2000);
//				
//				//Find the Test Mode radio button and click on it
//				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[6]/label[5]/span")).click();
//						
//				Thread.sleep(2000);
//				
//				//Find the Single radio button and click
//				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[8]/label[1]/span")).click();
//				
//				Thread.sleep(1000);
//				
//				//Find the AM/PM box and click on it
//				//driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
//						
//				
//				//Find the start time minute and increment by 4 minutes
//				driver.findElement(By.xpath("//td[3]/a/span")).click();
//				driver.findElement(By.xpath("//td[3]/a/span")).click();
//				driver.findElement(By.xpath("//td[3]/a/span")).click();
//				driver.findElement(By.xpath("//td[3]/a/span")).click();
//						
//				//enable double click
//				Actions action = new Actions(driver);
//						
//				//Find the Start Time hour block and enter test hour
//				//action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[3]"))).doubleClick().perform();
//				
//				//Thread.sleep(2000);
//				
//				//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LMhour);
//						
//				Thread.sleep(2000);
//						
//				//Find the Start Time minute block and enter LMminute
//				//action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[4]"))).doubleClick().perform();
//				
//				//Thread.sleep(2000);
//				
//				//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(LMminute);
//						
//				//Thread.sleep(1000);
//						
//				//Find Time Zone selector and select US/Eastern
//				driver.findElement(By.xpath("(//div[2]/select)")).click();
//						
//				Thread.sleep(1000);
//				
//				driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
//				
//				//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
//				//		+ "/div/div[1]/div[2]/select")).click();
//				
//				Thread.sleep(1000);
//				
//				//Find duration in minutes box and double click on it
//				action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
//						
//				Thread.sleep(1000);
//						
//				//Find Test Notes box and enter test notes
//				driver.findElement(By.xpath("//input[@type='number']")).sendKeys(testduration);
//						
//				Thread.sleep(1000);
//				
//				
//				//Find the All Gens radio button and click on it
//				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[11]/label[1]/span")).click();		
//					
//				Thread.sleep(1000);
//				
//				//Find the Test Notes box and enter the test notes
//				driver.findElement(By.xpath("//textarea")).sendKeys(testnotes);
//						
//				Thread.sleep(1000);
//				
//				
//				//Find the Submit button and click on it
//				driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
//				
//				Thread.sleep(4000);
//				
//				// Capture the screenshot of the browser as a file
//				File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//						
//				// Save the browser screenshot file to a new file with the specified location
//				FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
//						+ "LoadMgmtFor " + TestAddedByUtility + " Added.png"));
//
//				Thread.sleep(2000);
//		
//		return new TestingDashboardView(driver);
//		
//	}
	
	public TestingDashboardView scheduleTestNowbyRunGroup(String RunGroup, String testduration, String testnotes, String TestAddedByRunGroup) throws InterruptedException, IOException
	{
		
		//find the Add Test button and click
				driver.findElement(By.cssSelector("button.button.widget-heading-button.dash-add-test-btn")).click();
				
				Thread.sleep(2000);
				
				//Find the dialog title and print it out	
				System.out.println("Modal title is: " +
				driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[1]/h3")).getText());
								
				Thread.sleep(2000);
				
				//Find the Run Group radio button and click
				//driver.findElement(By.xpath("//*[@id='runByRunGroup']")).click();
				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[2]/label[1]/span")).click();
				Thread.sleep(2000);
				
				
				//Find the Utility text box and enter UtilityCompany1 string
				//driver.findElement(By.xpath("//label[8]/span")).click();
				
				driver.findElement(By.xpath("(//input[@type='text'])[2]"))
				.sendKeys(RunGroup);
				
				Thread.sleep(2000);
				
				//Select the first SiteName from drop down   
				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[4]/div/type-ahead/div/div/ul/li/span")).click();
				
				Thread.sleep(2000);
				
				//Find the Test Mode radio button and click on it
				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[6]/label[5]/span")).click();
						
				Thread.sleep(2000);
				
				//Find the Single radio button and click
				driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[8]/label[1]/span")).click();
				
				Thread.sleep(1000);
				
				//Find the AM/PM box and click on it
				//driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
						
				
				//Find the start time minute and increment by 4 minutes
				driver.findElement(By.xpath("//td[3]/a/span")).click();
				driver.findElement(By.xpath("//td[3]/a/span")).click();
				driver.findElement(By.xpath("//td[3]/a/span")).click();
				driver.findElement(By.xpath("//td[3]/a/span")).click();
						
				//enable double click
				Actions action = new Actions(driver);
						
				//Find the Start Time hour block and enter test hour
				//action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[3]"))).doubleClick().perform();
				
				//Thread.sleep(2000);
				
				//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LMhour);
						
				Thread.sleep(2000);
						
				//Find the Start Time minute block and enter LMminute
				//action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[4]"))).doubleClick().perform();
				
				//Thread.sleep(2000);
				
				//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(LMminute);
						
				//Thread.sleep(1000);
						
				//Find Time Zone selector and select US/Eastern
				driver.findElement(By.xpath("(//div[2]/select)")).click();
						
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
				
				//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
				//		+ "/div/div[1]/div[2]/select")).click();
				
				Thread.sleep(1000);
				
				//Find duration in minutes box and double click on it
				action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
						
				Thread.sleep(1000);
						
				//Find Test Notes box and enter test notes
				driver.findElement(By.xpath("//input[@type='number']")).sendKeys(testduration);
						
				Thread.sleep(1000);
				
				
				//Find the All Gens radio button and click on it
				//driver.findElement(By.xpath("//html/body/div[3]/div/div/test-modal/div[2]/form/div[11]/label[1]/span")).click();		
					
				//Thread.sleep(1000);
				
				//Find the Test Notes box and enter the test notes
				driver.findElement(By.xpath("//textarea")).sendKeys(testnotes);
						
				Thread.sleep(1000);
				
				
				//Find the Submit button and click on it
				driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
				
				Thread.sleep(4000);
				
				// Capture the screenshot of the browser as a file
				File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
				// Save the browser screenshot file to a new file with the specified location
				FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
						+ "LoadMgmtFor " + TestAddedByRunGroup + " Added.png"));

				Thread.sleep(2000);
		
		return new TestingDashboardView(driver);
		
	}
	
	public ScheduledTestsView clickScheduledTest() throws InterruptedException
	{
		
		Thread.sleep(1000);
		
		//find the Add LM button and click
		driver.findElement(By.linkText("Scheduled Tests")).click();
		
		Thread.sleep(5000);
		
		return new ScheduledTestsView(driver);
		
	}
	
}
