package webPageLevel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s1 = "C:\\Users\\INFOMATS123\\Desktop\\ScreenShot";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File screenshotTo = new File(s1+"\\shot2.png");
		FileHandler.copy(screenshotAs, screenshotTo);
		
		

	}

}
