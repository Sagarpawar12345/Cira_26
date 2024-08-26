package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class BatchJobEmailsPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Configurations Page Title", groups = { "Smoke" }, alwaysRun = true)
	public void verifyConfigurationsMenu(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Configurations Page Title");
		TestBase.setExtentReportSettings("Configuration Test", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		configurationsPage = loginPage.verifyBatchJobEmailConfigurations(credentials.getUsername(), credentials.getPassword());
		
		try {			
			assertEquals(configurationsPage.navigateToConfigurationsPage(), "Configurations");
		
		} catch (SkipException e) {
			System.out.println("Test is skipped " + e.getMessage());
			throw e;
			
		} catch (Exception e) {
			
			System.out.println("Exception occured " + e.getMessage());
			Assert.fail("Test failed due to exception " + e.getMessage());
		} 
	}

	@Test(priority = 1, description = "Verify Configurations Page >> Batch job Emails", groups = { "Smoke" }, alwaysRun = true)
	public void verifyBatchJobEmails() 
	{	LoggerManager.info("Verifying Batch Job Emails Page Title");
		System.out.println("Verifying Batch Job Emails Title");
		TestBase.setExtentReportSettings("Configuration Page BatchJob", "Smoke Test", "Verify Configuration Page Batch Job", "Verifying Configuration Page Batch Job");
		try {
			assertEquals(configurationsPage.navigateToBatchJobEmails(), "Batch Job Emails Configurations");
		} catch (SkipException e) {
			System.out.println("Test is skipped " + e.getMessage());
			throw e;
			
		} catch (Exception e) {
			System.out.println("Exception occured " + e.getMessage());
			Assert.fail("Test failed due to exception " + e.getMessage());
		} 
		
	}

	@Test(priority = 2, description = "Verify Configurations Page >> Batch job Emails URL", groups = { "Functional" }, alwaysRun = true)
	public void verifyNavigateToBatchJobEmails() {
		LoggerManager.info("Verifying Batch Job Emails Title");
		TestBase.setExtentReportSettings("Configuration Page BatchJob Title", "Smoke Test", "Verify Batch Job title", "Verifying Batch Job title");
		configurationsPage.navigateToBatchJobEmails();
		assertTrue(driver.getCurrentUrl().contains("batch-job-emails-configurations"), "Batch Job Emails URL is incorrect");
	}

	@Test(priority = 3, description = "Verify Configurations Page >> Batch job Emails dropdown1", groups = { "Functional" }, alwaysRun = true)
	public void verifyFirstDropdown() 
	{
		LoggerManager.info("Verifying Batch Job Emails first dropdown selection");
		TestBase.setExtentReportSettings("Batch Job Dropdown value first", "Smoke Test", "Verify Batch Job Dropdown Value first", "Verifying Batch Job dropdown value first");
		assertEquals(configurationsPage.selectBatchJobEmailConfigDropdowns("ACH & Fee Notification Email"), "ACH & Fee Notification Email");
	}

	@Test(priority = 4, description = "Verify Configurations Page >> Batch job Emails dropdown2", groups = { "Smoke" }, alwaysRun = true)
	public void verifySelectSecondDropdown() 
	{
		LoggerManager.info("Verifying Batch Job Emails second dropdown selection");
		TestBase.setExtentReportSettings("Batch Job Dropdown value second", "Smoke Test", "Verify Batch Job Dropdown Value second", "Verifying Batch Job dropdown value second");
		assertEquals(configurationsPage.selectBatchJobEmailConfigDropdowns("ACH Notification Email"), "ACH Notification Email");
	}

	@Test(priority = 5, description = "Verify Configurations Page >> Batch job Emails dropdown3", groups = { "Smoke" }, alwaysRun = true)
	public void verifySelectThirdDropdown() 
	{
		LoggerManager.info("Verifying Batch Job Emails third dropdown selection");
		TestBase.setExtentReportSettings("Batch Job Dropdown value", "Smoke Test", "Verify Dropdown Value", "Verifying Batch Job dropdown");
		assertEquals(configurationsPage.selectBatchJobEmailConfigDropdowns("Annual Budget Preparation Kickoff"), "Annual Budget Preparation Kickoff");
	}

	@Test(priority = 6, description = "Verify Configurations Page >> Batch job Emails dropdown4", groups = { "Smoke" }, alwaysRun = true)
	public void verifySelectFourthDropdown() 
	{
		LoggerManager.info("Verifying Batch Job Emails fourth dropdown selection");
		TestBase.setExtentReportSettings("Batch Job Dropdown value", "Smoke Test", "Verify Dropdown Value", "Verifying Batch Job dropdown");
		assertEquals(configurationsPage.selectBatchJobEmailConfigDropdowns("Annual Budget Submission to CAM"), "Annual Budget Submission to CAM");
	}

	@Test(priority = 7, description = "Verify Configurations Page >> Batch job Emails dropdown5", groups = { "Smoke" }, alwaysRun = true)
	public void verifySelectFifthDropdown() 
	{	
		LoggerManager.info("Verifying Batch Job Emails fifth dropdown selection");
		TestBase.setExtentReportSettings("Batch Job Dropdown value", "Smoke Test", "Verify Dropdown Value", "Verifying Batch Job dropdown");
		assertEquals(configurationsPage.selectBatchJobEmailConfigDropdowns("Annual Budget Submission to Client"), "Annual Budget Submission to Client");
	}
}