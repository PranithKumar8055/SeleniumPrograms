package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExportTheDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		 String url="https://opensource-demo.orangehrmlive.com/";
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 driver.findElement(By.id("menu_directory_viewDirectory")).click();
		 driver.findElement(By.id("searchDirectory_job_title")).click();
		 Thread.sleep(5000);
		WebElement JobTitle=driver.findElement(By.id("searchDirectory_job_title"));
		List<WebElement> JobNames=JobTitle.findElements(By.tagName("option"));
		
		for(int i=0;i<JobNames.size();i++)
		{
		String	JobProfile=JobNames.get(i).getText();
		System.out.println(i+". The job role is: "+JobProfile);
		}
FileInputStream File= new FileInputStream("./src/com/ExcelFiles/JobTitles.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(File);
XSSFSheet Sheet= workbook.getSheet("Sheet1");

for(int i=0;i<JobNames.size();i++)
{
	String	JobProfile=JobNames.get(i).getText();
Row R =Sheet.createRow(i);
Cell C=R.createCell(0);
C.setCellValue(JobProfile);

FileOutputStream File1= new FileOutputStream("./src/com/ExcelFiles/JobTitles.xlsx");
workbook.write(File1);
System.out.println(JobProfile);

}
	workbook.close();
	driver.quit();}

}
