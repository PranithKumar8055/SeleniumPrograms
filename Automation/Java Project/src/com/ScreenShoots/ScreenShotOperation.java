package com.ScreenShoots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotOperation {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://wwww.bing.com");

//type casting
//usually we put this inside catch block.

File BingHome=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(BingHome, new File("./Screenshot/bing.png"));
driver.quit();	}

}
