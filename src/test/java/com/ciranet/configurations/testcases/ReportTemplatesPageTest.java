package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ReportTemplatesPageTest extends TestBase {
	@Test(priority = 0,dataProvider = "internalUserProvider" , description = "Verify Report Template", groups = { "Smoke" }, alwaysRun=true)
	public void verifyConfigReportTemplatesClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Report Template");
		reportTemplatesPage =loginPage.verifyReportTemplatesPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Report Configuration Page Title", "Smoke Test", "Report Configuration", "Verify Report Configuration");
		
		}

	@Test(priority = 1, description = "Verify Report Template", groups = { "Functional" }, alwaysRun=true)
	public void verifyLetterTemplate() 
	{
		LoggerManager.info("Verifying Letter Template");
		TestBase.setExtentReportSettings("Verifying   Letter Templates / Builder Statement Cover Letter - Global  Title", "Smoke Test", "Letter Template", "Verify Letter Template");	
		assertEquals(reportTemplatesPage.letterTemplate(),"Letter Templates / Builder Statement Cover Letter - Global");
	}

	@Test(priority = 2, description = "Verify Report Template", groups = { "Functional" }, alwaysRun=true)
	public void verifyLetterHeadTemplate() 
	{
		LoggerManager.info("Verifying Letterhead Template");
		TestBase.setExtentReportSettings("Verifying  Letterhead Template / Page Footer - Global  Title", "Smoke Test", "Letterhead Template", "Verify Letterhead Template");
		assertEquals(reportTemplatesPage.letterHeadTemplate(),"Letterhead Template / Page Footer - Global");
	}
}