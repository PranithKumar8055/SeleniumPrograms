package com.DataDrivenApproach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRMLogInTest extends TestBase
{
@Test(priority=0)
public void LogIn() throws IOException, InterruptedException
{
	FileInputStream File= new FileInputStream("./src/com/ExcelFiles/DataDrivenApproach.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(File);
XSSFSheet Sheet= workbook.getSheet("Sheet1");
int RowNumber = Sheet.getLastRowNum();
for(int i=0; i<=RowNumber;i++)
{
	Row R=Sheet.getRow(i);
	driver.findElement(By.id("txtUsername")).clear();
	 driver.findElement(By.id("txtUsername")).sendKeys(R.getCell(0).getStringCellValue());
	 driver.findElement(By.id("txtPassword")).clear();
	 driver.findElement(By.id("txtPassword")).sendKeys(R.getCell(1).getStringCellValue());
	 driver.findElement(By.id("btnLogin")).click();
	String Actual_Title =driver.getTitle();
	String Expected_Title="OrangeHRM";
	System.out.println("The actual title of the page is: "+Actual_Title);
	System.out.println("The expected title of the page is: "+ Expected_Title);
	
	if(Actual_Title.contains(Expected_Title))
	{
		System.out.println("The Actual Title is same as expected title: PASS");
		R.createCell(2).setCellValue("LogIn is successful: PASS");
	}
	else {
		R.createCell(2).setCellValue("LogIn is unsuccessful: FAIL");
		System.out.println("The Actual Title is not same as expected title: FAIL");
	}
	
	FileOutputStream File1= new FileOutputStream("./src/com/ExcelFiles/DataDrivenApproach.xlsx");
	workbook.write(File1);
	driver.navigate().back();
Thread.sleep(5000);
}

}
	
	
}
