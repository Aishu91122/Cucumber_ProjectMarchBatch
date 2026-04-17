package webPageLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement register = driver.findElement(By.cssSelector("input#Register"));
		js.executeScript("arguments[0].scrollIntoView();",register);
		WebElement countryCode = driver.findElement(By.cssSelector("div.countryCodeText"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(countryCode)).click();
		List<WebElement> countryCodeList = driver.findElements(By.cssSelector("div#country_id>ul>li"));
		for (WebElement aa:countryCodeList)
        { 
          System.out.println(aa.getText()); 
        }
	    js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        for (WebElement aa:countryCodeList)
        { 
         	if (aa.getText().startsWith("Afghanist"))
        	{ 
         		Thread.sleep(2000);
        		aa.click();
        	}
        }
       
	}

}
