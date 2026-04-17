package com.cp.Runner;

import org.testng.annotations.BeforeSuite;

import com.cp.base.DriverFactory;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;



@CucumberOptions( 
		
		features = "src/main/resources/FeatureFolder",
		snippets = SnippetType.CAMELCASE,
		dryRun = !true,
		glue = {"com.cp.Steps", "com.cp.Hooks"},
		plugin = { "pretty",
				"html:Reports/CucumberResultsReports.html", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
	   
		)
public class LoginRun extends AbstractTestNGCucumberTests {
	
	@BeforeSuite
	public void setUp() {
		
	    DriverFactory.launchBrowser();
	}

}
