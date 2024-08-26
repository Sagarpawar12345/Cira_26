package com.ciranet.myworkqueue.receivableslockbox.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class StatementApprovalQueuePageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Statement Approval Queue Page Title", groups = { "Smoke" }, alwaysRun = true)
	public void verifyStatementApprovalQueueURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Statement Approval Queue Page Title");
		statementApprovalQueuePage = loginPage.verifyStatementApprovalQueuePage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Workspace Title", "functional Test", "Workspace","Verify Workspace");
		assertEquals(statementApprovalQueuePage.workspaceLabel.getText(),"Workspace");
	}

	@Test(priority = 1, description = "Verify Export To Excel Option", groups = { "Functional" }, alwaysRun=true)
	public void verifyStatementApprovalQueueMenu()
	{
		LoggerManager.info("Verifying Statement Approval Queue Title");
		TestBase.setExtentReportSettings("Statement Approval Queue Title", "Functional Test", "Verify Statement Approval Queue Title", "Verifying Statement Approval Queue Title");
		assertEquals(statementApprovalQueuePage.statementApprovalQueueMenu(),"Statement Approvals");
	}
	
	@Test(priority = 2, description = "Verify Search Approvals Tab", groups = { "Functional" }, alwaysRun = true)
	public void verifySearchApprovalsTab()
	{
		LoggerManager.info("Verifying Search Approvals Tab");
		TestBase.setExtentReportSettings("Verifying Search Approvals Tab", "functional Test", "Search Approvals Tab",
				"Verify Search Approvals Tab");
		assertEquals(statementApprovalQueuePage.searchApprovalTabClick(),"Date Type:");
	}
	
	@Test(priority = 3, description = "Verify Toolbar Full Screen Option", groups = { "Functional" }, alwaysRun = true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", "Functional Test", "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		assertTrue(statementApprovalQueuePage.toolBarFullScreen(), "Fullscreen Icon is not enabled");	
	}

	@Test(priority = 4, description = "Verify Select Date Type", groups = { "Functional" }, alwaysRun = true)
	public void verifyDateFields() 
	{
		LoggerManager.info("Verifying Date Fields");
		TestBase.setExtentReportSettings("Verifying Date Fields", "Functional Test", "Date Fields", "Verify Date Fields");
		assertEquals(statementApprovalQueuePage.dateFields(), "Begin Date:");
	}

	@Test(priority = 5, description = "Verify Logs Tab", groups = { "Functional" }, alwaysRun = true)
	public void verifyLogsColumn() 
	{
		LoggerManager.info("Verifying Logs Column click");
		TestBase.setExtentReportSettings("Verifying Logs Column click", "Functional Test", "Logs Column click",
				"Verify Logs Column click");
		assertEquals(statementApprovalQueuePage.logsClick(),"User");
	}

	@Test(priority = 6, description = "Verify Statement PDF Tab", groups = { "Functional" }, alwaysRun = true)
	public void verifyStatementColumn() 
	{
		LoggerManager.info("Verifying Statement Clicked");
		TestBase.setExtentReportSettings("Verifying Statement Clicked", "Functional Test", "Statement Clicked",
				"Verify Statement Clicked");
		assertEquals(statementApprovalQueuePage.statementColumnPDFClick(),"Resource Not Found.");
	}

	@Test(priority = 7, description = "Verify LocationColumn", groups = { "Functional" }, alwaysRun = true)
	public void verifyLocationSearch()
	{
		LoggerManager.info("Verifying Location Search");
		TestBase.setExtentReportSettings("Verifying Location Search", "Functional Test", "Location Search",
				"Verify Location Search");
		assertEquals(statementApprovalQueuePage.locationColumnLabel.getText(),"Location");
	}

	@Test(priority = 8, description = "Verify Run ID Column", groups = { "Functional" }, alwaysRun = true)
	public void verifyRunIDClick() 
	{
		LoggerManager.info("Verifying Run ID Search");
		TestBase.setExtentReportSettings("Verifying Run ID Search", "Functional Test", "Run ID Search",
				"Verify Run ID Search");
		assertEquals(statementApprovalQueuePage.runIDClick(),"Run Id");
	}

	@Test(priority = 9, description = "Verify Statement Runs Tab", groups = { "Functional" }, alwaysRun = true)
	public void verifyStatementRunsTab() 
	{
		LoggerManager.info("Verifying Statement Runs Tab");
		TestBase.setExtentReportSettings("Verifying Statement Runs Tab", "Functional Test", "Statement Runs Tab",
				"Verify Statement Runs Tab");
		assertEquals(statementApprovalQueuePage.statementRunsTabClick(),"Statement Runs");
	}
}