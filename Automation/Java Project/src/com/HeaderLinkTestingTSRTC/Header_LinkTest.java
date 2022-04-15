package com.HeaderLinkTestingTSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header_LinkTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Driver Files/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
String url="https://www.tsrtconline.in/oprs-web";

driver.get(url);

driver.manage().window().maximize();
WebElement Header=driver.findElement(By.className("menu-wrap"));

List<WebElement> Header_Links=Header.findElements(By.tagName("a"));

int Links_Count=Header_Links.size();

System.out.println("The total number of links In the header: "+Links_Count);
 for(int i=0;i<Links_Count;i++)
 {
	if(i==3)   //To skip the 3rd link we use this condition type.
	{continue;}
	 String Link_Text=Header_Links.get(i).getText(); 
	 System.out.println("The link text is: "+Link_Text);
	
	 String Url1=driver.getCurrentUrl();
	 System.out.println("The current URL is: "+Url1);
	 System.out.println(" "); 
	 Header_Links.get(i).click();
	 Thread.sleep(500);
	 driver.navigate().back();
	 Header=driver.findElement(By.className("menu-wrap"));
	Header_Links = Header.findElements(By.tagName("a"));
	
	 
	 
 }
 driver.quit();
	}

}
