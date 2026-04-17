package com.DataDriven.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader1 {
	
	File f;
	FileInputStream fis;
	XSSFWorkbook wb ;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell; 
	DataFormatter format;
	String array[][];
	
	public Reader1(String excelPath, String sheetName)
	{
		try {
	f = new File(excelPath);
	fis = new FileInputStream(f);
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheet(sheetName);
	}
	
	catch(IOException e)
		{
		e.printStackTrace();
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
	
	public String getSingleValue(int rowNum, int cellNum)
	{
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		format = new DataFormatter();
		return format.formatCellValue(cell);
	}
	
	public String[][] getEntireValue(int rowCount, int cellCount)
	{
		
	array = new String[rowCount][cellCount];
	
	for (int i=0; i<rowCount; i++)
	{
		for (int j=0; j<cellCount; j++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(j);
			format = new DataFormatter();
   		    array[i][j] = format.formatCellValue(cell);
		}
	}
	return array;
	}

}
