package com.DataDriven.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFB {
	
	WebDriver driver;
	Reader reader;

	@BeforeClass
	public void launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		reader = new Reader("C:\\Users\\INFOMATS123\\Desktop\\Sample.xlsx", "Sheet1");
	}
	
	@Test(dataProvider = "faceBookdata")
	public void verifyLoginwithEntireValue(String emailname, String pass)
	{
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		
		email.sendKeys(emailname);
		password.sendKeys(pass);
	}	
	
	@DataProvider(name="faceBookdata")
	public String[][] getData()
	{
		reader = new Reader("C:\\Users\\INFOMATS123\\Desktop\\Sample.xlsx", "Sheet1");
		int rowCount = reader.getRowCount();
		int cellCount = reader.getCellCount();
		return reader.getEntireValue(rowCount, cellCount);
	}

}
