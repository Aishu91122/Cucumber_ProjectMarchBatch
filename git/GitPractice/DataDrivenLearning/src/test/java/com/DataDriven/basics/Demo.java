package com.DataDriven.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void m1() throws IOException
	{
		File f = new File("C:\\Users\\INFOMATS123\\Desktop\\Demo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowNum = sheet.getLastRowNum()+1;
		System.out.println(rowNum);
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		for (int i=0; i<rowNum; i++)
		{
			for (int j=0; j<cellNum; j++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);

				DataFormatter format = new DataFormatter();
				String value = format.formatCellValue(cell);
				System.out.print(value + "|");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
