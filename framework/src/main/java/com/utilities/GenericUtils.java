package com.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author angit
 *
 */
public class GenericUtils {

	WebDriver driver;
	Select select;
	
	
	public void selectByValue(WebDriver driver,WebElement element,String value)
	{
		select =new Select(element);
		try {
		select.selectByValue(value);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public void selectByIndex(WebDriver driver,WebElement element,int index)
	{
		Select select =new Select(element);
		try {
			select.selectByIndex(index);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
	
	public void toDismissAnAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void toAcceptAnAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void toEnterValueToTheAlert(WebDriver driver,String value)
	{
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(value);
	}
	
	public void toGetTitleOfTheAlert()
	{
		Alert alert=driver.switchTo().alert();
		alert.getText();
	}
	
	public void toCaptureScreenshot(WebDriver driver, String path, String filename) throws IOException
	{
		try {
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File(path +filename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
