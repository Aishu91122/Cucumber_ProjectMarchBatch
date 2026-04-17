package com.DataDriven.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookLogin {
	
	WebDriver driver;
	Reader1 reader;
	
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		reader = new Reader1("C:\\Users\\INFOMATS123\\Desktop\\Demo.xlsx", "Sheet2");
	}
	
	@Test(enabled = false)
	public void loginwithSingleValue()
	{
		WebElement emailField = driver.findElement(By.name("email"));
		WebElement passwordField = driver.findElement(By.id("pass"));
		emailField.sendKeys(reader.getSingleValue(0, 1));
		passwordField.sendKeys(reader.getSingleValue(1, 1));
	}

	@Test(dataProvider = "data", dataProviderClass = DataGiver.class)
	public void loginwithEntireValue(String email, String pass) throws InterruptedException
	{
		WebElement emailField = driver.findElement(By.name("email"));
		WebElement passwordField = driver.findElement(By.id("pass"));
		
		
		emailField.sendKeys(email);
		passwordField.sendKeys(pass);
		
		Thread.sleep(3000);
		
		emailField.clear();
		passwordField.clear();
		
    }
	
//	@DataProvider(name="data")
//	public String[][] getData()
//	{
//	  int rowCount = reader.getRowCount();
//	  int cellCount = reader.getCellCount();
//	  return reader.getEntireValue(rowCount, cellCount);
//	}
	

	}


