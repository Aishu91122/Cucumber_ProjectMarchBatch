package com.cp.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static void launchBrowser()
	{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		}
	}
	


