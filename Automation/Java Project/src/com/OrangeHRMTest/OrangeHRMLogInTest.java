package com.OrangeHRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogInTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PranithKumar\\Desktop\\Automation\\Java Project\\Driver Files\\chromedriver.exe");
	 ChromeDriver CD=new ChromeDriver();
	 String url="https://opensource-demo.orangehrmlive.com/";
	 CD.get(url);
	 CD.manage().window().maximize();
	 CD.findElement(By.id("txtUsername")).sendKeys("Admin");
	 CD.findElement(By.id("txtPassword")).sendKeys("admin123");
	 CD.findElement(By.id("btnLogin")).click();
	String Title =CD.getTitle();
	System.out.println("The page title is: "+Title);
	 Thread.sleep(500);
	 CD.quit();
	}

}
