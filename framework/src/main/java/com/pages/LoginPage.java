package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WebActionUtils;

public class LoginPage {
	
	WebDriver driver;
	WebActionUtils webaction=new WebActionUtils();

	@FindBy(xpath="//input[@name='identity']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@name='remember']")
	WebElement rememberbtn;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotpwd;
	
	@FindBy(xpath="//a[text()='Back to home page']")
	WebElement backtohome;
	
	public LoginPage(WebDriver  driver) //constructor of login page
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialize the above mentioned elements
	}
	
	public void enterValueToUserName(String name)
	{
		webaction.enterTheValue(driver, username,name);
	}
	
	public void enterValueToPassword(String pwd)
	{
		webaction.enterTheValue(driver, password, pwd);
	}
	
	public void clickOnLoginButton()
	{
		webaction.clickOnTheElement(driver, loginbtn);
	}
	
	public HomePage login(String username,String password) throws Exception
	{
		enterValueToUserName(username);
		enterValueToPassword(password);
		clickOnLoginButton();
		return new HomePage(driver);
	}
	
}
