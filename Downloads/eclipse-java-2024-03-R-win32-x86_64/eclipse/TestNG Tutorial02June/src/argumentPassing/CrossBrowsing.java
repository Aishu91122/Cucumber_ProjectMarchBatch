package argumentPassing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
	
WebDriver driver;
	
    @Parameters({"browserName"})
	@BeforeClass
	public void launch(@Optional("Chrome") String browserName)
	{
    if(browserName.equalsIgnoreCase("chrome"))
    {
	driver = new ChromeDriver();
    }
    else if(browserName.equalsIgnoreCase("firefox"))
    {
    	driver = new FirefoxDriver();
    }
    else if(browserName.equalsIgnoreCase("edge"))
    {
    	driver = new EdgeDriver();
    }
    else 
    {
    	System.err.println("Please enter valid browser");
    }
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test (priority = -2)
	public void getTitle()
	{
		
		System.out.println(driver.getTitle());
	}
	
	@Test (priority =-1)
	public void getCurrentURL()
	{
	System.out.println(driver.getCurrentUrl());
	}
	
	@Test (priority = 0)
	public void dropDownHandling()
	{
	
	WebElement dayField = driver.findElement(By.xpath("//select[@class='day']"));
    Select daySelect = new Select(dayField);
    daySelect.selectByValue("10");
    List<WebElement> dayMenu = daySelect.getOptions();
    for (WebElement aa:dayMenu)
    {
    	System.out.println(aa.getText());
    }
    
    WebElement monthMenu = driver.findElement(By.xpath("//select[@class='middle month']"));
    Select monthSelect = new Select(monthMenu);
    monthSelect.selectByIndex(11);
    List<WebElement> monthsMenu = monthSelect.getOptions();
    for (WebElement aa: monthsMenu)
    {
    	System.out.println(aa.getText());
    }
    
    WebElement yearMenu = driver.findElement(By.xpath("//select[@class='year']"));
    Select yearSelect = new Select(yearMenu);
    yearSelect.selectByVisibleText("1990");
    List<WebElement> yearsMenu = yearSelect.getOptions();
    for (WebElement aa: yearsMenu)
    {
    	System.out.println(aa.getText());
    }
	}
	
	@Test(dependsOnMethods = "dropDownHandling")
    public void autoSuggestion() throws InterruptedException
    {
	
    WebElement registerField = driver.findElement(By.id("Register"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", registerField);
	Thread.sleep(1000);
	WebElement countryCode = driver.findElement(By.xpath("//div[@class='countryCodeText']"));
	countryCode.click();
	
	List<WebElement> suggestionList = driver.findElements(By.xpath("/html/body/div[2]/div[2]/form/div/div[17]/div/div/div[1]/ul/li"));
	
	
	for(WebElement aa: suggestionList)
		
	{
		System.out.println(aa.getText());
	}
	

	for(WebElement aa: suggestionList)
		
	{
		if(aa.getText().startsWith("Vietna"))
		{
			aa.click();
		}
		
	}
    }
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	


	

	}


