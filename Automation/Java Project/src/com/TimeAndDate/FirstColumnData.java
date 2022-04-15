package com.TimeAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstColumnData {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.timeanddate.com/worldclock/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// /html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1] First Row of First Column
 //  /html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]   Last Row of First Column
// tr[] is a row
for(int i = 1; i<=36;i++) {
String Name = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]")).getText();
System.out.println(i+". The name of the city is: "+Name);
}
driver.close();	System.out.println("Mission Successful");}

}
