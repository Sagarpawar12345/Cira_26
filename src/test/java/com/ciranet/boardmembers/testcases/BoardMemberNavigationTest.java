package com.ciranet.boardmembers.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class BoardMemberNavigationTest extends TestBase {
	@Test(priority = 0, dataProvider = "boardMemberProvider" , description = "Verify HomePage of Board Member", groups = { "Functional" },alwaysRun = true)
	public void verifyHomePageSearch(XMLCredentialsReader.userCredentials credentials)  {
		LoggerManager.info("Verify HomePage of Board Member");
		boardMemberHomePage = loginPage.verifyBoardMemberHomePage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Board Member Page Components Test", "Smoke Test", "Verify Home Page Components", "Verifying Home Page Components");
		assertTrue(boardMemberHomePage.verifyPageHeaderAndClickHelpIcon(),"Failed to get the Page Help");
	}

	// ========== Communications menus starts here ========== // 
	
	@Test(priority = 1, description = "Verify Communication Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommunication()  {
		LoggerManager.info("Verifying Communication-Announcement Page");
		TestBase.setExtentReportSettings("Communication-Announcement Test", "Smoke Test", "Verify Communication-Announcement Page", "Verifying Communication-Announcement Page");
		assertEquals(boardMemberHomePage.verifyCommunicationMenu(),"Announcements");
	}

	@Test(priority = 2, description = "Verify Mail Merge Page", groups = { "Functional" },alwaysRun = true)
	public void verifyMailMerge()  {
		LoggerManager.info("Verifying Mail Merge Page");
		TestBase.setExtentReportSettings("Mail Merge Test", "Smoke Test", "Verify Mail Merge Page", "Verifying Mail Merge Page");
		assertEquals(boardMemberHomePage.verifyMailMergeModule(), "Mail Merge");
	}

	@Test(priority = 3, description = "Verify Resident Contact Logs Page", groups = { "Functional" },alwaysRun = true)
	public void verifyResidentContactLogs()  {
		LoggerManager.info("Verifying Resident Contact Logs Page");
		TestBase.setExtentReportSettings("Resident Contact Logs Test", "Smoke Test", "Verify Resident Contact Logs Page", "Verifying Resident Contact Logs Page");
		assertEquals(boardMemberHomePage.verifyResidentContactLogsModule(), "Resident Contact Logs");
	}
	// ========== Communications menus ends here ========== // 
	
	// ========== Compliance menus starts here ========== // 
	

 
	public void verifyCertiedTracking()  {
		LoggerManager.info("Verifying Certified Tracking Page");
		TestBase.setExtentReportSettings("Certified Tracking Test", "Smoke Test", "Verify Certified Tracking Page", "Verifying Certified Tracking Page");
		assertEquals(boardMemberHomePage.verifyComplianceCertifiedTrackingModule(), "Certified Tracking");
	}
	
	@Test(priority = 5, description = "Verify Detailed Violation Log Page", groups = { "Functional" },alwaysRun = true)
	public void verifyDetailedViolationLog()  {
		LoggerManager.info("Verifying Detailed Violation Log Page");
		TestBase.setExtentReportSettings("Detailed Violation Log Test", "Smoke Test", "Verify Detailed Violation Log Page", "Verifying Detailed Violation Log Page");
		assertEquals(boardMemberHomePage.verifyDetailedViolationLogTrackingModule(), "Detailed Violations Log");
	}
	
	@Test(priority = 6, description = "Verify Last Inspection Log Page", groups = { "Functional" },alwaysRun = true)
	public void verifyLastInspectionLog()  {
		LoggerManager.info("Verifying Last Inspection Log Page");
		TestBase.setExtentReportSettings("Last Inspection Log Test", "Smoke Test", "Verify Last Inspection Log Page", "Verifying Last Inspection Log Page");
		assertEquals(boardMemberHomePage.verifyLastInspectionLogModule(), "Last Inspection Log");
	}
	
	@Test(priority = 7, description = "Verify Open Violations Log Page", groups = { "Functional" },alwaysRun = true)
	public void verifyOpenViolationsLog()  {
		LoggerManager.info("Verifying Open Violations Log Page");
		TestBase.setExtentReportSettings("Open Violations Log Test", "Smoke Test", "Verify Open Violations Log Page", "Verifying Open Violations Log Page");
		assertEquals(boardMemberHomePage.verifyLastOpenViolationsModule(), "Open Violations Log");
	}
	
	@Test(priority = 8, description = "Verify Report A Violation Page", groups = { "Functional" },alwaysRun = true)
		public void verifyReportAViolation()  {
			LoggerManager.info("Verifying Report A Violation Page");
			TestBase.setExtentReportSettings("Report A Violation Test", "Smoke Test", "Verify Report A Violation Page", "Verifying Report A Violation Page");
			assertEquals(boardMemberHomePage.verifyReportAViolationModule(), "Report a Violation");
		}
	
	@Test(priority = 9, description = "Verify Restriction Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyRestrictionSummary()  {
		LoggerManager.info("Verifying Restriction Summary Page");
		TestBase.setExtentReportSettings("Restriction Summary Test", "Smoke Test", "Verify Restriction Summary Page", "Verifying Restriction Summary Page");
		assertEquals(boardMemberHomePage.verifyRestrictionSummaryModule(), "Deed Restriction Full Summary");
	}
	
	// =========== Compliance menu Ends here ========== //
	
	// =========== Information menus start here ========== //
	
	@Test(priority = 10, description = "Verify Additional Info Page", groups = { "Functional" },alwaysRun = true)
	public void verifyAdditionalInfoMenu()  {
		LoggerManager.info("Verifying Additional Info Page");
		TestBase.setExtentReportSettings("Additional Info", "Smoke Test", "Verify Additional Info page", "Verifying Additional Info");
		assertEquals(boardMemberHomePage.verifyAdditionalInformationModule(), "Additional Information");
	}
	
	@Test(priority = 11, description = "Verify Amenities And Access Control Page", groups = { "Functional" },alwaysRun = true)
	public void verifyAmenitiesAccessControlMenu()  {
		LoggerManager.info("Verifying Amenities and Access Control Page");
		TestBase.setExtentReportSettings("Amenities and Access Control", "Smoke Test", "Verify Amenities and Access Control page", "Verifying Amenities and Access Control");
		assertEquals(boardMemberHomePage.verifyAmenitiesAccessControlModule(), "Amenities and Access Control");
	}
	
	
	@Test(priority = 12, description = "Verify Board / Committee Members Page", groups = { "Functional" },alwaysRun = true)
	public void verifyBoardCommitteeMembersMenu()  {
		LoggerManager.info("Verifying Board / Committee Members Page");
		TestBase.setExtentReportSettings("Board / Committee Members", "Smoke Test", "Verify Board / Committee Members page", "Verifying Board / Committee Members");
		assertEquals(boardMemberHomePage.verifyBoardCommitteeMemberModule(), "Board / Committee Members");
	}
	
	@Test(priority = 13, description = "Verify Calendar Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCalendarMenu()  {
		LoggerManager.info("Verifying Calendar Page");
		TestBase.setExtentReportSettings("Calendar", "Smoke Test", "Verify Calendar page", "Verifying Calendar Members");
		assertEquals(boardMemberHomePage.verifyCalendarModule(), "My Calendar");
	}
	
	@Test(priority = 14, description = "Verify Common Lots Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommonLotsMenu()  {
		LoggerManager.info("Verifying Common Lots Page");
		TestBase.setExtentReportSettings("Common Lots", "Smoke Test", "Verify Common Lots page", "Verifying Common Lots");
		assertEquals(boardMemberHomePage.verifyCommonLotsMenuClick(), "Common Lots");
	}
	
	@Test(priority = 15, description = "Verify Community Assets Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommunityAssetsMenu()  {
		LoggerManager.info("Verifying Community Assets Menu Page");
		TestBase.setExtentReportSettings("Community Assets ", "Smoke Test", "Verify Community Assets  page", "Verifying Community Assets");
		assertEquals(boardMemberHomePage.verifyCommunityAssetsMenuClick(), "Assets");
	}
	
	@Test(priority = 16, description = "Verify Community Notes Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommunityNotesMenu()  {
		LoggerManager.info("Verifying Community Notes Menu Page");
		TestBase.setExtentReportSettings("Community Notes", "Smoke Test", "Verify Community Notes page", "Verifying Community Notes");
		assertEquals(boardMemberHomePage.verifyCommunityNotesMenuClick(), "Community Notes");
	}
	
	@Test(priority = 17, description = "Verify Documents Archive Page", groups = { "Functional" },alwaysRun = true)
	public void verifyDocumentsArchiveMenu()  {
		LoggerManager.info("Verifying Documents Menu Page");
		TestBase.setExtentReportSettings("Archive", "Smoke Test", "Verify Archive page", "Verifying Archive");
		assertEquals(boardMemberHomePage.verifyDocumentArchiveClick(), "Documents");
	}

	@Test(priority = 18, description = "Verify New Documents Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyNewDocumentSummaryMenu()  {
		LoggerManager.info("Verifying Documents Menu Page");
		TestBase.setExtentReportSettings("New Document Summary", "Smoke Test", "Verify New Document Summary page", "Verifying New Document Summary");
		assertEquals(boardMemberHomePage.verifyNewDocumentSummaryClick(), "New Document Summary");
		boardMemberHomePage.ClickDocumentMenu();
	}
	
	@Test(priority = 19, description = "Verify New Documents Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyEnforcementPolicyMenu()  {
		LoggerManager.info("Verifying Enforcement Policy Page");
		TestBase.setExtentReportSettings("Enforcement Policy", "Smoke Test", "Verify Enforcement Policy page", "Verifying Enforcement Policy");
		assertEquals(boardMemberHomePage.verifyEnforcementPolicyMenuClick(), "Enforcement Policy");
	}
	
	@Test(priority = 20, description = "Verify Graphs & Metrics Page", groups = { "Functional" },alwaysRun = true)
	public void verifyGraphsAndMetricsMenu()  {
		LoggerManager.info("Verifying Graphs & Metrics Page");
		TestBase.setExtentReportSettings("Enforcement Policy", "Smoke Test", "Verify Graphs & Metrics page", "Verifying Enforcement Policy");
		assertEquals(boardMemberHomePage.verifyGraphsAndMetricsMenuClick(), "Community Dashboard");
	}
	
	@Test(priority = 21, description = "Verify Community Information Page", groups = { "Functional" },alwaysRun = true)
	public void verifyInfoSummaryMenu()  {
		LoggerManager.info("Verifying Community Information Page");
		TestBase.setExtentReportSettings("Community Information", "Smoke Test", "Verify Community Information page", "Verifying Community Information");
		assertEquals(boardMemberHomePage.verifyInfoSummaryMenuClick(), "Community Information");
	}
	
	@Test(priority = 22, description = "Verify Insurance Page", groups = { "Functional" },alwaysRun = true)
	public void verifyInsuranceMenu()  {
		LoggerManager.info("Verifying Insurance Page");
		TestBase.setExtentReportSettings("Insurance", "Smoke Test", "Verify Insurance page", "Verifying Insurance");
		assertEquals(boardMemberHomePage.verifyInsuranceMenuClick(), "Insurance");
	}

	@Test(priority = 23, description = "Verify Legal Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyLegalSummaryMenu()  {
		LoggerManager.info("Verifying Legal Summary Page");
		TestBase.setExtentReportSettings("Legal Summary", "Smoke Test", "Verify Legal Summary page", "Verifying Legal Summary");
		assertEquals(boardMemberHomePage.verifyLegalSummaryMenuClick(), "Legal Information");
	}
	
	@Test(priority = 24, description = "Verify Map Page", groups = { "Functional" },alwaysRun = true)
	public void verifyMapMenu()  {
		LoggerManager.info("Verifying Community Map Page");
		TestBase.setExtentReportSettings("Community Map", "Smoke Test", "Verify Community Map page", "Verifying Community Map");
		assertEquals(boardMemberHomePage.verifyMapMenuClick(), "Community Map");
		boardMemberHomePage.clickBreadMenu();
	}
	
	@Test(priority = 25, description = "Verify Vendor Management Page", groups = { "Functional" },alwaysRun = true)
	public void verifyVendorManagementMenu()  {
		LoggerManager.info("Verifying Vendor Management Page");
		TestBase.setExtentReportSettings("Vendor Management", "Smoke Test", "Verify Vendor Management page", "Verifying Vendor Management");
		assertEquals(boardMemberHomePage.verifyVendorManagementMenuClick(), "Vendor Management");
		boardMemberHomePage.informationMenuClick();
	}
	
	@Test(priority = 26, description = "Verify Property Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyPropertiesMenu()  {
		LoggerManager.info("Verifying Property Details Page");
		TestBase.setExtentReportSettings("Property Details", "Smoke Test", "Verify Property Details page", "Verifying Property Details");
		assertEquals(boardMemberHomePage.verifyPropertiesMenuClick(), "Property Details"); 
		boardMemberHomePage.clickBreadMenu();
	}
	
	@Test(priority = 27, description = "Verify Resident Directory Page", groups = { "Functional" },alwaysRun = true)
	public void verifyResidentDirectoryMenu()  {
		LoggerManager.info("Verifying Resident Directory Page");
		TestBase.setExtentReportSettings("Resident Directory", "Smoke Test", "Verify Resident Directory page", "Verifying Resident Directory");
		assertEquals(boardMemberHomePage.verifyResidentDirectoryMenu(), "Resident Directory"); 
	}
	
	@Test(priority = 28, description = "Verify Reports - Move-In-Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyMoveInSummaryMenu()  {
		LoggerManager.info("Verifying Reports Move-In-Summary Page");
		TestBase.setExtentReportSettings("Reports-Move-In-Summary", "Smoke Test", "Verify Reports-Move-In-Summary page", "Verifying Reports Move-In-Summary");
		assertEquals(boardMemberHomePage.verifyReportsMenuClick(), "Move-In Summary"); 
	}

	@Test(priority = 29, description = "Verify Reports - On Demand Page", groups = { "Functional" },alwaysRun = true)
	public void verifyOnDemandMenu() {
		LoggerManager.info("Verifying Reports On Demand Page");
		TestBase.setExtentReportSettings("Reports-On Demand", "Smoke Test", "Verify Reports-On Demand page", "Verifying Reports On-Demand");
		assertEquals(boardMemberHomePage.verifyReportsOnDemandMenuClick(), "Reports"); 
	}
	
	@Test(priority = 30, description = "Verify Reports - Summary Previous Month Page", groups = { "Functional" },alwaysRun = true)
	public void verifySummaryPreviousMonthMenu() {
		LoggerManager.info("Verifying Summary Previous Month Page");		
		TestBase.setExtentReportSettings("Reports-Summary Previous Month", "Smoke Test", "Verify Reports-Summary Previous Month page", "Verifying Report - Summary Previous Month");
		assertEquals(boardMemberHomePage.verifyReportsSummaryPrevMonthClick(),"Operations Summary - Previous Month" );
	}
	
	// ========== Cirabooks Starts here ========== Here need to check whether CiraBooks menu is available or not// 
	
	@Test(priority = 31, description = "Verify Cirabooks Worksspace Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksWorkSpace() {
		
		System.out.println("Verifying Cirabooks Worksspace Page");
		
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		 
		assertEquals(boardMemberHomePage.verifyCiraBooksMenusClick(),"CiraBooks Workspace" );
	}
	
	@Test(priority = 32, description = "Verify AP Expense Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksMenu() {
		LoggerManager.info("Verifying AP Expense Details Page");
		
		TestBase.setExtentReportSettings("AP Expense Details", "Smoke Test", "Verify AP Expense Details page", "Verifying AP Expense Details ");
		
		if (!boardMemberHomePage.isAPMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyCBAccountsPayableMenusClick(), "AP Expense Detail"); 
	}	
	
	@Test(priority = 33, description = "Verify AP Ledger Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksApLedgerMenu() {
		LoggerManager.info("Verifying AP Ledger Page");
		
		TestBase.setExtentReportSettings("AP Ledger", "Smoke Test", "Verify AP Ledger page", "Verifying AP Ledger");
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyCBAPLedgerMenuClick(), "AP Ledger"); 
	}

	
	@Test(priority = 34, description = "Verify My Submitted Invoices Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksMySubmittedInvoicesMenu() {
		LoggerManager.info("Verifying My Submitted Invoices Page");
		TestBase.setExtentReportSettings("My Submitted Invoices", "Smoke Test", "Verify My Submitted Invoices page", "Verifying My Submitted Invoices");
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyAccountsPayableMySubmittedInvoiceMenu(), "Review My Invoices");
	}

	@Test(priority = 35, description = "Verify Open AP Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksOpenAPMenu() {
		LoggerManager.info("Verifying Open AP Page");
		
		TestBase.setExtentReportSettings("Open AP", "Smoke Test", "Verify Open AP page", "Verifying Open AP");
		
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyCbOpenApMenuClick(), "Approved Open AP");
       	}
	
	@Test(priority = 36, description = "Verify Search InvoicesPage", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksSearchInvoicesMenu() {
		LoggerManager.info("Verifying Search Invoices Page");
		TestBase.setExtentReportSettings("Search Invoices", "Smoke Test", "Verify Search Invoices page", "Verifying Search Invoices");
		assertEquals(boardMemberHomePage.verifyCbSearchInvoicesMenuClick(), "Search Invoices");
	}
	
	@Test(priority = 37, description = "Verify Search InvoicesPage", groups = { "Functional" }, alwaysRun = true)
	public void verifyCiraBooksSubmitInvoiceMenu() {
	    LoggerManager.info("Verifying Submit Invoice Page");
	    TestBase.setExtentReportSettings("Submit Invoice", "Smoke Test", "Verify Submit Invoice page", "Verifying Submit Invoice");
	    assertEquals(boardMemberHomePage.verifyCBSubmitInvoiceMenuClick(), "Submit Invoice/Payment Request");
	}

	@Test(priority = 38, description = "Verify Vendor Aging Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksVendorAgingMenu() {
		LoggerManager.info("Verifying vendor Aging Page");
		TestBase.setExtentReportSettings("Vendor Aging", "Smoke Test", "Verify Vwndor Aging page", "Verifying Vendor Aging");
		
		assertEquals(boardMemberHomePage.verifyCBVendorAgingMenuClick(), "Vendor Aging");
        boardMemberHomePage.clickAccountPayableMenuClick();
    }
	
	
	@Test(priority = 39, description = "Verify AR Ledger Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBookARsMenu() {
		LoggerManager.info("Verifying AR Ledger Details Page");
		TestBase.setExtentReportSettings("AR Ledger Details", "Smoke Test", "Verify AR Ledger Details page", "Verifying AR Ledger Details ");
		assertEquals(boardMemberHomePage.verifyCBARLedgerMenuClick(), "AR Ledger");
	}	

	@Test(priority = 40, description = "Verify AR Ledger Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBookARAssessmentRulessMenu() {
		LoggerManager.info("Verifying Assessment Rules Page");
		TestBase.setExtentReportSettings("Assessment Rules Details", "Smoke Test", "Verify Assessment Rules Page", "Verifying Assessment Rules Details");
		assertEquals(boardMemberHomePage.verifyCBARAssessmentRulesMenuClick(), "Assessment Rules");
	}
	

	@Test(priority = 41, description = "Verify Customer Aging Page", groups = { "Functional" },alwaysRun = true)
		public void verifyCiraBookARCustomerAgingMenu() {
			LoggerManager.info("Verifying Customer Aging Page");
			TestBase.setExtentReportSettings("Customer Aging Details", "Smoke Test", "Verify Customer Aging Page", "Verifying Customer Aging Details");
			assertEquals(boardMemberHomePage.verifyCBARCustomerAgingMenuClick(), "Customer Aging");
		}
		
	@Test(priority = 42, description = "Verify Delinquency Detail Page", groups = { "Functional" },alwaysRun = true)
		public void verifyCiraBookARDelinquencyDetailMenu() {
			LoggerManager.info("Verifying Delinquency Detail Page");
			TestBase.setExtentReportSettings("Customer Delinquency Detail", "Smoke Test", "Verify Delinquency Detail Page", "Verifying Delinquency Detail");
			assertEquals(boardMemberHomePage.verifyCBARDelinquencyDetailMenuClick(), "Delinquency Detail");
			boardMemberHomePage.clickBreadMenu();
		}
		
	@Test(priority = 43, description = "Verify Actual Vs Budget Page", groups = { "Functional" },alwaysRun = true)
		public void verifyFRActualVsBudget() {
			LoggerManager.info("Verifying Actual Vs Budget Page");
			TestBase.setExtentReportSettings("ActualVsBudget Test", "Smoke Test", "Verify ActualVsBudget Page", "Verifying ActualVsBudget Page");
			boardMemberHomePage.verifyFRActualVsBudgetMenu();
			assertEquals(boardMemberHomePage.verifyFRActualVsBudgetMenu(), "Actual vs Budget");
		}	
	
	@Test(priority = 44, description = "Verify Benchmark Report Page", groups = { "Functional" },alwaysRun = true)
		public void verifyBenchmarkReport() {
			LoggerManager.info("Verifying Benchmark Report Page");
			TestBase.setExtentReportSettings("Benchmark Report Test", "Smoke Test", "Verify Benchmark Report Page", "Verifying Benchmark Report Page");
			assertEquals(boardMemberHomePage.verifyFRBenchmarkReportMenu(), "Benchmark Report");
		}
		
	@Test(priority = 45, description = "Verify Financial Summary Page", groups = { "Functional" },alwaysRun = true)
		public void verifyFinancialSummary() {
			LoggerManager.info("Verifying Financial Summary Page");
			TestBase.setExtentReportSettings("Financial Summary Test", "Smoke Test", "Verify Financial Summary Page", "Verifying Financial Summary Page");
			assertEquals(boardMemberHomePage.verifyFRFinancialSummaryMenu(), "Financial Summary");
		}
		
		
	@Test(priority = 46, description = "Verify General Ledger Report Page", groups = { "Functional" },alwaysRun = true)
		public void verifyGLReport() {
			LoggerManager.info("Verifying General Ledger Report Page");
			TestBase.setExtentReportSettings("General Ledger Report Test", "Smoke Test", "Verify General Ledger Report Page", "Verifying General Ledger Report Page");
			assertEquals(boardMemberHomePage.verifyGLGeneralLedgerReportMenu(), "General Ledger Report");
		}
		
	@Test(priority = 47, description = "Verify Trial Balance Page", groups = { "Functional" },alwaysRun = true)
		public void verifyGLTrialBalance() {
			LoggerManager.info("Verifying Trial Balance Page");
			TestBase.setExtentReportSettings("Trial Balance Test", "Smoke Test", "Verify Trial Balance Page", "Verifying Trial Balance Page");
			
			assertEquals(boardMemberHomePage.verifyTrialBalanceMenu(),"General Ledger Report");
		}
		
	@Test(priority = 48, description = "Verify Architectural Application Page", groups = { "Functional" },alwaysRun = true)
		public void verifymyWQArchitecturalApplication() {
			LoggerManager.info("Verifying Architectural Application Page");
			TestBase.setExtentReportSettings("Architectural Application Test", "Smoke Test", "Verify Architectural Application Page", "Verifying Architectural Application Page");
			assertEquals(boardMemberHomePage.verifyMyWorkQueueCommMgmtArchiApplMenu(), "Architectural Application");
		}
		
	@Test(priority = 49, description = "Verify Board Approval Page", groups = { "Functional" },alwaysRun = true)
		public void verifymyWQBoardApproval() {
			LoggerManager.info("Verifying Board Approval Page");
			TestBase.setExtentReportSettings("Board Approval Test", "Smoke Test", "Verify Board Approval Page", "Verifying Board Approval Page");
			assertEquals(boardMemberHomePage.verifyMyWorkQueueBoardApprovalMenu(), "Board Approvals");
		}
		
	@Test(priority = 50, description = "Verify Maintenance Work Orders Page", groups = { "Functional" },alwaysRun = true)
		public void verifymyWQMaintenceWorkOrders() {
			LoggerManager.info("Verifying Maintenance Work Orders Page");
			TestBase.setExtentReportSettings("Maintenance Work Orders Test", "Smoke Test", "Verify Maintenance Work Orders Page", "Verifying Maintenance Work Orders Page");
			assertEquals(boardMemberHomePage.verifyMyWorkQueueMaintenanceWorkOrdersMenu(), "Maintenance Work Orders");
		}

}

