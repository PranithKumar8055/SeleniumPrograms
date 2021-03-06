package com.Database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login 
{
	WebDriver driver=null;
	String url= "https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest
	public void setup()
	{System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearDown()

	{
		driver.quit();
		
	}
	
	@Test
	public void login() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		
		Connection conn = null;
		String Url= "jdbc:mysql://localhost:3306/";
		String dbname="pranithdb";
		String DBdriver="com.mysql.jdbc.Driver";
		String Username="Pranith";
		String Password="Mechanical12@";
	
		Class.forName(DBdriver);
		
		
		conn= DriverManager.getConnection(Url+dbname,Username,Password);
		
		PreparedStatement psmt= conn.prepareStatement("Select*from employee LIMIT 1");
		ResultSet rs= psmt.executeQuery();
		
		while(rs.next())
			
		{
			driver.findElement(By.id("txtUsername")).sendKeys(rs.getString(3));
			driver.findElement(By.id("txtPassword")).sendKeys(rs.getString(4));
			driver.findElement(By.id("btnLogin")).click();
			
			driver.navigate().back();
		}
		
		
	}

}
