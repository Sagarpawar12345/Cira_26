package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ServicesPageTest extends TestBase {
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Service Configuration", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyServicesPage(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Service Configurations");
		servicesPage = loginPage.verifyServicesPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Service Configuration", "Smoke Test", "Services Configurations",
				"Verify Services Configurations");
		assertEquals(servicesPage.servicesConfiguration(), "Services Configurations");
	}

	@Test(priority = 1, description = "Verify Board Approval", groups = { "Functional" }, alwaysRun = true)
	public void verifyBoardPortal() 
	{
		LoggerManager.info("Verifying Board Approval");
		TestBase.setExtentReportSettings("Verifying Board Approval Title", "Functional Test", "Board Approval",
				"Verify Board Approval");
		assertEquals(servicesPage.boardPortal(), "Board Portal - Global");
	}

	@Test(priority = 2, description = "Verify Branding Configuration", groups = { "Functional" }, alwaysRun = true)
	public void verifyBrandingConfiguration() 
	{
		LoggerManager.info("Verifying Branding Configuration");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", "Functional Test",
				"Branding Configuration", "Verify Branding Configuration");
		assertEquals(servicesPage.brandingConfiguration(), "Branding Configuration - Global");
	}

	@Test(priority = 3, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun = true)
	public void verifyBussinessHours() 
	{
		LoggerManager.info("Verifying Bussiness Hour");
		TestBase.setExtentReportSettings("Verifying Business Hours - Global Title", "Functional Test",
				" Business Hours ", "Verify Business Hours");
		assertEquals(servicesPage.bussinessHour(), "Business Hours - Global");
	}

	@Test(priority = 4, description = "Verify Calendar Configuration", groups = { "Functional" }, alwaysRun = true)
	public void verifyCalendarConfiguration() 
	{
		LoggerManager.info("Verifying Calendar Configuration");
		TestBase.setExtentReportSettings("Verifying Calendar Configuration - Global Title", "Functional Test",
				"Calendar Configuration", "Verify Calendar Configuration");
		assertEquals(servicesPage.calendarConfiguration(), "Calendar Configuration - Global");
	}

	@Test(priority = 5, description = "Verify Mass Communication System Template Configuration", groups = {
			"Functional" }, alwaysRun = true)
	public void verifyMassCommunicationSystemTemplateConfiguration() 
	{
		LoggerManager.info("Verifying Mass Communication System Template Configuration");
		TestBase.setExtentReportSettings("Verifying Mass Communication System Template Configuration - Global Title",
				"Functional Test", "Mass Communication System Template Configuration",
				"VerifyMass Communication System Template Configuration");
		assertEquals(servicesPage.massCommunicationSystemTemplateConfiguration(),
				"Mass Communication System Template Configuration - Global");
	}

	@Test(priority = 6, description = "Verify Resident Portal", groups = { "Functional" }, alwaysRun = true)
	public void verifyResidentPortal() 
	{
		LoggerManager.info("Verifying Resident Portal");
		TestBase.setExtentReportSettings("Verifying Resident Portal - Global Title", "Functional Test",
				"Resident Portal", "Verify Resident Portal");
		assertEquals(servicesPage.residentPortal(), "Resident Portal - Global");
	}

	@Test(priority = 7, description = "Verify Service Group", groups = { "Functional" }, alwaysRun = true)
	public void verifyServiceGroup() 
	{
		LoggerManager.info("Verifying Service Group");
		TestBase.setExtentReportSettings("Verifying Service Group - Global Title", "Functional Test", "Service Group",
				"Verify Service Group");
		assertEquals(servicesPage.serviceGroup(), "Service Groups - Global");
	}

	@Test(priority = 8, description = "Verify Service Role", groups = { "Functional" }, alwaysRun = true)
	public void verifyServiceRole() 
	{
		LoggerManager.info("Verifying Service Role");
		TestBase.setExtentReportSettings("Verifying Service Roles - Global Title", "Functional Test", "Service Role",
				"Verify Service Role");
		assertEquals(servicesPage.serviceRole(), "Service Roles - Global");
	}

	@Test(priority = 9, description = "Verify Services", groups = { "Functional" }, alwaysRun = true)
	public void verifyServices() 
	{
		LoggerManager.info("Verifying Services");
		TestBase.setExtentReportSettings("Verifying Services - Global Title", "Functional Test", "Services",
				"Verify Services");
		assertEquals(servicesPage.services(), "Services - Global");
	}
}