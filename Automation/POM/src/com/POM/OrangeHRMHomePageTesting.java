package com.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class OrangeHRMHomePageTesting extends TestBase
{
	@Test
	public void HomePage() throws IOException, InterruptedException
	{
		OrangeHRM ohrm=PageFactory.initElements(driver, OrangeHRM.class);
		
		FileInputStream File= new FileInputStream("./src/ApplicationTestDataFile/OrangeHRMLogInData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(File);
		XSSFSheet Sheet= workbook.getSheet("Sheet1");
	int RowCnt=	Sheet.getLastRowNum();
	for(int i=0;i<=RowCnt;i++)
	{
	Row R =	Sheet.getRow(i);
	ohrm.logIn(R.getCell(0).getStringCellValue(),R.getCell(1).getStringCellValue());
	System.out.println("Username: "+R.getCell(0).getStringCellValue()+" Password: "+R.getCell(1).getStringCellValue());
	System.out.println(driver.getTitle());
	System.out.println("");
	
	String ExpectedTitle = "OrangeHRM";
	String ActualTitle = driver.getTitle();
	
	
	if (ActualTitle.contains(ExpectedTitle))
	{
		System.out.println("LogIn is Successful");
		R.createCell(2).setCellValue("LogIn is Successful");
		
	}
	
	else
	{
		System.out.println(" Unsuccessful LogIn");
		R.createCell(2).setCellValue(" Unsuccessful LogIn");
		
	}
	FileOutputStream File1= new FileOutputStream("./src/ApplicationTestDataFile/OrangeHRMLogInData.xlsx");
	workbook.write(File1);
	System.out.println("  ");
	driver.navigate().back();
	}
	}
	@Test
	public void LinkedIn() throws InterruptedException 
	{
		OrangeHRM ohrm=PageFactory.initElements(driver, OrangeHRM.class);
	ohrm.LinkedIn();
	
	Set<String>WindowHandles=driver.getWindowHandles();
	Iterator<String> iterator =WindowHandles.iterator();
	String ParentWindow=iterator.next();
	String ChildWindow=iterator.next();
	driver.switchTo().window(ChildWindow);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(" ");
	driver.close();
	driver.switchTo().window(ParentWindow);
	Thread.sleep(5000);
	}
	@Test
	public void Facebook() throws InterruptedException 
	{
	OrangeHRM ohrm=PageFactory.initElements(driver, OrangeHRM.class);
	ohrm.Facebook();
	Set<String>WindowHandles2=driver.getWindowHandles();
	Iterator<String> iterator2 =WindowHandles2.iterator();
	String ParentWindow2=iterator2.next();
	String ChildWindow2=iterator2.next();
	driver.switchTo().window(ChildWindow2);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(" ");
	driver.close();
	driver.switchTo().window(ParentWindow2);
	Thread.sleep(5000);
	}
	@Test
	public void Twitter() throws InterruptedException
	{
	OrangeHRM ohrm=PageFactory.initElements(driver, OrangeHRM.class);
	ohrm.Twitter();
	Set<String>WindowHandles3=driver.getWindowHandles();
	Iterator<String> iterator3 =WindowHandles3.iterator();
	String ParentWindow3=iterator3.next();
	String ChildWindow3=iterator3.next();
	driver.switchTo().window(ChildWindow3);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(" ");
	driver.close();
	driver.switchTo().window(ParentWindow3);
	Thread.sleep(5000);
	}
	@Test
	public void Youtube()
	{
	OrangeHRM ohrm=PageFactory.initElements(driver, OrangeHRM.class);
	ohrm.Youtube();
	Set<String>WindowHandles4=driver.getWindowHandles();
	Iterator<String> iterator4 =WindowHandles4.iterator();
	String ParentWindow4=iterator4.next();
	String ChildWindow4=iterator4.next();
	driver.switchTo().window(ChildWindow4);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(" ");
	driver.close();
	driver.switchTo().window(ParentWindow4);
	
	}
	

}
