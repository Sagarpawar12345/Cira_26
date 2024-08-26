package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ResponseTemplatesPageTest extends TestBase 
{
	
	@Test(priority = 0,  dataProvider = "internalUserProvider" , description = "Verify Response Template", groups = { "Smoke" }, alwaysRun=true)
	public void verifyConfigReportTemplatesClickPages(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying  Response Templates");
		responseTemplatesPage =loginPage.verifyResponseTemplatesPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying  Response Templates Title", "Smoke Test", " Response Templates Configurations ", "Verify Response Templates Configurations");		
	}


	@Test(priority = 1, description = "Verify Response Template", groups = { "Functional" }, alwaysRun=true)

	public void verifyLetterTemplate() 
	{
		LoggerManager.info("Verifying  Response Templates");
		TestBase.setExtentReportSettings("Verifying  Response Templates Title", "Smoke Test", " Response Templates Configurations ", "Verify  Response Templates Configurations");
		assertEquals(responseTemplatesPage.responseTemplate(),"Response Templates Configurations");
	}
}
