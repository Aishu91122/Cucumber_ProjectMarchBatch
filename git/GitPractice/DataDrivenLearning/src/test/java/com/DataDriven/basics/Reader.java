package com.DataDriven.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader {
	
	File xcelPath;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet; 
	
	public Reader(String excelPath, String sheetName) {
		try {
		xcelPath = new File(excelPath);
		fis = new FileInputStream(xcelPath);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
		}
		catch(IOException e)
		{
			e.printStackTrace(); // Shows Exception/Warning in console 
		}
	}

	public int getRowCount()
	{
	    return sheet.getLastRowNum()+1;
	}
	
	public int getCellCount()
	{
	   return sheet.getRow(0).getLastCellNum();
	}
	
	public void singleCellValue()
	{
		
	}
	
	public void allCellValue()
	{
		
	}
	
}
