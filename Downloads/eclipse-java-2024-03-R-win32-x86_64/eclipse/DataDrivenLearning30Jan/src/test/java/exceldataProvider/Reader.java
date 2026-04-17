package exceldataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Reader {
	
	File file;
	FileInputStream stream;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell ;
	DataFormatter format;
	String array[][];
	
	public Reader(String excelPath, String sheetName)
	{
		try
		{
		file = new File(excelPath);
		stream = new FileInputStream(file);
		wb = new XSSFWorkbook(stream);
	    sheet = wb.getSheet(sheetName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public String getSingleValue(int rowNum, int cellNum)
	{
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		format = new DataFormatter();
		String value = format.formatCellValue(cell);
		return value;
	}
	
	public int getRowSize()
	{
		int rowSize = sheet.getLastRowNum()+1;
		return rowSize;
	}
	
	public int getCellSize()
	{
		int cellSize = sheet.getRow(0).getLastCellNum();
		return cellSize;
		
	}
	

	public String[][] getAllValues(int rowSize, int cellSize)
	{
		array = new String[rowSize][cellSize]; 
				
		for (int i=0; i<rowSize; i++)
		{
			for (int j=0; j<cellSize; j++)
			{
				row = sheet.getRow(i);
				cell = row.getCell(j);

				format = new DataFormatter();
				array[i][j] = format.formatCellValue(cell);
				
				
			}
			
		}
		
		return array;
	}

}
