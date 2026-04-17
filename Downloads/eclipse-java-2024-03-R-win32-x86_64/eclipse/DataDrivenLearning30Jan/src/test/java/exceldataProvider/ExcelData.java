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

public class ExcelData {
	
	
	@Test
	public void m1() throws IOException
	{
		File file = new File("C:\\Users\\INFOMATS123\\Desktop\\Test Data Facebook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(cell);
		System.out.println(value);
		
	}

}
