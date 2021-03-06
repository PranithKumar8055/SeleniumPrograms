package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderGrid 
{
	@DataProvider(parallel=true)          //@DataProvider(parallel=true) to perform parallel operation
	public Object[][] getData()           //@DataProvider to perform series operation
	{
		Object[][] data = new Object[2][3];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[0][2]="chrome";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		data[1][2]="firefox";
		
		return data;
	}

	@Test(dataProvider="getData")
	public void LogInTest(String Username,String Password,String Browser ) throws MalformedURLException
	{
	System.out.println(Browser);
	DesiredCapabilities cap= null;
	if(Browser.equalsIgnoreCase("Firefox"))
	{
		cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	}
	else
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			cap= new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
	
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"), cap);
	
	
	
	String url="https://opensource-demo.orangehrmlive.com/";
	driver.get(url);
	driver.findElement( By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
	
	driver.quit();
	
	}
}
