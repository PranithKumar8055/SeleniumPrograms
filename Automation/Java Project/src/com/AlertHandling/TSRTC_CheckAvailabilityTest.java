package com.AlertHandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_CheckAvailabilityTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","./Driver Files/msedgedriver.exe");
EdgeDriver driver= new EdgeDriver();
String url="https://www.tsrtconline.in/oprs-web/";
	
	driver.get(url);
	
	driver.manage().window().maximize();
	File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShot, new File( "./Screenshot/tsrtcalert.png"));
	
	driver.findElement(By.id("searchBtn")).click();
	
	Thread.sleep(2000); 
	Alert alt= driver.switchTo().alert();
	
	String Alert_Message=alt.getText();
	
	System.out.println("The alert message is: "+Alert_Message);
	
	
	alt.accept();
	
	driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("12345");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	
	alt.dismiss();
	File ScreenShot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShot2, new File( "./Screenshot/guru99cus.png"));
	Thread.sleep(2000);
	driver.close();}

}
