package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.QuantityAlertsPage;
import com.utilities.WebBrowserUtils;

public class QuantityAlertsPageTest extends AutomationBase{

WebDriver driver;
LoginPage login;
HomePage home;
WebBrowserUtils webbrowser;
QuantityAlertsPage alertpp;	
	@BeforeMethod
	public void preRun() throws Exception
	{
		driver=getDriver();
		login=new LoginPage(driver);
		webbrowser=new WebBrowserUtils();
		home=new HomePage(driver);
		webbrowser.launchUrl(driver,"https://qalegend.com/mobile_service/panel/login");
		home=login.login("admin@admin.com", "password");
		alertpp=home.navigateToQuantityAlertsPage();
	}
	
@Test(enabled=true,priority=1)
public void validateQuantityAlertPageFields()
{
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(alertpp.isShowDropDownDisplayed(), "Failure message:Show dropdown not displayed");
	soft.assertTrue(alertpp.isSearchBoxDisplayed(), "Failure message:Search box not displayed");
	soft.assertTrue(alertpp.isTableDisplayed(), "Failure message:Table not displayed");
	soft.assertTrue(alertpp.isPaginationDisplayed(), "Failure message:Pagination not displayed");
	soft.assertTrue(alertpp.isProductNameFieldDisplayed(), "Failure message:Product name field not displayed in table");
	soft.assertTrue(alertpp.isProductCodeFieldDisplayed(), "Failure message:Product code field not displayed in table");
	soft.assertTrue(alertpp.isQuantityFieldDisplayed(), "Failure message:Quantity field not displayed in table");
	soft.assertTrue(alertpp.isAlertQuantityFieldDisplayed(), "Failure message:Alert quantity field not displayed in table");
	soft.assertAll();
}
}
