package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import com.utilities.WaitUtil;
import com.utilities.WebBrowserUtils;

public class InventoryPageTest extends AutomationBase {


	WebDriver driver;
	LoginPage login;
	HomePage home;
	WebBrowserUtils webbrowser;
	InventoryPage inventorypp;
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
			inventorypp=home.navigateToInventoryPage();
		}
		
@Test(enabled=false,priority=1)
public void validateInventoryPage()
{
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(inventorypp.isShowBtnInInventoryPageDispayed(),"Failure message:Inventory page not displayed");
	soft.assertTrue(inventorypp.isSearchTextBoxInInventoryPageDispayed(),"Failure message:Search textbox not displayed");
	soft.assertTrue(inventorypp.isActionsTabInInventoryPageDispayed(),"Failure message:Actions icon not displayed");
	soft.assertTrue(inventorypp.isTableInInventoryPageDispayed(),"Failure message:Inventory table not displayed");
	soft.assertTrue(inventorypp.isCheckboxInInventoryTableDispayed(),"Failure message:Check box in inventory table not displayed");
	soft.assertTrue(inventorypp.isImageFieldInInventoryTableDispayed(),"Failure message:Image field in inventory table not displayed");
	soft.assertTrue(inventorypp.isCodeFieldInInventoryTableDispayed(),"Failure message:Code field in inventory table not displayed");
	soft.assertTrue(inventorypp.isNameFieldInInventoryTableDispayed(),"Failure message:Name field in inventory table not displayed");
	soft.assertTrue(inventorypp.isCostFieldInInventoryTableDispayed(),"Failure message:Cost field in inventory table not displayed");
	soft.assertTrue(inventorypp.isPriceFieldInInventoryTableDispayed(),"Failure message:Price field in inventory table not displayed");
	soft.assertTrue(inventorypp.isQuantityFieldInInventoryTableDispayed(),"Failure message:Quantity field in inventory table not displayed");
	soft.assertTrue(inventorypp.isAlertQuantityFieldInInventoryTableDispayed(),"Failure message:Alert Quantity field in inventory table not displayed");
	soft.assertTrue(inventorypp.isCheckboxInInventoryTableDispayed(),"Failure message:Check box in inventory table not displayed");
	soft.assertTrue(inventorypp.isActionsFieldInInventoryTableDispayed(),"Failure message:Actions field in inventory table not displayed");
	inventorypp.toClickOnActionButttonOfRowOne();
	soft.assertTrue(inventorypp.isDuplicateProductBtnInActionsDropdownDisplayed(),"Failure message:Duplicate product button in actions dropdown not displayed");
	soft.assertTrue(inventorypp.isEditProductBtnInActionsDropdownDisplayed(),"Failure message:Edit product button in actions dropdown not displayed");
	soft.assertTrue(inventorypp.isPrintBarcodeBtnInActionsDropdownDisplayed(),"Failure message:Print Barcode/Label button in actions dropdown not displayed");
	soft.assertTrue(inventorypp.isDeleteProductBtnInActionsDropdownDisplayed(),"Failure message:Delete product button in actions dropdown not displayed");
	inventorypp.toSelectValueForShowDropdown("10");
	inventorypp.toEnterValueToSearchTextBoxInInventoryPage("82957649");
	wait.waitForTheInVisibilityOfElement(driver, inventorypp.loader, 5);
	System.out.println("Code is : " +inventorypp.toGetTheCodeValueInFirstRowOfInventoryTable());
	soft.assertAll();	
}

@Test(enabled=false,priority=2)
public void validateActionsIconInInventoryPage()
{
	SoftAssert soft=new SoftAssert();
	inventorypp.toClickOnActionsTabInInventoryPage();
	soft.assertTrue(inventorypp.isAddProductsLinkInActionsTabDispayed(),"Failure message:Add products link in Actions tab not displayed");
	soft.assertTrue(inventorypp.isPrintBarcodeOrLabelLinkInActionsTabDispayed(),"Failure message:Print Barcode/label link in Actions tab not displayed");
	soft.assertTrue(inventorypp.isExportToExcelLinkInActionsTabDispayed(),"Failure message:Export to Excel link in Actions tab not displayed");
	soft.assertTrue(inventorypp.isExportToPdfLinkInActionsTabDispayed(),"Failure message:Export to Pdf link in Actions tab not displayed");
	soft.assertTrue(inventorypp.isImportProductsLinkInActionsTabDispayed(),"Failure message:Import products link in Actions tab not displayed");
	soft.assertTrue(inventorypp.isDeleteProductsLinkInActionsTabDispayed(),"Failure message:Delete products link in Actions tab not displayed");
	inventorypp.toSelectCheckboxOfFirstRow();
	inventorypp.toSelectCheckboxOfSecondRow();
	inventorypp.toClickOnExportToExcelLinkInActionsTab();
	inventorypp.toClickOnActionsTabInInventoryPage();
	inventorypp.toClickOnExportToPdfLinkInActionsTab();
	inventorypp.toClickOnActionsTabInInventoryPage();
	inventorypp.toClickOnPrintBarcodeOrLabelLinkInActionsTab();
	soft.assertTrue(inventorypp.isProductActionsPageHeaderDisplayed(),"Failure message:Product Actions page header not displayed");
	inventorypp.toClickOnUpdateBtnInProductActionsPage();
	soft.assertTrue(inventorypp.isPrintBtnInProductActionsPageDisplayed(),"Failure message:Print button in product actions page not displayed");
	inventorypp.toClikcOnPrintBtnInProductActionsPage();
	//to handle print screen
	soft.assertAll();
	
}

@Test(enabled=false,priority=3)
public void validateAddProductFunctionalityInActionsIconInInventoryPage()
{
	SoftAssert soft=new SoftAssert();
	wait.waitForTheInVisibilityOfElement(driver, inventorypp.loader, 5);
	inventorypp.toClickOnActionsTabInInventoryPage();
	inventorypp.toClickOnAddProductsLinkInActionsTab();
	soft.assertTrue(inventorypp.isAddProductPageHeaderDisplayed(),"Failure message:Add Product page header not displayed");
	soft.assertTrue(inventorypp.isProductTypeDropdownInAddProductPageDisplayed(),"Failure message:Product type dropdown not displayed");
	soft.assertTrue(inventorypp.isProductNameTxtBxInAddProductPageDisplayed(),"Failure message:Product name textbox not displayed");
	soft.assertTrue(inventorypp.isProductCodeTxtBxInAddProductPageDisplayed(),"Failure message:Product code textbox not displayed");
	soft.assertTrue(inventorypp.isCategoryDropdownInAddProductPageDisplayed(),"Failure message:Category dropdown not displayed");
	soft.assertTrue(inventorypp.isSubCategoryDropdownInAddProductPageDisplayed(),"Failure message:Sub-Category dropdown not displayed");
	soft.assertTrue(inventorypp.isModelDropdownInAddProductPageDisplayed(),"Failure message:Model dropdown not displayed");
	soft.assertTrue(inventorypp.isAlertQuantityTxtBxInAddProductPageDisplayed(),"Failure message:Alert Quantity textbox not displayed");
	soft.assertTrue(inventorypp.isQuantityTxtBxInAddProductPageDisplayed(),"Failure message:Quantity textbox not displayed");
	soft.assertTrue(inventorypp.isSupplierDropdownInAddProductPageDisplayed(),"Failure message:Supplier dropdown not displayed");
	soft.assertTrue(inventorypp.isProductUnitTxtBxInAddProductPageDisplayed(),"Failure message:Product Unit textbox not displayed");
	soft.assertTrue(inventorypp.isProductCostTxtBxInAddProductPageDisplayed(),"Failure message:Product cost textbox not displayed");
	soft.assertTrue(inventorypp.isProductPriceTxtBxInAddProductPageDisplayed(),"Failure message:Product price textbox not displayed");
	soft.assertTrue(inventorypp.isProductImageTxtBxInAddProductPageDisplayed(),"Failure message:Product image textbox not displayed");
	soft.assertTrue(inventorypp.isProductDetailsTxtBxInAddProductPageDisplayed(),"Failure message:Product details textbox not displayed");
	inventorypp.toSelectValueToProductTypeDropdownInAddProductPage("Standard");
	inventorypp.toEnterValueToProductNameTxtBxInAddProductPage("Maruti suzuki");
	inventorypp.toEnterValueToProductCodeTxtBxInAddProductPage("797656");
	inventorypp.toSelectValueToCategoryDropdownInAddProductPage("category one name");
	inventorypp.toSelectValueToModelDropdownInAddProductPage("model1");
	inventorypp.toClearValueInQuantityTxtBxInAddProductPage();
	inventorypp.toEnterValueToQuantityTxtBxInAddProductPage("3");
	inventorypp.toSelectValueToSupplierDropdownInAddProductPage("Abc");
	inventorypp.toEnterValueToProductUnitTxtBxInAddProductPage("1");
	inventorypp.toEnterValueToProductCostTxtBxInAddProductPage("100000");
	inventorypp.toEnterValueToProductPriceTxtBxInAddProductPage("90000");
	inventorypp.toClickOnAddProductButtonInAddProductPage();
	soft.assertTrue(inventorypp.isProductAddedSuccessPopupDisplayed(),"Failure message:Quantity textbox not displayed");
	inventorypp.toCloseProductAddedSuccessPopup();
	inventorypp.toEnterValueToSearchTextBoxInInventoryPage("797656");
	wait.waitForTheInVisibilityOfElement(driver, inventorypp.loader, 5);
	String newproductcode=inventorypp.toGetTheProductCodeAfterSearch();
	System.out.println("new product code:"+newproductcode);
	soft.assertEquals(newproductcode, "797656","Failure message:New Product not added");
	soft.assertAll();
}

@Test(enabled=false,priority=4)
public void validateEditProductFunctionalityInInventoryPage()
{
	SoftAssert soft=new SoftAssert();
	inventorypp.toEnterValueToSearchTextBoxInInventoryPage("797656");
	wait.waitForTheInVisibilityOfElement(driver, inventorypp.loader, 5);
	inventorypp.toClickOnProductCodeOfRowone();
	soft.assertTrue(inventorypp.isBarcodeAndQRCodeFieldInProductCardDisplayed(),"Failure message:Barcode and QR code field in product card not displayed");
	soft.assertTrue(inventorypp.isTypeFieldInProductCardDisplayed(),"Failure message:Type field in product card not displayed");
	soft.assertTrue(inventorypp.isNameFieldInProductCardDisplayed(),"Failure message:Name field in product card not displayed");
	soft.assertTrue(inventorypp.isCodeFieldInProductCardDisplayed(),"Failure message:Code field in product card not displayed");
	soft.assertTrue(inventorypp.isModelFieldInProductCardDisplayed(),"Failure message:Model field in product card not displayed");
	soft.assertTrue(inventorypp.isUnitFieldInProductCardDisplayed(),"Failure message:Unit field in product card not displayed");
	soft.assertTrue(inventorypp.isCostFieldInProductCardDisplayed(),"Failure message:Cost field in product card not displayed");
	soft.assertTrue(inventorypp.isPriceFieldInProductCardDisplayed(),"Failure message:Price field in product card not displayed");
	soft.assertTrue(inventorypp.isPrintBarcodeOrLabelBtnInProductCardDisplayed(),"Failure message:Print Barcode/Label button in product card not displayed");
	soft.assertTrue(inventorypp.isEditBtnInProductCardDisplayed(),"Failure message:Edit button in product card not displayed");
	soft.assertTrue(inventorypp.isDeleteBtnInProductCardDisplayed(),"Failure message:Delete button in product card not displayed");
	inventorypp.toClickOnEditBtnInProductCard();
	soft.assertTrue(inventorypp.isEditProductPageHeaderDisplayed(),"Failure message:Type field in product card not displayed");
	inventorypp.toSelectValueToModelDropdownInAddProductPage("Manufacturer");
	inventorypp.toClickOnEditProductBtnInEditProductPage();
	soft.assertTrue(inventorypp.isEditProductSuccessPopupDisplayed(),"Failure message:Edit product success popup not displayed");
	inventorypp.toCloseEditProductsuccesspopup();
	inventorypp.toEnterValueToSearchTextBoxInInventoryPage("797656");
	wait.waitForTheInVisibilityOfElement(driver, inventorypp.loader, 5);
	inventorypp.toClickOnProductCodeOfRowone();
	String modelvalue=inventorypp.toGetValueOfModelInProductCard();
	System.out.println("Updated modelvalue is :"+modelvalue);
	soft.assertEquals(modelvalue, "Manufacturer","Failure message:Model value not updated");
	soft.assertAll();
}
@Test(enabled=true,priority=4)
public void validateDuplicateProductFunctionalityInInventoryPage()
{
	inventorypp.toClickOnActionButttonOfRowOne();
	inventorypp.toClickOnDuplicateProductBtnInActionsDropdown();
	
}

}
