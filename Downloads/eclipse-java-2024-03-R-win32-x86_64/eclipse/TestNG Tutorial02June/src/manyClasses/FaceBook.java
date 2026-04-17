package manyClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaceBook {

WebDriver driver;   //Global Variable
	
	@BeforeClass (alwaysRun = true)
	public void launch()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com");
	}
	
	@Test (priority = -1, invocationCount = -2)
	public void getURL()
	{
	System.out.println(driver.getCurrentUrl());
	}
	
    @Test (priority = 0, description="Title of the Current Page")
	public void getTitle()
    {
	System.out.println(driver.getTitle());
    }
    
    @Test (priority =4, description="Login Module")
    public void loginModule()
    {    
	 WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
	 emailField.sendKeys("Automation");
	 WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/div/input"));
	 passwordField.sendKeys("Tester123");
    }
    
    @Test (priority = 1,  dependsOnMethods = "loginModule", timeOut = 5000)
    public void createNewAccount()
    {
 	 WebElement createNewField = driver.findElement(By.linkText("Create new account"));
	 createNewField.click();
	 WebElement firstNameField =driver.findElement(By.name("firstname"));
	 firstNameField.sendKeys("Tester");
	 WebElement surNameField =driver.findElement(By.name("lastname"));
	 surNameField.sendKeys("Manual");
    }
    
    
    @Test (priority =0, alwaysRun=true, dependsOnMethods = "loginModule")
    public void allLinks()
    {
	 List<WebElement> aTag =driver.findElements(By.tagName("a"));
	 System.out.println("Number of a tags "+aTag.size());
	 for (WebElement aa: aTag)
	    {
	    	System.out.println(aa.getText()+"---->"+aa.getAttribute("href"));
	    }
    }
    
    @AfterClass (alwaysRun = true)
    public void close()
    {
    	driver.close();
    }

	}


