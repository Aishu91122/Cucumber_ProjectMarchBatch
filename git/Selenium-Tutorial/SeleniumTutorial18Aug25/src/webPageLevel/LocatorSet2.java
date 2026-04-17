package webPageLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Linktext, partialText
public class LocatorSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());
	      driver.findElement(By.partialLinkText("Forgot")).click();
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());
	      driver.navigate().back();
	      driver.findElement(By.partialLinkText("Meta AI more content")).click();
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());

	}

}
