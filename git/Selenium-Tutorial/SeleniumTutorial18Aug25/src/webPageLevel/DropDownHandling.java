package webPageLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement createNew = driver.findElement(By.cssSelector("a[data-testid*='ration-form-button']"));
		createNew.click();
		WebElement dayMenu = driver.findElement(By.cssSelector("select#day"));
        Select daysSelect = new Select(dayMenu);
        daysSelect.selectByIndex(3);
        List<WebElement> dayOptions = daysSelect.getOptions();
        for (WebElement aa:dayOptions)
        {
        	System.out.println(aa.getText());
        }
        System.out.println("============Month================");
        WebElement monthMenu = driver.findElement(By.cssSelector("select#month"));
        Select monthSelect = new Select(monthMenu);
        monthSelect.selectByValue("2");
        List<WebElement> monthOptions = monthSelect.getOptions();
        for(WebElement aa:monthOptions)
        {
        	System.out.println(aa.getText());
        }
        
        
        
	}

}
