package com.cp.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cp.base.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UrlSteps extends DriverFactory{

	
	
	
	
	@When("user gets Webpage Url")
	public void userGetsWebpageUrl() {
		String actualPageUrl = driver.getCurrentUrl();
		System.out.println(actualPageUrl);
	}
}
