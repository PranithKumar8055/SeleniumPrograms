package com.RadioButtonTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonTest extends TestBase
{
	@Test
	public void radioButtonTest() throws IOException 
	{
		FileInputStream File= new FileInputStream("./src/com/ExcelFiles/RadioButton.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(File);
		XSSFSheet Sheet= workbook.getSheet("Sheet1");
	//
WebElement RadioButtonBlock= driver.findElement(By.xpath(" /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List <WebElement> Group1=RadioButtonBlock.findElements(By.name("group1"));
	int Group1cnt =Group1.size();
	System.out.println("Group 1 count: "+Group1cnt);
	
	for(int i=0; i<Group1cnt;i++)
	{
		Group1.get(i).click();
Row R =		Sheet.createRow(i);

for (int j=0; j<Group1cnt;j++)
{
System.out.println(Group1.get(j).getAttribute("value")+" "+Group1.get(j).getAttribute("checked"));	

R.createCell(j).setCellValue(Group1.get(j).getAttribute("value")+" "+Group1.get(j).getAttribute("checked"));
FileOutputStream File1= new FileOutputStream("./src/com/ExcelFiles/RadioButton.xlsx");
workbook.write(File1);

}
System.out.println("");		
	}
	workbook.close();
	
	}
}