package webPageLevel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TabsHandling {

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
		WebElement termsLink = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[10]/p/a[1]"));
		termsLink.click();
		Set<String> tabsHandling = driver.getWindowHandles();
//		System.out.println("Session ID of Tabs: "+tabsHandling);
//		System.out.println(tabsHandling.size());
		ArrayList<String> tabsList = new ArrayList<String>(tabsHandling);
		driver.switchTo().window(tabsList.get(1));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement metaLink = driver.findElement(By.linkText("Meta Company Products"));
		js.executeScript("arguments[0].scrollIntoView();",metaLink);
		driver.switchTo().window(tabsList.get(0));
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		firstNameField.sendKeys("Test1");
		WebElement surNameField = driver.findElement(By.name("lastname"));
		surNameField.sendKeys("Test2");
		WebElement maleRadioButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));
		if (maleRadioButton.isSelected()!=true)
		{
			maleRadioButton.click();
		}
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
        driver.switchTo().window(tabsList.get(1));
        driver.close();
		
	}

}
