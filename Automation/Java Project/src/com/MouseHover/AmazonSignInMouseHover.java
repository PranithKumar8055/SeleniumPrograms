package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignInMouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url="https://www.amazon.in";
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
WebElement		HelloSignIn=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
	Actions act= new Actions(driver);
	
	act.moveToElement(HelloSignIn).perform();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Your Orders")).click();
	System.out.println("Click operation is successfull, it's getting redirected to logIn Page: PASS");
	driver.close();
	}

}
