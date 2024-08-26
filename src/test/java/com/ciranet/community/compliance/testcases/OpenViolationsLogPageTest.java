package com.ciranet.community.compliance.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class OpenViolationsLogPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Open Violations Log Detail Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyOpenViolationsLogPage(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Open Violations Log Detail Title");
		TestBase.setExtentReportSettings("Open Violations Log Detail Title Test", "Smoke Test", "Verify Open Violations Log Detail Title", "Verifying Open Violations Log Detail Page Title");
		openViolationsLogPage = loginPage.verifyOpenViolationsLogPage(credentials.getUsername(), credentials.getPassword());	
		assertEquals(openViolationsLogPage.openViolationsLogMenu(),"Open Violations Log");
	}
 
	@Test(priority = 1, description = "Verify Log Details", groups = { "Functional" }, alwaysRun = true)
	public void verifyLogDetails() 
	{	
		LoggerManager.info("Verifying Log Detail Title");
		TestBase.setExtentReportSettings("Log Detail Title Test", "Functional Test", "Verify Log Detail Title", "Verifying Log Detail Page Title");
		assertEquals(openViolationsLogPage.logDetails(),"Open Violations Log Detail");
	}

	@Test(priority = 2, description = "Verify Violation History Title Test", groups = { "Functional" }, alwaysRun = true)
	public void verifyViolationHistory() 
	{	
		LoggerManager.info("Verifying Violation History Detail Title");
		TestBase.setExtentReportSettings("Violation History Title Test", "Functional Test", "Verify Violation History Title", "Verifying Violation History Title");
		assertEquals(openViolationsLogPage.violationHistory(),"Violation History");		
	}

	@Test(priority = 3, description = "Verify Violation History Images Title Test", groups = { "Functional" }, alwaysRun = true)
	public void verifyHistoryImage() 
	{	
		LoggerManager.info("Verifying Violation History Images Title");
		TestBase.setExtentReportSettings("Violation History Images Title Test", "Functional Test", "Verify Violation History Images Title", "Verifying Violation History Images Title");
		assertEquals(openViolationsLogPage.historyImage(),"Violation History Images");
	}

	@Test(priority = 4, description = "Verify Popup Close Buttons", groups = { "Functional" }, alwaysRun = true)
	public void verifyCloseButtons() 
	{	
		LoggerManager.info("Verifying Open Violations Log Detail Title");
		TestBase.setExtentReportSettings("Open Violations Log Detail Title Test", "Functional Test", "Verify Open Violations Log Detail Title", "Verifying Open Violations Log Detail Page Title");
		assertEquals(openViolationsLogPage.closeButtons(),"Open Violations Log");
	}
}
