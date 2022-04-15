package com.TimeAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureFirstColumnData {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.timeanddate.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[@href='/worldclock/' and @class='site-nav__title']")).click();
	 String Name=driver.findElement(By.xpath("//a[text()='Accra']")).getText();
	 String Time=driver.findElement(By.xpath("//*[@id='p0']")).getText();
	 System.out.println("The current date & time in "+Name+" is "+Time);
	 driver.close();
	
	}

}
