package com.TotalNumberLinksOrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestOrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com");
driver.manage().window().maximize();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();

List<WebElement>Links=driver.findElements(By.tagName("a"));
int Link_Count=Links.size();
System.out.println("Total number of links: "+Link_Count);
for(int i=0;i<Link_Count;i++)
{
 String Name_of_Link=Links.get(i).getText();	
 System.out.println("Name of the Link is: "+Name_of_Link);
}
for(int i=0;i<Link_Count;i++)
{
 Links.get(i).click();
 System.out.println("Link Url is : "+driver.getCurrentUrl());
 System.out.println(" ");
 driver.findElement(By.id("menu_dashboard_index")).click();
Links=driver.findElements(By.tagName("a"));


}
 driver.close();
}

	}


