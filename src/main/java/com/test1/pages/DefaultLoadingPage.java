package com.test1.pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefaultLoadingPage extends PageBase
{

	//private WebDriver driver;
	
	public DefaultLoadingPage (WebDriver driver)
	{
		super(driver);
	}
	
//	public String getTitle()
//	{
//		return driver.getTitle();
//	}
	
	
	public EditUserProfilePage clickEditProfile() throws InterruptedException
	{
		
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("h3.widget-title")).getText());
		
		
		Thread.sleep(1000);
		
		//Find Edit Profile dropdown link and click
		driver.findElement(By.xpath("//*[@id='page-box']/div[1]/div[2]/div/ul/div[1]/a/span[2]")).click();
		//driver.findElement(By.className("account-text")).click();		
			
		Thread.sleep(1000);
		
		//Find Edit Profile dropdown link and click
		driver.findElement(By.className("my-account-drop-link")).click();
		
		Thread.sleep(1000);
		
		return new EditUserProfilePage(driver);
		
		
	}
	
	public SiteListPage1 clickSiteListLink() throws InterruptedException
	{
		
		//Find Site List link and click on it
		driver.findElement(By.partialLinkText("Site List")).click();
		
		//Find Next Page button and click on it
		//driver.findElement(By.xpath(".//*[@id='content-body']/div[2]/site-list-view/div/div[2]/button[2]")).click();
		
		return new SiteListPage1(driver);
		//return null;
	}
	
	public LoadMgmtView clickLoadMgmtLink() throws InterruptedException
	{
		
		//Find Site List link and click on it
		driver.findElement(By.partialLinkText("Load Mgmt")).click();
		
		//Find Next Page button and click on it
		//driver.findElement(By.xpath(".//*[@id='content-body']/div[2]/site-list-view/div/div[2]/button[2]")).click();
		
		return new LoadMgmtView(driver);
		//return null;
	}
	
	public TestingDashboardView clickTestingLink() throws InterruptedException
	{
		
		//Find Site List link and click on it
		driver.findElement(By.partialLinkText("Testing")).click();
		
		//Find Next Page button and click on it
		//driver.findElement(By.xpath(".//*[@id='content-body']/div[2]/site-list-view/div/div[2]/button[2]")).click();
		
		return new TestingDashboardView(driver);
		//return null;
	}
	
	
	public ManageUsersPage clickManageUsers(String newemailAddress) throws InterruptedException
	{
		//Find Edit Profile dropdown link and click
		driver.findElement(By.xpath("//*[@id='page-box']/div[1]/div[2]/div/ul/div[1]/a/span[2]")).click();
		//driver.findElement(By.className("account-text")).click();	
		
        Thread.sleep(1000);
		
		//Find Manage Users dropdown link and click
		driver.findElement(By.partialLinkText("Manage Users")).click();
		
		return new ManageUsersPage(driver);
		
	}
	
	public DefaultLoadingPage SiteDView(String sitename) throws InterruptedException
	{
		//to get the window count
		//driver.getWindowHandles().size();
		System.out.println("Initial window count: " + driver.getWindowHandles().size());
		
        Thread.sleep(2000);
		
		//Find Site List link and click on it
		driver.findElement(By.partialLinkText("Site List")).click();
		
		Thread.sleep(1000);
		
		//Find Next Page button and click on it
		driver.findElement(By.xpath(".//*[@id='content-body']/div[2]/site-list-view/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
								
		System.out.println("Link URL: " + 
		driver.findElement(By.partialLinkText("Arby's 30")).getAttribute("href"));
				
		//Find the link for site name and click
		driver.findElement(By.partialLinkText(sitename)).click();
		
		//to get the window count after clicking on Arby's 30
		System.out.println("Window count after " + sitename + ": " + driver.getWindowHandles().size());
		
        Iterator<String> whs = driver.getWindowHandles().iterator();
		
		String mainWin = whs.next();
		String detailViewWin = whs.next();
		//String Publix30 = whs.next();
		
		
		driver.switchTo().window(detailViewWin);

		return new DefaultLoadingPage(driver);
	}
	
	public boolean isNavigationSuccessful (String expectedSiteDetailTitle) throws InterruptedException
	{
		System.out.println("The detail site view title is: " + driver.findElement(By.cssSelector("h1.site-detail-title.ng-binding")).getText());
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.cssSelector("h1.site-detail-title.ng-binding")).getText());
		
		Thread.sleep(1000);
		 
		return driver.findElement(By.cssSelector("h1.site-detail-title.ng-binding")).getText().contains(expectedSiteDetailTitle);
		
	}

//	public SiteListPage1 clickSiteListLink() 
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
