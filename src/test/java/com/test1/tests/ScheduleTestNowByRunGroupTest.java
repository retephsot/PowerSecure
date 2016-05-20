package com.test1.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleTestNowByRunGroupTest extends TestBase
{
	//public String UtilityCompany1;
	
	@Test (dataProvider = "dataProvider")
	public void testSuccessfulTestAddNowByRunGroup(String username, String password, String RunGroup, 
			String testduration, String testnotes, String TestAddedByRunGroup) throws InterruptedException, 
			IOException 
			
		  {
		    
		  //The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
		  // LogInPage loginPage = new LogInPage(driver);
			  
		  boolean testResults = logInPage.loginAs(username, password)
				  						 .clickTestingLink()
				  						 .scheduleTestNowbyRunGroup(RunGroup, testduration, testnotes, TestAddedByRunGroup)
				  						 .clickScheduledTest()
				  						 .isCreateTestbyRunGroupSuccessful(RunGroup);
				  						 
				  						   						 				  						 
			System.out.println(testResults);	
			 
			Assert.assertTrue(testResults, "Test has not been successfully added for " + RunGroup);				  						 
				  						 
		
		  }
	
	
	
}
