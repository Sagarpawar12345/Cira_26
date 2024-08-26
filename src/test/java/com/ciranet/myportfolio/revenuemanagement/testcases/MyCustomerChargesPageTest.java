package com.ciranet.myportfolio.revenuemanagement.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class MyCustomerChargesPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify My Customer Charges Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyMyCustomerChrages(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying My Customer Charges Title");
		myCustomerChargesPage = loginPage.verifyMyCustomerChargesPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Workspace Title", "Smoke Test", "Workspace Title", "Verify Workspace");	
	}

	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = { "Functional" }, alwaysRun=true)
	public void verifyMyCustomerChargesMenu() 
	{
		LoggerManager.info("Verifying My Customer Charges Menu");
		TestBase.setExtentReportSettings("Verifying My Customer Charges Title", "Functional Test", "My Customer Charges", "Verify My Customer Charges");
		assertEquals(myCustomerChargesPage.myCustomerChargesMenu(),"My Customer Charges");
	}
	
	@Test(priority = 2,description = "Verify Entity Selection", groups = { "Functional" }, alwaysRun=true)
	public void verifyEntitySelection() 
	{	
		LoggerManager.info("Verifying My Customer Charges Menu");
		TestBase.setExtentReportSettings("Verifying Entity Field", "Functional Test", "Entity Field", "Verify Entity Field");
		assertEquals(myCustomerChargesPage.entity(),"Entity:");
	}
	
	@Test(priority = 3, description = "Verify Toolbar Full Screen Option", groups = {"Functional" }, alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Fullscreen icon");
		TestBase.setExtentReportSettings("Verifying Fullscreen icon", "Functional Test", "Fullscreen icon", "Verify Fullscreen icon");
		assertTrue(myCustomerChargesPage.toolBarFullScreen(), "FullScreen Icon is not enabled");
	}

	@Test(priority = 4,description = "Verify Charge Button", groups = { "Functional" }, alwaysRun=true)
	public void verifyCreateNewCharge() 
	{
		LoggerManager.info("Verifying Add My Customer Charges");
		TestBase.setExtentReportSettings("Verifying Add My Customer Charges", "Functional Test", "Add My Customer Charges", "Verify Add My Customer Charges");
		assertEquals(myCustomerChargesPage.addNewCharge(),"Add Customer Charge");
	}
	
	@Test(priority = 5,description = "Verify Edit Menu", groups = { "Functional" }, alwaysRun=true)
	public void verifyEditCharge() 
	{
		LoggerManager.info("Verifying Edit Customer Charges");
		TestBase.setExtentReportSettings("Verifying Edit Customer Charges", "Functional Test", "Edit Customer Charges", "Verify Edit Customer Charges");
		assertEquals(myCustomerChargesPage.editCharge(),"Add Customer Charge");
	}

	@Test(priority = 6,description = "Verify Delete Menu", groups = { "Functional" }, alwaysRun=true)
	public void verifyDeleteCharge() 
	{
		LoggerManager.info("Verifying Delete Customer Charges");
		TestBase.setExtentReportSettings("Verifying Delete Customer Charges", "Functional Test", "Delete Customer Charges", "Verify Delete Customer Charges");
		assertEquals(myCustomerChargesPage.deleteCharge(),"Confirmation");
	}
}