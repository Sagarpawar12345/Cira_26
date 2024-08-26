package com.ciranet.myworkqueue.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ProjectsTasksPageTest extends TestBase{
	@Test(priority = 1, dataProvider = "internalUserProvider", description = "Verify HomePage Title", groups = { "Smoke" })
	public void verifyProjectTaskPage(XMLCredentialsReader.userCredentials credentials) {
		LoggerManager.info("Verifying Project Task Page");

		projectsTasksPage = loginPage.verifyProjectTaskPage(credentials.getUsername(), credentials.getPassword());
		projectsTasksPage.ProjectTaskPageLanding();
		TestBase.setExtentReportSettings("Verifying Project Task ", "Smoke Test", "Project task", "Verifying Project Tack");
	}

	@Test(priority = 2, description = "Verify Help Button", groups = { "Functional" })
	public void verifyHelpOfProjectTask() 
	{
		LoggerManager.info("Verifying Project Task Help");
		TestBase.setExtentReportSettings("Verifying Project Task  Help", "Smoke Test", "Project task", "Verify Project Task Help");
		assertTrue(projectsTasksPage.helpProjectTask(),"Help icon for Project Task is not seen");
	}

	@Test(priority = 3, description = "Verify tab Switching", groups ={"Functional" }) 
	public void VerifySwitchtab() 
	{
		LoggerManager.info("Verifying Project Task Tab Switch");
		TestBase.setExtentReportSettings("Verifying Project Task Tab Switch", "Smoke Test", "Project task", "Verify Tab switch");
		assertTrue(projectsTasksPage.Switchtab(),"Switch Tab is not working");
	}

	@Test(priority = 4, description = "Verify Project Task Page Refresh Button click", groups = { "Functional" })
	public void verifyRefreshButtonClick() 
	{
		LoggerManager.info("Verifying Project Task - Refresh button functionality");
		TestBase.setExtentReportSettings("Verifying Refresh Button Click", "Smoke Test", "Clicking Refresh button", "Verify Refresh button");
		assertTrue(projectsTasksPage.refreshButtonClick(),"Refresh button is not clicked");
	}

	@Test(priority = 5, description = "Verify Notification Settings Button", groups = { "Functional" })
	public void verifyNotificationSetting() 
	{
		LoggerManager.info("Verifying Project Task Notification Settings");
		TestBase.setExtentReportSettings("Verifying Notification screen", "Smoke Test", "Notification Screen", "Verify Notification Screen");
		assertTrue(projectsTasksPage.NotificationSetting(),"Notification button is not clicked");
	}

	@Test(priority = 6, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Project Task - Full screen");
		TestBase.setExtentReportSettings("Verifying Full Screen", "Functional Test", "Full Screen", "Verify Full Screen functionality");
		assertTrue(projectsTasksPage.ToolBarFullScreen(), "Fullscreen is not seen");
	}

	
	@Test(priority = 7, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verifying Project Task - Normal screen click");
		TestBase.setExtentReportSettings("Verifying Normal Screen", "Functional Test", "Normal Screen", "Verify Normal screen");
		assertTrue(projectsTasksPage.ToolBarNormalScreen(),"Normal icon is not seen");
	}

	@Test(priority = 8, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" })
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verifying Project Task - Column Chooser");
		TestBase.setExtentReportSettings("Verifying Column Chooser", "Functional Test", "Column Chooser", "Verify Column chooser");
		assertTrue(projectsTasksPage.columnChooserClick(),"Column chooser is not seen");
	}

	@Test(priority = 9, description = "Verify Toolbar - Expand And Collapse", groups = { "Functional" })
	public void verifyMenuExpandCollapseOption() 
	{	
		LoggerManager.info("Verifying Expand and Collapse");
		TestBase.setExtentReportSettings("Verifying Expand Collapse", "Functional Test", "Expand Collapse", "Verify Collapse");
		assertTrue(projectsTasksPage.expandCollapseClick(),"Expand collapse not seen");
	}

	//Action Button in closed task disabled
	@Test(priority = 10, description = "Verify Action button Edit functionality", groups = { "Functional" })
	public void verifyActionEditFunctionality() 
	{
		LoggerManager.info("Verifying Project Task Action Edit");
		TestBase.setExtentReportSettings("Verifying Action - Edit", "Functional Test", "Action Edit", "Verify Action Button");
		projectsTasksPage.verifyActionButton();
	}

	@Test(priority = 11, description = "Verify Add New Project Task Button", groups = { "Functional" })
	public void verifyAddNewProjectTaskButtonClick() 
	{
		LoggerManager.info("Verifying Add new Project Task");
		TestBase.setExtentReportSettings("Verifying Add new Project Task", "Functional Test", "New Project task", "Verify Add new Project Task functionaity");
		assertEquals(projectsTasksPage.AddNewProjectTaskButtonClick(), "Add New Task"); 
	}

	@Test(priority = 12, description = "Verify Active Filter selection", groups = { "Functional" })
	public void verifyActivefilterselection() 
	{
		LoggerManager.info("Verifying Active Filter");
		TestBase.setExtentReportSettings("Verifying Active Filter", "Functional Test", "Active Filter", "Verify Active Filter selection");
		assertTrue(projectsTasksPage.Activefilterselection(),"Filter is not selected");
	}

	@Test(priority = 13, description = "Verify Closed Within Days Textbox", groups = { "Functional" })
	public void verifyDaysTextbox() 
	{
		LoggerManager.info("Verifying Project Task Within Days");
		TestBase.setExtentReportSettings("Verifying Within Days Textbox", "Functional Test", "Days Text", "Verify Closed Within Days Testbox");
		assertTrue(projectsTasksPage.closedWithinDaysTextbox(),"Closed Within textbox is not seen");
	}

	@Test(priority = 14, description = "Verify user logout", groups = { "Smoke" })
	public void verifyuserlogout() 
	{
		LoggerManager.info("Verifying Logout functionality");
		TestBase.setExtentReportSettings("Verifying Logout ", "Functional Test", "Log out", "Verify Logout");
		projectsTasksPage.userlogout();
	}
}