package com.ciranet.myworkqueue.communitymanagement.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class CommonLotsAppraisalPageTest extends TestBase{

	@Test(priority = 0,dataProvider = "internalUserProvider" , description = "Verify Common Lots Appraisal Title", groups = { "Smoke" })
	public void verifyCommonLotsAppraisalURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");

		commonLotsAppraisalPage = loginPage.verifyComMgmtCommonLotsAppraisalPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", "Smoke Test", "Common Lots", "Verify C L A");
		assertEquals(commonLotsAppraisalPage.commonLotsAppraisalPage(), "Common Lots Appraisal");   
	}


	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = { "Functional" }, alwaysRun = true) 
	public void verifyToolbarFullScreenOption() {
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", "Functional Test", "Common Lots Appraisal", "Verify Common Lots Appraisal");
		assertTrue(commonLotsAppraisalPage.toolBarFullScreen(), "Fullscreen icon is not enabled");	
	}



	@Test(priority = 2, description = "Verify Column Chooser Option", groups = { "Functional" }, alwaysRun = true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", "Functional Test", "Common Lots", "Verify C L A");
		assertEquals(commonLotsAppraisalPage.columnChooserClick(), "Column Chooser");


	}
	@Test(priority = 3, description = "Verify excel Option", groups = { "Functional" }, alwaysRun = true)
	public void verifyexcelOption() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", "Functional Test", "Common Lots", "Verify C L A");
		assertTrue(commonLotsAppraisalPage.excelClick(), "Excel icon is not enabled");
	}

	@Test(priority = 4, description = "Verify csv Option", groups = { "Functional" }, alwaysRun = true)
	public void verifycsvOption() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", "Functional Test", "Common Lots", "Verify C L A");
		assertTrue(commonLotsAppraisalPage.csvClick(), "CSV icon is not enabled");
	}
}
