package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewUserProfilePage extends PageBase

{

	public CreateNewUserProfilePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public ManageUsersPage createNewUser(String firstname, String lastname, String email, 
			String companyname) throws InterruptedException
	{
		Thread.sleep(1000);
		
		//find the first name field and enter first name
		driver.findElement(By.name("first-name")).sendKeys(firstname);
		
		Thread.sleep(1000);
		
		// find the last name field and enter last name
		driver.findElement(By.name("last-name")).sendKeys(lastname);
		
		Thread.sleep(1000);
		
		// find the email address field and enter email address
		driver.findElement(By.name("email")).sendKeys(email);
		
		Thread.sleep(1000);
		
		//find the User's company field and enter company name
		driver.findElement(By.xpath("//*[@id='content-body']/div/div/div/div/form/div[5]/"
				+ "div[2]/div/type-ahead/div/input")).sendKeys(companyname);		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='content-body']/div/div/div/div/form/"
				+ "div[5]/div[2]/div/type-ahead/div/div/ul/li/span")).click();
		// find the Active radio button and click
		driver.findElement(By.cssSelector("span.radio-label")).click();
				
		Thread.sleep(1000);
		
		// find the user role drop down and select Admin
		driver.findElement(By.xpath("//div[@id='content-body']/div/div/div/div/form/div[7]/div[2]/select")).click();
		
		Thread.sleep(1000);
		
		//Select the Admin role
		driver.findElement(By.xpath("//div[@id='content-body']/div/div/div/div/form/div[7]/div[2]/select/option[2]")).click();
				
		Thread.sleep(1000);
		
		// find the save changes button and click	
		driver.findElement(By.cssSelector("button.button.save-changes")).click();
		
		return new ManageUsersPage(driver);
		
	}
	
	
}
