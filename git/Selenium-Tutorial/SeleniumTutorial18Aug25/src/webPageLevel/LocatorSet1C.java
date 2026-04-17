package webPageLevel;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//id, classname, name
public class LocatorSet1C {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	
		WebElement emailText = driver.findElement(By.id("email"));
		boolean displayed = emailText.isDisplayed();
		System.out.println(displayed);
		boolean enabled = emailText.isEnabled();
		System.out.println(enabled);
	
		String attribute = emailText.getAttribute("type");
		System.out.println(attribute);
		emailText.sendKeys("Developer@gmail.com");
		WebElement passText = driver.findElement(By.name("pass"));
		passText.sendKeys("Pass234");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		driver.switchTo().newWindow(WindowType.TAB).get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement emailText2 = driver.findElement(By.className("email-input"));
		emailText2.sendKeys("Tester");
		WebElement passText2 = driver.findElement(By.id("password"));
		passText2.sendKeys("Python1234");
		WebElement signinButton = driver.findElement(By.className("signin-btn"));
		signinButton.click();
		
		
		

	}

}
