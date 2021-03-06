package com.TimeAndDate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// Xpath of table
		///html/body/div[6]/section[1]/div/section/div[1]s
		
		WebElement Table=driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]"));
List <WebElement> Rows= Table.findElements(By.tagName("tr"));

for (int i=0; i<Rows.size();i++)
{
List<WebElement>Columns=Rows.get(i).findElements(By.tagName("td"));	
for(int j=0;j<Columns.size(); j++)
{String data=Columns.get(j).getText();
System.out.print(data+ " ");	
}
System.out.println(" ");
}
driver.close();	}

}
