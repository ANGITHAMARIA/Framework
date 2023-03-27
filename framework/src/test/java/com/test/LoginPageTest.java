package com.test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.PropertyUtil;
import com.utilities.WebBrowserUtils;

public class LoginPageTest extends AutomationBase
{
	WebDriver driver;
	WebBrowserUtils webbrowser;
	LoginPage login;
	HomePage home;
	PropertyUtil propertyutil;
	Properties prop;

	@BeforeMethod
	public void preRun() throws IOException
	{
		driver=getDriver();
		login=new LoginPage(driver);
		webbrowser=new WebBrowserUtils();
		home=new HomePage(driver);
		//waitutil=new WaitUtil();	
		prop = propertyutil.getProperty("config.properties");
		//driver.get(prop.getProperty("URL"));
		webbrowser.launchUrl(driver,prop.getProperty("url"));
}
	@Test
	public void validateLogin()
	{
		login.enterValueToUserName(prop.getProperty("username"));
		login.enterValueToPassword(prop.getProperty("password"));
		login.clickOnLoginButton();
		Assert.assertTrue(home.isSuccessPopupFieldDisplayed(),"Failure message:Unable to login to application");
	}
}