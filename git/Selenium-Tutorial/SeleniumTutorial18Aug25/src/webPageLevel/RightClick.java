package webPageLevel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act = new Actions(driver);
        act.contextClick(rightClick).perform();
        WebElement pasteOption = driver.findElement(By.xpath("//span[text()='Paste']"));
        pasteOption.click();
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
        
        WebElement doubleClick = driver.findElement(By.xpath("//button[starts-with(text(),'Double-Click')]"));
        act.doubleClick(doubleClick).perform();
        Alert alt1 = driver.switchTo().alert();
        System.out.println(alt1.getText());
        alt1.accept();
        
        driver.switchTo().defaultContent();  //Optional
	}

}
