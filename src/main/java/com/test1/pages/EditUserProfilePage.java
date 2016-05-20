package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditUserProfilePage extends PageBase

{

	public EditUserProfilePage (WebDriver driver)
	{
		super(driver);
	}
	
	public boolean isLoginSuccessful ( String username) throws InterruptedException
	{
		//Find the Email Address field and retrieve email and print it out
		System.out.println("The dialog title is: " + driver.findElement(By.xpath("//*[@id='content-body']"
				+ "/div/div/div/div/form/h3")).getText());
		
		boolean testresult;
		
		Thread.sleep(1000);
		
		testresult = driver.findElement(By.xpath("//*[@id='content-body']/div/div/div/div/form/h3"))
				.getText().equalsIgnoreCase(username + "'s Profile");
		
		Thread.sleep(1000);
		
		System.out.println(testresult);
		
		return testresult;
	}
	
	public EditUserProfilePage changePassword(String newpassword) throws InterruptedException
	{
		//Find New Password field and enter new password
		driver.findElement(By.xpath("//*[@id='content-body']/div/div/div/div/form/div[6]/div[2]/div[1]/input")).sendKeys(newpassword);
				
		Thread.sleep(1000);
				
		//Find Confirm Password field and enter new password
		driver.findElement(By.xpath("//*[@id='content-body']/div/div/div/div/form/div[6]/div[2]/div[2]/input")).sendKeys(newpassword);
				
		Thread.sleep(2000);
				
		//Find Save Changes button and click
		driver.findElement(By.xpath("//*[@id='content-body']/div/div/div/div/form/div[9]/button[1]")).click();
		
		Thread.sleep(2000);
		
		return new EditUserProfilePage(driver);
		
				
		//Find Success Toast and print - no more toast
		//System.out.println(driver.findElement(By.cssSelector("div.toast-message")).getText());
	}
	
	
}
