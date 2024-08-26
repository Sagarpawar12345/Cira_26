package com.ciranet.corporatecirabooks.generalledger.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class UploadBudgetsPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Upload Budgets Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyUploadBudgetsPage(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Upload Budgets Page Title");
		TestBase.setExtentReportSettings("Verifying Upload Budgets Page", "Smoke Test", "Upload Budgets", "Verify Upload Budgets Page");

		uploadBudgets = loginPage.verifyUploadBudgetsPage(credentials.getUsername(), credentials.getPassword());
		assertEquals(uploadBudgets.uploadBudgetsMenu(),"Upload Budgets");
	}

	@Test(priority = 1, description = "Verify Upload Budgets Page fields", groups = { "Functional" }, alwaysRun=true)
	public void verifyUploadBudgetsPage() throws AWTException 
	{
		LoggerManager.info("Verifying Upload Budgets Page");
		TestBase.setExtentReportSettings("Verifying Upload Budgets Title", "Functional Test", "Upload Budgets", "Verify Upload Budgets");
		uploadBudgets.verifyUploadBudgetsPage();
	}
}