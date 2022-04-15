package com.TotalNumberLinksOrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalLinksFinding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./Driver Files/msedgedriver.exe");
		EdgeDriver Driver=new EdgeDriver();
		String Url="https://opensource-demo.orangehrmlive.com/";
		Driver.get(Url);
		Driver.manage().window().maximize();
		Driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Driver.findElement(By.id("btnLogin")).click();
		String Title=Driver.getTitle();
		if(Title.equals("OrangeHRM"))
		{System.out.println("The Login is Successful and the home page title is same as expected:"+Title);
		}
		else
		{System.out.println("The Login is successfull but the home page title is differnet :"+Title);}
	
	List<WebElement>Links= Driver.findElements(By.tagName("a"));
	int LinksCount=Links.size();
	for(int i=0;i<LinksCount;i++)
	{
		String Link_Text=Links.get(i).getText();
		System.out.println(Link_Text);
	}
	Thread.sleep(500);
Driver.close();
	
	}

}
