package com.LinkTestScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsofTestedLinks {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.tsrtconline.in/oprs-web");
	driver.manage().window().maximize();
	
	WebElement Header=driver.findElement(By.className("menu-wrap"));
	List<WebElement>Header_Links=Header.findElements(By.tagName("a"));
int Header_Count =	Header_Links.size();
System.out.println("The total number of links present in header is :"+Header_Count);
for(int i=0;i<Header_Count;i++)
{
String LinkText=Header_Links.get(i).getText();	
System.out.println("The name of the link is: "+LinkText);

Header_Links.get(i).click();
System.out.println("The current url is: "+driver.getCurrentUrl());
File ScreenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(ScreenShots,new File("./TSRTCHeaderLinksScreenShots"+LinkText+".png"));

System.out.println(" ");
driver.navigate().back();
Header=driver.findElement(By.className("menu-wrap"));
Header_Links=Header.findElements(By.tagName("a"));
}
	driver.quit();}

}
