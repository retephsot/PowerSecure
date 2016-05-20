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

public class AddNewTestViaConfigPageNowTest extends TestBase

{
	

  //@Test (dataProvider = "dataProvider")
  public void testSuccessfulTestNowAdd(String username, String password, String sitename, 
		  String testduration, String testnotes) 
				  throws InterruptedException, IOException 
  {

	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = logInPage.loginAs(username, password)
			 						.clickSiteListLink()
		 							.clickNextPageLink()
		 							.clickSiteNameLink(sitename)
		 							.clickGearIconLink()
		 							.clickScheduledTestsLink()
		 							.addScheduledTestsRunNowTest(testduration, testnotes)
		 							.isAddTestSuccessful(); 
  
	 System.out.println(testResult);	
	 
	 Assert.assertTrue(testResult, "Test has not been successfully added for " + sitename );
	 
  }
  
  @Test (dataProvider = "dataProvider")
  public void testSuccessfulTestNowAdd2(String username, String password, String sitename, 
		  String testduration, String testnotes) 
				  throws InterruptedException, IOException 
  {

	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = logInPage.loginAs(username, password)
			 						.clickSiteListLink()
		 							.clickNextPageLink()
		 							.clickSiteNameLink(sitename)
		 							.clickGearIconLink()
		 							.clickScheduledTestsLink()
		 							.addScheduledTestsRunNowTest(testduration, testnotes)
		 							.clickTestingLink()
		 							.clickScheduledTest()
		 							.isCreateTestbySiteNameSuccessful(sitename); 
  
	 System.out.println(testResult);	
	 
	 Assert.assertTrue(testResult, "Test has not been successfully added for " + sitename );
	 
  }


}
