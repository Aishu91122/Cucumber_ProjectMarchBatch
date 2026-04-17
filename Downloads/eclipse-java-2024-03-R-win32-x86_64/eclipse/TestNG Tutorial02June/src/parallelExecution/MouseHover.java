package parallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {

	@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement searchJobsField = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(searchJobsField).perform();
		WebElement mncField = driver.findElement(By.xpath("//div[text()='MNC jobs']"));
		act.click(mncField).perform();

	}

}
