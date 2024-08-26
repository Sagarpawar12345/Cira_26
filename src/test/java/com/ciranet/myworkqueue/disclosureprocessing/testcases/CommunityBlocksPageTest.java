package com.ciranet.myworkqueue.disclosureprocessing.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class CommunityBlocksPageTest  extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Closing Requests Page Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyCommunityBlocks(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Community Blocks Page Title");
		communityBlocksPage = loginPage.verifyCommunityBlocksPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Community Blocks Page Title Test", "Smoke Test", "Verify Community Blocks Title", "Verifying Community Blocks Page Title");
		assertEquals(communityBlocksPage.communityBlocksMenu(),"SOA Community Blocks Config");
	}

	@Test(priority = 1, description = "Verify Closing Requests Page Column Chooser", groups = { "Functional" }, alwaysRun=true)
	public void verifyColumnChooserClick() {

		LoggerManager.info("Verifying Column chooser");
		TestBase.setExtentReportSettings("Column Chooser Test", "Functional Test", "Verify Column Chooser Title", "Verifying Column Chooser Page Title");
		assertEquals(communityBlocksPage.columnChooserClick(),"Column Chooser");
	}

	@Test(priority = 2, description = "Verify Toolbar and Full Screen Option", groups = { "Functional" }, alwaysRun=true)
	public void verifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", "Functional Test", "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		assertTrue(communityBlocksPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}

	@Test(priority = 3, description = "Verify Export To Excel Option", groups = { "Functional" }, alwaysRun=true)
	public void verifyExportToExcelDownload()
	{
		LoggerManager.info("Verifying Export To Excel Option");
		TestBase.setExtentReportSettings("Export To Excel Option Test", "Functional Test", "Verify Export To Excel Option", "Verifying Export To Excel Option");
		assertTrue(communityBlocksPage.exportToExcel(), "Excel icon is not enabled");
	}

	@Test(priority = 4, description = "Verify Switching Tabs", groups = { "Functional" }, alwaysRun=true)
	public void verifySwitchingTabs()
	{
		LoggerManager.info("Verifying Switching tabs");
		TestBase.setExtentReportSettings("Switching tabs Test", "Functional Test", "Verify Switching tabs", "Verifying Switching tabs");
		assertEquals(communityBlocksPage.switchingTabs(),"Active");
	}
	
	@Test(priority = 5, description = "Verify Add Block", groups = { "Functional" }, alwaysRun=true)
	public void verifyAddBlock()
	{
		LoggerManager.info("Verifying Add Block");
		TestBase.setExtentReportSettings("Community Add Blocks Page Title Test", "Functional Test", "Verify Add Community Blocks Title", "Verifying Add Community Blocks Page Title");
		assertEquals(communityBlocksPage.addBlock(),"Add Community Block");
	}

	@Test(priority = 6, description = "Verify Edit Button", groups = { "Functional" }, alwaysRun=true)
	public void verifyActiveEditButtonOption()
	{
		LoggerManager.info("Verifying Active Edit Button Option");
		TestBase.setExtentReportSettings("Active Edit Title Test", "Functional Test", "Verify Active Edit Title", "Verifying Active Edit Title");
		assertEquals(communityBlocksPage.activeEditButton(), "Block Text:");     
	}
	
	@Test(priority = 7, description = "Verify Expire Edit Button", groups = { "Functional" }, alwaysRun=true)
	public void verifyExpiredEditButtonoption()
	{
		LoggerManager.info("Verifying Expired Edit Button Option");
		TestBase.setExtentReportSettings("Expired Edit Title Test", "functional Test", "Verify Expired Edit Title", "Verifying Expired Edit Title");
		assertEquals(communityBlocksPage.expiredEditButton(),"Block Text:");   
	}

	@Test(priority = 8, description = "Verify Community Filter", groups = { "Functional" }, alwaysRun=true)
	public void verifyCommunityFilterOption()
	{
		LoggerManager.info("Verifying Community Filter Option");
		TestBase.setExtentReportSettings("Community Filter", "Functional Test", "Verify Community Filter", "Verifying Community Filter");
		assertEquals(communityBlocksPage.communityFilter(),"Community");
	}

	
}
