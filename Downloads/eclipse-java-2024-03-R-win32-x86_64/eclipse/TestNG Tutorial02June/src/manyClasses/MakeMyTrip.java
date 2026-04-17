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

public class MakeMyTrip {

WebDriver driver;   //Global Variable
	
	@BeforeClass (alwaysRun = true)
	public void launch()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.makemytrip.com/");
	}
	
	@Test (priority = -1, invocationCount = 5)
	public void getURL()
	{
	System.out.println(driver.getCurrentUrl());
	}
	
    @Test (priority = 0, description="Title of the Current Page")
	public void getTitle()
    {
	System.out.println(driver.getTitle());
    }
    
    @Test ()
    public void closeButton()
    {
    WebElement closeButton = 	driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
    closeButton.click();
    }
       
     
    @Test (priority =0, alwaysRun=true, dependsOnMethods = "closeButton")
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
