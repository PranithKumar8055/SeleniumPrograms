package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportFromExcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream File= new FileInputStream("./src/com/ExcelFiles/JobTitles.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(File);
		XSSFSheet Sheet= workbook.getSheet("Sheet1");
		int R =Sheet.getLastRowNum();
		System.out.println("The last row number is: "+ R);
		
		
		for(int i=0;i<R;i++)
		{Row r =	Sheet.getRow(i);
		int C =r.getLastCellNum();
		
		for(int j= 0; j<C;j++)
		{
			String CellValue=r.getCell(j).getStringCellValue();
			System.out.println(i+". "+CellValue);
		}

		workbook.close();
		}

	}

}
