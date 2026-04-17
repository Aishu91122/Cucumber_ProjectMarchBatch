package com.logesh.vikatan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleVikatan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books.vikatan.com/");
		
		List<WebElement> categories = driver.findElements(By.xpath("/html/body/div/div/div[1]/div[3]/div/div/div[1]/div/div/div/div/div"));
		
		System.out.println(categories.size());
	}

}
