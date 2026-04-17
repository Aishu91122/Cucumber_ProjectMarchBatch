package com.cp.Steps;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cp.base.DriverFactory;
import com.cp.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends DriverFactory {

	LoginPage loginpage = new LoginPage();

	@When("user enters valid username and password")
	public void userEntersValidUsernameAndPassword() {
		loginpage.enterUserName("Admin");
		loginpage.enterPassword("admin123");
	}

	@When("user clicks loginButton")
	public void userClicksLoginButton() {
		loginpage.clickLogin();
	}

	@Then("user should be logged into OrangeHRM successfully")
	public void userShouldBeLoggedIntoOrangeHRMSuccessfully() {
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualLoggedUrl = driver.getCurrentUrl();
		System.out.println(actualLoggedUrl);

	}

	@Then("user should be naviagte to homepage")
	public void userShouldBeNaviagteToHomepage() {
		System.out.println(loginpage.dashBoardDisplay());

	}

}
