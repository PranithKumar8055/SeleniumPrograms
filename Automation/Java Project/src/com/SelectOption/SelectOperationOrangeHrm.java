package com.SelectOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOperationOrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		
		WebElement JobTitle=driver.findElement(By.name("searchDirectory[job_title]"));
		Select selection = new Select(JobTitle);
		selection.selectByVisibleText("Automation Tester");
		Thread.sleep(500);
		selection.selectByValue("27");
		Thread.sleep(500);
		//selection.selectByIndex(0);
		driver.quit();
	}

}
