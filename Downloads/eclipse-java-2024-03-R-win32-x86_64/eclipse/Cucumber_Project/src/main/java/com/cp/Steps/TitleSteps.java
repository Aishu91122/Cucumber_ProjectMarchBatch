package com.cp.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cp.Hooks.Hooks;
import com.cp.base.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TitleSteps extends Hooks{
	
	
	
	
	
	@When("user gets Webpage Title")
	public void userGetsWebpageTitle() {
		String actualPageTitle = driver.getTitle();
		System.out.println(actualPageTitle);
	    
	}

}
