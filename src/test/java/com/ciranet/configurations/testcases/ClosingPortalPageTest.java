package com.ciranet.configurations.testcases;		

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;		

public class ClosingPortalPageTest extends TestBase 		
{		
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Configurations Page Title", groups = { "Smoke" }, alwaysRun=true)	
	public void verifyConfigurationsMenu(XMLCredentialsReader.userCredentials credentials) 	
	{	
		LoggerManager.info("Verifying Configurations Page Title");
		closingPortalconfigurationsPage = loginPage.verifyClosingPortalConfigClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Configuration Test", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
	}	

	@Test(priority = 1, description = "Verify Configurations Page >> Batch job Emails", groups = { "Smoke" }, alwaysRun=true)	
	public void verifyNavigateToclosingPortal() 
	{	
		LoggerManager.info("Verifying Closing Portal Configurations Title");
		closingPortalconfigurationsPage.navigateToclosingPortal();
		assertTrue(driver.getCurrentUrl().contains("Closing Portal Configurations"), "Closing Portal Configurations URL is incorrect");
	}	

	@Test(priority = 2, description = "Verify Configurations Page >> Closing Portal Configurations dropdown1", groups = { "Smoke" }, alwaysRun=true)	
	public void verifyFirstDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown1");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown first value", "Smoke Test", "Verify Closing Portal Configurations dropdown first value", "Verifying Closing Portal Configurations dropdown first value");
		assertEquals(closingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("Account Inquiry Fulfillment"), "Account Inquiry Fulfillment");
	}	

	@Test(priority = 3, description = "Verify Configurations Page >> Closing Portal Configurations dropdown2", groups = { "Smoke" }, alwaysRun=true)	
	public void verifySelectSecondDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown second value", "Smoke Test", "Verify Closing Portal Configurations dropdown second value", "Verifying Closing Portal Configurations dropdown second value");
		assertEquals(closingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("CiraConnect Fee"), "CiraConnect Fee");
	}	

	@Test(priority = 4, description = "Verify Configurations Page >> Closing Portal Configurations dropdown3", groups = { "Smoke" }, alwaysRun=true)	
	public void verifySelectThirdDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown third value", "Smoke Test", "Verify Closing Portal Configurations dropdown third value", "Verifying Closing Portal Configurations dropdown third value");
		assertEquals(closingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("Closing Portal Delivery Tiers"), "Closing Portal Delivery Tiers");
	}	

	@Test(priority = 5, description = "Verify Configurations Page >> Closing Portal Configurations dropdown4", groups = { "Smoke" }, alwaysRun=true)	
	public void verifySelectFourthDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown fourth value", "Smoke Test", "Verify Closing Portal Configurations dropdown fourth value", "Verifying Closing Portal Configurations dropdown fourth value");
		assertEquals(closingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("Portal Configuration Fees & Charges"), "Portal Configuration Fees & Charges");
	}	

	@SuppressWarnings("unlikely-arg-type")
	@Test(priority = 6, description = "Verify Configurations Page >> Closing Portal Configurations New tier button", groups = { "Smoke" }, alwaysRun=true)	
	public void verifynewtierbutton() 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations fourth dropdown selection");
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown fourth value", "Smoke Test", "Verify Closing Portal Configurations dropdown fourth value", "Verifying Closing Portal Configurations dropdown fourth value");
		equals("ClosingPortalconfigurationsPage.newtierbutton()");
	}
}		
