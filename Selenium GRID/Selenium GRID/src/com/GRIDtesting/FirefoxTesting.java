package com.GRIDtesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTesting 
{
	@Test
	public void Test1() throws MalformedURLException, InterruptedException
	{
		
		try {
			DesiredCapabilities cap= new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			WebDriver driver=new RemoteWebDriver (new URL("http://192.168.0.101:4444/wd/hub"),cap);
driver.manage().window().maximize();

driver.get("https://www.google.com");
String Title=driver.getTitle();
System.out.println("The title is: "+ Title);
Thread.sleep(5000);
driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block   //it's working
			e.printStackTrace();

                    }
	}
	
}
