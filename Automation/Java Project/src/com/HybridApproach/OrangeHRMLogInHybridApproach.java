package com.HybridApproach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRMLogInHybridApproach extends TestBase
{
@Test
public void LogInTest() throws IOException, InterruptedException
{
	FileInputStream File= new FileInputStream("./src/com/ExcelFiles/HybridApproach.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(File);
	XSSFSheet Sheet= workbook.getSheet("Sheet1");
int	RowNumber=Sheet.getLastRowNum();
for(int i=0; i<=RowNumber;i++)
{
Row R =Sheet.getRow(i);	
FileInputStream File1=new FileInputStream("./OrangeHRM.properties");
Properties pr = new Properties();
pr.load(File1);

driver.findElement(By.name(pr.getProperty("Username"))).clear();
driver.findElement(By.name(pr.getProperty("Username"))).sendKeys(R.getCell(0).getStringCellValue());
driver.findElement(By.name(pr.getProperty("Password"))).clear();
driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(R.getCell(1).getStringCellValue());
driver.findElement(By.name(pr.getProperty("LogIn"))).click();

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

FileOutputStream File2=new FileOutputStream("./src/com/ExcelFiles/HybridApproach.xlsx");
workbook.write(File2);
driver.navigate().back();
Thread.sleep(5000);

}





}
}
