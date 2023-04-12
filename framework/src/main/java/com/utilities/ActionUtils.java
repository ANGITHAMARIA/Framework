package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {

	WebDriver driver;
	WebElement element;
	
	/**
	 * To click the element using action class
	 * @param driver
	 * @param element
	 */
	public void toClickTheElementUsingActionClass(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.click(element).build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * To hover mouse over an element
	 * @param driver
	 * @param element
	 */
	public void toHoverMouseOverElement(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveToElement(element).build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to move pointer to an element and click
	 * @param driver
	 * @param element
	 */
	public void toMoveToElementAndClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveToElement(element).click().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to right click
	 * @param driver
	 * @param element
	 */
	public void toRightClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.contextClick(element).build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to move pointer to an element and right click
	 * @param driver
	 * @param element
	 */
	public void toMoveToElementAndRightClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveToElement(element).contextClick().build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to double click
	 * @param driver
	 * @param element
	 */
	public void toDoubleClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.doubleClick(element).build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to move to an element and double click
	 * @param driver
	 * @param element
	 */
	public void toMoveToElementAndDoubleClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveToElement(element).doubleClick().build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to click and hold an element
	 * @param driver
	 * @param element
	 */
	public void toClickAndHold(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.clickAndHold(element);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to move to the element and then click and hold
	 * @param driver
	 * @param element
	 */
	public void toMoveToElementAndClickAndHold(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveToElement(element).clickAndHold().build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to move to an element to the given x & y co-ordinates
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void toMoveToElementByOffset(WebDriver driver,int x,int y)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveByOffset(x,y).build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to move to an element to the given x & y co-ordinates
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void toMoveToElementByOffsetAndClick(WebDriver driver,int x,int y)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.moveByOffset(x,y).click().build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to drag and drop
	 * @param driver
	 * @param drag
	 * @param drop
	 */
	public void toDragAndDrop(WebDriver driver,WebElement drag,WebElement drop)
	{
		Actions action=new Actions(driver);
		try 
		{
			action.dragAndDrop(drag, drop).build().perform();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to scroll down the page
	 * @param driver
	 */
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
	
	/**
	 * This method is to scroll up the page
	 * @param driver
	 */
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
	
	/**
	 * This method is to scroll the page to a particular element
	 * @param driver
	 * @param element
	 */
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
	
	/**
	 * This method is to click the element
	 * @param driver
	 * @param element
	 */
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
	
	public void toEnterValueToTheElement(WebDriver driver,WebElement element,String text)
	{
		try 
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
	//		js.executeScript("document.getElementById('value').value='text'");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	 
	
}
