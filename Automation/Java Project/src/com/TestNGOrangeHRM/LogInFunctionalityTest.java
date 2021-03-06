package com.TestNGOrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInFunctionalityTest {
	WebDriver driver= null;
@BeforeTest
public void driverSetUp()
{
	System.setProperty("webdriver.gecko.driver","./Driver Files/geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test(priority=0)
public void logInFunctionality()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
@AfterTest
public void BrowserClose()
{
driver.close();
System.out.println("Browser close");
}
}
