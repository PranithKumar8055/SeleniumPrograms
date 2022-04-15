package com.RadioButtonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase 
{
WebDriver driver= null;
String url="https://www.echoecho.com/htmlforms10.htm";

@BeforeTest
public void DriverSetUp()

{
System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
@AfterTest
public void TearDown()
{
driver.quit();	
}
}
