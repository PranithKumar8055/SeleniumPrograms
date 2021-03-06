package com.GRID;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRMLogInTest 
{
	@Parameters("Browser")
	@Test
	
	public void LogIn(String browser) throws IOException, InterruptedException
	{
		//Connection to nodes
		DesiredCapabilities cap=null;
		System.out.println("The browser name is: "+browser);
		
		
		if (browser.equalsIgnoreCase("Firefox"))
		{
			
			cap= new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
		
			if(browser.equalsIgnoreCase("Chrome"))
				
			{
				
				cap=DesiredCapabilities.chrome(); 
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"),cap);
		
		//Automate TestScripts
		String url="https://opensource-demo.orangehrmlive.com";
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("spanMessage")).getText());	
		driver.quit();
		}
	}
	


