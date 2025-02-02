package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class CommunityAccountingPageTest extends TestBase
{
	
	@Test(priority = 0,  dataProvider = "internalUserProvider" , description = "Verify Community Accounting Configuration", groups = { "Smoke" }, alwaysRun=true)
	public void verifyCommunityAccountingPage(XMLCredentialsReader.userCredentials credentials)
	{
		LoggerManager.info("Verifying Community Accounting Configuration");
		communityAccountingPage =loginPage.verifyCommunityAccountingPage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Community Accounting Configuration", "Smoke Test","Community Accounting Configurations", "Verify  Community Accounting Configurations");
		assertEquals(communityAccountingPage.communityAccountingPage(),"Community Accounting Configurations");
	}
	
	@Test(priority = 1, description = "Verify AAP Cross Entity Bill", groups = { "Functional" }, alwaysRun=true)
	public void verifyaapCrossEntityBill() 
	{
		LoggerManager.info("Verifying AAP Cross Entity Bill");
		TestBase.setExtentReportSettings("Verifying AAP Cross Entity Bill Title", "Functional Test", "AAP Cross Entity Bill", "Verify AAP Cross Entity Bill");	
		assertEquals(communityAccountingPage.aapCrossEntityBill(),"AAP Cross Entity Bill - 1920 E. Maryland Place Townhomes, Inc.");
	}

	@Test(priority = 2, description = "Verify AAP Work Flow Auto Action", groups = { "Functional" }, alwaysRun=true)
	public void verifyaapWorkFlowAutoAction() 
	{
		LoggerManager.info("Verifying AAP Work Flow Auto Action");
		TestBase.setExtentReportSettings("Verifying AAP  Work Flow Auto Action Title", "Functional Test", "AAP Work Flow Auto Action", "Verify AAP Work Flow Auto Action");	
		assertEquals(communityAccountingPage.aapWorkFlowAutoAction(),"AAP Work Flow Auto Action - Global");
	}
	
	@Test(priority = 3, description = "Verify AAP Work Flow CheckList", groups = { "Functional" }, alwaysRun=true)
	public void verifyaapWorkFlowCheckList() 
	{
		LoggerManager.info("Verifying AAP Work Flow CheckList");
		TestBase.setExtentReportSettings("Verifying AAP Work Flow CheckList Title", "Functional Test", "AAP Work Flow CheckList", "Verify AAP Work Flow CheckList");	
		assertEquals(communityAccountingPage.aapWorkFlowCheckList(),"AAP Work Flow CheckList - Global");
	}
	
	@Test(priority = 4, description = "Verify AAR Billing Types", groups = { "Functional" }, alwaysRun=true)
	public void verifyaarBillingTypes() 
	{
		LoggerManager.info("Verifying AAR Billing Types");
		TestBase.setExtentReportSettings("Verifying AAR Billing Types Title", "Functional Test", "AAR Billing Types", "Verify AAR Billing Types");	
		assertEquals(communityAccountingPage.aarBillingTypes(),"AAR Billing Types - Global");
	}
		
	@Test(priority = 5, description = "Verify AAR Builder Statements", groups = { "Functional" }, alwaysRun=true)
	public void verifyaarBuilderStatements() 
	{
		LoggerManager.info("Verifying AAR Builder Statements");
		TestBase.setExtentReportSettings("Verifying AAR Builder Statements Title", "Functional Test", "AAR Builder Statements", "Verify AAR Builder Statements");	
		assertEquals(communityAccountingPage.aarBuilderStatements(),"AAR Builder Statements - Global");
	}

	@Test(priority = 6, description = "Verify AAR Misc Invoice Types", groups = { "Functional" }, alwaysRun=true)
	public void verifyaarMiscInvoiceTypes() 
	{
		LoggerManager.info("Verifying AAR Misc Invoice Types");
		TestBase.setExtentReportSettings("Verifying  Title", "Functional Test", "AAR Misc Invoice Types", "Verify AAR Misc Invoice Types");	
		assertEquals(communityAccountingPage.aarMiscInvoiceTypes(),"AAR Misc Invoice Types - RealManage");
	}

	@Test(priority = 7, description = "Verify AAR Payment Application Order", groups = { "Functional" }, alwaysRun=true)
	public void verifyaarPaymentApplicationOrder() 
	{
		LoggerManager.info("Verifying AAR Payment Application Order");
		TestBase.setExtentReportSettings("Verifying AAR Payment Application Order Title", "Functional Test", "AAR Payment Application Order", "Verify AAR Payment Application Order");	
		assertEquals(communityAccountingPage.aarPaymentApplicationOrder(),"AAR Payment Application Order - Global");
	}

	@Test(priority = 8, description = "Verify AAR Statements", groups = { "Functional" }, alwaysRun=true)
	public void verifyaarStatements() 
	{
		LoggerManager.info("Verifying AAR Statements");
		TestBase.setExtentReportSettings("Verifying AAR Statements Title", "Functional Test", "AAR Statements", "Verify AAR Statements");	
		assertEquals(communityAccountingPage.aarStatements(),"AAR Statements - RealManage");
	}

	@Test(priority = 9, description = "Verify Collections Configuration", groups = { "Functional" }, alwaysRun=true)
	public void verifycollectionsConfiguration() 
	{
		LoggerManager.info("Verifying Collections Configuration");
		TestBase.setExtentReportSettings("Verifying Collections Configuration Title", "Functional Test", "Collections Configuration", "Verify Collections Configuration");	
		assertEquals(communityAccountingPage.collectionsConfiguration(),"Collections Configuration - Global");
	}
	
}
