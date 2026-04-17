package com.DataDriven.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;
	
	Reader reader;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		reader = new Reader("C:\\\\Users\\\\INFOMATS123\\\\Desktop\\\\Sample.xlsx", "Sheet2");
	}
	@Test(enabled = false)
	public void verifyLoginWithSingleData()
	{
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("pass"));
		
		emailField.sendKeys(reader.getSingleValue(0, 0));
		passwordField.sendKeys(reader.getSingleValue(0, 1));
	}
	
	@Test(dataProvider = "data", dataProviderClass = DataGiver.class)
	public void verifyLoginWithEntireData(String email,String pass) throws InterruptedException
	{
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("pass"));
		
		emailField.sendKeys(email);
		passwordField.sendKeys(pass);
		
		Thread.sleep(2000);
		
		emailField.clear();
		passwordField.clear();
	}
	
	
}
