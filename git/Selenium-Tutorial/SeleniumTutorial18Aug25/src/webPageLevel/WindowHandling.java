package webPageLevel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW).navigate().to("https://www.makemytrip.com/");
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windowsList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowsList.get(0));
		WebElement emailText = driver.findElement(By.id("email"));
		emailText.sendKeys("Developer@gmail.com");
		WebElement passText = driver.findElement(By.name("pass"));
		passText.sendKeys("Pass234");
		driver.switchTo().window(windowsList.get(1));
		WebElement closeButton = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
		closeButton.click();
		WebElement armButton = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div/span"));
		armButton.click();
		

	}

}
