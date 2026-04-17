package webPageLevel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		List<WebElement> divTag = driver.findElements(By.tagName("div"));
		System.out.println("Div Tag "+divTag.size());
		List<WebElement> scriptTag = driver.findElements(By.tagName("script"));
		System.out.println("scriptTag "+scriptTag.size());
		List<WebElement> linkTag = driver.findElements(By.tagName("link"));
		System.out.println("linkTag "+linkTag.size());
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		System.out.println("aTag "+aTag.size());
		for (WebElement aa:aTag)
		{
			System.out.println(aa.getAttribute("href")+"-->"+ aa.getText());
		}
		WebElement forgotLink = driver.findElement(By.partialLinkText("Forgot"));
		System.out.println("Forgot"+forgotLink.getAttribute("href")+  "-->"+forgotLink.getText());
	}

}
