package com.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//button[@class='btn btn-box-tool']")
	WebElement plusicon;
	
	@FindBy(xpath="//button[text()=' Add Reparation            ']")
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
	
	@FindBy(xpath="(//span[@class='row_status label'])[1]")
	WebElement statuscolumnrowone;
	
	@FindBy(xpath="//h4[text()='Update Status']")
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
	
	@FindBy(xpath="//input[@name='date']")
	WebElement timeperiodtxtbxinfilterresult;
	
	@FindBy(xpath="//li[text()='Custom Range']")
	WebElement customrangeoptnindatepicker;
	
	@FindBy(xpath="//input[@name='daterangepicker_start']")
	WebElement datepickerstartdate;
	
	@FindBy(xpath="//input[@name='daterangepicker_end']")
	WebElement datepickerenddate;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement applybtn;
	
	@FindBy(xpath="//select[@name='manufacturer']")
	WebElement маркаinfilterresult;
	
	@FindBy(xpath="//select[@name='has_warranty']")
	WebElement haswarrantyfieldinfilterresult;
	
	@FindBy(xpath="//select[@name='status']")
	WebElement statusinfilterresult;
	
	@FindBy(xpath="//input[@class='btn btn-primary input-xs']")
	WebElement filterresultbtn;
	
	@FindBy(xpath="//h4[@id='titReparation']")
	WebElement addreparationheader;
	
	@FindBy(xpath="//input[@id='imei']")
	WebElement imeifield;
	
	@FindBy(xpath="//select[@id='client_name']")
	WebElement clientfield;
	
	@FindBy(xpath="//input[@id='category']")
	WebElement categoryfield;
	
	@FindBy(xpath="//select[@id='potax2']")
	WebElement taxrate;
	
	@FindBy(xpath="//select[@id='assigned_to']")
	WebElement assignedtofield;
	
	@FindBy(xpath="//input[@id='reparation_manufacturer']")
	WebElement manufacturerfield;
	
	@FindBy(xpath="//input[@id='reparation_model']")
	WebElement modelfield;
	
	@FindBy(xpath="//input[@id='defect']")
	WebElement defectfield;
	
	@FindBy(xpath="//select[@id='error_code']")
	WebElement errorcodefield;
	
	@FindBy(xpath="//input[@id='service_charges']")
	WebElement servicechargesfield;
	
	@FindBy(xpath="//input[@id='expected_close_date']")
	WebElement expectedclosedatefield;
	
	@FindBy(xpath="//input[@id='date_of_purchase']")
	WebElement purchasedatefield;
	
	@FindBy(xpath="//select[@id='has_warranty']")
	WebElement haswarrantyfield;
	
	@FindBy(xpath="//select[@id='warranty']")
	WebElement warrantyfield;
	
	@FindBy(xpath="//input[@id='warranty_card_number']")
	WebElement warrantycardnumberfield;
	
	@FindBy(xpath="//input[@id='repair_type']")
	WebElement repairtypefield;
	
	@FindBy(xpath="//input[@id='client_date']")
	WebElement clientreceivedatefield;
	
	@FindBy(xpath="//input[@id='add_item']")
	WebElement additemfield;
	
	@FindBy(xpath="//button[@class='pull-left btn btn-default']")
	WebElement gobackbutton;
	
	@FindBy(xpath="//select[@id='status_edit']")
	WebElement statusdropdowninaddreparation;
	
	@FindBy(xpath="//input[@id='code']")
	WebElement reparationcodeinaddreparation;
	
	@FindBy(xpath="//span[@id='rv_rep_code']")
	WebElement reparationcode2inaddreparation;
	
	@FindBy(xpath="(//button[@class='close'])[1]")
	WebElement closebuttonofnewreparationpopup;
	
	@FindBy(xpath="//span[text()='Print']")
	WebElement printbtninprintinvoicetab;
	
	@FindBy(xpath="//button[@id='upload_modal_btn']")
	WebElement uploadpicturebutton;
	
	@FindBy(xpath="//label[text()='Send an automatic TXT?']")
	WebElement sendautomatictxtlabel;
	
	@FindBy(xpath="//label[text()='Send Email?']")
	WebElement sendemaillabel;
	
	@FindBy(xpath="//button[@id='sign_repair']")
	WebElement signrepairbutton;
	
	@FindBy(xpath="//button[@class='prerepair_show btn btn-primary']")
	WebElement prerepairchecklistbutton;
	
	@FindBy(xpath="//button[@id='repair_submit']")
	WebElement addreparationbtninaddreparationpopup;
	
	@FindBy(xpath="//table[@id='dynamic-table']//tr")
	WebElement tablerows;
	
	@FindBy(xpath="//div[@class='dt-button-background']")
	WebElement columnvisibiltybackground;
	
	@FindBy(xpath="//span[text()='Created By']")
	WebElement createdbyfieldincolumnvisibiltytab;

	@FindBy(xpath="//span[text()='Last Modified']")
	WebElement lastmodifiedfieldincolumnvisibiltytab;
	
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
	
	public void toSearchByReparationCode(String reparationcode)
	{
		webaction.enterTheValue(driver, searchtxtbox, reparationcode);
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
	
	public String toGetTheCurrentStatus()
	{
		String currstatus= webaction.getTheElementText(driver, statuscolumnrowone);
		return currstatus;
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
	
	public boolean isUpdateStatusSuccessPopupDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, updatestatussuccessmsg);
	}
	
	public void toCloseUpdateStatusSuccessPopupMsg()
	{
		webaction.clickOnTheElement(driver, updatestatussuccessmsgclosebtn);
	}
	
	public void toClickOnPlusIconForFilterResult()
	{
		webaction.clickOnTheElement(driver, plusicon);
	}
	
	public void toEnterTimePeriodValueInFilterResult(String text)
	{
//		webaction.clickOnTheElement(driver, timeperiodtxtbxinfilterresult);
//		webaction.clickOnTheElement(driver, customrangeoptnindatepicker);
//		webaction.enterTheValue(driver, datepickerstartdate, startdate);
//		webaction.enterTheValue(driver, datepickerenddate, enddate);
//		webaction.clickOnTheElement(driver, applybtn);
		webaction.clearTheElement(driver, timeperiodtxtbxinfilterresult);
		webaction.enterTheValue(driver, timeperiodtxtbxinfilterresult, text);
		webaction.clickOnTheElement(driver, applybtn);	
	}
	
	public void toEnterмаркаValueInFilterResult(String text)
	{
		gen.selectByVisibleText(driver, маркаinfilterresult, text);
	}
	
	public boolean isмаркаFieldSelected()
	{
		return webaction.CheckElementIsSelected(driver, маркаinfilterresult);
	}
	public void toEnterWarrantyDetailInFilterResult(String text)
	{
		gen.selectByVisibleText(driver, haswarrantyfieldinfilterresult, text);
	}
	
	public boolean isWarrantyDetailsSelected()
	{
		return webaction.CheckElementIsSelected(driver, haswarrantyfieldinfilterresult);
	}
	
	public void toEnterStatusDetailInFilterResult(String text)
	{
		gen.selectByVisibleText(driver, statusinfilterresult, text);
	}
	
	public boolean isStatusDetailSelected()
	{
		return webaction.CheckElementIsSelected(driver, statusinfilterresult);
	}
	public void toClickOnFilterResultButton()
	{
		webaction.clickOnTheElement(driver, filterresultbtn);
	}
	
	public boolean isFilterResultButtonEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, filterresultbtn);
	}
	
	public void toClickOnAddReparationTab()
	{
		webaction.clickOnTheElement(driver, addreparationbtn);
	}
	
	public boolean isAddreparationHeaderDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addreparationheader);
	}
	
	public void toClickOnImeiField()
	{
		webaction.clickOnTheElement(driver, imeifield);
	}
	
	public boolean isImeiFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, imeifield);
	}
	
	public void toEnterValueToImeiField(String value)
	{
		webaction.enterTheValue(driver, imeifield, value);
	}
	
	public void toClickOnClientField()
	{
		webaction.clickOnTheElement(driver, clientfield);
	}
	
	public boolean isClientFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, clientfield);
	}
	
	public void toEnterValueToClientField(String text)
	{
		gen.selectByVisibleText(driver, clientfield, text);
	}
	
	public void toClickOnCategoryField()
	{
		webaction.clickOnTheElement(driver, categoryfield);
	}
	
	public boolean isCategoryFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, categoryfield);
	}
	
	public void toEnterValueToCategoryField(String value)
	{
		webaction.enterTheValue(driver, categoryfield, value);
	}
	
	public void toClickOnTaxRateField()
	{
		webaction.clickOnTheElement(driver, taxrate);
	}
	
	public boolean isTaxRateFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, taxrate);
	}
	
	public void toEnterValueToTaxRateField(String text)
	{
		gen.selectByVisibleText(driver, taxrate, text);
	}
	
	public void toClickOnAssignedToField()
	{
		webaction.clickOnTheElement(driver, assignedtofield);
	}
	
	public boolean isAssignedToFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, assignedtofield);
	}
	
	public void toEnterValueToAssignedToField(String text)
	{
		gen.selectByVisibleText(driver, assignedtofield, text);
	}
	
	public void toClickOnManufacturerField()
	{
		webaction.clickOnTheElement(driver, manufacturerfield);
	}
	
	public boolean isManufacturerFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, manufacturerfield);
	}
	
	public void toEnterValueToManufacturerField(String value)
	{
		webaction.enterTheValue(driver, manufacturerfield, value);
	}
	
	public void toClickOnModelField()
	{
		webaction.clickOnTheElement(driver, modelfield);
	}
	public boolean isModelFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, modelfield);
	}
	
	public void toEnterValueToModelField(String value)
	{
		webaction.enterTheValue(driver, modelfield, value);
	}
	
	public void toClickOnDefectField()
	{
		webaction.clickOnTheElement(driver, defectfield);
	}
	
	public boolean isDefectFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, defectfield);
	}
	
	public void toEnterValueToDefectField(String value)
	{
		webaction.enterTheValue(driver, defectfield, value);
	}
	
	public void toClickOnErrorCodeField()
	{
		webaction.clickOnTheElement(driver, errorcodefield);
	}
	public boolean isErrorCodeFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, errorcodefield);
	}
	
	public void toEnterValueToErroCodeField(String text)
	{
		gen.selectByVisibleText(driver, errorcodefield, text);
	}
	
	public void toClickOnServiceChargesField()
	{
		webaction.clickOnTheElement(driver, servicechargesfield);
	}
	public boolean isServiceChargesFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, servicechargesfield);
	}
	
	public void toEnterValueToServiceChargesField(String value)
	{
		webaction.enterTheValue(driver, servicechargesfield, value);
	}
	
	public void toClickOnExpectedCloseDateField()
	{
		webaction.clickOnTheElement(driver, expectedclosedatefield);
	}
	public boolean isExpectedCloseDateFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, expectedclosedatefield);
	}
	
	public void toEnterValueToExpectedCloseDateField(String value)
	{
		webaction.enterTheValue(driver, expectedclosedatefield, value);
	}
	
	public void toClickOnPurchaseDateField()
	{
		webaction.clickOnTheElement(driver, purchasedatefield);
	}
	public boolean isPurchaseDateFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, purchasedatefield);
	}
	
	public void toEnterValueToPurchaseDateField(String value)
	{
		webaction.enterTheValue(driver, purchasedatefield, value);
	}
	
	public void toClickOnHasWarrantyField()
	{
		webaction.clickOnTheElement(driver, haswarrantyfield);
	}
	
	public boolean isHasWarrantyFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, haswarrantyfield);
	}
	
	public void toEnterValueToHasWarrantyField(String text)
	{
		gen.selectByVisibleText(driver, haswarrantyfield, text);
	}
	
	public void toClickOnWarrantyField()
	{
		webaction.clickOnTheElement(driver, warrantyfield);
	}
	
	public boolean isWarrantyFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, warrantyfield);
	}
	
	public void toEnterValueToWarrantyField(String text)
	{
		gen.selectByVisibleText(driver, warrantyfield, text);
	}
	
	public void toClickOnWarrantyCardNumberField()
	{
		webaction.clickOnTheElement(driver, warrantycardnumberfield);
	}
	public boolean isWarrantyCardNumberFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, warrantycardnumberfield);
	}
	
	public void toEnterValueToWarrantyCardNumberField(String value)
	{
		webaction.enterTheValue(driver, warrantycardnumberfield, value);
	}
	
	public void toClickOnRepairTypeField()
	{
		webaction.clickOnTheElement(driver, repairtypefield);
	}
	public boolean isRepairTypeFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, repairtypefield);
	}
	
	public void toEnterValueToRepairTypeField(String value)
	{
		webaction.enterTheValue(driver, repairtypefield, value);
	}
	
	public void toClickOnClientReceiveDateField()
	{
		webaction.clickOnTheElement(driver, clientreceivedatefield);
	}
	
	public boolean isClientReceiveDateFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, clientreceivedatefield);
	}
	
	public void toEnterValueToClientReceiveDateField(String value)
	{
		webaction.enterTheValue(driver, clientreceivedatefield, value);
	}
	
	public void toClickOnAddItemField()
	{
		webaction.clickOnTheElement(driver, additemfield);
	}
	
	public boolean isAddItemFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, additemfield);
	}
	
	public void toEnterValueToAddItemField(String value)
	{
		webaction.enterTheValue(driver, additemfield, value);
	}
	
	public boolean isGoBackButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, gobackbutton);
	}
	
	public boolean isStatusDropdownInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, statusdropdowninaddreparation);
	}

	public boolean isReparationCodeInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, reparationcodeinaddreparation);
	}
	
	public String toGetTheReparationCodeInAddReparationPopup()
	{
		return webaction.getTheElementText(driver, reparationcodeinaddreparation);
	}
	
	public boolean isUploadPictureButtonInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, uploadpicturebutton);
	}
	
	public boolean isSendAutomaticTxtLabelInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, sendautomatictxtlabel);
	}
	
	public boolean isSendEmailLabelInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, sendemaillabel);
	}
	
	public boolean isSignRepairButtonInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, signrepairbutton);
	}
	 
	public boolean isPreRepairChecklistButtonInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, prerepairchecklistbutton);
	}
	
	public boolean isAddReparationButtonInAddReparationDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addreparationbtninaddreparationpopup);
	}
	
	public void toClickOnAddReparationbtnInAddReparationPopup()
	{
		webaction.clickOnTheElement(driver, addreparationbtninaddreparationpopup);
	}
	
	public void toHandlePrintInvoiceWindow()
	{
		String parent=driver.getWindowHandle();
		Set <String> windows=driver.getWindowHandles();
		for(String temp:windows)
		{
			if(!temp.equals(parent))
			{
			driver.switchTo().window(temp);
			webaction.clickOnTheElement(driver, printbtninprintinvoicetab);
			}
		}
		driver.switchTo().window(parent);
	}
	
	public String toGetNewReparationCode()
	{
		return webaction.getTheElementText(driver, reparationcode2inaddreparation);
	}
	
	public void toCloseNewReparationAddedWindow()
	{
		webaction.clickOnTheElement(driver, closebuttonofnewreparationpopup);
	}
	
	public int toCalculateRowCountOfTable()
	{
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='dynamic-table']//tr"));
		int noofrows=rows.size();
		return noofrows;
	}

	public void toClickOnColumnVisibilityBtn()
	{
		webaction.clickOnTheElement(driver, columnvisibilitybtn);
	}
	
	public void toClikOnCreatedByFieldInColumnVisibilityTab()
	{
		webaction.clickOnTheElement(driver, createdbyfieldincolumnvisibiltytab);
	}
	
	public void toClickOnlastModifiedFieldInColumnVisibilityTab()
	{
		webaction.clickOnTheElement(driver,lastmodifiedfieldincolumnvisibiltytab);
	}
	
	public void toClickOnColumnVisibilityBackground()
	{
		webaction.clickOnTheElement(driver, columnvisibiltybackground);
	}
	
}
