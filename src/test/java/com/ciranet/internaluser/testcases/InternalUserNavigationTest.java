package com.ciranet.internaluser.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

@SuppressWarnings("unused")
public class InternalUserNavigationTest extends TestBase {
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify All Modules Link Page", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifycheckAllModulesLinkPageLanding(XMLCredentialsReader.userCredentials credentials)
	{
		LoggerManager.info("Verifying Account Management Link");
		internalUserPage = loginPage.verifyInternalUserPage(credentials.getUsername(), credentials.getPassword());
		 internalUserPage.checkAllModulesLinkPageLanding();
		TestBase.setExtentReportSettings("Account Management test", "Smoke Test", "Verify Account Management Title",
				"Verifying Account Management Title");
		assertEquals(internalUserPage.accountManagementheader.getText(), "Account Management");
	}

	@Test(priority = 1, description = "Verify Achievements Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyAchievementsURL() {
		LoggerManager.info("Verifying Achievements Link Page");
		internalUserPage.AchievementsPageLanding();
		TestBase.setExtentReportSettings("achievements test", "Smoke Test", "Verify achievements Title",
				"Verifying achievements Title");
		assertEquals(internalUserPage.achievementsheader.getText(), "Achievements");
	}

	@Test(priority = 2, description = "Verify Cloud Drive Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyCloudDriveURL() {
		LoggerManager.info("Verifying Cloud Drive Link Page");
		internalUserPage.CloudDrivePageLanding();
		TestBase.setExtentReportSettings("cloud Drives", "Smoke Test", "Verify cloud Drives Title",
				"Verifying cloud Drives Title");
		assertTrue(internalUserPage.cloudDrivesheader.isDisplayed());
	}

	@Test(priority = 3, description = "Verify Map of My Communities Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyMapofMyCommunitiesURL() {
		LoggerManager.info("Verifying Map of My Communities Link Page");
		internalUserPage.MapofMyCommunitiesPageLanding();
		TestBase.setExtentReportSettings("map of My Communities", "Smoke Test", "Verify map of My Communities Title",
				"Verifying map of My Communities Title");
		assertEquals(internalUserPage.mapofMyCommunitiesHeader.getText(), "Map of My Communities");
	}

	@Test(priority = 4, description = "Verify My Communities page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyMyCommunitiesURL() throws AWTException {
		LoggerManager.info("Verifying My Communities Link Page");
		internalUserPage.myCommunitiesPageLanding();
		TestBase.setExtentReportSettings("my Communities", "Smoke Test", "Verify my Communities  Title",
				"Verifying my Communities Title");
		assertEquals(internalUserPage.myCommunitiesHeader.getText(), "My Communities");
	}

	@Test(priority = 5, description = "Verify My Tests page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifymyTestsURL()  {
		LoggerManager.info("Verifying My Tests Link Page");
		internalUserPage.myTestsPageLanding();
		TestBase.setExtentReportSettings("my Tests;", "Smoke Test", "Verify my Tests Title",
				"Verifying my Tests Title");
		assertEquals(internalUserPage.myTestsheader.getText(), "My Tests");
	}

	@Test(priority = 6, description = "Verify My Text page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifymyTextURL()  {
		LoggerManager.info("Verifying My Text Link Page");
		internalUserPage.myTextPageLanding();
		TestBase.setExtentReportSettings("my Text", "Smoke Test", "Verify my Text Title", "Verifying my Text Title");
		assertEquals(internalUserPage.myTextMenuHeader.getText(), "My Text");
	}

	@Test(priority = 7, description = "Verify Revenue Management page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifynavigatetorevenueManagement()  {
		LoggerManager.info("Verifying Revenue Management Page");
		internalUserPage.navigateToRevenueManagement();
	}

	@Test(priority = 8, description = "Verify  page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verify()  {
		LoggerManager.info("Verifying  Page");
		internalUserPage.billingItemManagementPageLanding();
		TestBase.setExtentReportSettings("Billing Item Management", "Smoke Test",
				"Verify Billing Item Management Title", "Verifying Billing Item Management Title");
		assertEquals(internalUserPage.billingItemManagementheader.getText(), "Billing Item Management");
	}

	@Test(priority = 9, description = "Verify Billing Queue Management page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifybillingQueueManagementPageLanding()  {
		LoggerManager.info("Verifying Billing Queue Management Page");
		internalUserPage.billingQueueManagementPageLanding();
		TestBase.setExtentReportSettings("Billing Queue Management", "Smoke Test",
				"Verify Billing Queue Management Title", "Verifying Billing Queue Management Title");
		assertEquals(internalUserPage.billingQueueManagementheader.getText(), "Billing Queue Management");
	}

	@Test(priority = 10, description = "Verify My Customer Charges page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifymyCustomerChargesPageLanding()  {
		LoggerManager.info("Verifying My Customer Charges Page");
		internalUserPage.myCustomerChargesPageLanding();
		TestBase.setExtentReportSettings("My Customer Charges", "Smoke Test", "Verify My Customer Charges Title",
				"Verifying My Customer Charges Title");
		assertEquals(internalUserPage.myCustomerChargesheader.getText(), "My Customer Charges");
	}

	@Test(priority = 11, description = "Verify Test Plan Configuration page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifytestPlanConfigurationPageLanding()  {
		LoggerManager.info("Verifying Test Plan Configuration Link Page");
		internalUserPage.testPlanConfigurationPageLanding();
		TestBase.setExtentReportSettings("test Plan Configuration", "Smoke Test", "Verify  Title",
				"Verifying test Plan Configuration Title");
		assertEquals(internalUserPage.testPlanConfigurationheader.getText(), "test Plan Configuration");
	}

	@Test(priority = 12, description = "Verify Testing Configuration page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifytestingConfigurationPageLanding()  {
		LoggerManager.info("Verifying Testing Configuration Link Page");
		internalUserPage.testingConfigurationPageLanding();
		TestBase.setExtentReportSettings("testing Configuration", "Smoke Test", "Verify testing Configuration Title",
				"Verifying testing Configuration Title");
		assertEquals(internalUserPage.testingConfigurationheader.getText(), "testing Configuration");
	}

	@Test(priority = 13, description = "Verify Time Expense Management page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifytimeExpenseManagementPageLanding()  {
		LoggerManager.info("Verifying Time Expense Management Link Page");
		internalUserPage.timeExpenseManagementPageLanding();
		TestBase.setExtentReportSettings("time Expense Management", "Smoke Test",
				"Verify time Expense Management Title", "Verifying time Expense Management Title");
		assertEquals(internalUserPage.timeExpenseManagementheader.getText(), "time Expense Management");
	}

	@Test(priority = 14, description = "Verify Time and Expense Submission page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifytimeandExpenseSubmissionPageLanding()  {
		LoggerManager.info("Verifying Time and Expense Submission Link Page");
		internalUserPage.timeandExpenseSubmissionPageLanding();
		TestBase.setExtentReportSettings("time Expense Submission", "Smoke Test",
				"Verify time Expense Submission Title", "Verifying time Expense Submission Title");
		assertEquals(internalUserPage.timeExpenseSubmissionheader.getText(), "time Expense Submission");
	}

	@Test(priority = 15, description = "Verify Vendor Management page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyvendorManagementPageLanding()  {
		LoggerManager.info("Verifying Vendor Management Link Page");
		internalUserPage.vendorManagementPageLanding();
		TestBase.setExtentReportSettings("vendor Management", "Smoke Test", "Verify vendor Management Title",
				"Verifying vendor Management Title");
		assertEquals(internalUserPage.vendorManagementheader.getText(), "vendor Management");
	}

	@Test(priority = 16, description = "Verify My Work Queue Menu", groups = { "Smoke" }, alwaysRun = true)
	public void VerifymyWorkQueueURL()  {

		LoggerManager.info("Verifying My Work Queue Menu");
		TestBase.setExtentReportSettings("Verifying My Work Queue Title", "Smoke Test", "AR Payment",
				"Verify AR Payment");
		internalUserPage.myWorkQueuePageLanding();
	}

	@Test(priority = 17, description = "Verify Automated Document Print ", groups = { "Functional" }, alwaysRun = true)
	public void ArchitecturalApplication()

	{
		internalUserPage.architecturalApplication();
		System.out.println("Page Title is:" + " Architectural Application ");
		TestBase.setExtentReportSettings("Verifying Architectural Application Title", "Smoke Test",
				"Architectural Application", "Verify Architectural Application");
		assertEquals(internalUserPage.lblArchitecturalAplicationLabel1.getText(), "Architectural Application");
	}

	@Test(priority = 18, description = "Verify Automated Document Print ", groups = { "Functional" }, alwaysRun = true)
	public void AutomatedDocumentPrint()

	{
		internalUserPage.automatedDocumentPrint();
		assertEquals((internalUserPage.lblAutomatedPrintDocument).getText(), " Automated Document Print ");
		System.out.println("Page Title is:" + " Automated Document Print ");
		TestBase.setExtentReportSettings("Verifying  Automated Document Print  Title", "Smoke Test",
				"Automated Document Print", "Verify Automated Document Print");

	}

	@Test(priority = 19, description = "Verify Board Approvals ", groups = { "Functional" }, alwaysRun = true)
	public void BoardApprovals()

	{
		internalUserPage.boardApprovals();
		assertEquals((internalUserPage.lblBoardApproval).getText(), "Board Approvals");
		System.out.println("Page Title is:" + "  ** Board Approvals **  ");
		TestBase.setExtentReportSettings("Verifying  ** Board Approvals **  Title", "Smoke Test",
				"  ** Board Approvals **  ", "Verify   ** Board Approvals **  ");

	}

	@Test(priority = 20, description = "Verify Common Lots Apprisal ", groups = { "Functional" }, alwaysRun = true)
	public void CommonLotsApprisal()

	{
		internalUserPage.commonLotsApprisal();
		assertEquals((internalUserPage.lblCommonLotsApprisal).getText(), "Common Lots Appraisal");
		System.out.println("Page Title is:" + "Common Lots Apprisal ");
		TestBase.setExtentReportSettings("Verifying Common Lots Title", "Smoke Test", "Common Lots Apprisal",
				"Verify Common Lots Apprisal");

	}

	@Test(priority = 21, description = "Verify Fullfillment Queue ", groups = { "Functional" }, alwaysRun = true)
	public void FullfillmentQueue()

	{
		internalUserPage.fullfillmentQueue();
		assertEquals((internalUserPage.lblFulfillmentQueue).getText(), "Fulfillment Queue");
		System.out.println("Page Title is:" + " Fulfillment Queue ");
		TestBase.setExtentReportSettings("Verifying Fulfillment Queue Title", "Smoke Test", "Fulfillment Queue",
				"Verify Fulfillment Queue");

	}

	@Test(priority = 22, description = "Verify Maintenance Work Order ", groups = { "Functional" }, alwaysRun = true)
	public void MaintenanceWorkOrder()

	{
		internalUserPage.maintenanceWorkOrder();
		assertEquals((internalUserPage.lblMaintenanceWorkOrder).getText(), "Maintenance Work Orders");
		System.out.println("Page Title is:" + " Maintenance Work Orders ");
		TestBase.setExtentReportSettings("Verifying Maintenance Work Order Title", "Smoke Test",
				"Maintenance Work Orders", "Verify Maintenance Work Orders");

	}

	@Test(priority = 23, description = "Verify Violation Review ", groups = { "Functional" }, alwaysRun = true)
	public void ViolationReview()

	{
		internalUserPage.violationReview();
		assertEquals((internalUserPage.lblViolationReviewingReview).getText(), "Open Violations Requiring Review");
		System.out.println("Page Title is:" + "Open Violations Requiring Review ");
		TestBase.setExtentReportSettings("Verifying Violation Review Title", "Smoke Test",
				"Open Violations Requiring Review", "Verify Open Violations Requiring Review");

	}

	@Test(priority = 24, description = "Verify Add Community ", groups = { "Functional" }, alwaysRun = true)
	public void AddCommunity()

	{
		internalUserPage.addCommunity();
		System.out.println("Page Title is:" + "Organization Details");
		TestBase.setExtentReportSettings("Verifying Organization Details Title", "Smoke Test", "Organization Details",
				"Verify Organization Details");
	}

	@Test(priority = 25, description = "Verify On Boarding CheckList ", groups = { "Functional" }, alwaysRun = true)
	public void OnBoardCheckList()

	{
		internalUserPage.onBoardCheckList();
		assertEquals((internalUserPage.lblOnBoardingChecklist).getText(), "On-Boarding Checklist");
		System.out.println("Page Title is:" + " On-Boarding Checklist ");
		TestBase.setExtentReportSettings("Verifying  On-Boarding Checklist  Title", "Smoke Test",
				"On-Boarding Checklist", "Verify On-Boarding Checklist");

	}

	@Test(priority = 26, description = "Verify On Boarding Flags ", groups = { "Functional" }, alwaysRun = true)
	public void OnBoardingFlag()

	{
		internalUserPage.onBoardingFlag();
		assertEquals((internalUserPage.lblOnBoardingFlag).getText(), "Modify an On-Boarding Community");
		System.out.println("Page Title is:" + "Modify an On-Boarding Community ");
		TestBase.setExtentReportSettings("Verifying  Modify an On-Boarding Community  Title", "Smoke Test",
				"Modify an On-Boarding Community", "Verify Modify an On-Boarding Community");

	}

	@Test(priority = 27, description = "Verify Schedule First Assessment ", groups = { "Functional" }, alwaysRun = true)
	public void ScheduleFirstAssessment()

	{
		internalUserPage.scheduleFirstAssessment();
		assertEquals((internalUserPage.lblSceduleFirstAssessment).getText(), "Schedule First Assessment");
		System.out.println("Page Title is:" + "Schedule First Assessment");
		TestBase.setExtentReportSettings("Verifying  Schedule First Assessment  Title", "Smoke Test",
				"Schedule First Assessment", "Verify Schedule First Assessment");

	}

	@Test(priority = 28, description = "Verify Schedule Initial Assessment ", groups = {
			"Functional" }, alwaysRun = true)
	public void ScheduleInitialAssessment()

	{
		internalUserPage.scheduleInitialAssessment();
		assertEquals((internalUserPage.lblScheduleInitialAssessment).getText(), "Schedule Initial Statement");
		System.out.println("Page Title is:" + "Schedule Initial Assessment");
		TestBase.setExtentReportSettings("Verifying  Schedule Initial Statement Title", "Smoke Test",
				"Schedule Initial Assessment", "Verify Schedule Initial Assessment");

	}

	@Test(priority = 29, description = "Verify Closing Portal Location Manager ", groups = {
			"Functional" }, alwaysRun = true)
	public void ClosingPortalLocationManager()

	{
		internalUserPage.closingPortalLocationManager();
		assertEquals((internalUserPage.lblClosingPortalLocationManager).getText(), "Closing Portal Location Manager");
		System.out.println("Page Title is:" + "Closing Portal Location Manager");
		TestBase.setExtentReportSettings("Verifying  Closing Portal Location Manager  Title", "Smoke Test",
				"Closing Portal Location Manager", "Verify Closing Portal Location Manager");

	}

	@Test(priority = 30, description = "Verify Closing Request ", groups = { "Functional" }, alwaysRun = true)
	public void ClosingRequests()

	{
		internalUserPage.closingRequests();
		assertEquals((internalUserPage.lblClosingRequest).getText(), "Closing Requests");
		System.out.println("Page Title is:" + "Closing Request");
		TestBase.setExtentReportSettings("Verifying  Closing Requests  Title", "Smoke Test", "Closing Request",
				"Verify Closing Request");

	}

	@Test(priority = 31, description = "Verify Closing Request ", groups = { "Functional" }, alwaysRun = true)
	public void communityBlocks()

	{
		internalUserPage.communityBlocks();
		assertEquals((internalUserPage.llCommunityBlocks).getText(), "SOA Community Blocks Config");
		System.out.println("Page Title is:" + " SOA Community Blocks Config ");
		TestBase.setExtentReportSettings("Verifying  Closing Requests  Title", "Smoke Test", "Closing Request",
				"Verify Closing Request");

	}

	@Test(priority = 32, description = "Verify Property Conveyances ", groups = { "Functional" }, alwaysRun = true)
	public void PropertyConveyances()

	{
		internalUserPage.propertyConveyances();
		assertEquals((internalUserPage.lblPropertyConveyances).getText(), "Property Ownership Conveyance");
		System.out.println("Page Title is:" + " Property Conveyances ");
		TestBase.setExtentReportSettings("Verifying  Property Ownership Conveyance  Title", "Smoke Test",
				"Property Conveyances", "Verify Property Conveyances");

	}

	
	@Test(priority = 34, description = "Verify Internal Task ", groups = { "Functional" }, alwaysRun = true)
	public void verifyInternalTask()

	{
		internalUserPage.internalTask();
		assertEquals((internalUserPage.lblInternalTask).getText(), " Internal Tasks ");
		System.out.println("Page Title is:" + "Internal Tasks");
		TestBase.setExtentReportSettings("Verifying  Internal Tasks  Title", "Smoke Test", "Internal Tasks",
				"Verify Internal Tasks");

	}

	@Test(priority = 35, description = "Verify My Work Inbox ", groups = { "Functional" }, alwaysRun = true)
	public void verifyMyWorkInbox()

	{
		internalUserPage.myWorkInbox();
		assertEquals((internalUserPage.lblMyWorkInbox).getText(), " My Work Inbox ");
		System.out.println("Page Title is:" + "My Work Inbox");
		TestBase.setExtentReportSettings("Verifying  My Work Inbox Title", "Smoke Test", "My Work Inbox",
				"Verify My Work Inbox");

	}

	@Test(priority = 36, description = "Verify Invoice Approval ", groups = { "Functional" }, alwaysRun = true)
	public void verifyInvoiceApproval()

	{
		internalUserPage.invoiceApproval();
		assertEquals((internalUserPage.lblInvoiceApproval).getText(), "AAP Workflow Queue");
		System.out.println("Page Title is:" + "Invoice Approval");
		TestBase.setExtentReportSettings("Verifying  AAP Workflow Queue Title", "Smoke Test", "Invoice Approval",
				"Verify Invoice Approval");

	}

	@Test(priority = 37, description = "Verify Invoice Approval ", groups = { "Functional" }, alwaysRun = true)
	public void verifyMetrics()

	{
		internalUserPage.metrics();
		assertEquals((internalUserPage.lblMetrics).getText(), "AAP Workflow Metrics");
		System.out.println("Page Title is:" + "Metrics");
		TestBase.setExtentReportSettings("Verifying  AAP Workflow Metrics Title", "Smoke Test", "Metrics",
				"Verify Metrics");

	}

	@Test(priority = 38, description = "Verify Invoice Approval ", groups = { "Functional" }, alwaysRun = true)
	public void verifyProcessInvoice()

	{
		internalUserPage.processInvoice();
		System.out.println("Page Title is:" + "Process Invoice");
		TestBase.setExtentReportSettings("Verifying New AR Payment Title", "Smoke Test", "Process Invoice",
				"Verify Process Invoice");

	}

	@Test(priority = 39, description = "Verify Annual Budget Preparation ", groups = { "Functional" }, alwaysRun = true)
	public void verifyAnnualBudgetPreparation()

	{
		internalUserPage.annualBudgetPreparation();
		assertEquals((internalUserPage.lblAnnualBudgetPreparation).getText(), "Annual Budget Preparation");
		System.out.println("Page Title is:" + "Annual Budget Praparation");
		TestBase.setExtentReportSettings("Verifying  Annual Budget Preparation Title", "Smoke Test",
				"Annual Budget Praparation", "Verify Annual Budget Praparation");

	}

	@Test(priority = 40, description = "Verify Annual Coupon Order ", groups = { "Functional" }, alwaysRun = true)
	public void verifyAnnualCouponOrder()

	{
		internalUserPage.annualCouponOrder();
		assertEquals((internalUserPage.lblAnnualCouponProcess).getText(), "Annual Coupon Process");
		System.out.println("Page Title is:" + "Annual Coupon Order");
		TestBase.setExtentReportSettings("Verifying  Annual Coupon Process Title", "Smoke Test", "Annual Coupon Order",
				"Verify Annual Coupon Order");

	}

	@Test(priority = 41, description = "Verify Annual Statement Generation Process ", groups = {
			"Functional" }, alwaysRun = true)
	public void verifyAnnualStatementGenerationProcess()

	{
		internalUserPage.annualStatementGenerationProcess();
		assertEquals((internalUserPage.lblAnnualStatementGenerationProcess).getText(),
				"Annual Statement Generation Process");
		System.out.println("Page Title is:" + "Annual Coupon Order");
		TestBase.setExtentReportSettings("Verifying  Annual Statement Generation Process Title", "Smoke Test",
				"Annual Statement Generation Process", "Verify Annual Statement Generation Process");

	}

	@Test(priority = 42, description = "Verify Financial Report Publishing", groups = {
			"Functional" }, alwaysRun = true)
	public void verifyFinancialReportPublishing()

	{
		internalUserPage.financialReportPublishing();
		assertEquals((internalUserPage.lblFinancialReportPublishing).getText(), "Financial Report Publishing");
		System.out.println("Page Title is:" + "Annual Coupon Order");
		TestBase.setExtentReportSettings("Verifying  Financial Report Publishing Title", "Smoke Test",
				"Annual Coupon Order", "Verify Annual Coupon Order");

	}

	@Test(priority = 43, description = "Verify Management Report Publishing", groups = {
			"Functional" }, alwaysRun = true)
	public void verifyManagementReportPublishing()

	{
		internalUserPage.managementReportPublishing();
		assertEquals((internalUserPage.lblMonthlyManagementReportGeneration).getText(),
				"Monthly Management Report Generation");
		System.out.println("Page Title is:" + "Monthly Management Report Generation");
		TestBase.setExtentReportSettings("Verifying  Monthly Management Report Generation Title", "Smoke Test",
				"Monthly Management Report Generation", "Verify Monthly Management Report Generation");

	}

	@Test(priority = 44, description = "Verify Project Task", groups = { "Functional" }, alwaysRun = true)
	public void verifyProjectTask()

	{
		internalUserPage.projectTask();
		System.out.println("Page Title is:" + "Project Task");
		TestBase.setExtentReportSettings("Verifying  Projects / Tasks  Title", "Smoke Test", "Project Task",
				"Verify Project Task");
		assertEquals((internalUserPage.lblProjectTask).getText(), "Projects / Tasks");
	}

	@Test(priority = 45, description = "Verify Bank Returns", groups = { "Functional" }, alwaysRun = true)
	public void verifyBankReturns()

	{
		internalUserPage.bankReturns();
		assertEquals((internalUserPage.lblBankReturns).getText(), "Bank Returns");
		System.out.println("Page Title is:" + "Banks Returns");
		TestBase.setExtentReportSettings("Verifying  Bank Returns Title", "Smoke Test", "Banks Returns",
				"Verify Banks Returns");

	}

	@Test(priority = 46, description = "Verify Project Task", groups = { "Functional" }, alwaysRun = true)
	public void verifyOrderAnnualCoupon()

	{
		internalUserPage.orderAnnualCoupon();
		assertEquals((internalUserPage.lblOrderAnnualCoupon).getText(), "Order Annual Coupons");
		System.out.println("Page Title is:" + "Order Annual Coupon");
		TestBase.setExtentReportSettings("Verifying  Order Annual Coupons Title", "Smoke Test", "Order Annual Coupon",
				"Verify Order Annual Coupon");

	}

	@Test(priority = 47, description = "Verify Payment Post Error", groups = { "Functional" }, alwaysRun = true)
	public void verifyPaymentPostError()

	{
		internalUserPage.paymentPostError();
		System.out.println("Page Title is:" + "Payment Post Errors");
		TestBase.setExtentReportSettings("Verifying  Payment Post Errors Title", "Smoke Test", "Payment Post Error",
				"Verify Payment Post Error");

	}

	@Test(priority = 48, description = "Verify Statement Approval", groups = { "Functional" }, alwaysRun = true)
	public void verifystatementApprovel()

	{
		internalUserPage.statementApproval();
		assertEquals((internalUserPage.lblStatementApproval).getText(), "Statement Approvals");
		System.out.println("Page Title is:" + "Statement Approval");
		TestBase.setExtentReportSettings("Verifying  Statement Approvals Title", "Smoke Test", "Statement Approval",
				"Verify Statement Approval");

	}
	
	
	@Test(priority = 49, description = "Verify CiraBooks Workspace page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyciraBooksModule()  {
		LoggerManager.info("Verifying CiraBooks Workspace Link Page");
		internalUserPage.ciraBooksModule();
	}

	@Test(priority = 50, description = "Verify  Accounts Payable  Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyaccountsPayablePageLanding() {
		LoggerManager.info("Verifying Accounts Payable Link Page");
		internalUserPage.accountsPayablePageLanding();
		TestBase.setExtentReportSettings("accounts Payable", "Smoke Test", "Verify accounts Payable Title",
				"Verifying accounts Payable Title");
		assertEquals(internalUserPage.accountsPayableheader.getText(), "Accounts Payable");
	}

	@Test(priority = 51, description = "Verify AP Bill Analysis Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyapBillAnalysisPageLanding() {
		LoggerManager.info("Verifying AP Bill Analysis Page");
		internalUserPage.apBillAnalysisPageLanding();
		TestBase.setExtentReportSettings("ap Bill Analysis", "Smoke Test", "Verify ap Bill Analysis Title",
				"Verifying ap Bill Analysis Title");
		assertEquals(internalUserPage.apBillAnalysisheader.getText(), "AP Bill Analysis");
	}

	@Test(priority = 52, description = "Verify AP Ledger Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyapLedgerPageLanding() {
		LoggerManager.info("Verifying AP Ledger Page");
		internalUserPage.apLedgerPageLanding();
		TestBase.setExtentReportSettings("ap Ledger", "Smoke Test", "Verify ap Ledger Title",
				"Verifying ap Ledger Title");
		assertEquals(internalUserPage.apLedgerheader.getText(), "AP Ledger");
	}

	@Test(priority = 53, description = "Verify AP Unapplied Payments Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyapUnappliedPaymentsPageLanding() {
		LoggerManager.info("Verifying AP Unapplied Payments Page");
		internalUserPage.apUnappliedPaymentsPageLanding();
		TestBase.setExtentReportSettings("AP Unapplied Payments", "Smoke Test", "Verify AP Unapplied Payments Title",
				"Verifying AP Unapplied Payments Title");
		assertEquals(internalUserPage.apUnappliedPaymentsheader.getText(), "AP Unapplied Payments");
	}

	@Test(priority = 54, description = "Verify CheckPrinting Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifycheckPrintingManagementPageLanding() {
		LoggerManager.info("Verifying Check Printing Management Page");
		internalUserPage.checkPrintingManagementPageLanding();
		TestBase.setExtentReportSettings("check Printing Management", "Smoke Test",
				"Verify check Printing Management Title", "Verifying check Printing Management Title");
		assertEquals(internalUserPage.checkPrintingManagementheader.getText(), "check Printing Management");
	}

	@Test(priority = 55, description = "Verify EFTPaymentManagement Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyeftPaymentManagementPageLanding() {
		LoggerManager.info("Verifying Check EFT Payment Management Page");
		internalUserPage.eftPaymentManagementPageLanding();
		TestBase.setExtentReportSettings("EFT Payment Management", "Smoke Test", "Verify EFT Payment Management Title",
				"Verifying EFT Payment Management Title");
		assertEquals(internalUserPage.eftPaymentManagementheader.getText(), "EFT Payment Management");
	}

	@Test(priority = 56, description = "Verify Local Office Only Check Printing Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifylocalOfficeOnlyCheckPrintingPageLanding() {
		LoggerManager.info("Verifying Check Local Office Only Check Printing Page");
		internalUserPage.localOfficeOnlyCheckPrintingPageLanding();
		TestBase.setExtentReportSettings("Local Office Only Check Printing", "Smoke Test",
				"Verify Local Office Only Check Printing Title", "Verifying Local Office Only Check Printing Title");
		assertEquals(internalUserPage.localOfficeOnlyCheckPrintingheader.getText(), "Local Office Only Check Printing");
	}

	@Test(priority = 57, description = "Verify Manage AAP Workflow Vendor Edit Landing Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifymanageAAPWorkflowVendorEditLanding() {
		LoggerManager.info("Verifying Manage AAP Workflow Vendor Edit Landing Page");
		internalUserPage.manageAAPWorkflowVendorEditLanding();
		TestBase.setExtentReportSettings("manage AAP Work flow Vendor Edit", "Smoke Test",
				"Verify Manage AAP Work flow Vendor Edit Title", "Verifying Manage AAP Work flow Vendor Edit Title");
		assertEquals(internalUserPage.manageAAPWorkflowVendorEditheader.getText(), "Manage AAP Work flow Vendor Edit");
	}

	@Test(priority = 58, description = "Verify My Submitted Invoices Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifymySubmittedInvoicesPageLanding() {
		LoggerManager.info("Verifying My Submitted Invoices Landing Page");
		internalUserPage.mySubmittedInvoicesPageLanding();
		TestBase.setExtentReportSettings("My Submitted Invoices", "Smoke Test", "Verify My Submitted Invoices Title",
				"Verifying My Submitted Invoices Title");
		assertEquals(internalUserPage.mySubmittedInvoicesheader.getText(), "My Submitted Invoices");
	}

	@Test(priority = 59, description = "Verify Reimbursement Request Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyreimbursementRequestPageLanding() {
		LoggerManager.info("Verifying Reimbursement Request Page");
		internalUserPage.reimbursementRequestPageLanding();
		TestBase.setExtentReportSettings("Reimbursement Request", "Smoke Test", "Verify Reimbursement Request Title",
				"Verifying Reimbursement Request Title");
		assertEquals(internalUserPage.reimbursementRequestheader.getText(), "Reimbursement Request");
	}

	@Test(priority = 60, description = "Verify Search Invoices Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifysearchInvoicesPageLanding() {
		LoggerManager.info("Verifying Search Invoices Page");
		internalUserPage.searchInvoicesPageLanding();
		TestBase.setExtentReportSettings("search Invoices", "Smoke Test", "Verify search Invoices Title",
				"Verifying search Invoices Title");
		assertEquals(internalUserPage.searchInvoicesheader.getText(), "search Invoices");
	}

	@Test(priority = 61, description = "Verify Submit Invoice Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifysubmitInvoicePageLanding() {
		LoggerManager.info("Verifying Submit Invoice Page");
		internalUserPage.submitInvoicePageLanding();
		TestBase.setExtentReportSettings("submit Invoice", "Smoke Test", "Verify submit Invoice Title",
				"Verifying submit Invoice Title");
		assertEquals(internalUserPage.submitInvoiceheader.getText(), "Submit Invoice");
	}

	@Test(priority = 62, description = "Verify Vendor 1099 Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyvendor1099PageLanding() {
		LoggerManager.info("Verifying Vendor 1099 Page");
		internalUserPage.vendor1099PageLanding();
		TestBase.setExtentReportSettings("vendor1099", "Smoke Test", "Verify vendor1099 Title",
				"Verifying vendor1099 Title");
		assertEquals(internalUserPage.vendor1099header.getText(), "vendor1099");
	}

	@Test(priority = 63, description = "Verify Vendor Aging Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyvendorAgingPageLanding() {
		LoggerManager.info("Verifying Vendor Aging Page");
		internalUserPage.vendorAgingPageLanding();
		TestBase.setExtentReportSettings("vendor Aging", "Smoke Test", "Verify vendor Aging Title",
				"Verifying vendor Aging Title");
		assertEquals(internalUserPage.vendorAgingheader.getText(), "vendor Aging");
	}

	@Test(priority = 64, description = "Verify Vendor Missing Bills Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyvendorMissingBillsPageLanding() {
		LoggerManager.info("Verifying Vendor Missing Bills Page");
		internalUserPage.vendorMissingBillsPageLanding();
		TestBase.setExtentReportSettings("Vendor Missing Bills", "Smoke Test", "Verify Vendor Missing Bills Title",
				"Verifying Vendor Missing Bills Title");
		assertEquals(internalUserPage.vendorMissingBillsheader.getText(), "Vendor Missing Bills");
	}

	@Test(priority = 65, description = "Verify Accounts Receivable Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyaccountsReceivablePageLanding() {
		LoggerManager.info("Verifying Accounts Receivable Page");
		internalUserPage.accountsReceivablePageLanding();
		TestBase.setExtentReportSettings("Accounts Receivable", "Smoke Test", "Verify Accounts Receivable Title",
				"Verifying Accounts Receivable Title");
		assertEquals(internalUserPage.accountsReceivableheader.getText(), "Accounts Receivable");
	}

	@Test(priority = 66, description = "Verify AR Collection Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyarCollectionPageLanding()  {
		LoggerManager.info("Verifying AR Collection Page");
		internalUserPage.arCollectionPageLanding();
		TestBase.setExtentReportSettings("ARCollection", "Smoke Test", "Verify ARCollection Title",
				"Verifying ARCollection Title");
		assertEquals(internalUserPage.arCollectionheader.getText(), "ARCollection");
	}

	@Test(priority = 67, description = "Verify AR Invoice Analysis Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyarInvoiceAnalysisPageLanding() {
		LoggerManager.info("Verifying AR Invoice Analysis Page");
		internalUserPage.arInvoiceAnalysisPageLanding();
		TestBase.setExtentReportSettings("AR Invoice Analysis", "Smoke Test", "Verify AR Invoice Analysis Title",
				"Verifying AR Invoice Analysis Title");
		assertEquals(internalUserPage.arInvoiceAnalysisheader.getText(), "AR Invoice Analysis");
	}

	@Test(priority = 68, description = "Verify AR Ledger Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyarLedgerPageLanding() {
		LoggerManager.info("Verifying AR Ledger Page");
		internalUserPage.arLedgerPageLanding();
		TestBase.setExtentReportSettings("AR Ledgere", "Smoke Test", "Verify AR Ledgere Title",
				"Verifying AR Ledgere Title");
		assertEquals(internalUserPage.arLedgereheader.getText(), "AR Ledgere");
	}

	@Test(priority = 69, description = "Verify Add Payments Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifyaddPaymentsPageLanding() {
		LoggerManager.info("Verifying Add Payments Page");
		internalUserPage.addPaymentsPageLanding();
		TestBase.setExtentReportSettings("Add Payments", "Smoke Test", "Verify Add Payments Title",
				"Verifying Add Payments Title");
		assertEquals(internalUserPage.addPaymentsheader.getText(), "Add Payments");
	}

	@Test(priority = 70, description = "Verify Customer Aging Page Link", groups = { "Smoke" }, alwaysRun = true)
	public void verifycustomerAgingPageLanding() {
		LoggerManager.info("Verifying Add Payments Page");
		internalUserPage.customerAgingPageLanding();
		TestBase.setExtentReportSettings("Customer Aging", "Smoke Test", "Verify Customer Aging Title",
				"Verifying Customer Aging Title");
		assertEquals(internalUserPage.customerAgingheader.getText(), "Customer Aging");
	}

	@Test(priority = 71, description = "Verify Generate Builder Statements Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifygenerateBuilderStatementsPageLanding() {
		LoggerManager.info("Verifying Generate Builder Statements Page");
		internalUserPage.generateBuilderStatementsPageLanding();
		TestBase.setExtentReportSettings("", "Smoke Test", "Verify Generate Builder Statements Title",
				"Verifying Generate Builder Statements Title");
		assertEquals(internalUserPage.generateBuilderStatementsheader.getText(), "Generate Builder Statements");
	}

	@Test(priority = 72, description = "Verify Lot Payment Allocation Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifylotPaymentAllocationPageLanding() {
		LoggerManager.info("Verifying Lot Payment Allocation Page");
		internalUserPage.lotPaymentAllocationPageLanding();
		TestBase.setExtentReportSettings("Lot Payment Allocation", "Smoke Test", "Verify Lot Payment Allocation Title",
				"Verifying Lot Payment Allocation Title");
		assertEquals(internalUserPage.lotPaymentAllocationheader.getText(), "Lot Payment Allocation");
	}
//=============================== Cash Management page code starts here ===========================

	@Test(priority = 73, description = "Verify CiraBooks>> Cash Management>> Bank Accounts Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifycashManagementPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Bank Accounts Page");
		TestBase.setExtentReportSettings("Verify Cash Management Title", "Smoke Test", "Verify Cash Management Title",
				"Verifying Cash Management Title");
		assertEquals(internalUserPage.cashManagementheader.getText(), "Cash Management");
	}

	@Test(priority = 74, description = "Verify CiraBooks>> Cash Management>> Bank Reconciliation Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifybankReconciliationPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Bank Reconciliation Page");
		internalUserPage.bankReconciliationPageLanding();
		TestBase.setExtentReportSettings("Bank Reconciliation", "Smoke Test", "Verify Bank Reconciliation Title",
				"Verifying Bank Reconciliation Title");
		assertEquals(internalUserPage.bankReconciliationheader.getText(), "Bank Reconciliation");
	}

	@Test(priority = 75, description = "Verify CiraBooks>> Cash Management>> CM Batches Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifycmBatchesPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> CM Batches");
		internalUserPage.cmBatchesPageLanding();
		TestBase.setExtentReportSettings("CM Batches", "Smoke Test", "Verify CM Batches Title",
				"Verifying CM Batches Title");
		assertEquals(internalUserPage.cmBatchesheader.getText(), "CM Batches");
	}

	@Test(priority = 76, description = "Verify CiraBooks>> Cash Management>> Cash Receipts Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifycashReceiptsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Cash Receipts");
		internalUserPage.cashReceiptsPageLanding();
		TestBase.setExtentReportSettings("cash Receipts", "Smoke Test", "Verify cash Receipts Title",
				"Verifying cash Receipts Title");
		assertEquals(internalUserPage.cashReceiptsheader.getText(), "cash Receipts");
	}

	@Test(priority = 77, description = "Verify CiraBooks>> Cash Management>> Cash Receipts Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifycreateCashReceiptsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Create Cash ReceiptsPageLanding");
		internalUserPage.createCashReceiptsPageLanding();
		TestBase.setExtentReportSettings("Create Cash Receipts", "Smoke Test", "Verify Create Cash Receipts Title",
				"Verifying Create Cash Receipts Title");
		assertEquals(internalUserPage.createCashReceiptsheader.getText(), "Create Cash Receipts");
	}

	@Test(priority = 78, description = "Verify CiraBooks>> Cash Management>> Deposits Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifydepositsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Deposits");
		internalUserPage.depositsPageLanding();
		TestBase.setExtentReportSettings("Deposits", "Smoke Test", "Verify Deposits Title", "Verifying Deposits Title");
		assertEquals(internalUserPage.depositsheader.getText(), "Deposits");
	}

	@Test(priority = 79, description = "Verify CiraBooks>> Cash Management>> Funds Transfer Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void veriffundsTransferPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Funds Transfer");
		internalUserPage.fundsTransferPageLanding();
		TestBase.setExtentReportSettings("Funds Transfer", "Smoke Test", "Verify Funds Transfer Title",
				"Verifying Funds Transfer Title");
		assertEquals(internalUserPage.fundsTransferheader.getText(), "Funds Transfer");
	}

	@Test(priority = 80, description = "Verify CiraBooks>> Cash Management>> Lockbox Payment File Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifylockboxPaymentFilePageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Lockbox Payment File");
		internalUserPage.lockboxPaymentFilePageLanding();
		TestBase.setExtentReportSettings("Lockbox Payment File", "Smoke Test", "Verify Lockbox Payment File Title",
				"Verifying Lockbox Payment File Title");
		assertEquals(internalUserPage.lockboxPaymentFileheader.getText(), "Lockbox Payment File");
	}

	@Test(priority = 81, description = "Verify CiraBooks>> Cash Management>> Manage Bank Statements Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifymanageBankStatementsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Manage Bank Statements");
		internalUserPage.manageBankStatementsPageLanding();
		TestBase.setExtentReportSettings("Manage Bank Statements", "Smoke Test", "Verify Manage Bank Statements Title",
				"Verifying Manage Bank Statements Title");
		assertEquals(internalUserPage.manageBankStatementsheader.getText(), "Manage Bank Statements");
	}

	@Test(priority = 82, description = "Verify CiraBooks>> Cash Management>> Unmatched Transactions Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyunmatchedTransactionsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Unmatched Transactions");
		internalUserPage.unmatchedTransactionsPageLanding();
		TestBase.setExtentReportSettings("Unmatched Transactions", "Smoke Test", "Verify Unmatched Transactions Title",
				"Verifying Unmatched Transactions Title");
		assertEquals(internalUserPage.unmatchedTransactionsheader.getText(), "Unmatched Transactions");
	}

	@Test(priority = 83, description = "Verify CiraBooks>> CiraBooks Entity>> Audit Log Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyciraBooksEntityPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> CiraBooks Entity>> Audit Log");
		internalUserPage.ciraBooksEntityPageLanding();
		TestBase.setExtentReportSettings("CiraBooks Entity", "Smoke Test", "Verify CiraBooks Entity Title",
				"Verifying CiraBooks Entity Title");
		assertEquals(internalUserPage.ciraBooksEntityheader.getText(), "CiraBooks Entity");
	}

	@Test(priority = 84, description = "Verify CiraBooks>> CiraBooks Entity>> Configuration Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyconfigurationPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> CiraBooks Entity>> Configuration");
		internalUserPage.configurationPageLanding();
		TestBase.setExtentReportSettings("Configuration", "Smoke Test", "Verify Configuration Title",
				"Verifying Configuration Title");
		assertEquals(internalUserPage.configurationheader.getText(), "Configuration");
	}

	@Test(priority = 85, description = "Verify CiraBooks>> Financial Reports>> Actual Budget Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyfinancialReportsPageLanding()  {
		LoggerManager.info("Verifying CiraBooks>> Financial Reports>> Actual Budget Page");
		internalUserPage.financialReportsPageLanding();
		TestBase.setExtentReportSettings("Financial Reports", "Smoke Test", "Verify Financial Reports Title",
				"Verifying Financial Reports Title");
		assertEquals(internalUserPage.financialReportsheader.getText(), "Financial Reports");
	}

	@Test(priority = 86, description = "Verify CiraBooks>> Financial Reports>> Benchmark Report Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifybenchmarkReportPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Financial Reports>> Benchmark Report page");
		internalUserPage.benchmarkReportPageLanding();
		TestBase.setExtentReportSettings("Benchmark Report", "Smoke Test", "Verify Benchmark Report Title",
				"Verifying Benchmark Report Title");
		assertEquals(internalUserPage.benchmarkReportheader.getText(), "Benchmark Report");
	}

	@Test(priority = 87, description = "Verify CiraBooks>> Financial Reports>> Financial Summary Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyfinancialSummaryPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Financial Reports>> Financial Summary page");
		internalUserPage.financialSummaryPageLanding();
		TestBase.setExtentReportSettings("Financial Summary", "Smoke Test", "Verify Financial Summary Title",
				"Verifying Financial Summary Title");
		assertEquals(internalUserPage.financialSummaryheader.getText(), "Financial Summary");
	}

	@Test(priority = 88, description = "Verify General Ledger>> Budget Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifygeneralLedgerPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Budget page");
		internalUserPage.generalLedgerPageLanding();
		TestBase.setExtentReportSettings("General Ledger", "Smoke Test", "Verify General Ledger Title",
				"Verifying General Ledger Title");
		assertEquals(internalUserPage.generalLedgerheader.getText(), "General Ledger");
	}

	@Test(priority = 89, description = "Verify General Ledger>> General Ledger Report Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifygeneralLedgerReportPageLanding() {
		LoggerManager.info("Verifying General Ledger>> General Ledger Report page");
		internalUserPage.generalLedgerReportPageLanding();
		TestBase.setExtentReportSettings("General Ledger Report", "Smoke Test", "Verify General Ledger Report Title",
				"Verifying General Ledger Report Title");
		assertEquals(internalUserPage.generalLedgerReportheader.getText(), "General Ledger Report");
	}

	@Test(priority = 90, description = "Verify General Ledger>> Journal Entries Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyjournalEntriesPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Journal Entries page");
		internalUserPage.journalEntriesPageLanding();
		TestBase.setExtentReportSettings("Journal Entries", "Smoke Test", "Verify Journal Entries Title",
				"Verifying Journal Entries Title");
		assertEquals(internalUserPage.journalEntriesheader.getText(), "Journal Entries");
	}

	@Test(priority = 91, description = "Verify General Ledger>> Journal Entry Templates Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyjournalEntryTemplatesPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Journal Entry Templates page");
		internalUserPage.journalEntryTemplatesPageLanding();
		TestBase.setExtentReportSettings("Journal Entry Templates", "Smoke Test",
				"Verify Journal Entry Templates Title", "Verifying Journal Entry Templates Title");
		assertEquals(internalUserPage.journalEntryTemplatesheader.getText(), "Journal Entry Templates");
	}

	@Test(priority = 92, description = "Verify General Ledger>> Open Close Books Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyopenCloseBooksPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Open Close Books page");
		internalUserPage.openCloseBooksPageLanding();
		TestBase.setExtentReportSettings("Open Close Books", "Smoke Test", "Verify Open Close Books Title",
				"Verifying Open Close Books Title");
		assertEquals(internalUserPage.openCloseBooksheader.getText(), "Open Close Books");
	}

	@Test(priority = 93, description = "Verify General Ledger>> Trial Balance Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifytrialBalancePageLanding() {
		LoggerManager.info("Verifying General Ledger>> Trial Balance page");
		internalUserPage.trialBalancePageLanding();
		TestBase.setExtentReportSettings("Trial Balance", "Smoke Test", "Verify Trial Balance Title",
				"Verifying Trial Balance Title");
		assertEquals(internalUserPage.trialBalanceheader.getText(), "Trial Balance");
	}

	@Test(priority = 94, description = "Verify General Ledger>> Upload Budgets Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyuploadBudgetsPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Upload Budgets page");
		internalUserPage.uploadBudgetsPageLanding();
		TestBase.setExtentReportSettings("Upload Budgets", "Smoke Test", "Verify Upload Budgets Title",
				"Verifying Upload Budgets Title");
		assertEquals(internalUserPage.uploadBudgetsheader.getText(), "Upload Budgets");
	}

	@Test(priority = 95, description = "Verify General Ledger>> Upload JEs Page Link", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifyuploadJEsPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Upload JEs page");
		internalUserPage.uploadJesPageLanding();
		TestBase.setExtentReportSettings("Upload JEs", "Smoke Test", "Verify Upload JEs Title",
				"Verifying Upload JEs Title");
		assertEquals(internalUserPage.uploadJesHeader.getText(), "Upload JEs");
	}

	// Corporate CiraBook
	@Test(priority = 96, description = "Verify Statement Approval", groups = { "Functional" }, alwaysRun = true)
	public void verifyCorporateCirabook() 

	{
		LoggerManager.info("Verifying Corporate Cirabook");
		internalUserPage.corporateCirabook();
		TestBase.setExtentReportSettings("Verifying  Corporate CiraBook Title", "Smoke Test", "Corporate CiraBook",
				"Verify Corporate CiraBook");

	}

	@Test(priority = 97, description = "Verify AP Batches", groups = { "Functional" }, alwaysRun = true)
	public void verifyAPBatches() 

	{
		internalUserPage.apBatches();
		assertEquals((internalUserPage.lblAPBatches).getText(), "AP Batches");
		System.out.println("Page Title is:" + " AP Batches ");
		TestBase.setExtentReportSettings("Verifying  APBatches Title", "Smoke Test", "APBatches", "Verify APBatches");

	}

	@Test(priority = 98, description = "Verify AP Bill Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyAPBillAnalysis()

	{
		internalUserPage.apBillAnalysis();
		assertEquals((internalUserPage.lblAPBillAnalysis).getText(), "AP Bill Analysis");
		System.out.println("Page Title is:" + " AP Bill Analysis");
		TestBase.setExtentReportSettings("Verifying  AP Bill Analysis Title", "Smoke Test", "AP Bill Analysis",
				"Verify AP Bill Analysis");

	}

	@Test(priority = 99, description = "Verify AP Bill Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyAPLedger()

	{
		internalUserPage.apLedger();
		assertEquals((internalUserPage.lblAPLedger).getText(), "AP Ledger");
		System.out.println("Page Title is:" + " AP Ledger");
		TestBase.setExtentReportSettings("Verifying  AP Ledger Title", "Smoke Test", "AP Ledger", "Verify AP Ledger");

	}

	@Test(priority = 100, description = "Verify Check Printing Management", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCheckPrintingManagement()

	{
		internalUserPage.ccbCheckPrintingManagement();
		assertEquals((internalUserPage.lblCCBCheckPrintingManagement).getText(),
				"Check Printing Management For Management Companies");
		System.out.println("Page Title is:" + " AP Bill Analysis");
		TestBase.setExtentReportSettings("Verifying  Check Printing Management Title", "Smoke Test",
				"Check Printing Management", "Verify Check Printing Management");

	}

	@Test(priority = 101, description = "Verify EFT Payment Management", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBEFTPAymentMAnagement()

	{
		internalUserPage.ccbEFTPaymentManagement();
		assertEquals((internalUserPage.lblCCBEFTPaymentManagement).getText(), "EFT Payment Management");
		System.out.println("Page Title is:" + "EFT Payment MAnagement");
		TestBase.setExtentReportSettings("Verifying  EFT PAyment Management Title", "Smoke Test",
				"EFT PAyment Management", "Verify EFT PAyment Management");

	}

	@Test(priority = 102, description = "Verify New AP Bill", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBNewAPBill()

	{
		internalUserPage.ccbNewAPBill();
		assertEquals((internalUserPage.lblCCBNewAPBills).getText(), "New AP Bill");
		System.out.println("Page Title is:" + "New AP Bill");
		TestBase.setExtentReportSettings("Verifying New AP Bill Title", "Smoke Test", "New AP Bill",
				"Verify New AP Bill");

	}

	@Test(priority = 103, description = "Verify Select Bills to PAy", groups = { "Functional" }, alwaysRun = true)

	public void verifySelectBillstoPay()

	{
		internalUserPage.selectBillstoPay();
		assertEquals((internalUserPage.lblCCBSelectBillstoPay).getText(), "Select Bills to Pay");
		System.out.println("Page Title is:" + "Select Bills to Pay");
		TestBase.setExtentReportSettings("Verifying Select Bills to Pay Title", "Smoke Test", "Select Bills to Pay",
				"Verify Select Bills to Pay");

	}

	@Test(priority = 104, description = "Verify Vendor 1099", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBVendor1099()

	{
		internalUserPage.ccbVendor1099();
		assertEquals((internalUserPage.lblCCBVendor1099).getText(), "Vendor 1099");
		System.out.println("Page Title is:" + "Vendor 1099");
		TestBase.setExtentReportSettings("Verifying Vendor 1099 Title", "Smoke Test", "Vendor 1099",
				"Verify Vendor 1099");

	}

	@Test(priority = 105, description = "Verify Vendor Aging", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBVendorAging()

	{
		internalUserPage.ccbVendorAging();
		assertEquals((internalUserPage.lblCCBVendorAging).getText(), "Vendor Aging");
		System.out.println("Page Title is:" + "Vendor Aging");
		TestBase.setExtentReportSettings("Verifying Vendor Aging Title", "Smoke Test", "Vendor Aging",
				"Verify Vendor Aging");
	}

	@Test(priority = 106, description = "Verify Vendor Aging", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBVendorManagement()

	{
		internalUserPage.ccbVendorManagement();
		assertEquals((internalUserPage.lblCCBVendorManagement).getText(), "Vendor Management");
		System.out.println("Page Title is:" + "Vendor Management");
		TestBase.setExtentReportSettings("Verifying Vendor Management Title", "Smoke Test", "Vendor Management",
				"Verify Vendor Management");
	}

	@Test(priority = 107, description = "Verify Vendor Aging", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBVendorWorkQueueMAnagement()

	{
		internalUserPage.ccbVendorWorkQueueManagement();
		assertEquals((internalUserPage.lblCCBWorkQueueManagement).getText(), "Work Queue Management");
		System.out.println("Page Title is:" + "Work Queue Management");
		TestBase.setExtentReportSettings("Verifying Work Queue Management Title", "Smoke Test", "Work Queue Management",
				"Verify Work Queue Management");
	}

	@Test(priority = 108, description = "Verify CCB AR Batches", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBARBatches()

	{
		internalUserPage.ccbARBatches();
		assertEquals((internalUserPage.lblARBatches).getText(), "AR Batches");
		System.out.println("Page Title is:" + "AR Batches");
		TestBase.setExtentReportSettings("Verifying AR Batches Title", "Smoke Test", "AR Batches", "Verify AR Batches");
	}

	@Test(priority = 109, description = "Verify CCB AR Invoice Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBARInvoiceAnalysis()

	{
		internalUserPage.ccbARInvoiceAnalysis();
		assertEquals((internalUserPage.lblARInvoiceAnalysis).getText(), "AR Invoice Analysis");
		System.out.println("Page Title is:" + "AR Invoice Analysis");
		TestBase.setExtentReportSettings("Verifying AR Invoice Analysis Title", "Smoke Test", "AR Invoice Analysis",
				"Verify AR Invoice Analysis");
	}

	@Test(priority = 110, description = "Verify CCB AR Invoice Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBARLedger()

	{
		internalUserPage.ccbARLedger();
		assertEquals((internalUserPage.lblARLedger).getText(), "AR Ledger");
		System.out.println("Page Title is:" + "AR Ledger");
		TestBase.setExtentReportSettings("Verifying AR Ledger Title", "Smoke Test", "AR Ledger", "Verify AR Ledger");
	}

	@Test(priority = 111, description = "Verify CCB AR Invoice Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCustomerAging()

	{
		internalUserPage.ccbCustomerAging();
		assertEquals((internalUserPage.lblCustomerAging).getText(), "Customer Aging");
		System.out.println("Page Title is:" + "Customer Aging");
		TestBase.setExtentReportSettings("Verifying Customer Aging Title", "Smoke Test", "Customer Aging",
				"Verify Customer Aging");
	}

	@Test(priority = 112, description = "Verify CCB AR Invoice Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCustomerManagement()

	{
		internalUserPage.ccbCustomerManagement();
		assertEquals((internalUserPage.llcCustomerManagement).getText(), "Customer Management");
		System.out.println("Page Title is:" + "Customer Managementt");
		TestBase.setExtentReportSettings("Verifying Customer Management Title", "Smoke Test", "Customer Management",
				"Verify Customer Management");
	}

	@Test(priority = 113, description = "Verify CCB AR Invoice Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBNewARAdjustment()

	{
		internalUserPage.ccbNewARAdjustment();
		assertEquals((internalUserPage.lblNewARAdjustment).getText(), "New AR Adjustment");
		System.out.println("Page Title is:" + "New AR Adjustment");
		TestBase.setExtentReportSettings("Verifying New AR Adjustment Title", "Smoke Test", "New AR Adjustment",
				"Verify New AR Adjustment");
	}

	@Test(priority = 114, description = "Verify CCB AR Invoice Analysis", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBNewARInvoice()

	{
		internalUserPage.ccbNewARInvoice();
		assertEquals((internalUserPage.lblNewARInvoice).getText(), "New AR Invoice");
		System.out.println("Page Title is:" + "New AR Invoice");
		TestBase.setExtentReportSettings("Verifying New AR Invoice Title", "Smoke Test", "New AR Invoice",
				"Verify New AR Invoice");
	}

	@Test(priority = 115, description = "Verify CCB AR Payment", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBNewARPayment()

	{
		internalUserPage.ccbNewARPayment();
		assertEquals((internalUserPage.lblNewARPAyment).getText(), "New AR Payment");
		System.out.println("Page Title is:" + "New AR Invoice");
		TestBase.setExtentReportSettings("Verifying New AR Invoice Title", "Smoke Test", "New AR Payment",
				"Verify New AR Payment");
	}

	@Test(priority = 116, description = "Verify CCB Bank Account", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBBankAccounts()

	{
		internalUserPage.ccbBankAccounts();
		assertEquals((internalUserPage.lblBankAccount).getText(), "Bank Accounts");
		System.out.println("Page Title is:" + "Bank Account");
		TestBase.setExtentReportSettings("Verifying Bank Account Title", "Smoke Test", "Bank Account",
				"Verify Bank Account");
	}

	@Test(priority = 117, description = "Verify CCB CM Batches", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCMBatches()

	{
		internalUserPage.ccbCMBatches();
		assertEquals((internalUserPage.lblCMBatches).getText(), "CM Batches");
		System.out.println("Page Title is:" + "CM Batches");
		TestBase.setExtentReportSettings("Verifying CM Batches Title", "Smoke Test", "CM Batches", "Verify CM Batches");
	}

	@Test(priority = 118, description = "Verify CCB Cash Receipts", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCashReceipts()

	{
		internalUserPage.ccbCashReceipts();
		assertEquals((internalUserPage.lblCashReceipts).getText(), "Cash Receipts");
		System.out.println("Page Title is:" + "CM Batches");
		TestBase.setExtentReportSettings("Verifying Cash Receipts Title", "Smoke Test", "Cash Receipts",
				"Verify Cash Receipts");
	}

	@Test(priority = 119, description = "Verify CCB Deposits", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBDeposits()

	{
		internalUserPage.ccbDeposits();
		assertEquals((internalUserPage.lblDeposits).getText(), "Deposits");
		System.out.println("Page Title is:" + "Deposits");
		TestBase.setExtentReportSettings("Verifying Deposits Title", "Smoke Test", "Deposits", "Verify Deposits");
	}

	@Test(priority = 120, description = "Verify CCB Reconcile Bank Account", groups = {
			"Functional" }, alwaysRun = true)

	public void verifyCCBReconcileBankAccount()

	{
		internalUserPage.ccbReconcileBankAccount();
		assertEquals((internalUserPage.lblReconcileBankAccount).getText(), "Bank Reconciliation");
		System.out.println("Page Title is:" + "Bank Reconciliation");
		TestBase.setExtentReportSettings("Verifying  Bank Reconciliation  Title", "Smoke Test", " Bank Reconciliation ",
				"Verify  Bank Reconciliation ");
	}

	@Test(priority = 121, description = "Verify CCB Audit Log", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBAuditLog()

	{
		internalUserPage.ccbAuditLog();
		assertEquals((internalUserPage.lblAuditLog).getText(), "Audit Log");
		System.out.println("Page Title is:" + "Audit Log");
		TestBase.setExtentReportSettings("Verifying  Audit Log  Title", "Smoke Test", "Audit Log", "Verify Audit Log");
	}

	@Test(priority = 122, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBConfiguration()

	{
		internalUserPage.ccbConfiguration();
		assertEquals((internalUserPage.lblConfiguration).getText(), "Configuration for Management Companies");
		System.out.println("Page Title is:" + "Audit Log");
		TestBase.setExtentReportSettings("Verifying Configuration for Management Companies Title", "Smoke Test",
				" Configuration for Management Companies ", "Verify  Configuration for Management Companies");
	}

	@Test(priority = 123, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBBudget()

	{
		internalUserPage.ccbBudget();
		assertEquals((internalUserPage.lblBudget).getText(), "Budgets");
		System.out.println("Page Title is:" + "Budgets");
		TestBase.setExtentReportSettings("Verifying Budgets Title", "Smoke Test", "Budgets", "Verify Budgets");
	}

	@Test(priority = 124, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBGeneralLedgerReports()

	{
		internalUserPage.ccbGeneralLedgerReports();
		 assertEquals((internalUserPage.lblGeneralLedgerReport).getText(),"General Ledger Report");
		System.out.println("Page Title is:" + " General Ledger Report ");
		TestBase.setExtentReportSettings("Verifying  General Ledger Report Title", "Smoke Test",
				" General Ledger Report ", "Verify  General Ledger Report ");
	}

	@Test(priority = 125, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBJournalEntries()

	{
		internalUserPage.ccbJournalEntries();
		assertEquals((internalUserPage.lblGeneralEntries).getText(), "Journal Entries");
		System.out.println("Page Title is:" + "Journal Entries");
		TestBase.setExtentReportSettings("Verifying  Journal Entries Title", "Smoke Test", "Journal Entries",
				"Verify Journal Entries");
	}

	@Test(priority = 126, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBJournalEntryTemplate()

	{
		internalUserPage.ccbJournalEntryTemplate();
		assertEquals((internalUserPage.lblJournalEntryTemplate).getText(), "Journal Entry Template");
		System.out.println("Page Title is:" + "Journal Entry Template");
		TestBase.setExtentReportSettings("Verifying  Journal Entry Template Title", "Smoke Test",
				"Journal Entry Templates", "Verify Journal Entry Templates");
	}

	@Test(priority = 127, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBOpenCloseBook()

	{
		internalUserPage.ccbOpenCloseBook();
		assertEquals((internalUserPage.lblOpenCloseBook).getText(), "Open - Close Books");
		System.out.println("Page Title is:" + " Open - Close Books ");
		TestBase.setExtentReportSettings("Verifying  Open - Close Books  Title", "Smoke Test", " Open - Close Books ",
				"Verify  Open - Close Books ");
	}

	@Test(priority = 128, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBTrialBalance()

	{
		internalUserPage.ccbTrialBalance();
		assertEquals((internalUserPage.lblTrialBalance).getText(), "Trial Balance");
		System.out.println("Page Title is:" + " Trial Balance ");
		TestBase.setExtentReportSettings("Verifying  Trial Balance Title", "Smoke Test", " Trial Balance ",
				"Verify  Trial Balance ");
	}

	@Test(priority = 129, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBUploadBudgets()

	{
		internalUserPage.ccbUploadBudgets();
		assertEquals((internalUserPage.lblUploadBudgets).getText(), "Upload Budgets");
		System.out.println("Page Title is:" + " Upload Budgets ");
		TestBase.setExtentReportSettings("Verifying  Upload Budgets  Title", "Smoke Test", " Upload Budgets ",
				"Verify  Upload Budgets ");
	}

	@Test(priority = 130, description = "Verify CCB Configuration", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBUploadJE()

	{
		internalUserPage.ccbUploadJE();
		assertEquals((internalUserPage.lblUploadJE).getText(), "Upload JE");
		System.out.println("Page Title is:" + " Upload JE ");
		TestBase.setExtentReportSettings("Verifying  Upload JE Title", "Smoke Test", " Upload JE ",
				"Verify  Upload JE ");
	}

	@Test(priority = 131, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBReports()

	{
		internalUserPage.ccbReports();
		assertEquals((internalUserPage.lblReports).getText(), "Reports");
		System.out.println("Page Title is:" + " Reports ");
		TestBase.setExtentReportSettings("Verifying  Reports Title", "Smoke Test", " Reports ", "Verify  Reports ");
	}

	@Test(priority = 132, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBBillingItemManagement()

	{
		internalUserPage.ccbBillingItemManagement();
		assertEquals((internalUserPage.lblBillingItemManagement).getText(), "Billing Item Management");
		System.out.println("Page Title is:" + " Billing Item Management ");
		TestBase.setExtentReportSettings("Verifying  Billing Item Management  Title", "Smoke Test",
				" Billing Item Management ", "Verify  Billing Item Management ");
	}

	@Test(priority = 133, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBBillingQueueManagement()

	{
		internalUserPage.ccbBillingQueueManagement();
		assertEquals((internalUserPage.lblBillingQueueManagement).getText(), "Billing Queue Management");
		System.out.println("Page Title is:" + " Billing Item Management ");
		TestBase.setExtentReportSettings("Verifying  Billing Queue Management Title", "Smoke Test",
				" Billing Queue Management ", "Verify  Billing Queue Management ");
	}

	@Test(priority = 134, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCuctomerContracts()

	{
		internalUserPage.ccbCuctomerContracts();
		assertEquals((internalUserPage.lblCustomerContracts).getText(), "Customer Contracts");
		System.out.println("Page Title is:" + " Customer Contracts ");
		TestBase.setExtentReportSettings("Verifying  Customer Contracts Title", "Smoke Test", " Customer Contracts ",
				"Verify  Customer Contracts ");
	}

	@Test(priority = 135, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBSetupBillingItemCategory()

	{
		internalUserPage.ccbSetupBillingItemCategory();
		assertEquals((internalUserPage.lblRevenueBillingItemCategorySetup).getText(), "Billing Item Category Setup");
		System.out.println("Page Title is:" + " Billing Item Category Setup ");
		TestBase.setExtentReportSettings("Verifying  Billing Item Category Setup  Title", "Smoke Test",
				" Billing Item Category Setup ", "Verify  Billing Item Category Setup ");
	}

	@Test(priority = 136, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBbillingRules()

	{
		internalUserPage.ccbBillingRules();
		assertEquals((internalUserPage.lblRevenueBillingRulesSetup).getText(), "Billing Rules Setup");
		System.out.println("Page Title is:" + " Billing Rules Setup ");
		TestBase.setExtentReportSettings("Verifying  Billing Rules Setup  Title", "Smoke Test", " Billing Rules Setup ",
				"Verify  Billing Rules Setup ");
	}

	@Test(priority = 137, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBContractForms()

	{
		internalUserPage.ccbContractForms();
		assertEquals((internalUserPage.lblRevenueContractFormSetup).getText(), "Contract Form Setup");
		System.out.println("Page Title is:" + " Contract Form Setup ");
		TestBase.setExtentReportSettings("Verifying  Contract Form Setup Title", "Smoke Test", " Contract Form Setup ",
				"Verify  Contract Form Setup ");
	}

	@Test(priority = 138, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBCustomerCategory()

	{
		internalUserPage.ccbCustomerCategory();
		assertEquals((internalUserPage.lblRevenueCustomerCategorySetup).getText(), "Customer Category Setup");
		System.out.println("Page Title is:" + " Customer Category Setup ");
		TestBase.setExtentReportSettings("Verifying  Customer Category Setup  Title", "Smoke Test",
				" Customer Category Setup ", "Verify  Customer Category Setup ");
	}

	@Test(priority = 139, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBProductCategory()

	{
		internalUserPage.ccbProductCategory();
		assertEquals((internalUserPage.lblRevenueProductCategorySetup).getText(), "Product Category Setup");
		System.out.println("Page Title is:" + " Product Category Setup ");
		TestBase.setExtentReportSettings("Verifying  Product Category Setup  Title", "Smoke Test",
				" Product Category Setup ", "Verify  Product Category Setup ");
	}

	@Test(priority = 140, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBProduct()

	{
		internalUserPage.ccbProduct();
		assertEquals((internalUserPage.lblRenenueProductsSetup).getText(), "Products Setup");
		System.out.println("Page Title is:" + " Products Setup ");
		TestBase.setExtentReportSettings("Verifying  Products Setup Title", "Smoke Test", " Products Setup ",
				"Verify  Products Setup ");
	}

	@Test(priority = 141, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBSubscription()

	{
		internalUserPage.ccbSubscription();
		assertEquals((internalUserPage.lblRevenueSubscriptionsSetup).getText(), "Subscriptions Setup");
		System.out.println("Page Title is:" + " Subscriptions Setup ");
		TestBase.setExtentReportSettings("Verifying  Subscriptions Setup Title", "Smoke Test", " Subscriptions Setup ",
				"Verify  Subscriptions Setup ");
	}

	@Test(priority = 142, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBTimeExpenseManagement()

	{
		internalUserPage.ccbTimeExpenseManagement();
		assertEquals((internalUserPage.lblPayrollReibursements).getText(), "Payroll Reimbursements");
		System.out.println("Page Title is:" + " Payroll Reimbursements ");
		TestBase.setExtentReportSettings("Verifying  Payroll Reimbursements  Title", "Smoke Test",
				" Payroll Reimbursements ", "Verify  Payroll Reimbursements");
	}

	@Test(priority = 143, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBChargeCodeCategory()

	{
		internalUserPage.ccbChargeCodeCategory();
		assertEquals((internalUserPage.lblChargeCodeCategorySetup).getText(), "Charge Code Category Setup");
		System.out.println("Page Title is:" + " Charge Code Category Setup ");
		TestBase.setExtentReportSettings("Verifying  Charge Code Category Setup  Title", "Smoke Test",
				" Charge Code Category Setup ", "Verify  Charge Code Category Setup ");
	}

	@Test(priority = 144, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBChargeCodes()

	{
		internalUserPage.ccbChargeCodes();
		assertEquals((internalUserPage.lblChargeCodeSetUp).getText(), "Charge Code Setup");
		System.out.println("Page Title is:" + " Charge Code Setup ");
		TestBase.setExtentReportSettings("Verifying  Charge Code Setup  Title", "Smoke Test", " Charge Code Setup ",
				"Verify  Charge Code Setup ");
	}

	@Test(priority = 145, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBChargeRateCategory()

	{
		internalUserPage.ccbChargeRateCategory();
		assertEquals((internalUserPage.lblChargeRateCategorySetup).getText(), "Charge Rate Category Setup");
		System.out.println("Page Title is:" + " Charge Rate Category Setup ");
		TestBase.setExtentReportSettings("Verifying  Charge Rate Category Setup  Title", "Smoke Test",
				" Charge Rate Category Setup ", "Verify  Charge Rate Category Setup ");
	}

	@Test(priority = 146, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCCBChargeRates()

	{
		internalUserPage.ccbChargeRates();
		assertEquals((internalUserPage.lblChargeRatesSetUp).getText(), "Charge Rate Setup");
		System.out.println("Page Title is:" + " Charge Rate Setup ");
		TestBase.setExtentReportSettings("Verifying  Charge Rate Setup Title", "Smoke Test", " Charge Rate Setup ",
				"Verify  Charge Rate Setup ");
	}

//======================================= Footer toolbar ====================================================
	@Test(priority = 147, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyAdvancedSearch()

	{
		internalUserPage.advancedSearch();
		System.out.println("Page Title is:" + " Search ");
		TestBase.setExtentReportSettings("Verifying  Modules  Search  Title", "Smoke Test", " Search ",
				"Verify  Search ");
	}

	@Test(priority = 148, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyUserDirectory()

	{
		internalUserPage.userDirectory();
		assertEquals((internalUserPage.lblUserDirectory).getText(), "Directory");
		System.out.println("Page Title is:" + " Directory ");
		TestBase.setExtentReportSettings("Verifying  Modules  Directory  Title", "Smoke Test", " Directory ",
				"Verify  Directory ");
	}

	@Test(priority = 149, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)
	public void verifyContactUs()

	{
		internalUserPage.contactUs();
		assertEquals((internalUserPage.lblContactUs).getText(), "Contact Us");
		System.out.println("Page Title is:" + "Contact Us");
		TestBase.setExtentReportSettings("Verifying  Modules Contact Us Title", "Smoke Test", "Contact Us",
				"Verify Contact Us");
	}

	@Test(priority = 150, description = "Verify CCB Reports", groups = { "Functional" }, alwaysRun = true)

	public void verifyCalendar()

	{
		internalUserPage.calendar();
		System.out.println("Page Title is:" + " My Calendar ");
		TestBase.setExtentReportSettings("Verifying  Modules  My Calendar Title", "Smoke Test", " My Calendar ",
				"Verify  My Calendar ");
	}

	@Test(priority = 151, description = "Verify ciramail footer toolbar ", groups = { "Smoke" }, alwaysRun = true)
	public void verifyciramailMenu()  {
		LoggerManager.info("Verifying ciramail footer toolbar");
		internalUserPage.ciramailMenu();
	}

	@Test(priority = 152, description = "Verify logcallcreatecase footer toolbar ", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifylogcallcreatecasePagelanding()  {
		LoggerManager.info("Verifying logcallcreatecase footer toolbar");
		internalUserPage.logcallCreateCaseIconClick();
	}

	@Test(priority = 153, description = "Verify time and expense management footer toolbar ", groups = {
			"Smoke" }, alwaysRun = true)
	public void verifytimeandexpensemanagementPageLanding()  {
		LoggerManager.info("Verifying time and expense managementfooter toolbar");
		internalUserPage.timeAndExpenseManagementIconClick();
	}

	@Test(priority = 154, description = "Verify help footer toolbar icon", groups = { "Smoke" }, alwaysRun = true)
	public void verifyhelpIcon()  {
		LoggerManager.info("Verifying help footer toolbar menu");
		internalUserPage.helpIcon();
	}

}
