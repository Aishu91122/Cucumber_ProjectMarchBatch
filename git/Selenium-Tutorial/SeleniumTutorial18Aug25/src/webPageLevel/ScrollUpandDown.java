package webPageLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/legal/terms/update");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		WebElement createNew = driver.findElement(By.cssSelector("a[data-testid*='ration-form-button']"));
//		createNew.click();
//		WebElement termsLink = driver.findElement(By.xpath("//a[text()='Terms']"));
//		termsLink.click();
		//typeCasting Syntax float b = (float)a
		JavascriptExecutor jsdriver = (JavascriptExecutor)driver;
		jsdriver.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		jsdriver.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		

		
	}

}
