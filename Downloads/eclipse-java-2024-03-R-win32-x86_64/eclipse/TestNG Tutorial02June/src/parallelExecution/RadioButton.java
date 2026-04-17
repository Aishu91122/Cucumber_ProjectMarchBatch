package parallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButton {

	@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement createNewField = driver.findElement(By.partialLinkText("Crea"));
		createNewField.click();
		WebElement radioButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));
		boolean displayed = radioButton.isDisplayed();
		boolean enabled = radioButton.isEnabled();
		boolean selected = radioButton.isSelected();
		System.out.println(displayed);
		System.out.println(enabled);
		System.out.println(selected);
		if (selected!=true)
		{
			radioButton.click();
		}
		boolean selectedAfterClick = radioButton.isSelected();
		System.out.println(selectedAfterClick);

	}

}
