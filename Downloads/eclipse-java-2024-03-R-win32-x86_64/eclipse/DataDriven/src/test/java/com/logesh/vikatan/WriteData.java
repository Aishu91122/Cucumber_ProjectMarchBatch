package com.logesh.vikatan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String url="https://books.vikatan.com/category/literature";
		
		int indexOf = url.lastIndexOf('/')+1;
		
		System.out.println(indexOf);
		
		String reUrl = url.substring(indexOf);
		
		System.out.println(reUrl);

		XSSFWorkbook w=new XSSFWorkbook();
		
		XSSFSheet sheet = w.createSheet(reUrl);
		
		XSSFRow row = sheet.createRow(5);//6
		
		XSSFCell cell = row.createCell(3);//4
		
		cell.setCellValue("admin");
		
		File file=new File("C:\\Users\\INFOMATS123\\Desktop\\logesh.xlsx");
		
		FileOutputStream fos=new FileOutputStream(file);
		
		w.write(fos);
		
		w.close();
	}

}
