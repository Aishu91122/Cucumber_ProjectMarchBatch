package webPageLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
		createButton.click();
		WebElement maleRadioButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));
		boolean displayed = maleRadioButton.isDisplayed();
		System.out.println(displayed);
		boolean enabled = maleRadioButton.isEnabled();
		System.out.println(enabled);
		boolean selected = maleRadioButton.isSelected();
		System.out.println(selected);
		if (maleRadioButton.isSelected()!=true)
		{
			maleRadioButton.click();
		}
	}

}
