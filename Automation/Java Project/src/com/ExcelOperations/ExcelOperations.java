package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelOperations {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream File= new FileInputStream("./src/com/ExcelFiles/Single Test Data.xlsx");
	XSSFWorkbook WorkBook = new XSSFWorkbook(File);
	XSSFSheet sheet = WorkBook.getSheet("Sheet1");
	Row r= sheet.getRow(0);
	Cell c= r.getCell(0);
	String data = c.getStringCellValue();
	System.out.println(data);

	}

}
