package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.GenericUtils;
import com.utilities.WebActionUtils;

public class InventoryPage {
	
	WebDriver driver;
	WebActionUtils webaction=new WebActionUtils();
	GenericUtils gen=new GenericUtils();
	
	@FindBy(xpath="//h1[text()='Inventory']")
	WebElement inventorypagehaeder;
	
	@FindBy(xpath="//label[text()='Show ']")
	WebElement showlabelininventorypage;
	
	@FindBy(xpath="//select[@name='PRData_length']")
	WebElement showdropdowninput;
	
	@FindBy(xpath="//input[@class='form-control input-sm input-xs']")
	WebElement searchtxtboxininventorypage;
	
	@FindBy(xpath="//i[@class='icon fa fa-tasks tip']")
	WebElement actionstab;
	
//	@FindBy(xpath="//i[@class='fas fa-plus-circle']")
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory/add']")
	WebElement addproductlinkbtninactionstab;
	
	@FindBy(xpath="//a[@id='labelProducts']")
	WebElement printbarcodeorlabelbtninactionstab;
	
	@FindBy(xpath="(//a[@id='excel'])[1]")
	WebElement exporttoexcelfileinactionstab;
	
	@FindBy(xpath="(//a[@id='excel'])[2]")
	WebElement exporttopdffileinactionstab;
	
	@FindBy(xpath="(//i[@class='fas fa-file-excel'])[2]")
	WebElement importproductsinactionstab;
	
	@FindBy(xpath="//a[@class='bpo']")
	WebElement deleteproductsinactionstab;
	
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[2]")
	WebElement checkboxofrowone;
	
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[3]")
	WebElement checkboxofrowtwo;
	
	@FindBy(xpath="//table[@id='PRData']")
	WebElement tableininventorypage;
	
	@FindBy(xpath="(//th[@class='sorting_disabled'])[1]")
	WebElement checkboxfieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Image'])[1]")
	WebElement imagefieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Code'])[1]")
	WebElement codefieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Name'])[1]")
	WebElement namefieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Cost'])[1]")
	WebElement costfieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Price'])[1]")
	WebElement pricefieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Quantity'])[1]")
	WebElement quantityfieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Alert Quantity'])[1]")
	WebElement alertquantityfieldininventorytable;
	
	@FindBy(xpath="(//th[text()='Actions'])[1]")
	WebElement actionsfieldininventorytable;
	
	@FindBy(xpath="(//button[text()='Actions '])[1]")
	WebElement actionsbtnofrowone;
	
	@FindBy(xpath="(//a[text()=' Duplicate Product'])[1]")
	WebElement duplicateproductbtninactionsdropdown;
	
	@FindBy(xpath="(//a[text()=' Edit Product'])[1]")
	WebElement editproductbtninactionsdropdown;
	
	@FindBy(xpath="(//a[text()=' Print Barcode/Label'])[1]")
	WebElement printbarcodebtninactionsdropdown;
	
	@FindBy(xpath="(//a[text()=' Delete Product'])[1]")
	WebElement deleteproductbtninactionsdropdown;
	
	@FindBy(xpath="(//table[@id='PRData']//tr//td)[3]")
	WebElement codeinrowone;
	
	@FindBy(xpath="//div[@id='loadingmessage']")
	public WebElement loader;
	
	@FindBy(xpath="//h1[text()='Product Actions']")
	WebElement productactionspageheader;
	
	@FindBy(xpath="//input[@name='print']")
	WebElement updatebtninproductactionspage;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block no-print']")
	WebElement printbtninproductactionspage;
	
	@FindBy(xpath="//h1[text()='Add Product']")
	WebElement addproductpageheader;
	
	@FindBy(xpath="//select[@id='type']")
	WebElement producttypedropdowninaddproductspage;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement productnametxtbxinaddproductspage;
	
	@FindBy(xpath="//input[@id='code']")
	WebElement productcodetxtbxinaddproductspage;
	
	@FindBy(xpath="//select[@id='category']")
	WebElement categorydropdowninaddproductspage;
	
	@FindBy(xpath="//select[@id='subcategory']")
	WebElement subcategorydropdowninaddproductspage;
	
	@FindBy(xpath="//select[@id='model']")
	WebElement modeldropdowninaddproductspage;
	
	@FindBy(xpath="//input[@id='alert_quantity']")
	WebElement alertquantitytxtbxinaddproductspage;
	
	@FindBy(xpath="//input[@id='quantity']")
	WebElement quantitytxtbxinaddproductspage;
	
	@FindBy(xpath="//textarea[@id='details']")
	WebElement productdetailstxtbxinaddproductspage;
	
	@FindBy(xpath="//select[@id='supplier']")
	WebElement supplierdropdowninaddproductspage;
	
	@FindBy(xpath="//input[@id='unit']")
	WebElement productunittxtbxinaddproductspage;
	
	@FindBy(xpath="//input[@id='cost']")
	WebElement productcosttxtbxinaddproductspage;
	
	@FindBy(xpath="//input[@id='price']")
	WebElement productpricetxtbxinaddproductspage;
	
	@FindBy(xpath="(//input[@class='file-caption-name'])[1]")
	WebElement productimagetxtbxinaddproductspage;
	
	@FindBy(xpath="//input[@name='add_product']")
	WebElement addproductbtninaddproductspage;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement productaddedsuccesspopup;
	
	@FindBy(xpath="(//button[@class='close'])[1]")
	WebElement productaddedsuccesspopupclosebtn;
	
	@FindBy(xpath="(//table[@id='PRData']//tr//td)[3]")
	WebElement productcodeofrowone;
	
	@FindBy(xpath="//td[text()='Barcode & QRcode']")
	WebElement barcodeandqrcodeinproductcard;
	
	@FindBy(xpath="//td[text()='Type']")
	WebElement typeinproductcard;
	
	@FindBy(xpath="//td[text()='Name']")
	WebElement nameinproductcard;
	
	@FindBy(xpath="//td[text()='Code']")
	WebElement codeinproductcard;
	
	@FindBy(xpath="//td[text()='Model']")
	WebElement modelinproductcard;
	
	@FindBy(xpath="(//table[@class='table table-borderless table-striped dfTable table-right-left']//tr//td)[10]")
	WebElement modelvalueinproductcard;
	
	@FindBy(xpath="//td[text()='Unit']")
	WebElement unitinproductcard;
	
	@FindBy(xpath="//td[text()='Cost']")
	WebElement costinproductcard;
	
	@FindBy(xpath="//td[text()='Price']")
	WebElement priceinproductcard;
	
	@FindBy(xpath="//button[@class='btn btn-xs btn-default no-print pull-right']")
	WebElement printbtninproductcard;
	
	@FindBy(xpath="//span[text()='Print Barcode/Label']")
	WebElement printbarcodeorlabelinproductcard;

	@FindBy(xpath="//a[@class='tip btn btn-warning tip']")
	WebElement editbtninproductcard;
	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement deletebtninproductcard;
	
	@FindBy(xpath="//h1[text()='Edit Product']")
	WebElement editproductpageheader;
	
	@FindBy(xpath="//input[@name='edit_product']")
	WebElement editproductbtnineditproductpage;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement editproductsuccesspopup;
	
	@FindBy(xpath="(//button[@class='close'])[1]")
	WebElement editproductsuccesspopupclosebtn;
	
	@FindBy(xpath="//small[text()='Please enter a value' and @data-bv-result='INVALID']")
	WebElement suppliervalidationmsg;
	
	@FindBy(xpath="//div[@class='toast-message']")
	WebElement productcodenotquniqueerrormsg;
	
	@FindBy(xpath="//i[@class='fa fa-random']")
	WebElement arrowbtninproductcodefield;
	
	
	public InventoryPage(WebDriver  driver) //constructor of home page
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialize the above mentioned elements
	}
	
	public boolean isInventoryPageHeaderDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, inventorypagehaeder);
	}
	
	public boolean isShowBtnInInventoryPageDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, showlabelininventorypage);
	}
	
	public void toSelectValueForShowDropdown(String text)
	{
		gen.selectByVisibleText(driver, showdropdowninput, text);
	}
	
	public boolean isSearchTextBoxInInventoryPageDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, searchtxtboxininventorypage);
	}
	
	public void toEnterValueToSearchTextBoxInInventoryPage(String value)
	{
		webaction.enterTheValue(driver, searchtxtboxininventorypage, value);
	}

	public boolean isActionsTabInInventoryPageDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, actionstab);
	}
	
	public void toClickOnActionsTabInInventoryPage()
	{
		webaction.clickOnTheElement(driver, actionstab);
	}
	
	public boolean isAddProductsLinkInActionsTabDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addproductlinkbtninactionstab);
	}
	
	public void toClickOnAddProductsLinkInActionsTab()
	{
		webaction.clickOnTheElement(driver, addproductlinkbtninactionstab);
	}
	
	public boolean isPrintBarcodeOrLabelLinkInActionsTabDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, printbarcodeorlabelbtninactionstab);
	}
	
	public void toClickOnPrintBarcodeOrLabelLinkInActionsTab()
	{
		webaction.clickOnTheElement(driver, printbarcodeorlabelbtninactionstab);
	}
	
	public boolean isExportToExcelLinkInActionsTabDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, exporttoexcelfileinactionstab);
	}
	
	public void toClickOnExportToExcelLinkInActionsTab()
	{
		webaction.clickOnTheElement(driver, exporttoexcelfileinactionstab);
	}
	
	public boolean isExportToPdfLinkInActionsTabDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, exporttopdffileinactionstab);
	}
	
	public void toClickOnExportToPdfLinkInActionsTab()
	{
		webaction.clickOnTheElement(driver, exporttopdffileinactionstab);
	}
	
	public boolean isImportProductsLinkInActionsTabDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, importproductsinactionstab);
	}
	
	public void toClickOnImportProductsLinkInActionsTab()
	{
		webaction.clickOnTheElement(driver, importproductsinactionstab);
	}
	
	public boolean isDeleteProductsLinkInActionsTabDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, deleteproductsinactionstab);
	}
	
	public void toClickOnDeleteProductsLinkInActionsTab()
	{
		webaction.clickOnTheElement(driver, deleteproductsinactionstab);
	}
	
	public boolean isTableInInventoryPageDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, tableininventorypage);
	}
	
	public boolean isCheckboxInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, checkboxfieldininventorytable);
	}

	public boolean isImageFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, imagefieldininventorytable);
	}

	public boolean isCodeFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, codefieldininventorytable);
	}
	
	public boolean isNameFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, namefieldininventorytable);
	}

	public boolean isCostFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, costfieldininventorytable);
	}

	public boolean isPriceFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, pricefieldininventorytable);
	}

	public boolean isQuantityFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, quantityfieldininventorytable);
	}
	
	public boolean isAlertQuantityFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, alertquantityfieldininventorytable);
	}
	
	public boolean isActionsFieldInInventoryTableDispayed()
	{
		return webaction.CheckElementIsDisplayed(driver, alertquantityfieldininventorytable);
	}

	public void toClickOnActionButttonOfRowOne()
	{
		webaction.clickOnTheElement(driver, actionsbtnofrowone);
	}
	
	public boolean isDuplicateProductBtnInActionsDropdownDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, duplicateproductbtninactionsdropdown);
	}
	
	public void toClickOnDuplicateProductBtnInActionsDropdown()
	{
		webaction.clickOnTheElement(driver, duplicateproductbtninactionsdropdown);
	}
	
	public boolean isEditProductBtnInActionsDropdownDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, editproductbtninactionsdropdown);
	}

	public boolean isPrintBarcodeBtnInActionsDropdownDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, printbarcodebtninactionsdropdown);
	}
	
	public boolean isDeleteProductBtnInActionsDropdownDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, deleteproductbtninactionsdropdown);
	}

	public String toGetTheCodeValueInFirstRowOfInventoryTable()
	{
		String code=webaction.getTheElementText(driver, codeinrowone);
		return code;
	}
	
	public void toSelectCheckboxOfFirstRow()
	{
		webaction.clickOnTheElement(driver, checkboxofrowone);
	}
	
	public void toSelectCheckboxOfSecondRow()
	{
		webaction.clickOnTheElement(driver, checkboxofrowtwo);
	}
	
	public boolean isProductActionsPageHeaderDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productactionspageheader);
	}
	
	public void toClickOnUpdateBtnInProductActionsPage()
	{
		webaction.clickOnTheElement(driver, updatebtninproductactionspage);
	}
	
	public boolean isPrintBtnInProductActionsPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, printbtninproductactionspage);
	}
	
	public void toClikcOnPrintBtnInProductActionsPage()
	{
		webaction.CheckElementIsDisplayed(driver, printbtninproductactionspage);
	}
	
	public boolean isAddProductPageHeaderDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addproductpageheader);
	}
	
	public boolean isProductTypeDropdownInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, producttypedropdowninaddproductspage);
	}
	
	public void toSelectValueToProductTypeDropdownInAddProductPage(String text)
	{
		gen.selectByVisibleText(driver, producttypedropdowninaddproductspage, text);
	}
	
	public boolean isProductNameTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productnametxtbxinaddproductspage);
	}
	
	public void toEnterValueToProductNameTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, productnametxtbxinaddproductspage, value);
	}
	
	public boolean isProductCodeTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productcodetxtbxinaddproductspage);
	}
	
	public void toEnterValueToProductCodeTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, productcodetxtbxinaddproductspage, value);
	}
	
	public boolean isCategoryDropdownInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, categorydropdowninaddproductspage);
	}
	
	public void toSelectValueToCategoryDropdownInAddProductPage(String text)
	{
		gen.selectByVisibleText(driver, categorydropdowninaddproductspage, text);
	}
	
	public boolean isSubCategoryDropdownInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, subcategorydropdowninaddproductspage);
	}
	
	public boolean isModelDropdownInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, modeldropdowninaddproductspage);
	}
	
	public void toSelectValueToModelDropdownInAddProductPage(String text)
	{
		gen.selectByVisibleText(driver, modeldropdowninaddproductspage, text);
	}
	
	public boolean isAlertQuantityTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, alertquantitytxtbxinaddproductspage);
	}
	
	public void toEnterValueToAlertQuantityTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, alertquantitytxtbxinaddproductspage, value);
	}
	
	public boolean isQuantityTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, quantitytxtbxinaddproductspage);
	}
	
	public void toClearValueInQuantityTxtBxInAddProductPage()
	{
		webaction.clearTheElement(driver, quantitytxtbxinaddproductspage);
	}
	
	public void toEnterValueToQuantityTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, quantitytxtbxinaddproductspage, value);
	}
	
	public boolean isProductDetailsTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productdetailstxtbxinaddproductspage);
	}
	
	public void toEnterValueToProductDetailsTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, productdetailstxtbxinaddproductspage, value);
	}
	
	public boolean isSupplierDropdownInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, supplierdropdowninaddproductspage);
	}
	
	public void toSelectValueToSupplierDropdownInAddProductPage(String text)
	{
		gen.selectByVisibleText(driver, supplierdropdowninaddproductspage, text);
	}
	
	public boolean isProductUnitTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productunittxtbxinaddproductspage);
	}
	
	public void toEnterValueToProductUnitTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, productunittxtbxinaddproductspage, value);
	}

	public boolean isProductCostTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productcosttxtbxinaddproductspage);
	}
	
	public void toEnterValueToProductCostTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, productcosttxtbxinaddproductspage, value);
	}

	public boolean isProductPriceTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productpricetxtbxinaddproductspage);
	}
	
	public void toEnterValueToProductPriceTxtBxInAddProductPage(String value)
	{
		webaction.enterTheValue(driver, productpricetxtbxinaddproductspage, value);
	}
	
	public boolean isProductImageTxtBxInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productimagetxtbxinaddproductspage);
	}
	
	public boolean isAddProductButtonInAddProductPageDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, addproductbtninaddproductspage);
	}
	
	public void toClickOnAddProductButtonInAddProductPage()
	{
		webaction.clickOnTheElement(driver, addproductbtninaddproductspage);
	}
	
	public boolean isProductAddedSuccessPopupDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productaddedsuccesspopup);
	}
	
	public void toCloseProductAddedSuccessPopup()
	{
		webaction.clickOnTheElement(driver, productaddedsuccesspopupclosebtn);
	}

	public String toGetTheProductCodeAfterSearch()
	{
		String productcode=webaction.getTheElementText(driver, productcodeofrowone);
		return productcode;
	}
	
	public void toClickOnProductCodeOfRowone()
	{
		webaction.clickOnTheElement(driver, productcodeofrowone);
	}
	
	public boolean isBarcodeAndQRCodeFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, barcodeandqrcodeinproductcard);
	}
	
	public boolean isTypeFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, typeinproductcard);
	}
	
	public boolean isNameFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, nameinproductcard);
	}

	public boolean isCodeFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, codeinproductcard);
	}
	
	public boolean isModelFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, modelinproductcard);
	}

	public String toGetValueOfModelInProductCard()
	{
		String modelvalue=webaction.getTheElementText(driver, modelvalueinproductcard);
		return modelvalue;
	}
	
	public boolean isUnitFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, unitinproductcard);
	}
	
	public boolean isCostFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, costinproductcard);
	}
	
	public boolean isPriceFieldInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, priceinproductcard);
	}

	public boolean isPrintBtnInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, printbtninproductcard);
	}
	
	public boolean isPrintBarcodeOrLabelBtnInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, printbarcodeorlabelinproductcard);
	}
	
	public boolean isEditBtnInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, editbtninproductcard);
	}
	
	public void toClickOnEditBtnInProductCard()
	{
		webaction.clickOnTheElement(driver, editbtninproductcard);
	}

	public boolean isDeleteBtnInProductCardDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, deletebtninproductcard);
	}

	public boolean isEditProductPageHeaderDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, editproductpageheader);
	}
	
	public void toClickOnEditProductBtnInEditProductPage()
	{
		webaction.clickOnTheElement(driver, editproductbtnineditproductpage);
	}
	
	public boolean isEditProductSuccessPopupDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, editproductsuccesspopup);
	}
	
	public void toCloseEditProductsuccesspopup()
	{
		webaction.clickOnTheElement(driver, editproductsuccesspopupclosebtn);
	}
	
	public boolean isValidationMsgForSupplierDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, suppliervalidationmsg);
	}
	
	public boolean isValidationMsgForUniqueProductCodeDisplayed()
	{
		return webaction.CheckElementIsDisplayed(driver, productcodenotquniqueerrormsg);
	}
	
	
	
	
	@FindBy(xpath="//i[@class='fa fa-random']")
	WebElement arrowbtninproductcodefield;
	}
