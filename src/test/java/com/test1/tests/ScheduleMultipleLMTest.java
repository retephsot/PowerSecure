package com.test1.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleMultipleLMTest extends TestBase
{
	public String UtilityCompany1;
	
	@Test (dataProvider = "dataProvider")
	public void testSuccessfulLoadMgmtRunGroupAdd(String username, String password, String RunGroup, 
			String LMduration, String LMhour, String LMminute, String LMnotes, String LoadMgmtByRunGroup) 
			throws InterruptedException, IOException 
			
		  {
		    
		  //The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
		  // LogInPage loginPage = new LogInPage(driver);
			  
		  boolean testResults = logInPage.loginAs(username, password)
				  						 .clickLoadMgmtLink()
				  						 .scheduleLMbyRunGroup(RunGroup, LMduration, LMhour, LMminute, LMnotes, LoadMgmtByRunGroup)
				  						 .clickScheduledLM()
				  						 .isCreateLMbyRunGroupSuccessful(RunGroup);
				  						 
				  						   						 
				  						 
			System.out.println(testResults);	
			 
			Assert.assertTrue(testResults, "Test has not been successfully added for " + UtilityCompany1);				  						 
				  						 
		
		  }
	
	
	@Test (dataProvider = "dataProvider")
	public void testSuccessfulLoadMgmtUtilityNowAdd(String username, String password, String UtilityCompany1, 
			String LMduration, String LMnotes, String LoadMgmtByUtil) throws InterruptedException, 
			IOException 
			
		  {
		    
		  //The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
		  // LogInPage loginPage = new LogInPage(driver);
			  
		  boolean testResults = logInPage.loginAs(username, password)
				  						 .clickLoadMgmtLink()
				  						 .scheduleLMbyUtilityNow(UtilityCompany1, LMduration, LMnotes, LoadMgmtByUtil)
				  						 .clickScheduledLM()
				  						 .isCreateLMbyUtilitySuccessful(UtilityCompany1);
				  						 
				  						   						 
				  						 
			System.out.println(testResults);	
			 
			Assert.assertTrue(testResults, "Test has not been successfully added for " + UtilityCompany1);				  						 
				  						 
		
		  }
	
	 @Test(dataProvider="dataProvider")
	  public void testSuccessfulLogin(String username, String password) throws InterruptedException 
	  {
		//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
		 // LogInPage loginPage = new LogInPage(driver);
		  
		  boolean testResult = logInPage.loginAs(username, password)
				  						.clickEditProfile()
				  						.isLoginSuccessful(username);
		  
		  Assert.assertTrue(testResult, "Login is not successful for user " + username);
		    
	  }
	 
	 @Test (dataProvider = "dataProvider")
	  public void testSuccessfulTestAdd(String username, String password, String sitename, 
			  String testduration, String testhour, String testminute, String testnotes) 
					  throws InterruptedException, IOException 
	  {
//		sitename = "Arby's 30";
//		testnotes = "Adding a new test !@#$%";
//		testduration = "25";
//		testhour = "12";
//		testminute = "35";
		
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
		public void testSuccessfulTestAddNowBySiteName(String username, String password, String sitename, 
				String testduration, String testnotes, String TestAddedBySiteName) throws InterruptedException, 
				IOException 
				
			  {
			    
			  //The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
			  // LogInPage loginPage = new LogInPage(driver);
				  
			  boolean testResults = logInPage.loginAs(username, password)
					  						 .clickTestingLink()
					  						 .scheduleTestNowbySiteName(sitename, testduration, testnotes, TestAddedBySiteName)
					  						 .clickScheduledTest()
					  						 .isCreateTestbySiteNameSuccessful(sitename);
					  						 
					  						   						 				  						 
				System.out.println(testResults);	
				 
				Assert.assertTrue(testResults, "Test has not been successfully added for " + sitename);				  						 
					  						 
			
			  }
	 
	
}
