package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./Driver Files/msedgedriver.exe");
EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("9030163415");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Mechanical12").perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.close();
		
		
		
	}

}
