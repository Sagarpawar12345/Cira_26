package com.ciranet.myworkqueue.communitymanagement.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class BoardApprovalsPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Board Approval Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyboardApprovalsMenu(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Board Approval Page Title");
		boardApprovalsPage = loginPage.verifyComMgmtBoardApprovalsPage(credentials.getUsername(), credentials.getPassword());
		boardApprovalsPage.verifyBoardApprovalsMenu();
		TestBase.setExtentReportSettings("Verifying Board Approval Title", "Smoke Test", "Board Approval", "Verify Board Approvals");
		assertEquals(boardApprovalsPage.verifyBoardApprovalsMenu(), "Board Approvals");
	}

	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = { "functional" }, alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", "Smoke Test", "Toolbar Full screen", "Verifying Toolbar - Full screen icon click");
		assertTrue(boardApprovalsPage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar Normal Screen option",  groups = { "functional" }, alwaysRun=true) 
	public void verifyToolBarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen", "Smoke Test", "Toolbar Normal screen", "Verifying Toolbar - Normal screen icon click");
		assertTrue(boardApprovalsPage.toolBarNormalScreen(),"toolBar Normal Screen is not seen");
		
	}
	
	@Test(priority = 3, description = "Verify Switching tabs Open tab and Closed tab", groups = { "functional" }, alwaysRun=true)
	public void verifySwitchTab() 
	{
		LoggerManager.info("Verify tab Switching");
		TestBase.setExtentReportSettings("Switching tab", "Smoke Test", "Switching tab", "Verifying tab Switching");
		assertTrue(boardApprovalsPage.switchTab(),"switch Tabs are not seen");
	}

	@Test(priority = 4, description = "Verify Exapnd All icon", groups = { "functional" }, alwaysRun=true)
	public void verifyExpandOptionClick() 
	{
		LoggerManager.info("Verify Exapnd All");
		TestBase.setExtentReportSettings("Exapnd All icon", "Smoke Test", "Verify Exapnd All icon", "Verifying Exapnd All icon");
		assertTrue(boardApprovalsPage.expandOptionClick(),"expand Option is not Clicked");
	}

	@Test(priority = 5, description = "Verify Column Chooser icon", groups = { "functional" }, alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Column Chooser icon");
		TestBase.setExtentReportSettings("Verify Column Chooser icon", "Smoke Test", "Verify Column Chooser icon", "Verify Column Chooser icon");
		assertTrue(boardApprovalsPage.columnChooserClick(),"column Chooser option is not Clicked");
	}
}
