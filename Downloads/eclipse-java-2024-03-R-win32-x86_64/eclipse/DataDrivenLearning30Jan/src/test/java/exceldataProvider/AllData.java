package exceldataProvider;

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

public class AllData {
	
	
	@Test
	public void m1() throws IOException
	{
		File file = new File("C:\\Users\\INFOMATS123\\Desktop\\Test Data Facebook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
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
