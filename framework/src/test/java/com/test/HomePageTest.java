package com.test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;

import com.utilities.WebBrowserUtils;

public class HomePageTest extends AutomationBase 
{
WebDriver driver;
LoginPage login;
HomePage home;
WebBrowserUtils webbrowser;

@BeforeMethod
public void preRun() throws Exception
{
	driver=getDriver();
	login=new LoginPage(driver);
	webbrowser=new WebBrowserUtils();
	home=new HomePage(driver);
	webbrowser.launchUrl(driver,"https://qalegend.com/mobile_service/panel/login");
	home=login.login("admin@admin.com", "password");
}

/**
 * Function to validate whether home page fields are displayed.
 */
@Test(enabled=true,priority=1)
public void validateHomePageFields()
{
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(home.isReparationFieldDisplayed(),"Failure message:Reparation field not displayed");
	soft.assertTrue(home.isClientFieldDisplayed(),"Failure message:Client field not displayed");
	soft.assertTrue(home.isInventoryProductsFieldDisplayed(),"Failure message:Products field not displayed");
	soft.assertTrue(home.isCalendarDisplayed(),"Failure message:Calendar not displayed");
	soft.assertTrue(home.isRevenueChartDisplayed(),"Failure message:Revenue chart field not displayed");
	soft.assertTrue(home.isStockChartDisplayed(),"Failure message:Stock chart field not displayed");
	soft.assertTrue(home.isQuickEmailFieldDisplayed(),"Failure message:Quick Email field not displayed");
	soft.assertTrue(home.isQuickSmsFieldDisplayed(),"Failure message:Quick SMS field not displayed");
	soft.assertAll();
	System.out.println("Verification of Home page fields success");
	home.toLogoutFromApplication();
}

/**
 * Function to validate whether home page top panel fields are displayed.
 */
@Test(enabled=true,priority=2)
public void validateHomePageTopPanelFields()
{
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(home.isServiceManagementTxtDisplayed(),"Failure message:Service Management Text not displayed");
	soft.assertTrue(home.isSidebarToggleButtonDisplayed(),"Failure message:Side-Bar toggle button not displayed");
	soft.assertTrue(home.isAlertButtonDisplayed(),"Failure message:Alert Button not displayed");
	soft.assertTrue(home.isAddButtonDisplayed(),"Failure message:Add Button not displayed");
	soft.assertTrue(home.isLoggedinUsernameDisplayedInTopPanel(),"Failure message:Logged-in username not displayed");	
	home.toClickOnAlertButton();
	soft.assertTrue(home.isNumberOfAlertsDisplayed(),"Failure message:Number of alerts not displayed");
	home.toClickOnAddButton();
	soft.assertTrue(home.isAddButtonEnabled(), "Failure message:Add Button not clicked");
	soft.assertTrue(home.isAddClientButtonDisplayed(), "Failure message:Add Client Button not displayed");
	soft.assertTrue(home.isAddReparationButtonDisplayed(), "Failure message:Add Reparation Button not displayed");
	soft.assertTrue(home.isSendSmsButtonDisplayed(),"Failure message:Send SMS Button not displayed");
	soft.assertTrue(home.isSendEmailButtonDisplayed(),"Failure message:Send Email Button not displayed");
	soft.assertAll();
	System.out.println("Verification of home page top panel fields success");
	home.toLogoutFromApplication();
}

/**
 * Function to validate whether home page left panel fields are displayed.
 */
@Test(enabled=true,priority=3)
public void validateHomePageLeftPanelFields()
{
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(home.isLoggedInUsernameDisplayedInLeftPanel(), "Failure message:Logged in username not displayed in left panel");
	soft.assertTrue(home.isSearchReparationTextBoxDisplayed(),"Failure message:Search reparations textbox not displayed");
	soft.assertTrue(home.isMainNavigationTextDisplayed(),"Failure message:Main Navigation text missing in left panel");
	soft.assertTrue(home.isHomeButtonDisplayed(),"Failure message:Home button not displayed in left panel");
	soft.assertTrue(home.isSettingsButtonDisplayed(),"Failure message: Settings button not displayed in left panel");
	home.toClickOnSettingsButton();
	soft.assertTrue(home.isSettingsOptionsDisplayed(),"Failure message:Settings options missing in left panel");
	soft.assertAll();
	System.out.println("Verification of home page left side panel fields success");
	home.toLogoutFromApplication();
}

/**
 * Function to validate Quick Email and Quick SMS options in homepage.
 */
@Test(enabled=true,priority=4)
public void validateQuickEmailAndQuickSmsOption()
{
	SoftAssert soft=new SoftAssert();
	home.toEnterEmailIdInQuickEmail("test@test.com");
	soft.assertTrue(home.isEnterEmailidFieldEnabled(), "Failure message:Please enter emailid");
	home.toEnterSubjectInQuickEmail("Test Email");
	soft.assertTrue(home.isEnterSubjectFieldEnabled(), "Failure message:Please enter mail subject");
	home.toEnterMessageInQuickEmail("Test Email Message");
	soft.assertTrue(home.isEnterMessageFieldEnabled(),"Failure message:Please enter mail body");
	home.toClickSendButtonInQuickEmail();
	soft.assertTrue(home.isSendButtonInQuickEmailEnabled(), "Failure message:Email not send");
	home.toEnterNumberInQuickSms("+911234567890");
	soft.assertTrue(home.isEnterNumberFieldEnabled(), "Failure message:Please enter mobile number");
	home.toEnterSmsText("Test SMS");
	soft.assertTrue(home.isSMSTextFieldEnabled(),"Failure message:Please enter SMS message");
	home.toClickSendButtonInQuickSms();
	soft.assertTrue(home.isSendButtonInQuickSmsEnabled(), "Failure message:SMS not send");
	soft.assertAll();
	System.out.println("Quick Email and Quick SMS functions verified");
}

}
