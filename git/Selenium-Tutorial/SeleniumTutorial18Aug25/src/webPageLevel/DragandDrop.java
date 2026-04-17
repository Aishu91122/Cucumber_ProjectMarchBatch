package webPageLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement frameElement = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frameElement);
		WebElement dragFrom = driver.findElement(By.cssSelector("div#draggable"));
		WebElement dropTo = driver.findElement(By.cssSelector("div#droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragFrom, dropTo).perform();
        driver.switchTo().defaultContent(); //Must
        WebElement resizeLink = driver.findElement(By.xpath("//a[text()='Resizable']"));
        resizeLink.click();
		
		
		
	}

}
