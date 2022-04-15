package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataInside {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./src/com/ExcelFiles/Single Test Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheet("Sheet1");
	Row r = Sheet.createRow(1);
	Cell c01= r.createCell(1);
	c01.setCellValue("JESUS");
	FileOutputStream file1= new FileOutputStream("./src/com/ExcelFiles/Single Test Data.xlsx");
	workbook.write(file1);
	String data=c01.getStringCellValue();
	System.out.println(data);
	}

}
