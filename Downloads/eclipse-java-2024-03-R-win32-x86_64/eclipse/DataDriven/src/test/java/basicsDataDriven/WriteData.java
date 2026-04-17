package basicsDataDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook w = new XSSFWorkbook();
		
		XSSFSheet sheet = w.createSheet("Sheet1");
		
		XSSFRow row = sheet.createRow(0);
		
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue("Hospital");
		
		File f = new File("C:\\Users\\INFOMATS123\\Desktop\\writeexcel.xlsx");
		
		FileOutputStream outputStream = new FileOutputStream(f);
		
		w.write(outputStream);
	}
}
