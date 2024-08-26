package com.ciranet.myworkqueue.communitymanagement.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ViolationReviewPageTest extends TestBase{
	
	@Test(priority = 0, dataProvider = "internalUserProvider" ,  description = "Verify Violation Review Page Title", groups = { "Smoke" })
	public void verifyViolationReviewURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Violation Review Page Title");
		violationReviewPage = loginPage.verifyViolationReviewPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Violetion review Title", "Smoke Test", "Violetion review", "Verify B A");
        assertEquals(violationReviewPage.ViolationReviewMenu(),"Open Violations Requiring Review");
	}

	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = { "Functional" },alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", "Functional Test", "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		assertTrue(violationReviewPage.toolBarFullScreen(), "Fullscreen Icon is not enabled"); 
	}
	
	@Test(priority= 3, description= "Verify Violation History Popup", groups= {"Functional"},alwaysRun=true)
	public void verifyViolationInspectionHistoryPopup() 
	{
		LoggerManager.info("Verifying Violation History");
		TestBase.setExtentReportSettings("Violation History Title Test", "Functional Test", "Verify Violation History Title", "Verifying Violation History Title");
		assertEquals(violationReviewPage.ViolationInspectionHistoryPopup(),"Violation Inspection History");	
	}
}