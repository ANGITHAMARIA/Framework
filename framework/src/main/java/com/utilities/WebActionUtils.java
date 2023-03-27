package com.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActionUtils {

	WebDriver driver;
	WebElement element;
	
	/**
	 * This method is enter value to a field
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void enterTheValue(WebDriver driver,WebElement element,String value)
	{
		try 
		{
			element.sendKeys(value);	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to click an element
	 * @param driver
	 * @param element
	 */
	public void clickOnTheElement(WebDriver driver,WebElement element)
	{
		try 
		{
			element.click();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to clear an element
	 * @param driver
	 * @param element
	 */
	public void clearTheElement(WebDriver driver,WebElement element)
	{
		try 
		{
			element.clear();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to click submit for an element
	 * @param driver
	 * @param element
	 */
	public void submitTheElement(WebDriver driver,WebElement element)
	{
		try 
		{
			element.submit();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is check if an element is selected or not.
	 * @param driver
	 * @param element
	 * @return
	 */
	public boolean CheckElementIsSelected(WebDriver driver,WebElement element)
	{
		boolean flag = false;
		try 
		{
			flag=element.isSelected();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}
	
	/**
	 * This method is to check if an element is enabled.
	 * @param driver
	 * @param element
	 * @return
	 */
	public boolean CheckElementIsEnabled(WebDriver driver,WebElement element)
	{
		boolean flag=false;
		try 
		{
			flag=element.isEnabled();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}
	
	/**
	 * This method is check if an element is displayed.
	 * @param driver
	 * @param element
	 * @return
	 */
	public boolean CheckElementIsDisplayed(WebDriver driver,WebElement element)
	{
		boolean flag=false;
		try 
		{
			flag=element.isDisplayed();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}
	
	/**
	 * This method is to get the text of an element.
	 * @param driver
	 * @param element
	 * @return
	 */
	public String getTheElementText(WebDriver driver,WebElement element)
	{
		String value=null;
		
		try 
		{
			value=element.getText();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}
	
	/**
	 * This method is to get the tag name of an element
	 * @param driver
	 * @param element
	 * @return
	 */
	public String getTheElementTagName(WebDriver driver,WebElement element)
	{
		String value=null;
		try 
		{
			value=element.getTagName();	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}
	
	/**
	 * This method is to get the attribute value of an element.
	 * @param driver
	 * @param element
	 * @param attribute
	 * @return
	 */
	public String getTheElementAttribute(WebDriver driver,WebElement element,String attribute)
	{
		String value=null;
		try 
		{
			value=element.getAttribute(attribute);	
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}
	
	/**
	 * This method is to get the Css value of an element
	 * @param driver
	 * @param element
	 * @param property
	 * @return
	 */
	public String getTheElementCssValue(WebDriver driver,WebElement element,String property)
	{
		String value=null;
		try 
		{
			value=element.getCssValue(property);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}
	
	/**
	 * This method is to get the size of an element.
	 * @param driver
	 * @param element
	 * @return
	 */
	public Dimension getTheElementSize(WebDriver driver,WebElement element)
	{
		Dimension value=null;
		try 
		{
			value=element.getSize();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}
	
	/**
	 * This method is to get the location of an element.
	 * @param driver
	 * @param element
	 * @return
	 */
	public Point getTheElementLocation(WebDriver driver,WebElement element)
	{
		Point value=null;
		try 
		{
			value=element.getLocation();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}
}
