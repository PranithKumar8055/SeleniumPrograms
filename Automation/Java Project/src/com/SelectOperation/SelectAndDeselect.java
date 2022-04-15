package com.SelectOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./Driver Files/geckodriver.exe");
FirefoxDriver driver= new FirefoxDriver();
String url="https://opensource-demo.orangehrmlive.com";
driver.get(url);
driver.manage().window().maximize();

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
Thread.sleep(2000);
driver.findElement(By.id("menu_directory_viewDirectory")).click();

WebElement JobTitle=driver.findElement(By.id("searchDirectory_job_title"));

Select selection= new Select(JobTitle);

selection.selectByVisibleText("Chief Executive Officer");
Thread.sleep(2000);

List<WebElement> JobTitles=JobTitle.findElements(By.tagName("option"));

System.out.println("The total number of jobs: "+JobTitles.size());

for(int i=0;i<JobTitles.size();i++)
{
String JobRole=JobTitles.get(i).getText();	
System.out.println("The Job Title is: "+JobRole);
}
driver.close();

	}

}
