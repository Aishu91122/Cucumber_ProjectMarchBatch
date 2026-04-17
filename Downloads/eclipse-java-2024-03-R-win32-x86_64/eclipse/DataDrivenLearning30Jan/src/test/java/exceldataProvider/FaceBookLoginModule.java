package exceldataProvider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookLoginModule {
	
	WebDriver driver;  //Global Variable 
	Reader reader;
	
	@BeforeTest(alwaysRun = true)
	public void launch()
	{
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		reader = new Reader("C:\\Users\\INFOMATS123\\Desktop\\Test Data Facebook.xlsx", "Sheet1");
	}
	
	@Test(priority = 0)
	public void verifyTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test (priority = -1)
	public void verifyUrl() 
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test (priority = 1, dataProviderClass = DataSuppliers.class , dataProvider = "FBLoginCredentials"   )
	public void login(String email, String password) throws InterruptedException
	{
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.name("pass"));
		
//		emailField.sendKeys(reader.getSingleValue(1, 0));
//		emailField.sendKeys(reader.getSingleValue(1, 1));
		
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
				
		Thread.sleep(3000);
		
		emailField.clear();
		passwordField.clear();
		
	
		
		
	}
	
	
	@Test (priority = 0)
	public void allLinks()
	{
		List<WebElement> aTags = driver.findElements(By.tagName("a"));
        System.out.println(aTags.size());
       
	}
	
	
	

}
