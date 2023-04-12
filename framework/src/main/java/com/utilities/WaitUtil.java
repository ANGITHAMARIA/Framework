package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil 
{
	public void forImplicitWait(WebDriver driver,int timeout)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	public void waitForTheVisibilityOfElement(WebDriver driver,WebElement element,int duration)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		WebElement status=wait.until(( ExpectedConditions.visibilityOf(element)));
		//status.click();
	}
	
	public Boolean waitForTheInVisibilityOfElement(WebDriver driver,WebElement element,int duration)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		Boolean status=wait.until(( ExpectedConditions.invisibilityOf(element)));
		return status;
		//status.click();
	}
	
	public void waitForClickabilityofElement(WebDriver driver,WebElement element,int duration)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		WebElement status=wait.until(( ExpectedConditions.elementToBeClickable(element)));
		
	}
	
	public void waitForTextofElement(WebDriver driver,WebElement element,int duration,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		Boolean status=wait.until(( ExpectedConditions.textToBe((By) element,value)));
		
	}
	
	
}
