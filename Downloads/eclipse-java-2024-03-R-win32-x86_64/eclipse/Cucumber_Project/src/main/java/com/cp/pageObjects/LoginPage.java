package com.cp.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cp.base.DriverFactory;

public class LoginPage extends DriverFactory {
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameElement;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passWordElement;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath= "//h[text()='Dashboard']")
	private WebElement dashBoardElement;
	
	public void enterUserName(String username)
	{
		userNameElement.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passWordElement.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	public boolean dashBoardDisplay()
	{
		return dashBoardElement.isDisplayed();
	}
	
	
}
