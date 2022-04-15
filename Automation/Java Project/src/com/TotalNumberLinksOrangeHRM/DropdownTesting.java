package com.TotalNumberLinksOrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropdownTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./Driver Files/msedgedriver.exe");
		EdgeDriver Driver=new EdgeDriver();
		String Url="https://opensource-demo.orangehrmlive.com/";
		Driver.get(Url);
		Driver.manage().window().maximize();
		Driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Driver.findElement(By.id("btnLogin")).click();
		Driver.findElement(By.id("menu_directory_viewDirectory")).click();
Driver.findElement(By.name("searchDirectory[job_title]")).click();
WebElement JobTitle= Driver.findElement(By.id("searchDirectory_job_title"));
List<WebElement> Job_Title=JobTitle.findElements(By.tagName("option"));
int JobsCount=Job_Title.size();
System.out.println("Total number of jobs= "+JobsCount);
for(int i=0;i<JobsCount;i++)
{
	String Name_of_Position=Job_Title.get(i).getText();
	System.out.println("Neme of the position: "+Name_of_Position);
	Job_Title.get(26).click();
	
}
Driver.close();
;
	}

}
