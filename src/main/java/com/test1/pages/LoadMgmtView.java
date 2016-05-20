package com.test1.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoadMgmtView extends PageBase
{
	public LoadMgmtView (WebDriver driver)
	{
		super(driver);
	}
	
	
	public LoadMgmtView scheduleLMbyUtility2(String UtilityCompany1, String LMduration, String LMhour, 
			String LMminute, String LMnotes, String LoadMgmtByUtil) throws InterruptedException, IOException
	{
		
		//find the Add LM button and click
		driver.findElement(By.xpath("//div/button")).click();
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[1]/h3")).getText());
						
		Thread.sleep(2000);
		
		//Find the Utility dialog button and click
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[2]/label[1]/span")).click();
		Thread.sleep(2000);
		
		
		//Find the Utility text box and enter UtilityCompany1 string
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]/div/type-ahead/div/input"))
		.sendKeys(UtilityCompany1);
		
		Thread.sleep(2000);
		
		//Select Utility company   
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]"
				+ "/div/type-ahead/div/div/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		//Find the LoadManagement radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[6]/label[5]/span")).click();
				
		Thread.sleep(2000);
		
		//Find the AM/PM box and click on it
		driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
				
		Thread.sleep(2000);
		
		//Find the start time hour and increment by 1 hr
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a/span")).click();
				
		//enable double click
		Actions action = new Actions(driver);
				
		//Find the Start Time hour block and enter test hour
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[3]"))).doubleClick().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LMhour);
				
		Thread.sleep(2000);
				
		//Find the Start Time minute block and enter LMminute
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[4]"))).doubleClick().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(LMminute);
				
		Thread.sleep(1000);
				
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
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(LMduration);
				
		Thread.sleep(1000);
				
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(LMnotes);
				
		Thread.sleep(1000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(4000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
				+ "LoadMgmtFor " + LoadMgmtByUtil + " Added.png"));

		Thread.sleep(2000);
		
		return new LoadMgmtView(driver);
		
	}
	
	public LoadMgmtView scheduleLMbyUtilityNow(String UtilityCompany1, String LMduration, 
			String LMnotes, String LoadMgmtByUtil) throws InterruptedException, IOException
	{
		
		//find the Add LM button and click
		driver.findElement(By.xpath("//div/button")).click();
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[1]/h3")).getText());
						
		Thread.sleep(2000);
		
		//Find the Utility dialog button and click
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[2]/label[1]/span")).click();
		Thread.sleep(2000);
		
		
		//Find the Utility text box and enter UtilityCompany1 string
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]/div/type-ahead/div/input"))
		.sendKeys(UtilityCompany1);
		
		Thread.sleep(2000);
		
		//Select Utility Company   
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]"
				+ "/div/type-ahead/div/div/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		//Find the LoadManagement radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[6]/label[5]/span")).click();
				
		Thread.sleep(2000);
		
		//Find the AM/PM box and click on it
		//driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
				
		//Thread.sleep(2000);
		
		//Find the start time hour and increment by 1 hr
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a/span")).click();
				
		//enable double click
		//Actions action = new Actions(driver);
				
		//Find the minute up chevron-up and double click
		//action.moveToElement(driver.findElement(By.xpath("//td[3]/a/span"))).doubleClick().perform();
		
		//Find the minute up chevron-up and double click
		//action.moveToElement(driver.findElement(By.xpath("//td[3]/a/span"))).doubleClick().perform();
		
		//Find the minute up chevron-up and click up 4 times
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		
        driver.findElement(By.xpath("//td[3]/a/span")).click();
		
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LMhour);
//				
//		Thread.sleep(2000);
				
//		//Find the Start Time minute block and enter LMminute
//		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[4]"))).doubleClick().perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(LMminute);
//				
//		Thread.sleep(1000);
				
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
		//		+ "/div/div[1]/div[2]/select")).click();
		
		Thread.sleep(2000);
		
		//enable double click
		Actions action = new Actions(driver);
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
				
		Thread.sleep(2000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(LMduration);
				
		Thread.sleep(2000);
				
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(LMnotes);
				
		Thread.sleep(2000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(5000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
				+ "LoadMgmtFor " + LoadMgmtByUtil + " Added.png"));

		Thread.sleep(2000);
		
		return new LoadMgmtView(driver);
		
	}
	
	public LoadMgmtView scheduleLMbyRunGroup(String RunGroup, String LMduration, String LMhour, 
			String LMminute, String LMnotes, String LoadMgmtByRunGroup) throws InterruptedException, IOException
	{
		
		//find the Add LM button and click
		driver.findElement(By.xpath("//div/button")).click();
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[1]/h3")).getText());
						
		Thread.sleep(2000);
		
		//Find the RunGroup dialog button and click
		driver.findElement(By.xpath("html/body/div[3]/div/div/lm-modal/div[2]/form/div[2]/label[2]/span")).click();
		Thread.sleep(2000);
		
		
		//Find the RunGroup text box and enter RunGroup string
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]/div/type-ahead/div/input"))
		.sendKeys(RunGroup);
		
		Thread.sleep(2000);
		
		//Select Scanna Energy   
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]"
				+ "/div/type-ahead/div/div/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		//Find the LoadManagement radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[6]/label[5]/span")).click();
				
		Thread.sleep(2000);
		
		//Find the AM/PM box and click on it
		driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
				
		Thread.sleep(2000);
		
		//Find the start time hour and increment by 1 hr
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a/span")).click();
				
		//enable double click
		Actions action = new Actions(driver);
				
		//Find the Start Time hour block and enter test hour
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[3]"))).doubleClick().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(LMhour);
				
		Thread.sleep(2000);
				
		//Find the Start Time minute block and enter LMminute
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='text'])[4]"))).doubleClick().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(LMminute);
				
		Thread.sleep(2000);
				
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
		//		+ "/div/div[1]/div[2]/select")).click();
		
		Thread.sleep(2000);
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
				
		Thread.sleep(2000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(LMduration);
				
		Thread.sleep(2000);
				
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(LMnotes);
				
		Thread.sleep(2000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(6000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
				+ "LoadMgmtFor " + LoadMgmtByRunGroup + " Added.png"));

		Thread.sleep(2000);
		
		return new LoadMgmtView(driver);
		
	}
	
	public LoadMgmtView scheduleLMNowbyRunGroup(String RunGroup, String LMduration, 
			String LMnotes, String LoadMgmtByRunGroup) throws InterruptedException, IOException
	{
		
		//find the Add LM button and click
		driver.findElement(By.xpath("//div/button")).click();
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[1]/h3")).getText());
						
		Thread.sleep(2000);
		
		//Find the RunGroup dialog button and click
		driver.findElement(By.xpath("html/body/div[3]/div/div/lm-modal/div[2]/form/div[2]/label[2]/span")).click();
		Thread.sleep(2000);
		
		
		//Find the RunGroup text box and enter RunGroup string
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]/div/type-ahead/div/input"))
		.sendKeys(RunGroup);
		
		Thread.sleep(2000);
		
		//Select Scanna Energy   
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]"
				+ "/div/type-ahead/div/div/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		//Find the LoadManagement radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[6]/label[5]/span")).click();
				
		Thread.sleep(2000);
				
		//Find the start time minute up button and increment by 4 minutes
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
	
		Thread.sleep(1000);
		
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
		//		+ "/div/div[1]/div[2]/select")).click();
		
		Thread.sleep(2000);
		
		//enable double click
		Actions action = new Actions(driver);
								
		Thread.sleep(2000);
				
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
				
		Thread.sleep(2000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(LMduration);
				
		Thread.sleep(2000);
				
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(LMnotes);
				
		Thread.sleep(2000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(5000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
				+ "LoadMgmtFor " + LoadMgmtByRunGroup + " Added.png"));

		Thread.sleep(2000);
		
		return new LoadMgmtView(driver);
		
	}
	
	
	public LoadMgmtView scheduleLMNowbySiteName(String sitename, String LMduration, 
			String LMnotes, String LoadMgmtBySiteName) throws InterruptedException, IOException
	{
		
		//find the Add LM button and click
		driver.findElement(By.xpath("//div/button")).click();
		
		//Find the dialog title and print it out	
		System.out.println("Modal title is: " +
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[1]/h3")).getText());
						
		Thread.sleep(2000);
		
		//Find the Site dialog button and click
		driver.findElement(By.xpath("html/body/div[3]/div/div/lm-modal/div[2]/form/div[2]/label[3]/span")).click();
		Thread.sleep(2000);
		
		
		//Find the Site text box and enter SiteName string
		//driver.findElement(By.xpath("//label[8]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]/div/type-ahead/div/input"))
		.sendKeys(sitename);
		
		Thread.sleep(2000);
		
		//Select the sitename from dropdown menu  
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[4]"
				+ "/div/type-ahead/div/div/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		//Find the LoadManagement radio button and click on it
		driver.findElement(By.xpath("//html/body/div[3]/div/div/lm-modal/div[2]/form/div[6]/label[5]/span")).click();
				
		Thread.sleep(2000);
				
		//Find the start time minute up button and increment by 4 minutes
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
		driver.findElement(By.xpath("//td[3]/a/span")).click();
	
		Thread.sleep(1000);
		
		//Find Time Zone selector and select US/Eastern
		driver.findElement(By.xpath("(//div[2]/select)")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/test-modal/div[2]/form/div[7]/div[2]/div/div[2]"
		//		+ "/div/div[1]/div[2]/select")).click();
		
		Thread.sleep(2000);
		
		//enable double click
		Actions action = new Actions(driver);
								
		Thread.sleep(2000);
				
		
		//Find duration in minutes box and double click on it
		action.moveToElement(driver.findElement(By.xpath("//input[@type='number']"))).doubleClick().perform();
				
		Thread.sleep(2000);
				
		//Find Test Notes box and enter test notes
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(LMduration);
				
		Thread.sleep(2000);
				
				
		//Find the Test Notes box and enter the test notes
		driver.findElement(By.xpath("//textarea")).sendKeys(LMnotes);
				
		Thread.sleep(2000);
		
		
		//Find the Submit button and click on it
		driver.findElement(By.cssSelector("button.button.modal-ok-button")).click();
		
		Thread.sleep(5000);
		
		// Capture the screenshot of the browser as a file
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		// Save the browser screenshot file to a new file with the specified location
		FileUtils.copyFile(imgFile, new File("C:\\Users\\jslee\\workspace\\WebDriverScreenShot\\"
				+ "LoadMgmtFor " + sitename + " Added.png"));

		Thread.sleep(2000);
		
		return new LoadMgmtView(driver);
		
	}
	
	
	public ScheduledLMView clickScheduledLM() throws InterruptedException
	{
		
		Thread.sleep(1000);
		
		//find the Add LM button and click
		driver.findElement(By.linkText("Scheduled LM")).click();
		
		Thread.sleep(5000);
		
		return new ScheduledLMView(driver);
		
	}
	
}
