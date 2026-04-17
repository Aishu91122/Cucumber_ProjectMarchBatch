package webPageLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://money.rediff.com/gainers");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)"); 
		List<WebElement> headingRow = driver.findElements(By.xpath("html/body/div[6]/div/table/thead/tr"));
		int headingRowSize = headingRow.size();
		for (int i=1; i<=headingRowSize; i++)
		{
			List<WebElement> headingColumn = driver.findElements(By.xpath("html/body/div[6]/div/table/thead/tr["+i+"]/th"));
			int headingColumnSize = headingColumn.size();
			for (int j=1; j<=headingColumnSize; j++)
			{
				WebElement tableHeadingData = driver.findElement(By.xpath("html/body/div[6]/div/table/thead/tr["+i+"]/th["+j+"]"));
				System.out.print(tableHeadingData.getText()+" "); 
			}
		}
		System.out.println();
//		List<WebElement> bodyRow = driver.findElements(By.xpath("/html/body/div[6]/div/table/tbody/tr"));
//		for (int i=1; i<=bodyRow.size(); i++)
//		{
//			List<WebElement> bodyColumn = driver.findElements(By.xpath("/html/body/div[6]/div/table/tbody/tr["+i+"]/td"));
//			for (int j=1; j<=bodyColumn.size(); j++)
//			{
//				WebElement bodyContent = driver.findElement(By.xpath("/html/body/div[6]/div/table/tbody/tr["+i+"]/td["+j+"]"));
//				System.out.print(bodyContent.getText()+" ");
//				
//			}
//			System.out.println();
//		}
		List<WebElement> bodyRow = driver.findElements(By.xpath("/html/body/div[6]/div/table/tbody/tr"));
		for (int i=1; i<=bodyRow.size(); i++)
		{
			List<WebElement> bodyColumn = driver.findElements(By.xpath("/html/body/div[6]/div/table/tbody/tr["+i+"]/td"));
			for (int j=1; j<=1; j++)
			{
				WebElement bodyContent = driver.findElement(By.xpath("/html/body/div[6]/div/table/tbody/tr["+i+"]/td["+j+"]/a"));
				if (bodyContent.getText().endsWith("Wires"))
				{
					bodyContent.click();
					break;
				}
				
		}
	
			
	}

}
}
