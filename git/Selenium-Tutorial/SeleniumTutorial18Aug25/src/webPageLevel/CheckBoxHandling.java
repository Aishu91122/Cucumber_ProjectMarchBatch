package webPageLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement checkBox = driver.findElement(By.xpath("/html/body/div/div[4]/fieldset/label[2]/input"));
		boolean displayed = checkBox.isDisplayed();
		System.out.println(displayed);
		boolean enabled = checkBox.isEnabled();
		System.out.println(enabled);
		boolean selected = checkBox.isSelected();
		System.out.println(selected);
		if (checkBox.isSelected()!=true)
		{
			checkBox.click();
		}
	}

}
