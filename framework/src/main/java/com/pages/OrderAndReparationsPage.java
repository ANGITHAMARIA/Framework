package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.GenericUtils;
import com.utilities.WebActionUtils;

public class OrderAndReparationsPage {

	WebDriver driver;
	WebActionUtils webaction=new WebActionUtils();
	GenericUtils gen=new GenericUtils();
	
	@FindBy(xpath="//h1[text()='Order & Reparations']")
	WebElement pageheader;
	
	@FindBy(xpath="//div[@class='box-header with-border']")
	WebElement filterresultfield;
	
	@FindBy(xpath="//button[@class='add_reparation btn btn-primary']")
	WebElement addreparationbtn;
	
	@FindBy(xpath="//label[text()='Show ']")
	WebElement showbtn;
	
	@FindBy(xpath="(//button[@class='dt-button buttons-collection buttons-colvis'])[1]")
	WebElement columnvisibilitybtn;
	
	@FindBy(xpath="(//table[@class='display compact table table-bordered table-striped dataTable'])[1]")
	WebElement orderandreparationstable;
	
	@FindBy(xpath="//input[@class='form-control input-sm input-xs']")
	WebElement searchtxtbox;
	
	@FindBy(xpath="//i[@class='fa fa-file-pdf']")
	WebElement downloadpdficon;
	
	@FindBy(xpath="//i[@class='fa fa-file-excel']")
	WebElement downloadexcelicon;
	
	@FindBy(xpath="//a[text()='Pending Repairs']")
	WebElement pendingrepairstab;
	
	@FindBy(xpath="//a[text()='Completed Repairs']")
	WebElement completedrepairstab;
	
	@FindBy(xpath="//div[@class='dataTables_info']")
	WebElement paginationinreparationstable;
	
	@FindBy(xpath="//h4[text()='Update Status']")
	WebElement statuscolumnrowone;
	
	@FindBy(xpath="(//h4[@class='modal-title'])[9]")
	WebElement updatestatuspopupheader;
	
	@FindBy(xpath="(//table[@class='table table-condensed table-striped table-borderless']//tr//td)[2]")
	WebElement referencenoinupdatestatuspopup;
	
	@FindBy(xpath="//select[@class='form-control']")
	WebElement statustextboxinupdatestatuspopup;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement updatebtninupdatestatuspopup;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement updatestatussuccessmsg;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement updatestatussuccessmsgclosebtn;
		
	public OrderAndReparationsPage(WebDriver  driver) //constructor of home page
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialize the above mentioned elements
	}
	
	public boolean isHeaderDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, pageheader);
	}
	
	public boolean isFilterResultFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, filterresultfield);
	}
	
	public boolean isAddReparationButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addreparationbtn);
	}
	
	public boolean isShowButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, showbtn);
	}
	
	public boolean isColumnVisibilityButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, columnvisibilitybtn);
	}
	
	public boolean isOrderAndReparationsTableDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, orderandreparationstable);
	}
	
	public boolean isSearchTextBoxDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, searchtxtbox);
	}
	
	public boolean isDownloadPdfIconDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, downloadpdficon);
	}
	
	public void toClickOnDownloadpdfIcon()
	{
		webaction.clickOnTheElement(driver, downloadpdficon);
	}
	
	public boolean isDownloadpdfIconEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, downloadpdficon);
	}
	
	public boolean isDownloadExcelIconDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, downloadexcelicon);
	}
	
	public void toClickOnDownloadExcelIcon()
	{
		webaction.clickOnTheElement(driver, downloadexcelicon);
	}
	
	public boolean isDownloadExcelIconEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, downloadexcelicon);
	}
	
	public boolean isPendingRepairsTabDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, pendingrepairstab);
	}
	
	public boolean isCompletedRepairsTabDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, completedrepairstab);
	}
	
	public boolean isPaginationDisplayedInReparationsTable()
	{
		return webaction.CheckElementIsDisplayed(driver, paginationinreparationstable);
	}
	
	public void toClickOnStatusColumnRowOne()
	{
		webaction.clickOnTheElement(driver, statuscolumnrowone);
	}
	
	public boolean isUpdateStatusPopupHeaderDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, updatestatuspopupheader);
	}
	
	public void toSelectStatusInUpdateStatusPopup(String status)
	{
		gen.selectByVisibleText(driver, statustextboxinupdatestatuspopup, status);
	}
	
	public void toClickOnUpdateStatusButtonInUpdateStatusPopup()
	{
		webaction.clickOnTheElement(driver, updatebtninupdatestatuspopup);
	}
	
	public String toGetTheReparationCodeInUpdateStatusPopup()
	{
		String reparationcode=webaction.getTheElementText(driver, referencenoinupdatestatuspopup);
		return reparationcode;
	}
	
	public void isUpdateStatusSuccessPopupDisplayed()
	{
		webaction.CheckElementIsDisplayed(driver, updatestatussuccessmsg);
	}
	
	public void toCloseUpdateStatusSuccessPopupMsg()
	{
		webaction.clickOnTheElement(driver, updatestatussuccessmsgclosebtn);
	}
}
