package com.HeaderLinkTestingTSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTCheaderBlockEleName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();

String url="https://www.tsrtconline.in/oprs-web";
driver.get(url);
driver.manage().window().maximize();

	WebElement Header= driver.findElement(By.className("menu"));
	List<WebElement> HeaderLinks = Header.findElements(By.tagName("a"));
	int HeaderLinkCnt= HeaderLinks.size();
	System.out.println("The total number of links present in header : "+HeaderLinkCnt);
	
	for(int i=0;i<HeaderLinkCnt;i++)
	{
	String Header_Link_Name	=HeaderLinks.get(i).getText();
	System.out.println("The header link name is: "+Header_Link_Name);
	}
	System.out.println("   ");
	
	for(int i=0;i<HeaderLinkCnt;i++)
	{
		String Header_Link_Name =HeaderLinks.get(i).getText();
	if(i==3)
	{continue;}
	HeaderLinks.get(i).click();
	System.out.println(Header_Link_Name+" "+"Tested Successfully");
	driver.findElement(By.className("selectedtabcopy")).click();
	Header=driver.findElement(By.className("menu-wrap"));
	HeaderLinks=Header.findElements(By.tagName("a"));
	}
	driver.close();
	}

}
