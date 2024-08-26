package com.ciranet.myworkqueue.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class InternalTasksPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify InternalTaskPage Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyInternalTasksPageURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Internal Task Page Title");
		TestBase.setExtentReportSettings("Verifying Internal Task Title", "Smoke Test", "Internal task", "Verify Internal Task Page");
		internalTasksPage = loginPage.verifyInternalTaskPage(credentials.getUsername(), credentials.getPassword());
		internalTasksPage.internalTaskPageLanding();
	}

	@Test(priority = 1, description = "Verify Help Button", groups = { "Smoke" }, alwaysRun=true)
	public void verifyHelpInternalTask() 
	{
		LoggerManager.info("Verifying Internal Task Help");
		TestBase.setExtentReportSettings("Verifying Internal Task  Help", "Smoke Test", "Internal task", "Verify Internal Task Help");
		assertTrue(internalTasksPage.helpInternalTask(),"Help icon for Project Task is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar - Column Chooser icon click", groups = { "Smoke" }, alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verifying Internal Task - Column Chooser");
		TestBase.setExtentReportSettings("Verifying Column Chooser", "Functional Test", "Column Chooser", "Verify Column chooser");
		assertTrue(internalTasksPage.columnChooserClick(),"Column chooser is not seen");
	}

	@Test(priority = 3, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Internal Task - Full screen");
		TestBase.setExtentReportSettings("Verifying Full Screen", "Functional Test", "Full Screen", "Verify Full Screen functionality");
		assertTrue(internalTasksPage.toolbarFullScreen(), "Fullscreen is not seen");
	}

	@Test(priority = 4, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifytoolBarNormalScreenOption() 
	{
		LoggerManager.info("Verifying Internal Task - Normal screen click");
		TestBase.setExtentReportSettings("Verifying Normal Screen", "Functional Test", "Normal Screen", "Verify Normal screen");
		assertTrue(internalTasksPage.toolBarNormalScreen(),"Normal icon is not seen");
	}

	@Test(priority = 5, description = "Verify Email Setting button", groups = { "Smoke" })
	public void verifyEmailSetting() 
	{
		LoggerManager.info("Verifying Email Setting button");
		TestBase.setExtentReportSettings("Verifying Email Setting button", "Functional Test", "Internal Task", "Verify Email Setting button functionaity");
		assertEquals(internalTasksPage.emailSetting(), "Email Setting button");
	}

	@Test(priority = 6, description = "Verify Toolbar - Expand And Collapse", groups = { "Smoke" }, alwaysRun=true)
	public void verifyExpandCollapseOption() 
	{
		LoggerManager.info("Verifying Expand and Collapse");
		TestBase.setExtentReportSettings("Verifying Expand Collapse", "Functional Test", "Expand Collapse", "Verify Collapse");
		assertTrue(internalTasksPage.expandCollapseClick(),"Expand collapse not seen");
	}

	@Test(priority = 7, description = "Verify Active Filter selection", groups = { "Functional" })
	public void verifyActiveFilterSelect() 
	{
		LoggerManager.info("Verifying Active Filter");
		TestBase.setExtentReportSettings("Verifying Active Filter", "Functional Test", "Active Filter", "Verify Active Filter selection");
		assertTrue(internalTasksPage.activeFilterSelection(),"Filter is not selected");
	}

	@Test(priority = 8, description = "Verify Refresh", groups = { "Smoke" }, alwaysRun=true)
	public void verifyRefreshButton() 
	{
		LoggerManager.info("Verifying Refresh button");
		TestBase.setExtentReportSettings("Verifying Refresh button", "Functional Test", "Internal Task", "Verify Refresh button functionaity");
		assertEquals(internalTasksPage.refreshClick(), "Refresh button");
	}
}