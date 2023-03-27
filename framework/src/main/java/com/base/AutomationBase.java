package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class AutomationBase {

	static WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void launchBrowser(String browserName) throws Exception //will run before each test
	{
		switch(browserName)
		{
		case "chrome": launchChromeBrowser();
		break;
		
		case "edge":launchEdgeBrowser();
		break;
		
		case "firefox":launchFirefoxBrowser();
		break;
		
		default:
			//System.out.println(AutomationConstants.CHECKBROWSER_MESSAGE);
			System.out.println("Check the browser name entered");
			break;
		}
		
		//return driver;
	}
	private void launchChromeBrowser() throws Exception
	{
		try
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
	}
	
	private void launchEdgeBrowser() throws Exception
	{
		try
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
	}
	
	private void launchFirefoxBrowser() throws Exception
	{
		try
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
	}
	
	public WebDriver getDriver() //to return the driver
	{
		return driver; 
	}
}
