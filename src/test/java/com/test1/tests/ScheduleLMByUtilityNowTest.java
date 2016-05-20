package com.test1.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleLMByUtilityNowTest extends TestBase
{
	//public String UtilityCompany1;
	
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
	
	
	
}
