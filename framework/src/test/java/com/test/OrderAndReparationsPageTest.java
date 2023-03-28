package com.test;

import org.openqa.selenium.WebDriver;
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
		//	wait.forImplicitWait(driver, 5);
			home=login.login("admin@admin.com", "password");
			reparationpp=home.navigateToOrderAndReparationsPage();
		}
@Test(enabled=false,priority=1)
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

@Test(enabled=true,priority=2)
public void validateUpdateStatusFunctionalityInReparationsTable() throws InterruptedException
{
	SoftAssert soft=new SoftAssert();
//	wait.forExplicitWait(driver, statuscolumnrowone, 20);
	reparationpp.toClickOnStatusColumnRowOne();	
	soft.assertTrue(reparationpp.isUpdateStatusPopupHeaderDisplayed(), "Failure message:Update status popup header not displayed");
	//reparationpp.toGetTheReparationCodeInUpdateStatusPopup();
	reparationpp.toSelectStatusInUpdateStatusPopup("Delivered");
	reparationpp.toClickOnUpdateStatusButtonInUpdateStatusPopup();
	soft.assertAll();
	
}
{
	
}
}
