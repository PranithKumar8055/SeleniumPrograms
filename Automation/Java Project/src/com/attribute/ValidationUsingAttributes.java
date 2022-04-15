package com.attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationUsingAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com";
driver.navigate().to(url);
driver.manage().window().maximize();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
Thread.sleep(500);
driver.findElement(By.linkText("Dashboard")).click();
String Actual_url =driver.getCurrentUrl();
String Link =driver.findElement(By.linkText("Dashboard")).getAttribute("href");
System.out.println("The actual Link is: "+Actual_url);
	System.out.println("The link is: "+Link);
	
	if (Actual_url.contains(Link))
	
	{System.out.println("The link is same as expected: PASS");}
	
	else
	
	{System.out.println("The link is not same as actual link: FAIL");}
	
	driver.close();
	
	}

}
