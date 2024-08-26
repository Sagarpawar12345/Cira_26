package com.ciranet.myportfolio.revenuemanagement.testcases;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class BillingItemManagementPageTest extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Billing Item Management Page Title", groups = { "Smoke" }, alwaysRun = true)
	public void VerifybillingItemManagementURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Billing Item Management Page Title");
		TestBase.setExtentReportSettings("Billing Item Management Page Title Test", "Smoke Test", "Verify Billing Item Management Page Title", "Verifying Billing Item Management Page Title");

		billingItemManagementPage = loginPage.verifyBillingItemManagementPage(credentials.getUsername(), credentials.getPassword());
		assertEquals(billingItemManagementPage.billingItemManagementMenu(),"Billing Item Management");		
	}
}
