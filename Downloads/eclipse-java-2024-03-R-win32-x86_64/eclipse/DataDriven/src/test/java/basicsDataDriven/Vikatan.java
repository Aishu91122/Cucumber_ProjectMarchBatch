package basicsDataDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vikatan {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook w = new XSSFWorkbook();
		
		long height = 0;

		String url = "https://books.vikatan.com/category/health";
		
		int stringPosition = url.lastIndexOf('/')+1;
		
		String name = url.substring(stringPosition);
		
		System.out.println(name);
		
		XSSFSheet sheet = w.createSheet(name);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		while(true)
		{
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		long pageHeight = (long)js.executeScript("return document.body.scrollHeight");
        if (height==pageHeight)
        {
        	break;
        }
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		height = pageHeight;
		
		}
		
		List<WebElement> booksList = driver.findElements(By.xpath("//div[contains(@class,'category_magazine')]/div"));
		
		int booksTotalCount = booksList.size();
		
		System.out.println(booksTotalCount);
		
		XSSFRow rowHeader = sheet.createRow(0);
		
		rowHeader.createCell(0).setCellValue("book Name");
		
		rowHeader.createCell(1).setCellValue("book Price");

		for(int i=1; i<=booksTotalCount; i++)
		
		{
			WebElement bookName = driver.findElement(By.xpath("//div[contains(@class,'category_magazine')]/div["+i+"]/descendant::p[contains(@class, 'book_title')]"));
			
			WebElement bookPrice = driver.findElement(By.xpath("//div[contains(@class,'category_magazine')]/div["+i+"]/descendant::p[contains(@class, 'book_cost')]/strong"));
			
			System.out.println(bookName.getText() + "------> " +bookPrice.getText());
			
			XSSFRow row = sheet.createRow(i);
			
			row.createCell(0).setCellValue(bookName.getText());
			
			row.createCell(1).setCellValue(bookPrice.getText());

		}
		
		File f = new File("C:\\Users\\INFOMATS123\\Desktop\\vikatan.xlsx");
		
		FileOutputStream outputStream = new FileOutputStream(f);
		
		w.write(outputStream);
	}

}
