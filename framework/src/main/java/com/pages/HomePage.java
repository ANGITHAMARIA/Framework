package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WebActionUtils;

public class HomePage {
	
	WebDriver driver;
	WebActionUtils webaction=new WebActionUtils();

	@FindBy(xpath="//p[text()='Logged In Successfully']")
	WebElement successpopup;
	
	@FindBy(xpath="//p[text()='Reparation']")
	WebElement reparationdiv;
	
	@FindBy(xpath="(//a[text()='More Info '])[1]")
	WebElement reparationmoreinfolink;
	
	@FindBy(xpath="//p[text()='Client']")
	WebElement clientdiv;
	
	@FindBy(xpath="(//a[text()='More Info '])[2]")
	WebElement clientmoreinfolink;
	
	@FindBy(xpath="//p[text()='Inventory Products']")
	WebElement inventoryproductsdiv;
	
	@FindBy(xpath="(//a[text()='More Info '])[3]")
	WebElement inventoryproductsmoreinfolink;
	
	@FindBy(xpath="//h3[text()='Revenue Chart']")
	WebElement revenuechartdiv;
	
	@FindBy(xpath="(//button[@class='btn btn-info btn-sm'])[1]")
	WebElement revenuechartclosebtn;
	
	@FindBy(xpath="//h3[text()='Stock Chart']")
	WebElement stockchartdiv;
	
	@FindBy(xpath="//i[@class='fa fa-minus']")
	WebElement stockchartminusbtn;
	
	@FindBy(xpath="(//i[@class='fa fa-times'])[2]")
	WebElement stockchartclosebtn;
	
	@FindBy(xpath="//div[@id='calendar']")
	WebElement calendarsection;
	
	@FindBy(xpath="//h3[text()='Quick Email']")
	WebElement quickemaildiv;
	
	@FindBy(xpath="(//button[@class='btn btn-info btn-sm'])[2]")
	WebElement quickemailclosebtn;
	
	@FindBy(xpath="//h3[text()='Quick SMS']")
	WebElement quicksmsdiv;
	
	@FindBy(xpath="(//button[@class='btn btn-info btn-sm'])[3]")
	WebElement quicksmsclosebtn;
	
	@FindBy(xpath="//b[text()='Service Management']")
	WebElement servicemanagementtxt;
	
	@FindBy(xpath="//a[@class='sidebar-toggle']")
	WebElement sidebartogglebtn;
	
	@FindBy(xpath="//a[@class='btn blightOrange tip']")
	WebElement alertbtn;
	
	@FindBy(xpath="//span[@class='label label-danger pull-right']")
	WebElement numofalertbtn;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement addbtn;
	
	@FindBy(xpath="//span[@class='fa fa-user-plus icon']")
	WebElement addclientbtn;
	
	@FindBy(xpath="(//button[@class='close'])[8]")
	WebElement addclientpopupclosebtn;
	
	@FindBy(xpath="//a[@class='add_reparation']")
	WebElement addreparationbtn;
	
	@FindBy(xpath="(//button[@class='close'])[2]")
	WebElement addreparationpopupclosebtn;
	
	@FindBy(xpath="//a[@data-target='#sendSMSModal']")
	WebElement sendsmsbtn;
	
	@FindBy(xpath="(//button[@class='close'])[9]")
	WebElement sendsmspopupclosebtn;
	
	@FindBy(xpath="//a[@data-target='#sendEmailModal']")
	WebElement sendemailbtn;
	
	@FindBy(xpath="(//button[@class='close'])[10]")
	WebElement sendemailpopupclosebtn;
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[1]")
	WebElement loggedinusernameintoppanel;
	
	@FindBy(xpath="//a[@class='btn btn-default btn-flat']")
	WebElement signoutbtn;
	
	@FindBy(xpath="//div[@class='pull-left info']")
	WebElement loggedinusernameinsidepanel;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchreparationtxtbx;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement searchreparationbutton;
	
	@FindBy(xpath="//li[@class='header']")
	WebElement mainnavigationtxt;
	
	@FindBy(xpath="//i[@class='fa fa-home']")
	WebElement homebtn;
	
	@FindBy(xpath="//i[@class='fa fa-cog']")
	WebElement settingsbtn;
	
	@FindBy(xpath="//ul[@class='treeview-menu']")
	WebElement settingsmenuoptions;
	
	@FindBy(xpath="(//i[@class='far fa-circle'])[1]")
	WebElement settingsmenuoptionone;
	
	@FindBy(xpath="(//i[@class='far fa-circle'])[2]")
	WebElement settingsmenuoptiontwo;
	
	@FindBy(xpath="(//i[@class='far fa-circle'])[3]")
	WebElement settingsmenuoptionthree;
		
	@FindBy(xpath="//input[@id='emailto_']")
	WebElement quickemailemailtofield;
	
	@FindBy(xpath="//input[@id='subject_']")
	WebElement quickemailsubjectfield;
	
	@FindBy(xpath="//textarea[@id='body_']")
	WebElement quickemailmessagefield;
	
	@FindBy(xpath="//button[@form='send_email_form']")
	WebElement quickemailsendbtn;
	
	@FindBy(xpath="//input[@id='phone_number']")
	WebElement quicksmsnumberfield;
	
	@FindBy(xpath="(//textarea[@name='text'])[1]")
	WebElement quicksmstxtfield;
	
	@FindBy(xpath="//button[@form='send_quicksms']")
	WebElement quicksmssendbtn;
	
	public HomePage(WebDriver  driver) //constructor of home page
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialize the above mentioned elements
	}
	
	public Boolean isSuccessPopupFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, successpopup);
	}
	
	public Boolean isReparationFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, reparationdiv);
	}
	
	public void toClickOnReparationMoreInfoBtn()
	{
		webaction.clickOnTheElement(driver, reparationmoreinfolink);
	}
	
	public Boolean isClientFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, clientdiv);
	}
	
	public Boolean isInventoryProductsFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver,inventoryproductsdiv);
	}
	
	public Boolean isRevenueChartDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver,revenuechartdiv);
	}
	
	public Boolean isCalendarDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver,calendarsection);
	}
	
	public Boolean isStockChartDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver,stockchartdiv);
	}
	
	public Boolean isQuickEmailFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver,quickemaildiv);
	}
	
	public Boolean isQuickSmsFieldDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver,quicksmsdiv);
	}
	
	public void toOpenReparationMoreInfopage()
	{
		webaction.clickOnTheElement(driver, reparationmoreinfolink);
	}
	
	public void toOpenClientMoreInfoPage()
	{
		webaction.clickOnTheElement(driver, clientmoreinfolink);
	}
	
	public void toOpenInventoryProductsMoreInfoPage()
	{
		webaction.clickOnTheElement(driver,inventoryproductsmoreinfolink);
	}
	
	public Boolean isServiceManagementTxtDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, servicemanagementtxt);
	}
	
	public Boolean isSidebarToggleButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, sidebartogglebtn);
	}
	
	public Boolean isAlertButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, alertbtn);
	}
	
	public Boolean isAddButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addbtn);
	}
	
	public Boolean isLoggedinUsernameDisplayedInTopPanel()
	{
		return webaction.CheckElementIsDisplayed(driver, loggedinusernameintoppanel);
	}
	
	public void toLogoutFromApplication()
	{
		webaction.clickOnTheElement(driver, loggedinusernameintoppanel);
		webaction.clickOnTheElement(driver, signoutbtn);
	}
	
	public void toClickOnSideBarToggleButton()
	{
		webaction.clickOnTheElement(driver, sidebartogglebtn);
	}
	
	public void toClickOnAlertButton()
	{
		webaction.clickOnTheElement(driver, alertbtn);
	}
	
	public Boolean isNumberOfAlertsDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, numofalertbtn);
	}
	
	public void toClickOnNumberOfAlerts()
	{
		webaction.clickOnTheElement(driver,numofalertbtn);
	}
	
	public void toClickOnAddButton()
	{
		webaction.clickOnTheElement(driver, addbtn);
	}
	
	public Boolean isAddButtonEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, addbtn);
	}
	
	public void toClickOnAddClientButton()
	{
		webaction.clickOnTheElement(driver, addclientbtn);
	}
	
	public Boolean isAddClientButtonEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, addclientbtn);
	}
	
	public Boolean isAddClientButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addclientbtn);
	}
	
	public void toCloseAddClientPopup()
	{
		webaction.clickOnTheElement(driver, addclientpopupclosebtn);
	}
	
	public void toClickOnAddReparationButton()
	{
		webaction.clickOnTheElement(driver, addreparationbtn);
	}
	
	public Boolean isAddReparationButtonEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, addreparationbtn);
	}
	
	public Boolean isAddReparationButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addreparationbtn);
	}
	
	public void toCloseAddReparationPopup()
	{
		webaction.clickOnTheElement(driver, addreparationpopupclosebtn);
	}
	
	public void toClickOnsendSmsButton()
	{
		webaction.clickOnTheElement(driver, sendsmsbtn);
	}
	
	public Boolean isSendSmsButtonEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, sendsmsbtn);
	}
	
	public Boolean isSendSmsButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, sendsmsbtn);
	}
	
	public void toCloseSendSmsPopup()
	{
		webaction.clickOnTheElement(driver,sendsmspopupclosebtn);
	}
	
	public void toClickOnsendEmailButton()
	{
		webaction.clickOnTheElement(driver, sendemailbtn);
	}
	
	public Boolean isSendEmailButtonEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, sendemailbtn);
	}
	
	public Boolean isSendEmailButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, sendemailbtn);
	}
	
	public void toCloseSendEmailPopup()
	{
		webaction.clickOnTheElement(driver,sendemailpopupclosebtn);
	}
	
	public Boolean isLoggedInUsernameDisplayedInLeftPanel()
	{
		return webaction.CheckElementIsDisplayed(driver, loggedinusernameinsidepanel);
	}
	
	public Boolean isSearchReparationTextBoxDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, searchreparationtxtbx);
	}
	
	public void toClickOnSearchReparationSearchButton()
	{
		webaction.clickOnTheElement(driver, searchreparationbutton);
	}
	
	public Boolean isMainNavigationTextDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, mainnavigationtxt);
	}
	
	public Boolean isHomeButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, homebtn);
	}
	
	public void toClickOnHomeButton()
	{
		webaction.clickOnTheElement(driver, homebtn);
	}
	
	public Boolean isSettingsButtonDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, settingsbtn);
	}
	
	public void toClickOnSettingsButton()
	{
		webaction.clickOnTheElement(driver, settingsbtn);
	}
	
	public Boolean isSettingsOptionsDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, settingsmenuoptions);
	}
	
	public void toClickOnSettingsOptionOne()
	{
		webaction.clickOnTheElement(driver, settingsmenuoptionone);
	}
	
	public void toClickOnSettingsOptionTwo()
	{
		webaction.clickOnTheElement(driver, settingsmenuoptiontwo);
	}
	
	public void toClickOnSettingsOptionThree()
	{
		webaction.clickOnTheElement(driver, settingsmenuoptionthree);
	}
	
	public void toEnterEmailIdInQuickEmail(String mailid)
	{
		webaction.enterTheValue(driver, quickemailemailtofield, mailid);
	}
	
	public Boolean isEnterEmailidFieldEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quickemailemailtofield);
	}
	
	public void toEnterSubjectInQuickEmail(String mailsubject)
	{
		webaction.enterTheValue(driver, quickemailsubjectfield, mailsubject);
	}
	
	public Boolean isEnterSubjectFieldEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quickemailsubjectfield);
	}
	public void toEnterMessageInQuickEmail(String mailmessage)
	{
		webaction.enterTheValue(driver, quickemailmessagefield, mailmessage);
	}
	
	public Boolean isEnterMessageFieldEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quickemailmessagefield);
	}
	
	public void toClickSendButtonInQuickEmail()
	{
		webaction.clickOnTheElement(driver, quickemailsendbtn);
	}
	
	public Boolean isSendButtonInQuickEmailEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quickemailsendbtn);
	}
	
	public void toEnterNumberInQuickSms(String number)
	{
		webaction.enterTheValue(driver, quicksmsnumberfield, number);
	}
	
	public Boolean isEnterNumberFieldEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quicksmsnumberfield);
	}
	
	public void toEnterSmsText(String smstext)
	{
		webaction.enterTheValue(driver, quicksmstxtfield, smstext);
	}
	
	public Boolean isSMSTextFieldEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quicksmstxtfield);
	}
	
	public void toClickSendButtonInQuickSms()
	{
		webaction.clickOnTheElement(driver, quicksmssendbtn);
	}
	
	public Boolean isSendButtonInQuickSmsEnabled()
	{
		return webaction.CheckElementIsEnabled(driver, quicksmssendbtn);
	}
	
	public QuantityAlertsPage navigateToQuantityAlertsPage()
	{
		toClickOnAlertButton();
		toClickOnNumberOfAlerts();
		return new QuantityAlertsPage(driver);
	}
	
	public OrderAndReparationsPage navigateToOrderAndReparationsPage()
	{
		toClickOnReparationMoreInfoBtn();
		return new OrderAndReparationsPage(driver);
	}
	
}
