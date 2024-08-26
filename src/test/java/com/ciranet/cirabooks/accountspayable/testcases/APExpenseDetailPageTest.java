package com.ciranet.cirabooks.accountspayable.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class APExpenseDetailPageTest extends TestBase 
{

	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify AP Expense Details Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyAPExpenseDetail(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying AP Expense Details Title");
		TestBase.setExtentReportSettings("Workspace Title Test", "Smoke Test", "Verify Workspace Title", "Verifying Workspace Page Title");
		apExpenseDetailPage = loginPage.verifyAPExpenseDetailPage(credentials.getUsername(), credentials.getPassword());	
		assertEquals(apExpenseDetailPage.apExpenseDetailMenu(),"AP Expense Detail");
	}
	
	@Test(priority = 1, description = "Verify Toolbar and Full Screen Option", groups = { "Functional" }, alwaysRun=true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", "Functional Test", "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		assertTrue(apExpenseDetailPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}

	@Test(priority = 2, description = "Verify AP Bill", groups = { "Functional" }, alwaysRun=true)
	public void verifyAmount() 
	{
		LoggerManager.info("Verifying AP Bill");
		TestBase.setExtentReportSettings("AP Bill Page Title Test", "Functional Test", "Verify AP Bill", "Verifying AP Bill");
		assertEquals(apExpenseDetailPage.amountColumn(),"Bill Description:");
	}
	
	@Test(priority = 3, description = "Verify Workflow Details", groups = { "Functional" }, alwaysRun=true)
	public void verifyReclassifyButton() 
	{
		LoggerManager.info("Verifying Workflow Details");
		TestBase.setExtentReportSettings("Workflow Details Test", "Functional Test", "Verify Workflow Details", "Verifying Workflow Details");
		assertEquals(apExpenseDetailPage.reclassifyButton(), "AAP Workflow Job Details");
	} 
}
