package webPageLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//id, classname, name
public class LocatorSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("Developer@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Java123");
		driver.findElement(By.name("login")).click();
		driver.switchTo().newWindow(WindowType.TAB).get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.className("email-input")).sendKeys("Tester");
		driver.findElement(By.className("email-input")).clear();
		driver.findElement(By.className("email-input")).sendKeys("Tester1");
		driver.findElement(By.id("password")).sendKeys("Python1234");
		driver.findElement(By.className("signin-btn")).click();
		
		
		

	}

}
