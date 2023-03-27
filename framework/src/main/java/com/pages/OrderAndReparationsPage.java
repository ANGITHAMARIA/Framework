package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderAndReparationsPage {

	WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Order & Reparations']")
	WebElement pageheader;
	
	@FindBy(xpath="//div[@class='box-header with-border']")
	WebElement filterresultfield;
	
	@FindBy(xpath="//button[@class='add_reparation btn btn-primary']")
	WebElement addreparationbtn;
	
	@FindBy(xpath="//label[text()='Show ']")
	WebElement showoption;
	
	@FindBy(xpath="(//button[@class='dt-button buttons-collection buttons-colvis'])[1]")
	WebElement columnvisibilitybtn;
	
	@FindBy(xpath="(//table[@class='display compact table table-bordered table-striped dataTable'])[1]")
	WebElement orderandreparationstable;
	
//	@FindBy(xpath="")
	//WebElement 
	
	
}
