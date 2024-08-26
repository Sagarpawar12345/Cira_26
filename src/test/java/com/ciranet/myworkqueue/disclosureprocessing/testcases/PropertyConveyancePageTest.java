package com.ciranet.myworkqueue.disclosureprocessing.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class PropertyConveyancePageTest extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Property Coveyance Work Queue Page Title", groups = { "Smoke" })
	public void verifyPropertyConveyanceWorkQueuePageURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Property Conveyance Work Queue Page Title");
		propertyConveyanceWorkQueuePage = loginPage.verifyPropertyConveyanceWorkQueuePage(credentials.getUsername(), credentials.getPassword());
		propertyConveyanceWorkQueuePage.propertyConveyancePageLanding();
		TestBase.setExtentReportSettings("Property Conveyance Work Queue Page Title", "Smoke Test", "Property Conveyance", "verifying Property Conveyance Work Queue Page Title");
		assertEquals(propertyConveyanceWorkQueuePage.propertyConveyancePageLanding(), "Property Ownership Conveyance");
	}

	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", "Smoke Test", "Toolbar Full screen", "Verifying Toolbar - Full screen icon click");
		assertTrue(propertyConveyanceWorkQueuePage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen", "Smoke Test", "Toolbar Normal screen", "Verifying Toolbar - Normal screen icon click");
		assertTrue(propertyConveyanceWorkQueuePage.toolBarNormalScreen(),"toolBar Normal Screen is not seen");
	}

	@Test(priority = 3, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" },alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Column Chooser icon");
		TestBase.setExtentReportSettings("Column Chooser icon", "Smoke Test", "Column Chooser icon", "Verifying Column Chooser icon");
		assertTrue(propertyConveyanceWorkQueuePage.columnChooserClick(),"column Chooser option is not Clicked");
	}

	@Test(priority = 4, description = "Verify Toolbar Expand icon", groups = { "Functional" })
	public void verifyExpandOption() 
	{
		LoggerManager.info("Verify Toolbar Expand icon");
		TestBase.setExtentReportSettings("Toolbar Expand icon", "Smoke Test", "Toolbar Expand icon", "Verifying Toolbar Expand icon");
		assertTrue(propertyConveyanceWorkQueuePage.expandOptionClick(),"Toolbar Expand icon is not Clicked");
	}

	@Test(priority = 5, description = "Verify Edit Community Cancel Button", groups = { "Functional" })
	public void VerifyactionEditCommunityCancel() 
	{
		LoggerManager.info("Verify Edit Community Cancel Button");
		TestBase.setExtentReportSettings("Edit Community Cancel Button", "Smoke Test", "Edit Community Cancel Button", "Verifying Edit Community Cancel Button");
		assertTrue(propertyConveyanceWorkQueuePage.actionEditCommunityCancel(),"Edit Community Cancel Button is not Clicked");
	}

	@Test(priority = 5 , description = "Verify Delete Community  Button", alwaysRun=true, groups = { "Functional" })
	public void VerifyactionDeleteCommunity() 
	{
		LoggerManager.info("Verify Delete Community Button");
		TestBase.setExtentReportSettings("Delete Community  Button", "Smoke Test", "Delete Community  Button", "Verifying Delete Community  Button");
		try 
		{
			assertTrue(propertyConveyanceWorkQueuePage.verifyActionDelete(),"Delete Community  Button is not Clicked");
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 6 , description = "Verify Refresh Button", groups = { "Functional" })
	public void Verifyrefresh() 
	{
		LoggerManager.info("Verify Refresh Button");
		TestBase.setExtentReportSettings("Refresh Button", "Smoke Test", "Refresh Button", "Verifying Refresh Button");
		assertTrue(propertyConveyanceWorkQueuePage.verifyRefreshButton(),"Refresh Button is not Clicked");
	}

	@Test(priority = 7, description = "Verify Process Property Conveyance Menu and Toggle Compact Mode", alwaysRun=true, groups = { "Functional" })
	public void verifyCompactModeOnPropertyConveyancePopup() 
	{
		LoggerManager.info("Verify Process Property Conveyance Menu and Toggle Compact Mode");
		TestBase.setExtentReportSettings("Process Property Conveyance Menu and Toggle Compact Mode", "Smoke Test", "Process Property Conveyance Menu and Toggle Compact Mode", "Verifying Process Property Conveyance Menu and Toggle Compact Mode");
		
		try 
		{
			assertTrue(propertyConveyanceWorkQueuePage.compactModeToggleOnPropertyConveyancePopup(),"Toggle Compact Mode is not seen");
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 8, description = "Verify Toggle Completed and Open Tabs", alwaysRun=true, groups = { "Functional" })
	public void verifyToggleCompletedTabOpenTabs() 
	{
		LoggerManager.info("Verify Toggle Completed and Open Tabs");
		TestBase.setExtentReportSettings("Toggle Completed and Open Tabs", "Smoke Test", "Toggle Completed and Open Tabs", "Verifying Toggle Completed and Open Tabs");
		assertTrue(propertyConveyanceWorkQueuePage.toggleCompletedOpenTabClick(),"Toggle Completed and Open Tabs is not seen");
	}

	@Test(priority = 9, description = "Verify Search Work Queue button click", alwaysRun=true, groups = { "Functional" })
	public void verifySearchWorkQueueButton() 
	{
		LoggerManager.info("Verify Search Work Queue button click");
		TestBase.setExtentReportSettings("Search Work Queue button click", "Smoke Test", "Search Work Queue button click", "Verifying Search Work Queue button click");
		assertTrue(propertyConveyanceWorkQueuePage.searchWorkQueueButtonClick(),"Search Work Queue button click is not Clicked");
	}
}
