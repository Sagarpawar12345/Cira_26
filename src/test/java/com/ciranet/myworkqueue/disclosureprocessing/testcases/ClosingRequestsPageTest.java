package com.ciranet.myworkqueue.disclosureprocessing.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ClosingRequestsPageTest  extends TestBase{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Closing Requests Page Title", groups = { "Smoke" },alwaysRun = true)
	public void verifyclosingRequeststURL(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Closing Request Page Title");

		closingRequestsPage = loginPage.verifyDiscloProcessingClosingRequestsPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Closing Request Title", "Smoke Test", "Closing Request", "Verify Closing Request");
		assertEquals(closingRequestsPage.closingRequestsMenu(), "Closing Requests");
	}

	@Test(priority = 1, description = "Verify Toolbar and Full Screen", groups ={ "Functional" },alwaysRun = true) 
	public void verifyToolBarFullScreen() 
	{
		LoggerManager.info("Verifying Closing Request"); 
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertTrue(closingRequestsPage.toolBarFullScreen(),"FullScreen icon is not enabled");
	}

	@Test(priority = 2, description = "Verify Search Button", groups = { "Functional" },alwaysRun = true)
	public void verifySearchButton() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertTrue(closingRequestsPage.searchButton(), "Search icon is not enabled");
	}

	@Test(priority = 3, description = "Verify Action Transfer to Collection", groups = { "Functional" },alwaysRun = true)
	public void verifyActionTransfertoCollectionsOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertEquals(closingRequestsPage.verifyActionTransfertoCollections(), "Collections");
		
	}
	@Test(priority = 4, description = "Verify Action Transfer to Transition", groups = { "Functional" },alwaysRun = true)
	public void verifyActionTransfertoTransitionOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertEquals(closingRequestsPage.verifyActionTransfertoTransition(), "Transition");
	}


	@Test(priority = 5, description = "Verify Assign Property", groups = { "Functional" },alwaysRun = true)
	public void verifyActionAssignPropertyOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertEquals(closingRequestsPage.verifyActionAssignProperty(), "Resale/SOA Change Request Property");
	}

	@Test(priority = 6, description = "Verify Action cancle request", groups = { "Functional" },alwaysRun = true)
	public void actionCancleRequestOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertEquals(closingRequestsPage.actionCancelRequest(), "Cancel Reason:");	
	}

	@Test(priority = 7, description = "Verify Assign Property", groups = { "Functional" },alwaysRun = true)
	public void verifySwitchingTabs() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertTrue(closingRequestsPage.switchingTabs(), "Open Request(Auto Fill) tab is clicked ");
	}

	@Test(priority = 8, description = "Verify Request Type", groups = {"Functional" },alwaysRun = true) 
	public void verifyRequestTypeFilter() {
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertEquals(closingRequestsPage.requestTypeFilter(), "Location");
	}
	@Test(priority = 9, description = "Verify Search tab", groups = { "Functional" },alwaysRun = true)
	public void verifySearchTab() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request ", "Functional Test", "Verify Closing Request", "Verifying Closing Request");
		assertEquals(closingRequestsPage.searchTab(), "Property Address:");
	}


	}
