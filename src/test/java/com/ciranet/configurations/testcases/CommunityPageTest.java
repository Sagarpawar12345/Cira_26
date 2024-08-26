package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class CommunityPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Configurations Page Title", groups = { "Smoke" })
	public void verifyConfigurationsMenu(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Configurations Page Title");
		communityconfigurationsPage = loginPage.verifyCommunityConfigPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Configuration Test", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		assertEquals(communityconfigurationsPage.navigateToConfigurationsPage(), "Configurations");
	}
	
	@Test(priority = 1, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyNavigateToCommunityConfigurations() {
		LoggerManager.info("Verifying Community Configurations Title");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		assertEquals(communityconfigurationsPage.navigateToCommunityConfigurations(),"Community Configurations");
		
	}

	@Test(priority = 2, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyAmenityDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations first dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Amenity");
		assertEquals(communityconfigurationsPage.labelAmenity.getText(), "Amenity - Global");
		
	}

	@Test(priority = 3, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyBoardApprovalDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations second dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Board Approval");
		assertEquals(communityconfigurationsPage.labelBoardApproval.getText(), "Board Approval - Global");
		
	}
	
	@Test(priority = 4, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyCollectionLettersDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Collection Letter Fees");
		assertEquals(communityconfigurationsPage.labelCollectionLetterFees.getText(), "Collection Letter Fees - RealManage");
		
	}
	
	@Test(priority = 5, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyCommunityConfigurationDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Community Configuration");
		assertEquals(communityconfigurationsPage.labelCommunityConfiguration.getText(), "Community Configuration - 1920 E. Maryland Place Townhomes, Inc.");
		
	}
	
	@Test(priority = 6, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyFullfilmentJobSpecialPricingDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Fulfillment Job Special Pricing Configuration");
		assertEquals(communityconfigurationsPage.labelFullfillmentJobSpecialPricingConfiguration.getText(), "Fulfillment Job Special Pricing Configuration - Global");
		
	}
	
	@Test(priority = 7, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyHolidayDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Holidays");
		assertEquals(communityconfigurationsPage.labelHoliday.getText(), "Holidays - Global");
		
	}
	@Test(priority = 8, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyInfo() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Info");
		assertEquals(communityconfigurationsPage.labelInfo.getText(), "Info - Global");
		
	}
	
	@Test(priority = 9, description = "Verify Configurations Page >> Community Configurations dropdown8", groups = { "Smoke" })
	public void verifyMassCommunicationConfiguration() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Mass Communication Configuration");
		assertEquals(communityconfigurationsPage.labelMassConfigurationConfiguration.getText(), "Mass Communication Configuration - RealManage");
		
	}
	
	@Test(priority = 10, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyNotes() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Notes");
		assertEquals(communityconfigurationsPage.labelNotes.getText(), "Notes - Global");
		
	}
    
	@Test(priority = 11, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyOnwerFees() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Owner Fees");
		assertEquals(communityconfigurationsPage.labelOwnerFees.getText(), "Owner Fees - RealManage");
		
	}
	
	@Test(priority = 12, description = "Verify Community Configurations", groups = { "Smoke" })
	public void verifyPrintingProvider() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		communityconfigurationsPage.selectCommunityConfigDropdowns("Printing Provider");
		assertEquals(communityconfigurationsPage.labelPrintingProvider.getText(), "Printing Provider - Global");
		
	}

}