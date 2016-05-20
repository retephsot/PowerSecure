package com.test1.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.test1.pages.DefaultLoadingPage;
import com.test1.pages.LogInPage;

import org.testng.annotations.BeforeMethod;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddNewTestViaConfigPageTest extends TestBase

{
	//the below are inherited from TestBase class
//	private WebDriver driver;
//	public String baseUrl;
//	public String username;
//	public String password;
//	public String sitename;
//	public String testduration;
//	public String testhour;
//	public String testminute;
//	public String testnotes;

	//BeforeMethod is not inherited from TestBase class
//  @BeforeMethod
//  public void beforeMethod() 
//  {
//	//To launch on google Chrome
//		System.setProperty("webdriver.chrome.driver",
//		"C:\\seleniumJar\\chromedriver_win32\\chromedriver.exe");
//					
//		driver = new ChromeDriver();
//		  
//		baseUrl = "http://www.powercontrol.net:81/login";
//		username = "user1@ps.com";
//		password = "pass1";	
//		sitename = "Arby's 30";
//		testnotes = "Adding a new test !@#$%";
//		testduration = "25";
//		testhour = "12";
//		testminute = "35";
//				
//		//Set implicityWait time to 45 seconds
//		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//		
//		//Enlarge the application screen
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		int Width = (int) toolkit.getScreenSize().getWidth();
//		int Height = (int)toolkit.getScreenSize().getHeight();
//		driver.manage().window().setSize(new Dimension(1600,1300));
//		
//		driver.get(baseUrl);
//  }

  @Test (dataProvider = "dataProvider")
  public void testSuccessfulTestAdd(String username, String password, String sitename, 
		  String testduration, String testhour, String testminute, String testnotes) 
				  throws InterruptedException, IOException 
  {
//	sitename = "Arby's 30";
//	testnotes = "Adding a new test !@#$%";
//	testduration = "25";
//	testhour = "12";
//	testminute = "35";
	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = logInPage.loginAs(username, password)
			 						.clickSiteListLink()
		 							.clickNextPageLink()
		 							.clickSiteNameLink(sitename)
		 							.clickGearIconLink()
		 							.clickScheduledTestsLink()
		 							.addScheduledTest(testduration, testhour, testminute, testnotes)
		 							.isAddTestSuccessful(); 
  
	 System.out.println(testResult);	
	 
	 Assert.assertTrue(testResult, "Test has not been successfully added for " + sitename );
	 
  }
  
  @Test (dataProvider = "dataProvider")
  public void testSuccessfulTestAdd2(String username, String password, String sitename, 
		  String testduration, String testhour, String testminute, String testnotes) 
				  throws InterruptedException, IOException 
  {
//	sitename = "Arby's 30";
//	testnotes = "Adding a new test !@#$%";
//	testduration = "25";
//	testhour = "12";
//	testminute = "35";
	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = logInPage.loginAs(username, password)
			 						.clickSiteListLink()
		 							.clickNextPageLink()
		 							.clickSiteNameLink(sitename)
		 							.clickGearIconLink()
		 							.clickScheduledTestsLink()
		 							.addScheduledTest(testduration, testhour, testminute, testnotes)
		 							.clickTestingLink()
		 							.clickScheduledTest()
		 							.isCreateTestbySiteNameSuccessful(sitename); 
  
	 System.out.println(testResult);	
	 
	 Assert.assertTrue(testResult, "Test has not been successfully added for " + sitename );
	 
  }

  //AfterMethod is not inherited from TestBase class
//  @AfterMethod
//  public void afterMethod() 
//  {
//	  driver.close();
//  }

}
