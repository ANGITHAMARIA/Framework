package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionUtils {

	WebDriver driver;
	WebElement element;
	
	public void toScrollDownThePage(WebDriver driver)
	{
	try 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	} 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	
	public void toScrollUpThePage(WebDriver driver)
	{
	try 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
	} 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	
	
	public void toScrollToTheElement(WebDriver driver,WebElement element)
	{
	try 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element );
	} 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	
	public void toClickTheElement(WebDriver driver,WebElement element)
	{
	try 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	} 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}

	
}
