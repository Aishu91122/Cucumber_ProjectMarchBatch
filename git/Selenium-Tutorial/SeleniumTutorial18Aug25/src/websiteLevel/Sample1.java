package websiteLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement closeButton = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
		closeButton.click();
		WebElement armButton = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div/span"));
		armButton.click();

	}

}
