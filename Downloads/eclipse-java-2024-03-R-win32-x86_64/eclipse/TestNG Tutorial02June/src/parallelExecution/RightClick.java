package parallelExecution;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {

	@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement doubleClick = driver.findElement(By.xpath("//button[starts-with(text(),'Double')]"));
        Actions act = new Actions(driver);
        act.doubleClick(doubleClick).perform();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
        WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right cl')]"));
        act.contextClick(rightClickButton).perform();
    
        
        WebElement deleteButton = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        deleteButton.click(); 
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert.accept();
	
	}

}
