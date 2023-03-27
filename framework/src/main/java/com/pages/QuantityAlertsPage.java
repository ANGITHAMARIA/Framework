package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WebActionUtils;

public class QuantityAlertsPage {
	
	WebDriver driver;
	WebActionUtils webaction=new WebActionUtils();

	@FindBy(xpath="//label[text()='Show ']")
	WebElement showdropdown;
	
	@FindBy(xpath="//label[text()='Search']")
	WebElement searchbox;
	
	@FindBy(xpath="//table[@id='dynamic-table']")
	WebElement table;
	
	@FindBy(xpath="//div[@class='dataTables_info']")
	WebElement paginationelement;
	
	@FindBy(xpath="//th[@class='sorting_desc']")
	WebElement productnamefield;
	
	@FindBy(xpath="(//th[@class='sorting'])[1]")
	WebElement productcodefield;
	
	@FindBy(xpath="(//th[@class='sorting'])[2]")
	WebElement quantityfield;
	
	@FindBy(xpath="(//th[@class='sorting'])[3]")
	WebElement alertquantityfield;

	public QuantityAlertsPage(WebDriver  driver) //constructor of login page
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialize the above mentioned elements
	}

	public boolean isShowDropDownDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, showdropdown);
	}
	
	public boolean isSearchBoxDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, searchbox);
	}
	
	public boolean isTableDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, table);
	}
	
	public boolean isPaginationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, paginationelement);
	}
	
	public boolean isProductNameFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productnamefield);
	}
	
	public boolean isProductCodeFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productcodefield);
	}
	
	public boolean isQuantityFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, quantityfield);
	}
	
	public boolean isAlertQuantityFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, alertquantityfield);
	}
}
