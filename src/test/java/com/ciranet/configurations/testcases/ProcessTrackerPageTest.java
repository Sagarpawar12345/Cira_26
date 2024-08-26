package com.ciranet.configurations.testcases;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ProcessTrackerPageTest extends TestBase {
	@Test(priority = 0,dataProvider = "internalUserProvider" , description = "Verify Process Tracker", groups = { "Smoke" }, alwaysRun=true)
	public void verifyConfigProcessTrackerClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Process Tracker");
		processTrackerPage =loginPage.verifyProcessTrackerPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Process Tracker", "Smoke Test", "Process Tracker", "Verify Process Tracker");
		
		}

	@Test(priority = 1, description = "Verify Process Tracker", groups = { "Functional" }, alwaysRun=true)

	public void verifyCommunityAutoCloseReportGeneration() 

	{
		LoggerManager.info("Verifying Community Auto Close & Report Generation");
		TestBase.setExtentReportSettings("Verifying  Community Auto Close & Report Generation - Global Title", "Smoke Test", "Community Auto Close & Report Generation - Global", "Verify Community Auto Close & Report Generation - Global");
		assertEquals(processTrackerPage.communityAutoCloseReportGeneration(),"Community Auto Close & Report Generation - Global");
		
			
	}

	@Test(priority = 2, description = "Verify Process Tracker", groups = { "Functional" }, alwaysRun=true)

	public void verifyFinancialPackageConfiguration() 

	{
		LoggerManager.info("Verifying Financial Package Configuration");
		TestBase.setExtentReportSettings("Verifying Financial Package Configuration - Global Title", "Smoke Test", "Financial Package Configuration - Global", "Verify Financial Package Configuration");
		assertEquals(processTrackerPage.financialPackageConfiguration(),"Financial Package Configuration - Global");
		
			
	}
	@Test(priority = 3, description = "Verify Process Tracker", groups = { "Functional" }, alwaysRun=true)

	public void verifyProcessTrackerConfiguration() 

	{
		LoggerManager.info("Verifying Process Tracker Configuration");
		TestBase.setExtentReportSettings("Verifying Process Tracker Configuration - Global Title", "Smoke Test", "Process Tracker Configuration", "Verify Process Tracker Configuration");	
		assertEquals(processTrackerPage.processTrackerConfiguration(),"Process Tracker Configuration - Global");
		
			
	}


}
