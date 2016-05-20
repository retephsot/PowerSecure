package com.test1.tests;

import org.testng.annotations.Test;

import com.test1.pages.DefaultLoadingPage;
import com.test1.pages.LogInPage;

import org.testng.annotations.BeforeMethod;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SiteDViewTest extends TestBase

{
	//the below are inherited from TestBase class
//	private WebDriver driver;
//	public String baseUrl;
//	public String username;
//	public String password;
	public String sitename;
	public String expectedSiteDetailTitle;


	//BeforeMethod is inherited from TestBase
//  @BeforeMethod
//  public void beforeMethod() 
//  {
//	//To launch on google Chrome
//	System.setProperty("webdriver.chrome.driver",
//	"C:\\seleniumJar\\chromedriver_win32\\chromedriver.exe");
//				
//	driver = new ChromeDriver();
//	  
//	baseUrl = "http://52.2.124.11:81/login";
//	username = "user1@ps.com";
//	password = "pass1";	
//	sitename = "Arby's 30";
//	expectedSiteDetailTitle = "Arby's 30";
//	
//	
//	
//	//Set implicityWait time to 45 seconds
//	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//	
//	//Enlarge the application screen
//	Toolkit toolkit = Toolkit.getDefaultToolkit();
//	int Width = (int) toolkit.getScreenSize().getWidth();
//	int Height = (int)toolkit.getScreenSize().getHeight();
//	driver.manage().window().setSize(new Dimension(1800,1600));
//	
//	driver.get(baseUrl);
//		
//		
//  }

  @Test
  public void testNavigationSuccessful() throws InterruptedException 
  {
	  //the two below are not inherited from TestBase as these are not common between all test classes
	  sitename = "Arby's 30";
	  expectedSiteDetailTitle = "Arby's 30";
	  
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
      //LogInPage loginPage = new LogInPage(driver);
	  
      boolean testResult = logInPage.loginAs(username, newpassword)
    		  						.SiteDView(sitename)
    		  						.isNavigationSuccessful(expectedSiteDetailTitle); 
	  
	 
	  System.out.println(testResult);
	  
	  
	  Assert.assertTrue(testResult, "The Site Detail View did not open for " + sitename); 
  }
  
  // work on this - add a test to change user password then save then logout and log back in with new pw
  @Test
  public void testChangePasswordSuccessful() throws InterruptedException
  {
	  
	  
	  logInPage.loginAs(username, password)
	  		   .clickEditProfile()
	  		   .changePassword(newpassword)
	  		   .logOut()
	  		   .loginAs(username, newpassword)
	  		   .clickEditProfile()
	  		   .isLoginSuccessful(username);
	  
  }
  
  //AfterMethod is inherited from TestBase
//  @AfterMethod
//  public void afterMethod() 
//  {
//	driver.close();
//  }

}
