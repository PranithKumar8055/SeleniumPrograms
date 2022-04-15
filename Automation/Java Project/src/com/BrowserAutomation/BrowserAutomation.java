package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) throws InterruptedException {
//Chrome Browser automation
		//System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PranithKumar\\Desktop\\Automation\\Java Project\\Driver Files\\chromedriver.exe");
		ChromeDriver CD= new ChromeDriver();
		CD.get("https://www.youtube.com/watch?v=USccSZnS8MQ");
		CD.findElement(By.cssSelector("button[class='ytp-large-play-button ytp-button']")).click();
		Thread.sleep(11000);
		CD.findElement(By.cssSelector("button[class='ytp-ad-skip-button ytp-button']")).click();
		Thread.sleep(1000);
		CD.manage().window().maximize();
		Thread.sleep(1000);
		CD.findElement(By.id("main"));
		Thread.sleep(500);
		CD.findElement(By.id("dismiss-button")).click();
		Thread.sleep(21000);
		//CD.switchTo().alert().dismiss();
        CD.close();
	
	}

}
