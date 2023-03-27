package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
	
	/**
	 * To select value from drop-down using value
	 * @param driver
	 * @param element
	 * @param value
	 */
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
	
	/**
	 * To select value from drop-down using index
	 * @param driver
	 * @param element
	 * @param index
	 */
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
	
	/**
	 * To select value from drop-down using visible text
	 * @param driver
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebDriver driver,WebElement element,String text)
	{
		Select select=new Select(element);
		try 
		{
			select.selectByVisibleText(text);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to get all options in the drop-down
	 * @param driver
	 * @param element
	 * @return
	 */
	public List<WebElement> toGetAllOptionsInDropdown(WebDriver driver,WebElement element)
	{
		List<WebElement> option=null;
		Select select=new Select(element);
		try
		{
			option=select.getOptions();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return option;
	}
	
	/**
	 * To get all the selected options in a drop-down
	 * @param driver
	 * @param element
	 * @return
	 */
	public List<WebElement> toGetAllSelectedOptions(WebDriver driver,WebElement element)
	{
		List<WebElement> option = null;
		Select select=new Select(element);
		try 
		{
			option = select.getAllSelectedOptions();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return option;
	}
	
	/**
	 * To get the first select option in the drop-down
	 * @param driver
	 * @param element
	 * @return
	 */
	public String toGetTheFirstSelectedOption(WebDriver driver,WebElement element)
	{
		String option = null;
		Select select=new Select(element);
		try 
		{
			option=select.getFirstSelectedOption().getText();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}		
		return option;
	}
	
	/**
	 * To de-select option from drop-down using value
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void deSelectOptionByValue(WebDriver driver,WebElement element,String value)
	{
		Select select=new Select(element);
		try 
		{
			select.deselectByValue(value);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * To de-select option from drop-down by index
	 * @param driver
	 * @param element
	 * @param index
	 */
	public void deSelectOptionByIndex(WebDriver driver,WebElement element,int index)
	{
		Select select=new Select(element);
		try 
		{
			select.deselectByIndex(index);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}

	/**
	 * To de-select option from drop-down by visible text
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void deSelectOptionByVisibleText(WebDriver driver,WebElement element,String value)
	{
		Select select=new Select(element);
		try 
		{
			select.deselectByVisibleText(value);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * To de-select all selected options from drop-down
	 * @param driver
	 * @param element
	 */
	public void deSelectAllSelectedOptions(WebDriver driver,WebElement element)
	{
		Select select=new Select(element);
		try 
		{
			select.deselectAll();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}	
	}
	
	/**
	 * This method is to dismiss an alert
	 * @param driver
	 */
	public void toDismissAnAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		try 
		{
			alert.dismiss();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to accept an alert
	 * @param driver
	 */
	public void toAcceptAnAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		try 
		{
			alert.accept();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to enter value to an alert
	 * @param driver
	 * @param value
	 */
	public void toEnterValueToTheAlert(WebDriver driver,String value)
	{
		Alert alert=driver.switchTo().alert();
		try 
		{
			alert.sendKeys(value);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to get the title of the alert
	 * @return 
	 */
	public String toGetTitleOfTheAlert(WebDriver driver)
	{	
		String text=null;
		Alert alert=driver.switchTo().alert();
		try 
		{
			text=alert.getText();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return text;
	}
	
	/**
	 * This method is to capture the screenshot of a page
	 * @param driver
	 * @param path
	 * @param filename
	 * @throws IOException
	 */
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
