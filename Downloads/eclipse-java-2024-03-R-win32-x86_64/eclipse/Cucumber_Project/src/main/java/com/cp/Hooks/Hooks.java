package com.cp.Hooks;



import java.net.URI;
import java.util.Collection;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cp.base.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends DriverFactory{
	
	

	@Before
	public void beforeScenario(Scenario scenario)
	{
		String name = scenario.getName();
		Integer line = scenario.getLine();
		String id = scenario.getId();
		URI uri = scenario.getUri();
		Collection<String> sourceTagNames = scenario.getSourceTagNames();
		System.out.println("Scenario Name "+name);
		System.out.println("Scenario Line "+ line);
		System.out.println("Scenario ID "+id);
		System.out.println("Scenario uri " +uri);
		System.out.println("All Tags in this Scenario " +sourceTagNames);
	}
	
	@After
	public void afterScenario(Scenario scenario)
	{
		Status status = scenario.getStatus();
		System.out.println("Scenario Validation Status : " + status);
		if (scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		    scenario.attach(screenshotAs, "image/png", "Failed ScreenShot"); 
		}
	}
	
	
}
