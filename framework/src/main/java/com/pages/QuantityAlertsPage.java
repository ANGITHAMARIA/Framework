package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuantityAlertsPage {

	@FindBy(xpath="//label[text()='Show ']")
	WebElement showdropdown;
	
	@FindBy(xpath="//label[text()='Search']")
	WebElement searchbox;
	
	@FindBy(xpath="//table[@id='dynamic-table']")
	WebElement table;
	
	@FindBy(xpath="//div[@class='dataTables_info']")
	WebElement paginationelement;
	
	//@FindBy()
}
