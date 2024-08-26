package com.ciranet.corporatecirabooks.accountsreceivable.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class NewARPaymentPageTest extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify New AR Payment", groups = { "Smoke" })
	public void verifyNewARPayment(XMLCredentialsReader.userCredentials credentials)
	{
		LoggerManager.info("Verifying New AR Payment Page Title");
		newARPaymentPage = loginPage.verifyNewARPaymentPageURL(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying New AR Payment Title", "Smoke Test", "AR Payment", "Verify AR Payment");
		assertEquals(newARPaymentPage.newARPaymentMenu(),"New AR Payment");
	} 
	
	@Test(priority = 1, description = "Verify New AR Payment Page fields", groups = { "Functional" }, alwaysRun=true)
	public void verifyCreateAR()
	{
		LoggerManager.info("Verifying Create New AR Payment");
		TestBase.setExtentReportSettings("Verifying Create AR Payment", "Functional Test", "Create AR Payment", "Verify Create AR Payment");
		assertTrue(newARPaymentPage.createAR(), "Confirmation popup is displayed");
	}
}