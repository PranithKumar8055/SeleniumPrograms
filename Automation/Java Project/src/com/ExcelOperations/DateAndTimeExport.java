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

public class DateAndTimeExport {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream File= new FileInputStream("./src/com/ExcelFiles/DateAndTimeExport.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(File);
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
	
	WebElement	Table=driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]"));
List<WebElement> Rows =Table.findElements(By.tagName("tr"));
int RowCnt=Rows.size();

for(int i=0;i<RowCnt;i++)
{Row R=Sheet.createRow(i);
List <WebElement> Columns=Rows.get(i).findElements(By.tagName("td"));

for(int j=0; j<Columns.size();j++)
{
String Text = Columns.get(j).getText();	
System.out.print(Text+ " ");
//Row R=Sheet.createRow(i); It will cause deletion of previous data
Cell C =R.createCell(j);
C.setCellValue(Text);
FileOutputStream File1= new FileOutputStream("./src/com/ExcelFiles/DateAndTimeExport.xlsx");
workbook.write(File1);


}
System.out.println(" ");
}
workbook.close();
driver.close();
	}

}
