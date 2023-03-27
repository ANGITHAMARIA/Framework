package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil 
{
	public void forImplicitWait(WebDriver driver,int timeout)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void forExplicitWait(WebDriver driver,WebElement element,int duration)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.visibilityOf(element).click());
	}
	
}
