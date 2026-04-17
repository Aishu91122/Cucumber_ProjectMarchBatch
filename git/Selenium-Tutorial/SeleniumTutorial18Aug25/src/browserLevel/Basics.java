package browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized", "--headless");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.google.com");
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());  
		System.out.println( driver.getTitle()); 
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
