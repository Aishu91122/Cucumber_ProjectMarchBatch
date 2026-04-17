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
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void m1 () throws IOException
	{
		File f= new File("C:\\Users\\INFOMATS123\\Desktop\\Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sheet = w.getSheet("Sheet1");
		int rowNum = sheet.getLastRowNum()+1;
		//System.out.println(rowNum);
		int cellNum = sheet.getRow(0).getLastCellNum();
		//System.out.println(cellNum);
		for (int i=1; i<rowNum; i++)
		{
			for (int j=0; j<cellNum; j++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				String value = format.formatCellValue(cell);
				System.out.print(value+"|");
			}
			System.out.println();
		}
		
		
		
	}
}
