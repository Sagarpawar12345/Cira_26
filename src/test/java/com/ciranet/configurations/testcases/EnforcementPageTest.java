package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class EnforcementPageTest extends TestBase{
	
	@Test(priority = 0, dataProvider = "internalUserProvider" ,description = "Verify Configuration Module", groups = { "Smoke" }, alwaysRun=true)
	public void verifyConfigEnforcementClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Enforcement Configuration");
		enforcementPage =loginPage.verifyEnforcementPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Enforcement Configuration Module", "Smoke Test", "Enforcement Configuration", "Verify Enforcement Configuration");

	}
	
	@Test(priority = 1, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyArchitecturalCategories() 

	{
		
		LoggerManager.info("Verifying Architectural Categories");
		assertEquals(enforcementPage.architecturalCategories(),"Architectural Categories - Global");	
		TestBase.setExtentReportSettings("Verifying Architectural Categories Title", "Smoke Test", "Architectural Categories", "Verify Architectural Categories");	
	}

	@Test(priority = 2, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyArchitecturalFormsandGuides() 

	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.architecturalFormsandGuides(),"Architectural Forms and Guides - Global");
		TestBase.setExtentReportSettings("Verifying Architectural Forms and Guides", "Smoke Test", "Architectural Forms and Guides", "Verify Architectural Forms and Guides");	
	}

	@Test(priority = 3, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationCategorySubCategoryConfiguration() 

	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.violationCategorySubCategoryConfiguration(),"Violation Category / SubCategory Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Violation Category Sub Category Configuration", "Smoke Test", "Violation Category Sub Category Configuration", "Verify Violation Category Sub Category Configuration");	
	}
    
	@Test(priority = 4, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationEscalationConfiguration() 

	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.violationEscalationConfiguration(),"Violation Escalation Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Violation Escalation Configuration", "Smoke Test", "Violation Escalation Configuration", "Verify Violation Escalation Configuration");	
	}

	@Test(priority = 5, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationNotificationTemplates() 

	{
		LoggerManager.info("Verifying Architectural Categories");
		assertEquals(enforcementPage.violationNotificationTemplates(),"Violation Notification Templates - Global");
		TestBase.setExtentReportSettings("Verifying Violation Notification Templates", "Smoke Test", "Violation Notification Templates", "Verify Violation Notification Templates");	
	}
 
	@Test(priority = 6, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationRestrictionDefinition() 

	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.violationRestrictionDefinition(),"Violation Restriction Definition - 1920 E. Maryland Place Townhomes, Inc.");
		TestBase.setExtentReportSettings("Verifying Violation Restriction Definition", "Smoke Test", "Violation Restriction Definition", "Verify Violation Restriction Definition");	
	}

}
