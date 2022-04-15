package com.FacebookLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunctionalityTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\PranithKumar\\Desktop\\Automation\\Java Project\\Driver Files\\geckodriver.exe");
    FirefoxDriver Driver= new FirefoxDriver();
    Driver.get("https://www.facebook.com");
    Driver.findElementById("email").sendKeys("9030163415");
    Driver.findElement(By.id("pass")).sendKeys("Mechanical12");
    Driver.findElementByName("login").click();
    Thread.sleep(2000);
    Driver.close();
    
	}

}
