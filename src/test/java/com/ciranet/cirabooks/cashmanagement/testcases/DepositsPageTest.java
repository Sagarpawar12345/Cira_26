package com.ciranet.cirabooks.cashmanagement.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class DepositsPageTest  extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify CM Deposits Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyDepositsPage(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Deposits Page Title");
		depositsPage = loginPage.verifyDepositsPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Workspace Page Title Test", "Smoke Test", "Verify Workspace Title", "Verifying Workspace Page Title");
	}
	
	@Test(priority = 1, description = "Verify Deposits Menu", groups = { "Functional" }, alwaysRun=true)
	public void verifyDepositsMenu()
	{
		LoggerManager.info("Verifying Deposits Page Title");
		TestBase.setExtentReportSettings("Deposits Page Title Test", "Functional Test", "Verify Deposits Title", "Verifying Deposits Page Title");	
		assertEquals(depositsPage.depositsMenu(),"Deposits");
	}

	@Test(priority = 2, description = "Verify Add Deposit", groups = { "Functional" }, alwaysRun=true)
	public void verifyAddDeposits()
	{
		LoggerManager.info("Verifying Add New Deposits Page Title");
		TestBase.setExtentReportSettings("Add New Deposits Page Title", "Functional Test", "Verify Add New Deposits Title", "Verifying Add New Deposits Page Title");
		assertEquals(depositsPage.addDeposits(),"Add New Deposit");
	}
	
	@Test(priority = 3, description = "Verify Column Chooser", groups = { "Functional" }, alwaysRun=true)
	public void VerifycolumnChooserClick() 
	{
		LoggerManager.info("Verifying Column Chooser");
		TestBase.setExtentReportSettings("Column Chooser Test", "Functional Test", "Verify Column Chooser Title", "Verifying Column Chooser Page Title");
		assertEquals(depositsPage.columnChooserClick(),"Column Chooser");
	}
	
	@Test(priority = 4, description = "Verify Toolbar and Full Screen Option", groups = { "Functional" }, alwaysRun=true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", "Functional Test", "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		assertTrue(depositsPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}

	@Test(priority = 5, description = "Verify Export To Excel Option", groups = { "Functional" }, alwaysRun=true)
	public void verifyExportToExcelDownload()
	{
		LoggerManager.info("Verifying Export To Excel Option");
		TestBase.setExtentReportSettings("Export To Excel Option Test", "Functional Test", "Verify Export To Excel Option", "Verifying Export To Excel Option");
		assertTrue(depositsPage.verifyExportToExcel(), "Excel icon is not enabled");
	}
	
	@Test(priority = 6, description = "Verify View Menu Option", groups = { "Functional" }, alwaysRun=true)
	public void verifyViewMenu()
	{
		LoggerManager.info("Verifying View Menu Option");
		TestBase.setExtentReportSettings("View Menu Option Test", "Functional Test", "Verify View Menu Option", "Verifying View Menu Option");
		assertEquals(depositsPage.viewMenu(),"Receive Date");	
	}
}
