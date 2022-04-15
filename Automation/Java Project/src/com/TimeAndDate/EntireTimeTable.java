package com.TimeAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntireTimeTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//First Row First column Xpath
		// /html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
        // Last row last column xpath
		// /html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	
		
		for(int i = 1;i<=36;i++)
		{
			for (int j=1; j<=8;j++)
			{String Data=driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(Data);
			}
			System.out.println(" ");
		}driver.close();
		
	}

}
