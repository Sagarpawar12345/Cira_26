package com.ciranet.myworkqueue.communitymanagement.testcases;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class FulfillmentQueuePageTest extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Fulfillment Queue Page Title", groups = { "Smoke" })
	public void verifyFulfillmentQueuePageURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Fulfillment Queue Page Title");
		fulfillmentQueuePage = loginPage.verifyComMgmtFulfillmentQueuePage(credentials.getUsername(), credentials.getPassword());
		fulfillmentQueuePage.fulfillmentQueuePage();
		TestBase.setExtentReportSettings("Verifying Fullfillment Queue Title", "Smoke Test", "Fullfillment Queue", "Verify Fullfillment Queue");
	}

	@Test(priority = 1, description ="Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", "Smoke Test", "Toolbar Full screen", "Verifying Toolbar Full screen icon click");
		assertTrue(fulfillmentQueuePage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description ="Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen", "Smoke Test", "Toolbar Normal screen", "Verifying Toolbar Normal screen icon click");
		assertTrue(fulfillmentQueuePage.toolBarNormalScreen(),"Normal Full Screen is not seen");
	}

	@Test(priority = 3, description = "Verify Toolbar Expand icon click",groups = { "Functional" })
	public void verifyExpandOption() 
	{
		LoggerManager.info("Verify Toolbar Expand icon");
		TestBase.setExtentReportSettings("Verify Toolbar Expand icon", "Smoke Test", "Toolbar Expand icon", "Verifying Toolbar Expand icon");
		assertTrue(fulfillmentQueuePage.expandCollapseOptionClick()	,"Expand icon is not clicked"); 
	}

	@Test(priority = 4, description ="Verify Toolbar - Column Chooser icon click", groups = { "Functional" })
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Column Chooser icon");
		TestBase.setExtentReportSettings("Verify Column Chooser icon", "Smoke Test", "Verify Column Chooser icon", "Verify Column Chooser icon");
		assertTrue(fulfillmentQueuePage.columnChooserClick(),"Column Chooser is not selected"); 
	}

	@Test(priority = 5, description = "Verify tab Switching", groups = {"Functional" })
	public void verifySwitchtab() 
	{
		LoggerManager.info("Verify tab Switching");
		TestBase.setExtentReportSettings("Switching tab", "Smoke Test", "Switching tab", "Verifying tab Switching");
		assertTrue(fulfillmentQueuePage.switchTab(),"Tab switching is seen");
	}

	@Test(priority = 6, description = "Verify Action Button save", groups = { "Functional" })
	public void verifyactionSaveClick() 
	{
		LoggerManager.info("Verify Action Button save");
		TestBase.setExtentReportSettings("Switching tab", "Smoke Test", "Action Button save", "Verifying Action Button save");
		assertTrue(fulfillmentQueuePage.actionSaveClick(),"Action save button is clicked");
	}

	@Test(priority =7, description = "Verify that View Edit Action close button", groups= {" Functional" })
	public void verifyActionCloseButton() 
	{
		LoggerManager.info("Verify that View Edit Action close button");
		TestBase.setExtentReportSettings("View Edit Action close button", "Smoke Test", "View Edit Action close button", "Verifying View Edit Action close button");
		assertTrue(fulfillmentQueuePage.verifyActionCloseButton(),"Action Close is seen");
	}

	@Test(priority = 8, description = "Verify Action Button Save and Close ", groups = { "Functional" })
	public void verifyactionSaveCloseClick() 
	{
		LoggerManager.info("Verify Action Button Save and Close");
		TestBase.setExtentReportSettings("Action Button Save and Close", "Smoke Test", "Action Button Save and Close", "Verifying Action Button Save and Close");
		assertTrue(fulfillmentQueuePage.actionSaveCloseClick(),"Save and Close button is seen");
	}

	@Test(priority = 9, description = "Verify Refresh Queue", groups = { "Functional" })
	public void verifyrefreshQueuebutton() 
	{
		LoggerManager.info("Verify Refresh Queue");
		TestBase.setExtentReportSettings("Refresh Queue", "Smoke Test", "Refresh Queue", "Verifying Refresh Queue");
		assertTrue(fulfillmentQueuePage.refreshQueueButton(),"refresh Queue button is seen");
	}

	@Test(priority = 10, description = "Verify Documents tab", groups = { "Functional" })
	public void verifyActionDocumenttabclick() 
	{
		LoggerManager.info("Verify Documents tab");
		TestBase.setExtentReportSettings("Documents tab", "Smoke Test", "Documents tab", "Verifying Documents tab");
		assertTrue(fulfillmentQueuePage.actionDocumentTabClick(),"action Document tab is seen");
	}

	@Test(priority = 11, description = "Verify Action completion Job tab", groups = { "Functional" })
	public void verifyActionCompletionttabclick() 
	{
		LoggerManager.info("Verify Action completion Job tab");
		TestBase.setExtentReportSettings("Action completion Job tab", "Smoke Test", "Action completion Job tab", "Verifying Action completion Job tab");
		assertTrue(fulfillmentQueuePage.actionCompletiontTabclick(),"action Completion tab is seen");
	}

	@Test(priority = 12, description = "Verify Add Job save and close", groups ={ "Functional" }) 
	public void verifyAddJobSaveAndCloseButton() 
	{
		LoggerManager.info("Verify Add Job save and close");
		TestBase.setExtentReportSettings("Add Job save and close", "Smoke Test", "Add Job save and close", "Verifying Add Job save and close");
		assertTrue(fulfillmentQueuePage.addJobSaveAndCloseButton(),"add Job Save And Close button is seen");
	}

	@Test(priority = 13, description = "Verify Add Completion Job tab", groups = { "Functional" }) 
	public void verifyAddCompletionJobtab() 
	{
		LoggerManager.info("Verify Add Completion Job tab");
		TestBase.setExtentReportSettings("Add Completion Job tab", "Smoke Test", "Add Completion Job tab", "Verifying Add Completion Job tab");
		assertTrue(fulfillmentQueuePage.addCompletionJobtab(),"add Completion Job tab is seen");
	}

	@Test(priority = 14, description = "Verify Closed Jobs Search Button", groups = { "Functional" })
	public void verifyClosedJobsSearchButton() 
	{
		LoggerManager.info("Verify Closed Jobs Search Button");
		TestBase.setExtentReportSettings("Closed Jobs Search", "Smoke Test", "Closed Jobs Search Button", "Verifying Closed Jobs Search Button");
		assertTrue(fulfillmentQueuePage.closedJobsSearchButton(),"Closed Jobs Search Button is seen");
	}

	@Test(priority = 15, description = "Verify Add Completed Job Save & Add Documents button click", groups =
		{ "Functional" }) 
	public void verifyAddCompletedJobbuttonSaveandAddDocuments() 
	{
		LoggerManager.info("Verify Add Completed Job Save & Add Documents button click");
		TestBase.setExtentReportSettings("Add Completed Job Save and Add Documents", "Smoke Test", "Add Completed Job Save & Add Documents button click", "Verifying Add Completed Job Save & Add Documents button click");
		assertTrue(fulfillmentQueuePage.addCompletedJobbuttonSaveandAddDocuments(),"Add Documents is seen");
	}

	@Test(priority = 16, description = "Verify Add Completed Job Close button click", groups ={ "Functional" }) 
	public void verifyAddCompletedJobbuttonclick() 
	{
		LoggerManager.info("Verify Add Completed Job Close button click");
		TestBase.setExtentReportSettings("Add Completed Job Close button click", "Smoke Test", "Add Completed Job Close", "Verifying Add Completed Job Close button click");
		assertTrue(fulfillmentQueuePage.addCompletedJobButtonClick(),"add Completed Job button is seen");
	}
}
