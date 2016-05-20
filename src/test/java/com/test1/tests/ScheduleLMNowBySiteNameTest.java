package com.test1.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleLMNowBySiteNameTest extends TestBase
{
	public String UtilityCompany1;
	
	@Test (dataProvider = "dataProvider")
	public void testSuccessfulLoadMgmtNowSiteNameAdd(String username, String password, String sitename, 
			String LMduration, String LMnotes, String LoadMgmtNowBySiteName) 
			throws InterruptedException, IOException 
			
		  {
		    
		  //The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
		  // LogInPage loginPage = new LogInPage(driver);
			  
		  boolean testResults = logInPage.loginAs(username, password)
				  						 .clickLoadMgmtLink()
				  						 .scheduleLMNowbySiteName(sitename, LMduration, LMnotes, LoadMgmtNowBySiteName)
				  						 .clickScheduledLM()
				  						 .isCreateLMbyRunGroupSuccessful(sitename);
				  						 
				  						   						 
				  						 
			System.out.println(testResults);	
			 
			Assert.assertTrue(testResults, "Test has not been successfully added for " + UtilityCompany1);				  						 
				  						 
		
		  }
	
	
	
	
	
}
