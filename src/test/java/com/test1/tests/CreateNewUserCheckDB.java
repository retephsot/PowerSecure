package com.test1.tests;

import org.testng.annotations.Test;

import com.test1.pages.LogInPage;

import org.testng.annotations.BeforeMethod;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CreateNewUserCheckDB extends TestBase 

{
	//the below are inherited from TestBase class
	//private WebDriver driver;
	//public String baseUrl;
	//public String username;
	//public String password;
	
 
	//The whole @BeforeMethod is not inherited from TestBase class
//  @BeforeMethod
//  public void beforeMethod() 
//  {
//	  
//	//To launch on google Chrome
//	System.setProperty("webdriver.chrome.driver",
//	"C:\\seleniumJar\\chromedriver_win32\\chromedriver.exe");
//				
//	driver = new ChromeDriver();
//	  
//	baseUrl = "http://52.2.124.11:81/login";
//	username = "user1@ps.com";
//	password = "pass1";	
//	expectedWidgetTitle = "Sites Currently Running";
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
//	
//  }

  @Test(dataProvider = "dataProvider")
  public void testNewUserCreationCheckDB(String username, String password, String email, String firstname,
		  String lastname, String companyname) throws InterruptedException, ClassNotFoundException, SQLException 
  {
	  
	  
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
	 // LogInPage loginPage = new LogInPage(driver);
	  
	  boolean testResults = logInPage.loginAs(username, password)
			  						.clickManageUsers(email)
			  						.clickAddNewUser(firstname, lastname, email)
			  						.createNewUser(firstname, lastname, email, companyname)
			  						.isCreateNewUserSuccessfulCheckDB(email, firstname);
	  
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(testResults, "New user account has not been created successfully for: " + email );
	  
	  
  }
  
  //The whole @AfterMethod is not inherited from TestBase class
//  @AfterMethod
//  public void afterMethod() 
//  {
//	  //driver.quit();
//  }

}
