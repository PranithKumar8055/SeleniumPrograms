package com.BackToHomeTest;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBackToHomeTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	String url= "https://www.amazon.com";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Alert alt= driver.switchTo().alert();	
   // alt.dismiss();
	
	WebElement Act =driver.switchTo().activeElement();
		Act.findElement(By.className("a-button-input")).click();	
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
driver.findElement(By.id("nav-logo-sprites")).click();
String crnturl=driver.getCurrentUrl();
    System.out.println("The current url is: "+crnturl);
    if(crnturl.contains(url))
    {System.out.println("The Amazon Back To Home Page Using Click Logo operation is successful : PASS");}
    else
    	{System.out.println("The Back To Home Page Operation Is unsuccessful : FAIL");}
    
	driver.close();}
	

}
