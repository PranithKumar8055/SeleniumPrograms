package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMProfilePic 
{
	WebDriver driver= null;
	String URL="https://www.facebook.com/";
	
	@BeforeTest
	public void BrowserSetUp()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}

	@Test(priority=0)
	public void logIn()
	{
		driver.findElement(By.id("email")).sendKeys("9030163415");
		driver.findElement(By.id("pass")).sendKeys("Mechanical12");
        driver.findElement(By.name("login")).click();
        
	}
	@Test(priority=1)
	public void Registration() throws IOException, InterruptedException
	{
     driver.findElement(By.xpath("//span[text()='Bhaskar Chaganti']")).click();
     Thread.sleep(5000);
     Actions act= new Actions(driver);
     act.sendKeys(Keys.ESCAPE).build().perform();
 
	 driver.findElement(By.xpath("//div[@aria-label='Profile picture actions']")).click();
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("//div[@class='bp9cbjyn j83agx80 btwxx1t3 buofh1pr i1fnvgqd hpfvmrgz']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//span[text()='Upload Photo']")).click();
    Thread.sleep(5000);
	 
    java.lang.Runtime.getRuntime().exec("./AutoIt Scripts/fbProup.exe");
    Thread.sleep(5000);	 
	driver.findElement(By.xpath("//span[text()='Save']")).click();
	Thread.sleep(5000);	 
	
	
	
	}
	
}
