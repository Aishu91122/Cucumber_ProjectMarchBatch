package webPageLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement jobsMenu = driver.findElement(By.cssSelector("nav>ul>li>a[title='Search Jobs']>div"));
		Actions act = new Actions(driver);
		act.moveToElement(jobsMenu).perform();
		WebElement itJobs = driver.findElement(By.xpath("//div[text()='IT jobs']"));
        act.click(itJobs).perform();
	}

}
