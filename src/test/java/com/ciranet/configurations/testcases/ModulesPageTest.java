package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;


public class ModulesPageTest extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider" ,description = "Verify Configuration Module", groups = { "Smoke" }, alwaysRun=true)
	public void verifyconfigModulesClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Configuration Module");
		modulesPage =loginPage.verifyModulesPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Module Configuration Title", "Smoke Test", "Module Configuration", "Verify Module Configuration");

	}
	@Test(priority = 1, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyConfigurations() 

	{
		LoggerManager.info("Verifying Customer Defined Info");
		TestBase.setExtentReportSettings("Verifying  Customer Defined Info Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");
		assertEquals(modulesPage.configurationsModules(),"Customer Defined Info - RealManage");	
			
	}


	@Test(priority = 2, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyEgnyteConfiguration() 

	{   
		LoggerManager.info("Verifying Egnyte Configuration");	
		TestBase.setExtentReportSettings("Verifying Egnyte Configuration Title", "Smoke Test", "Modules Configuration", "Verify  Modules Configurations ");
		assertEquals(modulesPage.egnyteConfiguration(),"Egnyte Configuration - Global");		
			
	}


	@Test(priority = 3, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyHelp() 

	{   
		LoggerManager.info("Verifying Help");
		TestBase.setExtentReportSettings("Verifying Help - Global Title", "Smoke Test","Modules Configurations", "Verify  Modules Configurations ");
		assertEquals(modulesPage.help(),"Help - Global");
		
			
	}

	@Test(priority = 4, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyRecommendationsandAssumptions() 

	{   
		LoggerManager.info("Verifying Recommendations and Assumptions - Global");		
		TestBase.setExtentReportSettings("Verifying Recommendations and Assumptions Title", "Smoke Test", "Recommendations and Assumptions - Global", "Verify Recommendations and Assumptions - Global");
		assertEquals(modulesPage.recommendationsandAssumptions(),"Recommendations and Assumptions - Global");		
			
	}


	@Test(priority = 5, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifySupplimentalInformation() 

	{   
		LoggerManager.info("Verifying Supplemental Information");	
		TestBase.setExtentReportSettings("Verifying Supplemental Information - Global Title", "Smoke Test", "Modules Configurations", "Verify  Modules Configurations ");
		assertEquals(modulesPage.supplimentalInformation(),"Supplemental Information - Global");	
			
	}


	@Test(priority = 6, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyTransitionDocuments() 

	{   
		LoggerManager.info("Verifying Transition Document");
		TestBase.setExtentReportSettings("Verifying Transition Document - Global Title", "Smoke Test", "Transition Document", "Verify Transition Document");
		assertEquals(modulesPage.transitionDocuments(),"Transition Document - Global");
			
	}
	@Test(priority = 7, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyTransitionTaskTemplates() 

	{   
		LoggerManager.info("Verifying Transition Task Templates");
		TestBase.setExtentReportSettings("Verifying Transition Task Templates -  Title", "Smoke Test", "Transition Task Templates", "Verify Transition Task Templates");
		assertEquals(modulesPage.transitionTaskTemplates(),"Tasks");
			
	}


	@Test(priority = 8, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyWorkOrderWorkArea() 

	{   
		LoggerManager.info("Verifying Work Order Work Areas");
		TestBase.setExtentReportSettings("Verifying Work Order Work Areas Title", "Smoke Test", "Modules Configurations", "Verify  Modules Configurations ");
		assertEquals(modulesPage.workOrderWorkArea(),"Work Order Work Areas - 1920 E. Maryland Place Townhomes, Inc.");
		
			
	}

}