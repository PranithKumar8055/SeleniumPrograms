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

public class OrangeHRMEmployeeListExport {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		 String url="https://opensource-demo.orangehrmlive.com/";
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.xpath("//b[text()='PIM']")).click();
		 WebElement PIMHeader= driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']/li[2]/ul"));
			
		 PIMHeader.findElement(By.linkText("Employee List")).click();
	 WebElement EmpTable =driver.findElement(By.xpath("//*[@id='frmList_ohrmListComponent']"));
	List <WebElement> Rows=EmpTable.findElements(By.tagName("tr"));	
	int RowsCnt=Rows.size();
	System.out.println("The total number of rows: "+RowsCnt);
	
	FileInputStream File= new FileInputStream("./src/com/ExcelFiles/OrangeHRMEmployeeListExport.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(File);
	XSSFSheet Sheet= workbook.getSheet("Sheet1");

	/*for( int i=0;i<RowsCnt;i++)
	{Row R=Sheet.createRow(i);
		List<WebElement> Columns =Rows.get(i).findElements(By.tagName("th"));
		for(int j= 0;j<Columns.size();j++)
		{
			String TEXT=Columns.get(j).getText();
			System.out.print(TEXT+" ");
			Cell C = R.createCell(j);
		C.setCellValue(TEXT);
		FileOutputStream File1=new FileOutputStream("./src/com/ExcelFiles/OrangeHRMEmployeeListExport.xlsx");
		workbook.write(File1);
		// Truncated ZIP file Error
	}
		
		
	}*/
	
	for(int k=0;k<RowsCnt;k++)
	{Row R=Sheet.createRow(k);
		List<WebElement> Columns =Rows.get(k).findElements(By.tagName("td"));
		for(int j= 0;j<Columns.size();j++)
		{
			String TEXT=Columns.get(j).getText();
			System.out.print(TEXT+" ");
			Cell C = R.createCell(j);
		C.setCellValue(TEXT);
		FileOutputStream File1=new FileOutputStream("./src/com/ExcelFiles/OrangeHRMEmployeeListExport.xlsx");
		workbook.write(File1);
		}
	
		System.out.println(" ");
	}
	
	
	}

}
