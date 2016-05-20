package com.test1.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jdt.internal.compiler.ast.AssertStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManageUsersPage extends PageBase
{

	static String uName;
	public ManageUsersPage(WebDriver driver) 
	{
		super(driver);
	}


	public CreateNewUserProfilePage clickAddNewUser(String firstname, String lastname, String email)
	{
		//Find the Add New User button and click on it
		driver.findElement(By.linkText("Add New User")).click();
		
		return new CreateNewUserProfilePage(driver);
	}
	
	public boolean isCreateNewUserSuccessful (String email) throws InterruptedException
	{
		
		System.out.println(driver.findElement(By.xpath("//div[contains(.,email)]")).getText());
		
		Thread.sleep(2000);
		
		boolean testresults;
		
		testresults = driver.findElement(By.xpath("//div[contains(.,email)]")).getText().contains(email);
		
        Thread.sleep(2000);
		
		System.out.println(testresults);
		
		Thread.sleep(2000);
		
		return testresults;
	}
	
	public boolean isCreateNewUserSuccessfulCheckDB (String email, String firstname) throws InterruptedException, 
	ClassNotFoundException, SQLException
	{
		
		// Connection url
		String dbUrl = "jdbc:mysql://commandcenter-development.cwximgybge3b.us-east-1.rds.amazonaws.com:3306/ccDemo";
		
		// Column Name
		String ColName = "UserName";
		
		// Give DB username
		String username1 = "jlee";
		
		// Give DB password
		String password = "fast13BT";
		
		// SQL query
		String query = "SELECT UserName FROM ccDemo.Users WHERE UserFirstName = \"Rick\";";
		
		//Local MySql JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// get connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username1, password);
		
		// Prints out result of DB connection
		System.out.println("Connection Successfull");
        System.out.println(con); 
		
		// Create statement object
		Statement stmt = con.createStatement();
		
		// Send SQL query to DB
		ResultSet rs = stmt.executeQuery(query);
		
	
		
		// While loop to get ResultSet all rows of data
	while(rs.next())
		{
//			System.out.println("RequestedOn: " + rs.getString("RequestedOn"));
//			System.out.println("ScheduledTestNotes: " + rs.getString("ScheduledTestNotes"));
//			System.out.println("SiteID: " + rs.getString("SiteID"));
//			System.out.println("RequestedBy: " + rs.getString("RequestedBy"));
//			System.out.println("NextStartDate: " + rs.getString("NextStartDate"));
//			System.out.println("NextEndDate: " + rs.getString("NextEndDate"));
			
		    uName = rs.getString(1);
			System.out.println(uName);
		}
	
	 // Close DB connection
	 con.close();
	 
	   System.out.println("uName after DB is closed. " + uName);
	
		//System.out.println("The result of the query is: " + uName);		
		
		//System.out.println(driver.findElement(By.xpath("//div[contains(.,email)]")).getText());
		
		Thread.sleep(2000);
		
		boolean testresults;
		
		testresults = uName.contains(email);
		
        Thread.sleep(3000);
		
		System.out.println(testresults);
		
		Thread.sleep(3000);
		
			
		
		return testresults;
		
		
		
	}
	
}
