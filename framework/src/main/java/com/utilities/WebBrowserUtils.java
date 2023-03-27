package com.utilities;

import org.openqa.selenium.WebDriver;

public class WebBrowserUtils {

	
	/**
	 * This method is for launching the given URL
	 * @param driver
	 * @param url
	 */
	
	public void launchUrl(WebDriver driver,String url)
	{
		try 
		{
			driver.get(url);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is to get the title of a web page.
	 * @param driver
	 * @return
	 */
	public String getTheWebpageTitle(WebDriver driver)
	{
		String title=null;
		try 
		{
			title=driver.getTitle();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return title;
	}
	
	/**
	 * This method is to get the current url. 
	 * @param driver
	 * @return
	 */
	public String getTheCurrentUrl(WebDriver driver)
	{
		String currenturl=null;
		try 
		{
			currenturl=driver.getCurrentUrl();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return currenturl;
	}
	
	/**
	 * This method is to get the sourcecode of the page.
	 * @param driver
	 * @return
	 */
	public String getPageSource(WebDriver driver)
	{
		String pagesource=null;
		try 
		{
			pagesource=driver.getPageSource();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return pagesource;
	}
	
	public void navigateToUrl(WebDriver driver,String url)
	{
		try 
		{
			driver.navigate().to(url);;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	public void navigateForward(WebDriver driver)
	{
		try 
		{
			driver.navigate().forward();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	public void navigateBack(WebDriver driver)
	{
		try 
		{
			driver.navigate().back();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	public void refreshPage(WebDriver driver)
	{
		try 
		{
			driver.navigate().refresh();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public void browserMaximize(WebDriver driver)
	{
		try 
		{
			driver.manage().window().maximize();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public void browserMinimize(WebDriver driver)
	{
		try 
		{
			driver.manage().window().minimize();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public void fullScreenBrowser(WebDriver driver)
	{
		try 
		{
			driver.manage().window().fullscreen();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public void closeBrowser(WebDriver driver)
	{
		try 
		{
			driver.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
	
	public void quitDriver(WebDriver driver)
	{
		try 
		{
			driver.quit();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}	
	}
}
