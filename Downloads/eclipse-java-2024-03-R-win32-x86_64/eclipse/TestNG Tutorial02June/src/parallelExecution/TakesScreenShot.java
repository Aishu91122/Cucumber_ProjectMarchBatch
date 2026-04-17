package parallelExecution;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakesScreenShot {

	@Test
	public static void main() throws IOException{
		// TODO Auto-generated method stub
		
		String fold =  "‪C:\\Users\\INFOMATS123\\Desktop\\TS";
		String fnew = "C:\\Users\\INFOMATS123\\Desktop\\TS";
		
		System.out.println(fold.length()+"--->"+fnew.length());
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement createAccountButton = driver.findElement(By.partialLinkText("Crea"));
		createAccountButton.click();
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File screenShotTo = new File(fnew +"\\screen3.png");
		FileHandler.copy(screenShotAs, screenShotTo);
	}

}
