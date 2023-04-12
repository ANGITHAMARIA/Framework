package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OrderAndReparationsPage;
import com.pages.QuantityAlertsPage;
import com.utilities.WaitUtil;
import com.utilities.WebBrowserUtils;

public class OrderAndReparationsPageTest extends AutomationBase {

	WebDriver driver;
	LoginPage login;
	HomePage home;
	WebBrowserUtils webbrowser;
	OrderAndReparationsPage reparationpp;	
	WaitUtil wait=new WaitUtil();
		@BeforeMethod
		public void preRun() throws Exception
		{
			driver=getDriver();
			login=new LoginPage(driver);
			webbrowser=new WebBrowserUtils();
			home=new HomePage(driver);
			webbrowser.launchUrl(driver,"https://qalegend.com/mobile_service/panel/login");
			wait.forImplicitWait(driver,7);
			home=login.login("admin@admin.com", "password");
			reparationpp=home.navigateToOrderAndReparationsPage();
		}
@Test(enabled=true,priority=1)
public void validateOrderAndReparationsPageFields()
{
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(reparationpp.isHeaderDisplayed(),"Failure message:Header not displayed");
	soft.assertTrue(reparationpp.isFilterResultFieldDisplayed(), "Failure message:Filter Results field not displayed");
	soft.assertTrue(reparationpp.isAddReparationButtonDisplayed(), "Failure message:Add Reparation button not displayed");
	soft.assertTrue(reparationpp.isShowButtonDisplayed(), "Failure message:Show dropdown not displayed");
	soft.assertTrue(reparationpp.isColumnVisibilityButtonDisplayed(), "Failure message:Column Visibility Button not displayed");
	soft.assertTrue(reparationpp.isOrderAndReparationsTableDisplayed(), "Failure message:Order and Reparations table not displayed");
	soft.assertTrue(reparationpp.isSearchTextBoxDisplayed(), "Failure message:Search textbox not displayed");
	soft.assertTrue(reparationpp.isDownloadPdfIconDisplayed(), "Failure message:Download PDF icon not displayed");
	soft.assertTrue(reparationpp.isDownloadExcelIconDisplayed(), "Failure message:Download Excel icon not displayed");
	soft.assertTrue(reparationpp.isPendingRepairsTabDisplayed(), "Failure message:Pending Repairs tab not displayed");
	soft.assertTrue(reparationpp.isCompletedRepairsTabDisplayed(), "Failure message:Completed Repairs tab not displayed");
	soft.assertTrue(reparationpp.isPaginationDisplayedInReparationsTable(), "Failure message:Pagination not displayed");
	reparationpp.toClickOnDownloadpdfIcon();
	soft.assertTrue(reparationpp.isDownloadpdfIconEnabled(), "Failure message:Download PDF icon not clicked");
	reparationpp.toClickOnDownloadExcelIcon();
	soft.assertTrue(reparationpp.isDownloadExcelIconEnabled(), "Failure message:Download Excel icon not clicked");
	soft.assertAll();
}

@Test(enabled=false,priority=2)
public void validateUpdateStatusFunctionalityInReparationsTable()
{
	String reparationcode="WkT9kG";
	String statustobeupdated="Job done! ready to deliver";
	SoftAssert soft=new SoftAssert();
//	wait.waitForClickabilityofElement(driver, reparationpp.searchtxtbox, 5);
	reparationpp.toSearchByReparationCode(reparationcode);
	//wait.waitForTextofElement(driver, reparationpp.reparationcoderowone, 5, "7QHHP2");
	wait.waitForTheInVisibilityOfElement(driver, reparationpp.loader, 5);
	System.out.println("Status before update: "+reparationpp.toGetTheCurrentStatus());
	reparationpp.toClickOnStatusColumnRowOne();	
	soft.assertTrue(reparationpp.isUpdateStatusPopupHeaderDisplayed(), "Failure message:Update status popup header not displayed");
	reparationpp.toSelectStatusInUpdateStatusPopup(statustobeupdated);
	reparationpp.toClickOnUpdateStatusButtonInUpdateStatusPopup();
	soft.assertTrue(reparationpp.isUpdateStatusSuccessPopupDisplayed(), "Failure message:Unable to update status");
//	wait.waitForClickabilityofElement(driver, reparationpp.searchtxtbox, 5);
	reparationpp.toSearchByReparationCode(reparationcode);
	wait.waitForTheInVisibilityOfElement(driver, reparationpp.loader, 5);
	System.out.println("New Status:"+reparationpp.toGetTheCurrentStatus());
	soft.assertEquals(reparationpp.toGetTheCurrentStatus(),statustobeupdated,"Failure message:Status not updated properly");	
	soft.assertAll();	
}

@Test(enabled=false,priority=3)
public void validateFilterResultFunctionalityInReparationTable()
{
	SoftAssert soft=new SoftAssert();
	reparationpp.toClickOnPlusIconForFilterResult();	
	reparationpp.toEnterTimePeriodValueInFilterResult("01-28-2023-03-28-2023");
	reparationpp.toEnterмаркаValueInFilterResult("Denim");
	soft.assertTrue(reparationpp.isмаркаFieldSelected(), "Failure message:марка detail not selected");
	reparationpp.toEnterWarrantyDetailInFilterResult("In Warranty");
	soft.assertTrue(reparationpp.isWarrantyDetailsSelected(), "Failure message:Warranty detail not selected");
	reparationpp.toEnterStatusDetailInFilterResult("In Progress");
	soft.assertTrue(reparationpp.isStatusDetailSelected(), "Failure message:Status detail not selected");
	reparationpp.toClickOnFilterResultButton();
	soft.assertTrue(reparationpp.isFilterResultButtonEnabled(), "Failure message:Filter result not displayed");
	soft.assertAll();
}

@Test(enabled=false,priority=4)
public void validateAddNewReparationFunctionalityInReparationTable()
{
	SoftAssert soft=new SoftAssert();
	reparationpp.toClickOnAddReparationTab();
	//soft.assertTrue(reparationpp.isAddreparationHeaderDisplayed(), "Failure message:Add reparation popup not displayed");
	soft.assertTrue(reparationpp.isImeiFieldDisplayed(), "Failure message:IMEI field not displayed");
	soft.assertTrue(reparationpp.isClientFieldDisplayed(), "Failure message:Client field not displayed");
	soft.assertTrue(reparationpp.isCategoryFieldDisplayed(), "Failure message:Category field not displayed");
	soft.assertTrue(reparationpp.isTaxRateFieldDisplayed(), "Failure message:Tax Rate field not displayed");
	soft.assertTrue(reparationpp.isAssignedToFieldDisplayed(), "Failure message:Assigned To field not displayed");
	soft.assertTrue(reparationpp.isManufacturerFieldDisplayed(), "Failure message:Manufacturer field not displayed");
	soft.assertTrue(reparationpp.isModelFieldDisplayed(), "Failure message:Model field not displayed");
	soft.assertTrue(reparationpp.isAddItemFieldDisplayed(), "Failure message:Add Item field not displayed");
	soft.assertTrue(reparationpp.isDefectFieldDisplayed(), "Failure message:Defect field not displayed");
	soft.assertTrue(reparationpp.isErrorCodeFieldDisplayed(), "Failure message:Error code field not displayed");
	soft.assertTrue(reparationpp.isServiceChargesFieldDisplayed(), "Failure message:Service Charges field not displayed");
	soft.assertTrue(reparationpp.isExpectedCloseDateFieldDisplayed(), "Failure message:Expected close date field not displayed");
	soft.assertTrue(reparationpp.isPurchaseDateFieldDisplayed(),"Failure message:Purchase Date field not displayed");
	soft.assertTrue(reparationpp.isHasWarrantyFieldDisplayed(), "Failure message:Has Warranty field not displayed");
	soft.assertTrue(reparationpp.isWarrantyFieldDisplayed(), "Failure message:Warranty field not displayed");
	soft.assertTrue(reparationpp.isWarrantyCardNumberFieldDisplayed(), "Failure message:Warranty card number field not displayed");
	soft.assertTrue(reparationpp.isRepairTypeFieldDisplayed(), "Failure message:Repair Type field not displayed");
	soft.assertTrue(reparationpp.isClientReceiveDateFieldDisplayed(), "Failure message:Client Receive date field not displayed");
	reparationpp.toClickOnImeiField();
	reparationpp.toEnterValueToImeiField("TestIMEI9");
	reparationpp.toClickOnClientField();
	reparationpp.toEnterValueToClientField("kiran1 kmn - k");
	reparationpp.toClickOnCategoryField();
	reparationpp.toEnterValueToCategoryField("laptop");
	reparationpp.toClickOnTaxRateField();
	reparationpp.toEnterValueToTaxRateField("VAT");
	reparationpp.toClickOnAssignedToField();
	reparationpp.toEnterValueToAssignedToField("Joe Jacobs");
	reparationpp.toClickOnManufacturerField();
	reparationpp.toEnterValueToManufacturerField("Apple");
	reparationpp.toClickOnModelField();
	reparationpp.toEnterValueToModelField("NoteBook 15");
	reparationpp.toClickOnAddItemField();
	reparationpp.toEnterValueToAddItemField("laptop");
	reparationpp.toClickOnDefectField();
	reparationpp.toEnterValueToDefectField("Display issue");
	reparationpp.toClickOnErrorCodeField();
	reparationpp.toEnterValueToErroCodeField("203873 - Laptop not working");
	reparationpp.toClickOnServiceChargesField();
	reparationpp.toEnterValueToServiceChargesField("100");
	reparationpp.toClickOnExpectedCloseDateField();
	reparationpp.toEnterValueToExpectedCloseDateField("04-19-2023");
	reparationpp.toClickOnPurchaseDateField();
	reparationpp.toEnterValueToPurchaseDateField("11-23-2022");
	reparationpp.toClickOnHasWarrantyField();
	reparationpp.toEnterValueToHasWarrantyField("In Warranty");
	reparationpp.toClickOnWarrantyField();
	reparationpp.toEnterValueToWarrantyField("4 Month");
	reparationpp.toClickOnWarrantyCardNumberField();
	reparationpp.toEnterValueToWarrantyCardNumberField("W5684652");
	reparationpp.toClickOnRepairTypeField();
	reparationpp.toEnterValueToRepairTypeField("Display");
	reparationpp.toClickOnClientReceiveDateField();
	reparationpp.toEnterValueToClientReceiveDateField("04-26-2023");
	String reparationcode=reparationpp.toGetTheReparationCodeInAddReparationPopup();
	System.out.println("Reparationcode is : "+reparationcode);
	reparationpp.toClickOnAddReparationbtnInAddReparationPopup();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	reparationpp.toHandlePrintInvoiceWindow();	
	String newreparationcode=reparationpp.toGetNewReparationCode();
	System.out.println("New reparation code is: "+newreparationcode);
	reparationpp.toCloseNewReparationAddedWindow();	
	reparationpp.toSearchByReparationCode(newreparationcode);	
	System.out.println("no of rows: " +reparationpp.toCalculateRowCountOfTable());
	soft.assertAll();
}

@Test(enabled=false,priority=5)
public void validateColumnVisibilityFunctionalityInReparationTable()
{
	SoftAssert soft=new SoftAssert();
	reparationpp.toClickOnColumnVisibilityBtn();
	reparationpp.toClikOnCreatedByFieldInColumnVisibilityTab();
	reparationpp.toClickOnlastModifiedFieldInColumnVisibilityTab();
	reparationpp.toClickOnColumnVisibilityBackground();
//	soft.assertEquals(reparationpp.toSearchAHeaderInReparationTable("Created By"), "false");
//	soft.assertEquals(reparationpp.toSearchAHeaderInReparationTable("Last Modified"),"false");
	reparationpp.toClickOnColumnVisibilityBtn();
	reparationpp.toClikOnCreatedByFieldInColumnVisibilityTab();
	reparationpp.toClickOnColumnVisibilityBackground();
	reparationpp.toClickOnPendingRepairsTab();
	reparationpp.toClickOnCompletedRepairsTab();
	soft.assertAll();
}
@Test(enabled=false,priority=6)
public void validateViewAndAddPaymentFunctionalityInReparationTable()
{
	SoftAssert soft=new SoftAssert();
	reparationpp.toSearchByReparationCode("DALGPA");
	wait.waitForTheInVisibilityOfElement(driver, reparationpp.loader, 5);
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnViewPaymentInActionDropdown();
	//soft.assertTrue(reparationpp.isViewPaymentHeaderDisplayed(),"Failure message:View payment header not displayed");
	reparationpp.toClickOnEditBtnInViewPaymentInActionDropdown();
	soft.assertTrue(reparationpp.isPaymentStatusisAlreadyPaidAlertMsgDisplayed(),"Failure message:Payment status is already paid message not displayed");
	reparationpp.toClickOnPaymentStatusisAlreadyPaidAlertMsgCloseBtn();
	reparationpp.toSearchByReparationCode("591GPA");
	wait.waitForTheInVisibilityOfElement(driver, reparationpp.loader, 5);
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnViewPaymentInActionDropdown();
	reparationpp.toClickOnDeleteBtnInViewPaymentInActionDropdown();
	reparationpp.toClickOnConfirmDeleteBtnInViewPaymentInActionDropdown();
	soft.assertTrue(reparationpp.isPaymentDeletedSuccessPopupMsgDisplayed(),"Failure message:Payment deleted success popup not displayed");
	reparationpp.toSearchByReparationCode("591GPA");
	wait.waitForTheInVisibilityOfElement(driver, reparationpp.loader, 5);
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnAddPaymentOptn();
	soft.assertTrue(reparationpp.isAddPaymentHeaderDisplayed(),"Failure message:Add payment header not displayed");
	reparationpp.toClearDateFieldValueInAddPayment();
	reparationpp.toEnterValueToDateFieldInAddPayment("2023-04-05 10:20");
	reparationpp.toClearAmountinAddPayment();
	reparationpp.toEnterAmountInAddPayment("30");
	reparationpp.toEnterPayingByOptnInAddPayment("Other");
	reparationpp.toEnterNoteInAddPayment("paid");
	reparationpp.toClickOnAddPaymentBtnInAddPayment();
	soft.assertTrue(reparationpp.isPaymentAddedSuccessMsgDisplayed(),"Failure message:Payment added success message not displayed");
	reparationpp.toClickOnPaymentAddedSuccessMsgCloseBtn();
	soft.assertAll();
}

@Test(enabled=false,priority=7)
public void validateAddAttachmentFunctionalityInReparationsTable()
{
	SoftAssert soft=new SoftAssert();
	reparationpp.toSearchByReparationCode("YH3W8V");
	wait.waitForTheInVisibilityOfElement(driver, reparationpp.loader, 5);
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnViewAttachmentOption();
	soft.assertTrue(reparationpp.isViewAttachmentHeaderDisplayed(), "Failure message:View Attachments header not displayed");
//	reparationpp.toClickOnBrowseBtnInViewAttachment();
	//to handle file input using robot class;
//	reparationpp.toClickOnUploadBtnInViewAttachment();
//	soft.assertTrue(reparationpp.isDoneSuccessMsgDisplayedInViewAttachment(), "Failure message:File upload success message not displayed");
//	reparationpp.toClickOnCloseBtnInViewAttachment();
//	reparationpp.toClickOnActionDropdownOptn();
//	reparationpp.toClickOnViewAttachmentOption();
	soft.assertTrue(reparationpp.isViewDetailButtoninViewAttachmentDisplayed(),"Failure message:File selected message not displayed");
	soft.assertAll();
}

@Test(enabled=false,priority=8)
public void validateInvoiceAndPrintBarcodeFunctionalityInReparationsTable()
{
	SoftAssert soft=new SoftAssert();
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnInvoiceOptionInActionDropDown();
	//come back to main window
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnEmailInvoiceOptionInActionDropDown();
	reparationpp.toClearValueInEmailAddressTxtBoxInEmailInvoice();
	reparationpp.toEnterValueInEmailAddressTxtBoxInEmailInvoice("test@test.com");
	reparationpp.toClickOkBtnInEmailInvoice();
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnViewLogOptionInActionDropdown();
	soft.assertTrue(reparationpp.isViewLogHeaderDisplayed(),"Failure message:View Log header not displayed");
	reparationpp.toNavigateBackToOrderAndReparationsPage();
	reparationpp.toClickOnActionDropdownOptn();
	reparationpp.toClickOnPrintBarcodeOptionInActionDropdown();
	soft.assertTrue(reparationpp.isPrintBarcodeHeaderDisplayed(),"Failure message:View Log header not displayed");
	reparationpp.toClickOnUpdateBtnInPrintBarcodePage();
	reparationpp.toClickOnPrintBtnInPrintBarcodePage();
	soft.assertAll();
}
}

