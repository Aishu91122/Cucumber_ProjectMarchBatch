package parallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	
    @Test
	public static void main() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		WebElement dragFrom =  driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropTo =  driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragFrom, dropTo).perform();
		driver.switchTo().defaultContent();

	}

}
