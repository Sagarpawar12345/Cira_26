package com.ciranet.myworkqueue.communitymanagement.testcases;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class MaintenanceWorkOrdersPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Work Orders Page Title", groups = { "Smoke" }) 

	public void verifyworkOrdersPageURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Work Orders Page Title");

		workOrdersPage = loginPage.verifyMaintenanceWorkOrdersPage(credentials.getUsername(), credentials.getPassword());
		workOrdersPage.workOrdersPageLanding();
		TestBase.setExtentReportSettings("Verifying Work Order Title", "Smoke Test", "Work Order", "Verify Work Order");
	}

	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = {"Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", "Smoke Test", "Toolbar Full screen", "Verifying Toolbar - Full screen icon click");
		assertTrue(workOrdersPage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = {"Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen", "Smoke Test", "Toolbar Normal screen", "Verifying Toolbar - Normal screen icon click");
		assertTrue(workOrdersPage.toolBarNormalScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 3, description = "Verify tab Switching", groups = {"Functional" })
	public void verifySwitchtab()
	{
		LoggerManager.info("Verify tab Switching");
		TestBase.setExtentReportSettings("Switching tab", "Smoke Test", "Verify tab Switching", "Verify tab Switching");
		assertTrue(workOrdersPage.switchTab(),"tab switching are not seen");
	}

	@Test(priority = 4, description = "Verify Closed Work Orders In Past days textbox", groups = {"Functional" })
	public void verifyClosedDaysTextbox()
	{
		LoggerManager.info("Verify Closed Work Orders In Past days textbox");
		TestBase.setExtentReportSettings("Closed Work Orders In Past days textbox", "Smoke Test", "Closed Work Orders In Past days textbox", "Verifying Closed Work Orders In Past days textbox");
		assertTrue(workOrdersPage.closedDaysTextbox(),"closed DaysTextbox is not seen");
		
	}

	@Test(priority = 5, description = "Verify Toolbar - Expand icon click", groups = {"Functional" })
	public void verifyExpandOption() 
	{
		LoggerManager.info("Verify Toolbar - Expand icon");
		TestBase.setExtentReportSettings("Verify Toolbar - Expand icon", "Smoke Test", "Verify Toolbar - Expand icon", "Verifying Toolbar - Expand icon");
		assertTrue(workOrdersPage.expandOptionClick(),"Expand icon is not clicked");
	}

	@Test(priority = 6, description = "Verify Toolbar - collapsed icon click", groups = {"Functional" })
	public void verifyCollapseOption() 
	{
		LoggerManager.info("Verify Toolbar - collapsed icon");
		TestBase.setExtentReportSettings("Verify Toolbar - collapsed icon", "Smoke Test", "Toolbar collapsed icon", "Verifying Toolbar collapsed icon");
		assertTrue(workOrdersPage.collapseOptionClick(),"Collapse icon is not clicked");
	}

	@Test(priority = 7, description = "Verify Toolbar - Column Chooser icon click", groups = {"Functional" })
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Toolbar - Column Chooser icon");
		TestBase.setExtentReportSettings("Verify Toolbar - Column Chooser icon", "Smoke Test", "Toolbar Column Chooser", "Verifying Toolbar Column Chooser icon");
		assertTrue(workOrdersPage.columnChooserClick(),"Column Chooser is not selected");
	}

	@Test(priority =8, description = "Verify that View Edit Work Order and close", groups= {" Functional" })
	public void verifyViewEditCloseWorkOrderClick()
	{
		LoggerManager.info("Verify that View Edit Work Order and close");
		TestBase.setExtentReportSettings("Verify that View Edit Work Order and close", "Smoke Test", "View Edit Work Order and close", "Verifying that View Edit Work Order and close");
		assertTrue(workOrdersPage.viewEditCloseWorkOrderClick(),"view Edit Clos Work Order is not seen");
	}

	@Test(priority =9, description = "Verify that View Edit Work Order", groups= {" Functional" })
	public void verifyViewEditWorkOrder()
	{
		LoggerManager.info("Verify that View Edit Work Order");
		TestBase.setExtentReportSettings("Verify that View Edit Work Order", "Smoke Test", "View Edit Work Order", "Verifying that View Edit Work Order");
		assertTrue(workOrdersPage.viewEditWorkOrder(),"view Edit Work Order is not seen");
	}

	@Test(priority =10, description = "Verify that View Edit Work Order and save", groups= {" Functional" })
	public void verifyViewEditSaveWorkOrderClick()
	{
		LoggerManager.info("Verify that View Edit Work Order and save");
		TestBase.setExtentReportSettings("Verify that View Edit Work Order and save", "Smoke Test", "View Edit Work Order and save", "Verifying that View Edit Work Order and save");
		assertTrue(workOrdersPage.viewEditSaveWorkOrderClick(),"view Edit Save Work Order is not seen");
	}

	@Test(priority = 11, description = "Verify Work Authorization", groups = {"Functional" })
	public void verifyManageWorkAuthorization() 
	{
		LoggerManager.info("Verify Work Authorization");
		TestBase.setExtentReportSettings("Verify Work Authorization", "Smoke Test", "Work Authorization", "Verifying Work Authorization");
		assertTrue(workOrdersPage.verifyManageWorkAuthorization(),"verify Manage Work Authorization is not seen");
	}

	@Test(priority =12, description = "Verify that Manage Praposal PopUp", groups= {" Functional" })
	public void VerifyManageProposal() 
	{
		LoggerManager.info("Verify that Manage Praposal PopUp");
		TestBase.setExtentReportSettings("Verify that Manage Praposal PopUp", "Smoke Test", "Manage Praposal PopUp", "Verifying Manage Praposal PopUp");
		assertTrue(workOrdersPage.manageProposal(),"verify manage Proposal is not seen");
	}

	@Test(priority =13, description = "Verify the Chanage Status", groups= {" Functional" })
	public void verifychangeStatus()
	{
		workOrdersPage.changeStatus();
	}

	@Test(priority = 14, description = "Verify Manage Task References Popup", groups = {"Functional" })
	public void VerifyManageTaskReferences() 
	{
		LoggerManager.info("Verify Manage Task References Popup");
		TestBase.setExtentReportSettings("Verify Manage Task References Popup", "Smoke Test", "Manage Task References Popup", "Verifying Manage Task References Popup");
		assertTrue(workOrdersPage.manageTaskReferences(),"manage Task References is not seen");
	}

	@Test(priority =15, description = "Verify that Add Work Oreders and Close", groups= {" Functional" })
	public void verifycloseWorkOrder()
	{
		LoggerManager.info("Verify that Add Work Oreders and Close");
		TestBase.setExtentReportSettings("Verify that Add Work Oreders and Close", "Smoke Test", "Add Work Oreders and Close", "Verifying Add Work Oreders and Close");
		assertTrue(workOrdersPage.closeAddWorkOrder(),"close Add Work Order is not seen");
	}

	@Test(priority = 16, description = "Verify Add New Work Order button click", groups = {"Functional" })
	public void VerifyAddNewWorkOrderClick() 
	{
		LoggerManager.info("Verify Add New Work Order button click");
		TestBase.setExtentReportSettings("Verify Add New Work Order button click", "Smoke Test", "Add New Work Order", "Verifying Add New Work Order button click");
		assertTrue(workOrdersPage.addNewWorkOrderClick(),"add New Work Order is not seen");
	}
}


