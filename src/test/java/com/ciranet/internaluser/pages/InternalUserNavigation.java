package com.ciranet.internaluser.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

//Every line of code that runs in Java must be inside a class
public class InternalUserNavigation extends BasePage
{
	public InternalUserNavigation(WebDriver driver) 
	{
		super(driver);
	}

	// Initializing the Page Objects	
	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	public WebElement hamburgerMenu;

	@FindBy(xpath = "//dx-text-box[@placeholder='Search Navigation']")
	public WebElement searchNavigation;

	@FindBy(xpath = "//span[normalize-space()='My Portfolio']")
	WebElement myPortfolioMenu;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement accountManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement accountManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Achievements']")
	WebElement achievementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement achievementsheader;

	@FindBy(xpath = "//span[normalize-space()='Cloud Drive']")
	WebElement cloudDriveMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cloudDrivesheader;

	@FindBy(xpath = "//input[@id='loginUsername']")
	WebElement cloudDriveusername;

	@FindBy(xpath = "//button[@class='btn btn-primary set-username-btn']")
	WebElement cloudDriveContinueBtn;

	@FindBy(xpath = "//input[@id='j_password']")
	WebElement cloudDrivePwd;

	@FindBy(xpath = "//button[@id='loginBtn']")
	WebElement cloudDriveLoginBtn;

	@FindBy(xpath = "//span[normalize-space()='Map of My Communities']")
	WebElement mapofMyCommunitiesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement mapofMyCommunitiesHeader;

	@FindBy(xpath = "//span[normalize-space()='My Communities']")
	WebElement myCommunitiesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myCommunitiesHeader;

	@FindBy(xpath = "//span[normalize-space()='My Tests']")
	WebElement myTestsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myTestsheader;

	@FindBy(xpath = "//span[normalize-space()='My Tests']")
	WebElement myTextMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myTextMenuHeader;

	@FindBy(xpath = "//span[normalize-space()='Revenue Management']")
	public WebElement revenueManagementMenu;

	@FindBy(xpath = "//span[normalize-space()='Billing Item Management']")
	public WebElement billingItemManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement billingItemManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Billing Queue Management']")
	public WebElement billingQueueManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement billingQueueManagementheader;

	@FindBy(xpath = "//span[normalize-space()='My Customer Charges']")
	public WebElement myCustomerChargesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myCustomerChargesheader;

	@FindBy(xpath = "//span[normalize-space()='** Test Plan Configuration **']")
	WebElement testPlanConfigurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement testPlanConfigurationheader;

	@FindBy(xpath = "//span[normalize-space()='** Testing Configuration **']")
	WebElement testingConfigurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement testingConfigurationheader;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense']")
	WebElement timeExpenseMenu;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense Management']")
	WebElement timeExpenseManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement timeExpenseManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense Submission']")
	WebElement timeExpenseSubmissionMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement timeExpenseSubmissionheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor Management']")
	WebElement vendorManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendorManagementheader;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks']")
	WebElement ciraBooksMenu;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Workspace']")
	WebElement ciraBooksWorkspaceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement ciraBooksWorkspaceheader;

	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement accountsPayableMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement accountsPayableheader;

	@FindBy(xpath = "//span[normalize-space()='Accounts Receivable']")
	WebElement accountsReceivableMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement accountsReceivableheader;

	@FindBy(xpath = "//span[normalize-space()='AP Batches']")
	WebElement apBatchesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='AP Bill Analysis']")
	WebElement apBillAnalysisMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apBillAnalysisheader;

	@FindBy(xpath = "//span[normalize-space()='AP Ledger']")
	WebElement apLedgerMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apLedgerheader;

	@FindBy(xpath = "//span[normalize-space()='AP Unapplied Payments']")
	WebElement apUnappliedPaymentsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apUnappliedPaymentsheader;

	@FindBy(xpath = "//span[normalize-space()='Check Printing Management']")
	WebElement checkPrintingManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement checkPrintingManagementheader;

	@FindBy(xpath = "//span[normalize-space()='EFT Payment Management']")
	WebElement eftPaymentManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement eftPaymentManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Local Office Only Check Printing']")
	WebElement localOfficeOnlyCheckPrintingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement localOfficeOnlyCheckPrintingheader;

	@FindBy(xpath = "//span[normalize-space()='Manage AAP Workflow Vendor Edit']")
	WebElement manageAAPWorkflowVendorEditMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement manageAAPWorkflowVendorEditheader;

	@FindBy(xpath = "//span[normalize-space()='My Submitted Invoices']")
	WebElement mySubmittedInvoicesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement mySubmittedInvoicesheader;

	@FindBy(xpath = "//span[normalize-space()='Reimbursement Request']")
	WebElement reimbursementRequestMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement reimbursementRequestheader;

	@FindBy(xpath = "//span[normalize-space()='Search Invoices']")
	WebElement searchInvoicesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement searchInvoicesheader;

	@FindBy(xpath = "//span[normalize-space()='Submit Invoice']")
	WebElement submitInvoiceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement submitInvoiceheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor 1099']")
	WebElement vendor1099Menu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendor1099header;

	@FindBy(xpath = "//span[normalize-space()='Vendor Aging']")
	WebElement vendorAgingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendorAgingheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor Missing Bills']")
	WebElement vendorMissingBillsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendorMissingBillsheader;

	@FindBy(xpath = "//span[normalize-space()='AR Batches']")
	WebElement arBatchesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='AR Collections']")
	WebElement arCollectionMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arCollectionheader;

	@FindBy(xpath = "//span[normalize-space()='AR Invoice Analysis']")
	WebElement arInvoiceAnalysisMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arInvoiceAnalysisheader;

	@FindBy(xpath = "//span[normalize-space()='AR Ledger']")
	WebElement arLedgerMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arLedgereheader;

	@FindBy(xpath = "//span[normalize-space()='Add Payments']")
	WebElement addPaymentsMenu;	

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement addPaymentsheader;

	@FindBy(xpath = "//span[normalize-space()='Customer Aging']")
	WebElement customerAgingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement customerAgingheader;

	@FindBy(xpath = "//span[normalize-space()='Generate Builder Statements']")
	WebElement generateBuilderStatementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement generateBuilderStatementsheader;

	@FindBy(xpath = "//span[normalize-space()='Lot Payment Allocation']")
	WebElement lotPaymentAllocationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lotPaymentAllocationheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Management']")
	WebElement cashManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cashManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Bank Accounts']")
	WebElement bankAccountsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement bankAccountsheader;

	@FindBy(xpath = "//span[normalize-space()='Bank Reconciliation']")
	WebElement bankReconciliationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement bankReconciliationheader;

	@FindBy(xpath = "//span[normalize-space()='CM Batches']")
	WebElement cmBatchesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cmBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Receipts']")
	WebElement cashReceiptsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cashReceiptsheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Receipts']")
	WebElement createCashReceiptsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement createCashReceiptsheader;

	@FindBy(xpath = "//span[normalize-space()='Deposits']")
	WebElement depositsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement depositsheader;

	@FindBy(xpath = "//span[normalize-space()='Funds Transfer']")
	WebElement fundsTransferMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement fundsTransferheader;

	@FindBy(xpath = "//span[normalize-space()='Lockbox Payment File']")
	WebElement lockboxPaymentFileMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lockboxPaymentFileheader;

	@FindBy(xpath = "//span[normalize-space()='Manage Bank Statements']")
	WebElement manageBankStatementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement manageBankStatementsheader;

	@FindBy(xpath = "//span[normalize-space()='Unmatched Transactions']")
	WebElement unmatchedTransactionsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement unmatchedTransactionsheader;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Entity']")
	WebElement ciraBooksEntityMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement ciraBooksEntityheader;

	@FindBy(xpath = "//span[normalize-space()='Audit Log']")
	WebElement auditLogMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement auditLogheader;

	@FindBy(xpath = "//span[normalize-space()='Configuration']")
	WebElement configurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement configurationheader;

	@FindBy(xpath = "//span[normalize-space()='Financial Reports']")
	WebElement financialReportsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement financialReportsheader;

	@FindBy(xpath = "//span[normalize-space()='Actual vs Budget']")
	WebElement actualBudgetMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement actualBudgetheader;

	@FindBy(xpath = "//span[normalize-space()='Benchmark Report']")
	WebElement benchmarkReportMenu; 

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement benchmarkReportheader;

	@FindBy(xpath = "//span[normalize-space()='Financial Summary']")
	WebElement financialSummaryMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement financialSummaryheader;

	@FindBy(xpath = "//span[normalize-space()='General Ledger']")
	WebElement generalLedgerMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement generalLedgerheader;

	@FindBy(xpath = "//span[normalize-space()='Budget']")
	WebElement budgetMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement budgetheader;

	@FindBy(xpath = "//span[normalize-space()='General Ledger Report']")
	WebElement generalLedgerReportMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement generalLedgerReportheader;

	@FindBy(xpath = "//span[normalize-space()='Journal Entries']")
	WebElement journalEntriesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement journalEntriesheader;

	@FindBy(xpath = "//div[@title='Journal Entry Templates']")
	WebElement journalEntryTemplatesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement journalEntryTemplatesheader;

	@FindBy(xpath = "//span[normalize-space()='Open / Close Books']")
	WebElement openCloseBooksMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement openCloseBooksheader;

	@FindBy(xpath = "//span[normalize-space()='Trial Balance']")
	WebElement trialBalanceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement trialBalanceheader;

	@FindBy(xpath = "//span[normalize-space()='Upload Budgets']")
	WebElement uploadBudgetsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement uploadBudgetsheader;

	@FindBy(xpath = "//span[normalize-space()='Upload JEs']")
	WebElement uploadJEsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement uploadJesHeader;

	@FindBy(xpath = "//span[normalize-space()='User Setup']")
	WebElement usetupMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement usetupheader;

	@FindBy(xpath = "//span[normalize-space()='AR Load']")
	WebElement arloadMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arloadheader;

	@FindBy(xpath = "//div[@title='My Portfolio']//i[@class='fas fa-chevron-right header-icon-button-right']")
	WebElement myPortfolioClick;

	@FindBy(xpath = "//span[normalize-space()='** Report Templates **']")
	WebElement reportTemplates;

	@FindBy(xpath = "//span[normalize-space()='Owner ACH Setup']")
	WebElement achImportMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement achImportheader;

	@FindBy(xpath = "//span[normalize-space()='Portal User Management']")
	WebElement userManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement userManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Corp Invoice']")
	WebElement corpInvoiceUploadToolMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement corpInvoiceUploadToolheader;

	@FindBy(xpath = "//div[@title='Lot Load']")
	WebElement lotLoadMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lotLoadheader;

	@FindBy(xpath = "//span[normalize-space()='AR Load']")
	WebElement arLoadMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arLoadheader;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-mail-bulk']")
	WebElement ciraMailIcon;

	@FindBy(xpath = "//i[@class='fas fa-bars fa-stack-1x fa-inverse']")
	WebElement logCallCreateCaseIcon;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-hand-holding-usd']")
	WebElement timeAndExpensesIcon;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement logCallCreateCaseMenuheader;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-question']")
	WebElement helpiconMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement helpiconheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement batchJobEmailsConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement closingPortalConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement communityConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement communityAccountingConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement enforcementConfigurationsheader;

	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Work Queue ')]")
	WebElement myWorkQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Community Management ')]")
	WebElement communityManagementLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Architectural Application')]")
	WebElement architecturalAplicationLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Automated Document Print ')]")
	WebElement automatedDocumentPrintLabel;
	// Initializing the Page Objects
	@FindBy(xpath = "//span[normalize-space()='Employee Management']")
	WebElement employeeManagement;

	// Initializing the Page Objects
	@FindBy(xpath = "//span[normalize-space()='Remit To Addresses']")
	WebElement remitToAddresses;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Board Approvals')]")
	public WebElement boardApprovals;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Common Lots Appraisal ')]")
	public WebElement commonLotsApprisal;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Fulfillment Queue ')]")
	public WebElement fulfillmentQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Maintenance Work Orders ')]")
	public WebElement maintenanceWorkOrderlabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Violation Review ')]")
	public WebElement violationReviewLabel;

	@FindBy(xpath = "(//i[@class='fas fa-chevron-left header-icon-button-back'])[1]")
	public WebElement communityManagementLefticon;

	@FindBy(xpath = "(//i[@class='fas fa-chevron-left header-icon-button-back'])[2]")
	public WebElement communityOnBoardingClosed;

	@FindBy(xpath = "//span[contains(text(),' Community On-Boarding ')]")
	public WebElement communityOnBoardingLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Add Community ')]")
	public WebElement addCommunity;

	@FindBy(xpath = "//h3[contains(text(),'Organization Details')]")
	public WebElement addCommunityHeader;

	@FindBy(xpath = "//span[contains(text(),' On-Boarding Checklist ')]")
	public WebElement onBoardingChecklist;

	@FindBy(xpath = "//span[contains(text(),' On-Boarding Flags ')]")
	public WebElement onBoardingFlags;

	@FindBy(xpath = "//span[contains(text(),' Schedule First Assessment ')]")
	public WebElement scheduleFirstAssessment;

	@FindBy(xpath = "//span[contains(text(),'Schedule Initial Statement ')]")
	public WebElement scheduleInitialAssessment;

	@FindBy(xpath = "//span[contains(text(), ' Disclosure Processing ')]")
	public WebElement discloserProcessingLabel;

	@FindBy(xpath = "//span[contains(text(), 'Closing Portal Location Manager ')]")
	public WebElement closingPortalLocationManager;

	@FindBy(xpath = "//span[contains(text(), ' Closing Requests ')]")
	public WebElement closingRequestLabel;

	@FindBy(xpath = "//span[contains(text(), ' Community Blocks ')]")
	public WebElement communityBlockLabel;

	@FindBy(xpath = "//span[contains(text(), 'Property Conveyances')]")
	public WebElement propertyConveyancesLabel;

	@FindBy(xpath = "//div[@title='Disclosure Processing']//div[@class='header-text']")
	public WebElement discloserProcessingLabelClose;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Internal Tasks ')]")
	public WebElement internalTask;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' My Work Inbox ')]")
	public WebElement myWorkInbox;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Payables Workflow ')]")
	public WebElement payableWorkflow;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Invoice Approval ')]")
	public WebElement invoiceApproval;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Metrics')]")
	public WebElement metrics;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Process Invoice')]")
	public WebElement processInvoice;

	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	WebElement hamburger;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Process Tracker')]")
	WebElement processTracker;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Annual Budget Preparation ')]")
	WebElement annualBudgetPreparation;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Annual Coupon Order ')]")
	WebElement annualCouponOrder;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Annual Statement Generation Process ')]")
	WebElement annualStatementGenarationProcess;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Financial Report Publishing ')]")
	WebElement financialReportPublishing;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Management Report Generation ')]")
	WebElement managementReportPublishing;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Projects / Tasks ')]")
	WebElement projectTask;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Receivables Lockbox ')]")
	WebElement receivableLockbox;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Bank Returns ')]")
	WebElement bankReturns;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Order Annual Coupons')]")
	WebElement orderAnnualCoupon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Payment Post Errors ')]")
	WebElement paymentPostError;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Statement Approvals')]")
	WebElement statementApprovel;

	@FindBy(xpath="//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement errorPopupTitle;
	@FindBy(xpath="//div[@class='dx-button-content']//span[contains(text(),'Close')]")
	WebElement closeErrorPopupTitle;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-item-content dx-box-item-content'])[4]")
	public WebElement lblArchitecturalAplicationLabel1;
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-item-content dx-box-item-content'])[4]")
	public WebElement lblArchitecturalAplicationLabel11;
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-item-content dx-box-item-content'])[4]")
	public WebElement lblAutomatedPrintDocument;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Board Approvals ')]")
	public WebElement lblBoardApproval;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Common Lots Appraisal ')]")
	public WebElement lblCommonLotsApprisal;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Fulfillment Queue ')]")
	public WebElement lblFulfillmentQueue;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Maintenance Work Orders ')]")
	public WebElement lblMaintenanceWorkOrder;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Open Violations Requiring Review ')]")
	public WebElement lblViolationReviewingReview;
	@FindBy(xpath = "//h3[contains(text(),'Organization Details')]")
	public WebElement lblAddCommunity;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' On-Boarding Checklist ')]")
	public WebElement lblOnBoardingChecklist;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Modify an On-Boarding Community ')]")
	public WebElement lblOnBoardingFlag;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Schedule First Assessment')]")
	public WebElement lblSceduleFirstAssessment;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Schedule Initial Statement ')]")
	public WebElement lblScheduleInitialAssessment;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Closing Portal Location Manager ')]")
	public WebElement lblClosingPortalLocationManager;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Closing Requests ')]")
	public WebElement lblClosingRequest;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' SOA Community Blocks Config ')]")
	public WebElement llCommunityBlocks;
	@FindBy(xpath = "//h2[contains(text(),' Property Ownership Conveyance ')]")
	public WebElement lblPropertyConveyances;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Internal Tasks')]")
	public WebElement lblInternalTask;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' My Work Inbox ')]")
	public WebElement lblMyWorkInbox;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AAP Workflow Queue ')]")
	public WebElement lblInvoiceApproval;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AAP Workflow Metrics ')]")
	public WebElement lblMetrics;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Annual Budget Preparation ')]")
	public WebElement lblAnnualBudgetPreparation;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Annual Coupon Process ')]")
	public WebElement lblAnnualCouponProcess;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Annual Statement Generation Process ')]")
	public WebElement lblAnnualStatementGenerationProcess;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Financial Report Publishing ')]")
	public WebElement lblFinancialReportPublishing;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Monthly Management Report Generation ')]")
	public WebElement lblMonthlyManagementReportGeneration;	
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lblProjectTask;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Bank Returns ')]")
	public WebElement lblBankReturns;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Order Annual Coupons ')]")
	public WebElement lblOrderAnnualCoupon;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Payment Post Errors ')]")
	public WebElement lblPaymentPostError;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Statement Approvals ')]")
	public WebElement lblStatementApproval;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AP Batches ')]")
	public WebElement lblAPBatches;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AP Bill Analysis ')]")
	public WebElement lblAPBillAnalysis;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'AP Ledger')]")
	public WebElement lblAPLedger;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Check Printing Management For Management Companies ')]")
	public WebElement lblCCBCheckPrintingManagement;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' EFT Payment Management ')]")
	public WebElement lblCCBEFTPaymentManagement;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' New AP Bill ')]")
	public WebElement lblCCBNewAPBills;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Select Bills to Pay ')]")
	public WebElement lblCCBSelectBillstoPay;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Vendor 1099 ')]")
	public WebElement lblCCBVendor1099;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Vendor Aging')]")
	public WebElement lblCCBVendorAging;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Vendor Management ')]")
	public WebElement lblCCBVendorManagement;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Work Queue Management')]")
	public WebElement lblCCBWorkQueueManagement;
	@FindBy(xpath = "//h2[@class='page-header flex-center-aligned-row']")
	public WebElement lblARBatches;
	@FindBy(xpath = "//h2[contains(text(),' AR Invoice Analysis ')]")
	public WebElement lblARInvoiceAnalysis;
	@FindBy(xpath = "//h2[contains(text(),' AR Ledger ')]")
	public WebElement lblARLedger;
	@FindBy(xpath = "//h2[contains(text(),' Customer Aging ')]")
	public WebElement lblCustomerAging;
	@FindBy(xpath = "//h2[contains(text(),' Customer Management ')]")
	public WebElement llcCustomerManagement;
	@FindBy(xpath = "//h2[contains(text(),' New AR Adjustment ')]")
	public WebElement lblNewARAdjustment;
	@FindBy(xpath = "//h2[contains(text(),' New AR Invoice ')]")
	public WebElement lblNewARInvoice;
	@FindBy(xpath = "//h2[contains(text(),' New AR Payment ')]")
	public WebElement lblNewARPAyment;
	@FindBy(xpath = "//h2[contains(text(),' Bank Accounts ')]")
	public WebElement lblBankAccount;
	@FindBy(xpath = "//h2[contains(text(),' CM Batches ')]")
	public WebElement lblCMBatches;
	@FindBy(xpath = "//h2[contains(text(),' Cash Receipts ')]")
	public WebElement lblCashReceipts;
	@FindBy(xpath = "//h2[contains(text(),' Deposits ')]")
	public WebElement lblDeposits;
	@FindBy(xpath = "//h2[contains(text(),' Bank Reconciliation ')]")
	public WebElement lblReconcileBankAccount;
	@FindBy(xpath = "//h2[contains(text(),' Audit Log ')]")
	public WebElement lblAuditLog;
	@FindBy(xpath = "//h2[contains(text(),' Configuration for Management Companies ')]")
	public WebElement lblConfiguration;
	@FindBy(xpath = "//h2[contains(text(),' Budgets ')]")
	public WebElement lblBudget;
	@FindBy(xpath = "//h2[@class='page-header flex-center-aligned-row']")
	public WebElement lblGeneralLedgerReport;
	@FindBy(xpath = "//h2[contains(text(),' Journal Entries ')]")
	public WebElement lblGeneralEntries;
	@FindBy(xpath = "//h2[contains(text(),' Journal Entry Template ')]")
	public WebElement lblJournalEntryTemplate;
	@FindBy(xpath = "//h2[contains(text(),' Open - Close Books ')]")
	public WebElement lblOpenCloseBook;
	@FindBy(xpath = "//h2[contains(text(),' Trial Balance ')]")
	public WebElement lblTrialBalance;
	@FindBy(xpath = "//h2[contains(text(),' Upload Budgets ')]")
	public WebElement lblUploadBudgets;
	@FindBy(xpath = "//h2[contains(text(),' Upload JE ')]")
	public WebElement lblUploadJE;
	@FindBy(xpath = "//h2[contains(text(),' Reports ')]")
	public WebElement lblReports;
	@FindBy(xpath = "//h2[contains(text(),' Billing Item Management ')]")
	public WebElement lblBillingItemManagement;
	@FindBy(xpath = "//h2[contains(text(),' Billing Queue Management ')]")
	public WebElement lblBillingQueueManagement;
	@FindBy(xpath = "//h2[contains(text(),' Customer Contracts ')]")
	public WebElement lblCustomerContracts;
	@FindBy(xpath = "//h2[contains(text(),' Billing Item Category Setup ')]")
	public WebElement lblRevenueBillingItemCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Billing Rules Setup ')]")
	public WebElement lblRevenueBillingRulesSetup;
	@FindBy(xpath = "//h2[contains(text(),' Contract Form Setup ')]")
	public WebElement lblRevenueContractFormSetup;
	@FindBy(xpath = "//h2[contains(text(),' Customer Category Setup ')]")
	public WebElement lblRevenueCustomerCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Product Category Setup ')]")
	public WebElement lblRevenueProductCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Products Setup ')]")
	public WebElement lblRenenueProductsSetup;
	@FindBy(xpath = "//h2[contains(text(),' Subscriptions Setup ')]")
	public WebElement lblRevenueSubscriptionsSetup;
	@FindBy(xpath = "//h2[contains(text(),' Payroll Reimbursements ')]")
	public WebElement lblPayrollReibursements;
	@FindBy(xpath = "//h2[contains(text(),' Charge Code Category Setup ')]")
	public WebElement lblChargeCodeCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Charge Code Setup ')]")
	public WebElement lblChargeCodeSetUp;
	@FindBy(xpath = "//h2[contains(text(),' Charge Rate Category Setup ')]")
	public WebElement lblChargeRateCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),'Charge Rate Setup')]")
	public WebElement lblChargeRatesSetUp;
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Customer Defined Info - RealManage')]")
	public WebElement lblModuleConfigurations;
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Egnyte Configuration - Global')]")
	public WebElement lblEgnyteConfiguration;
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Help - Global')]")
	public WebElement lblHelp;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Search ')]")
	public WebElement lblAdvancedSearch;
	@FindBy(xpath = "//h2[contains(text(),' Directory ')]")
	public WebElement lblUserDirectory;
	@FindBy(xpath = "//h2[contains(text(),'Contact Us')]")
	public WebElement lblContactUs;
	
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' CiraBooks Corporate ')]")
	WebElement corporateCiraBook;

	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement accountPayable;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AP Batches')]")
	WebElement ccbAPBatches;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AP Bill Analysis')]")
	WebElement ccbAPBillAnalysis;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AP Ledger')]")
	WebElement ccbAPLedger;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Check Printing Management')]")
	WebElement ccbCheckPrintingManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'EFT Payment Management')]")
	WebElement ccbEFTPaymentManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'New AP Bill')]")
	WebElement ccbNewAPBill;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Select Bills to Pay')]")
	WebElement ccbSelectBillstiPay;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Vendor 1099')]")
	WebElement ccbVendor1099;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Vendor Aging')]")
	WebElement ccbVendorAging;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Vendor Management')]")
	WebElement ccbVendorManagement;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Work Queue Management')]")
	WebElement ccbWorkQueueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Accounts Receivable ')]")
	WebElement accountReceivable;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AR Batches')]")
	WebElement ccbARBatches;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AR Invoice Analysis')]")
	WebElement ccbARInvoiceAnalysis;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'AR Ledger')]")
	WebElement ccbARLedger;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Customer Aging')]")
	WebElement ccbCustomerAging;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Customer Management')]")
	WebElement ccbCustomerManagement;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'New AR Adjustment')]")
	WebElement ccbNewARAdjustment;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'New AR Invoice')]")
	WebElement ccbNewARInvoice;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'New AR Payment')]")
	WebElement ccbNewARPayment;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Cash Management ')]")
	WebElement cashManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Bank Accounts')]")
	WebElement ccbBankAccount;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'CM Batches')]")
	WebElement ccbCMBatches;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Cash Receipts')]")
	WebElement ccbCashReceipts;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Deposits')]")
	WebElement ccbDeposits;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Reconcile Bank Account')]")
	WebElement ccbReconcileBankAccount;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Entity ')]")
	WebElement entity;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Audit Log ')]")
	WebElement ccbAuditLog;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Configuration')]")
	WebElement ccbConfiguration;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'General Ledger')]")
	WebElement genaralLedger;

	@FindBy(xpath = "(//div[@class='header-text']//span[contains(text(),'Budget')])[1]")
	WebElement ccbBudget;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Journal Entries')]")
	WebElement ccbGeneralLedgerReport;

	@FindBy(xpath = "//div[@class='selected-header-text']//span[contains(text(),'Journal Entries')]")
	WebElement ccbJournalEntries;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Journal Entry Template')]")
	WebElement ccbGenaralEntryTemplate;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Open/Close Books')]")
	WebElement ccbOpenCloseBook;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Trial Balance')]")
	WebElement ccbTrialBalance;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Upload Budgets')]")
	WebElement ccbUploadBudgets;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Upload JEs')]")
	WebElement ccbUploadJE;

	@FindBy(xpath = "(//div[@class='header-text']//span[contains(text(),'Reports')])[1]")
	WebElement ccbReports;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Revenue Management ')]")
	WebElement ccbRevenueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Item Management ')]")
	WebElement ccbBillingItemManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Queue Management ')]")
	WebElement ccbBillingQueueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Customer Contracts ')]")
	WebElement ccbCustomerContracts;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Setup ')]")
	WebElement ccbRevenumManagementSetup;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Item Categories ')]")
	WebElement ccbRevenueBillingItemCategory;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Rules ')]")
	WebElement ccbRevenueBillingRules;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Contract Forms ')]")
	WebElement ccbRevenueCotractForms;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Customer Categories ')]")
	WebElement ccbRevenueCustomerCategories;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Product Categories ')]")
	WebElement ccbRevenueProductCategories;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Products ')]")
	WebElement ccbRevenueProducts;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Subscriptions ')]")
	WebElement ccbRevenueSubscriptions;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Time & Expense Management ')]")
	WebElement ccbTimeExpenseManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Payroll Reimbursement')]")
	WebElement ccbPayrollReimbeursement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Setup ')]")
	WebElement ccbTimeExpenseManagementsetup;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Code Categories ')]")
	WebElement ccbChargeCodeCategory;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Codes ')]")
	WebElement ccbChargeCodes;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Rate Categories ')]")
	WebElement ccbChargeRateCategory;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Rates ')]")
	WebElement ccbChargeRates;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Configurations ')]")
	WebElement configurations;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Modules')]")
	WebElement modules;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Customer Defined Info')]")
	WebElement customerDefinedInfo;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement customerDefinedInfoContext;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement customerDefinedInfoContextvalue;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Egnyte Configuration')]")
	WebElement egnyteConfiguration;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Help')]")
	WebElement help;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//i[@class='dx-icon fas fa-search']")
	WebElement advancedSearch;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[2]")
	WebElement userDirectory;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[3]")
	WebElement contactUs;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[4]")
	WebElement calendar;
	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement processInvoiceErrorMessage;
	@FindBy(xpath = "//div[@class='dx-button-content']//span[contains(text(),'Close')]")
	WebElement processInvoiceCloseButton;

	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	// method declaration
	public void checkAllModulesLinkPageLanding()  
	{
		waitForInvisibility(loaderIcon);
		clickElement(myPortfolioMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(accountManagementMenu);
		clickElementJS(accountManagementMenu);

		waitForInvisibility(loaderIcon);
	}

	public void AchievementsPageLanding() 
	{
		scrollToElement(achievementsMenu);

		waitForElementToBeClickable(achievementsMenu);
		clickElementJS(achievementsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void CloudDrivePageLanding() 
	{

		waitForElementToBeClickable(cloudDriveMenu);
		clickElementJS(cloudDriveMenu);
		waitForInvisibility(loaderIcon);
	}

	public void MapofMyCommunitiesPageLanding() 
	{
		waitForElementToBeClickable(mapofMyCommunitiesMenu);
		clickElementJS(mapofMyCommunitiesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void myCommunitiesPageLanding() throws AWTException 
	{
		waitForElementToBeClickable(myCommunitiesMenu);
		clickElementJS(myCommunitiesMenu);
		waitForInvisibility(loaderIcon);

		//Caling Esc key function
		pressEscapeKey();
	}

	public void myTestsPageLanding()  
	{
		waitForElementToBeClickable(myTestsMenu);
		clickElementJS(myTestsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void myTextPageLanding() 
	{
		waitForElementToBeClickable(myTextMenu);
		clickElementJS(myTextMenu);
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })

		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(1));

		@SuppressWarnings({ "unchecked", "rawtypes" })

		ArrayList browserTextTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTextTabs.get(0));
	}

	public void navigateToRevenueManagement() 
	{
		scrollToElement(revenueManagementMenu);
		waitForElementToBeClickable(revenueManagementMenu);
		clickElementJS(revenueManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	public void billingItemManagementPageLanding() 
	{
		waitForElementToBeClickable(billingItemManagementMenu);
		clickElementJS(billingItemManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	public void billingQueueManagementPageLanding() 
	{
		waitForElementToBeClickable(billingQueueManagementMenu);
		clickElementJS(billingQueueManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	public void myCustomerChargesPageLanding() 
	{
		scrollToElement(myCustomerChargesMenu);
		waitForElementToBeClickable(myCustomerChargesMenu);
		clickElementJS(myCustomerChargesMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(revenueManagementMenu);
		waitForElementToBeClickable(revenueManagementMenu);
	}

	public void testPlanConfigurationPageLanding() 
	{
		scrollToElement(testPlanConfigurationMenu);
		waitForElementToBeClickable(testPlanConfigurationMenu);
		clickElementJS(testPlanConfigurationMenu);
		waitForInvisibility(loaderIcon);
	}

	public void testingConfigurationPageLanding() 
	{
		scrollToElement(testingConfigurationMenu);
		waitForElementToBeClickable(testingConfigurationMenu);
		clickElementJS(testingConfigurationMenu);
		waitForInvisibility(loaderIcon);

		hamburgerMenu.click();
	}

	public void timeExpenseManagementPageLanding()  
	{
		scrollToElement(timeExpenseMenu);
		waitForElementToBeClickable(timeExpenseMenu);
		clickElementJS(timeExpenseMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(timeExpenseManagementMenu);
		waitForElementToBeClickable(timeExpenseManagementMenu);
		clickElementJS(timeExpenseManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	public void timeandExpenseSubmissionPageLanding()  
	{
		scrollToElement(timeExpenseSubmissionMenu);
		waitForElementToBeClickable(timeExpenseSubmissionMenu);
		clickElementJS(timeExpenseSubmissionMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(timeExpenseMenu);
		waitForElementToBeClickable(timeExpenseMenu);
		clickElementJS(timeExpenseMenu);
		waitForInvisibility(loaderIcon);
	}

	public void vendorManagementPageLanding()  
	{
		scrollToElement(vendorManagementMenu);
		waitForElementToBeClickable(vendorManagementMenu);
		clickElementJS(vendorManagementMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(myPortfolioMenu);
		waitForElementToBeClickable(myPortfolioMenu);
		clickElementJS(myPortfolioMenu);
		waitForInvisibility(loaderIcon);
	}

	//My Work Queue Pages
	public void myWorkQueuePageLanding() {
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		System.out.println("My Work Queue Label is clicked");
	}

	public void architecturalApplication() {

		waitForInvisibility(loaderIcon);
		clickElementJS(communityManagementLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Community Management Label is clicked");
		clickElement(architecturalAplicationLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Community Management Label is clicked");
	}

	public void automatedDocumentPrint() {
		waitForInvisibility(loaderIcon);
		clickElementJS(automatedDocumentPrintLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Automated Document Print Menu is clicked and page loaded successfully");
	}

	public void boardApprovals() {
		waitForInvisibility(loaderIcon);
		clickElementJS(boardApprovals);
		waitForInvisibility(loaderIcon);
		System.out.println("Board Approvals Menu is clicked and page loaded successfully");
	}

	public void commonLotsApprisal() {
		waitForInvisibility(loaderIcon);
		clickElementJS(commonLotsApprisal);
		waitForInvisibility(loaderIcon);
		System.out.println("Common Lots Apprisal Menu is clicked and page loaded successfully");
	}

	public void fullfillmentQueue() {
		waitForInvisibility(loaderIcon);
		clickElementJS(fulfillmentQueue);
		waitForInvisibility(loaderIcon);
		System.out.println("Fullfillment Page Loaded Successfully");
	}

	public void maintenanceWorkOrder() {
		waitForInvisibility(loaderIcon);
		clickElementJS(maintenanceWorkOrderlabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Maintenance Work Order Page Loaded Successfully");
	}

	public void violationReview() {
		waitForInvisibility(loaderIcon);
		clickElementJS(violationReviewLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Open Violation Requiring Review page is open");
		clickElementJS(communityManagementLabel);
	}

	public void addCommunity() {
		waitForInvisibility(loaderIcon);
		clickElementJS(communityOnBoardingLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Community On-Boarding Label is clicked");
		clickElementJS(addCommunity);
		waitForInvisibility(loaderIcon);
		System.out.println("Add Community Menu is clicked and Page Loaded Successfully");
	}

	public void onBoardCheckList() {
		waitForInvisibility(loaderIcon);
		scrollToElement(onBoardingChecklist);
		clickElement(onBoardingChecklist);
		waitForInvisibility(loaderIcon);
		System.out.println("OnBoarding Checklist Label is clicked");
	}

	public void onBoardingFlag() {
		waitForInvisibility(loaderIcon);
		clickElementJS(onBoardingFlags);
		waitForInvisibility(loaderIcon);
		System.out.println("On-Boarding Flags Label is clicked");
	}

	public void scheduleFirstAssessment() {
		waitForInvisibility(loaderIcon);
		scrollToElement(scheduleFirstAssessment);
		clickElement(scheduleFirstAssessment);
		waitForInvisibility(loaderIcon);
		System.out.println("Schedule First Assessment Label is clicked");
	}

	public void scheduleInitialAssessment() {
		waitForInvisibility(loaderIcon);
		scrollToElement(scheduleInitialAssessment);
		clickElement(scheduleInitialAssessment);
		waitForInvisibility(loaderIcon);
		System.out.println("Schedule Initial Assessment Label is clicked");
		clickElementJS(communityOnBoardingLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Community On- Boarding LAbel is closed");
	}

	public void closingPortalLocationManager() {
		waitForInvisibility(loaderIcon);
		clickElementJS(discloserProcessingLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Discloser Processing Label is clicked");
		clickElementJS(closingPortalLocationManager);
		waitForInvisibility(loaderIcon);
		System.out.println("Closing Portal Location Manager Label is clicked");
	}

	public void closingRequests() {
		waitForInvisibility(loaderIcon);
		clickElementJS(closingRequestLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Closing Request Label is clicked");
	}

	public void communityBlocks() {
		waitForInvisibility(loaderIcon);
		clickElementJS(communityBlockLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Community Blocks Label is clicked");
	}

	public void propertyConveyances() {
		waitForInvisibility(loaderIcon);
		clickElementJS(propertyConveyancesLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Property Conveyances Label is clicked");
		clickElementJS(discloserProcessingLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Discloser Processing Label is Closed");
	}

	public void discloserProcessingClose() {
		waitForInvisibility(loaderIcon);
		clickElementJS(discloserProcessingLabelClose);
		waitForInvisibility(loaderIcon);
		System.out.println("Discloser Processing Label is clicked");
	}

	public void internalTask() {
		waitForInvisibility(loaderIcon);
		clickElementJS(internalTask);
		waitForInvisibility(loaderIcon);
		System.out.println("Internal Task Menu is clicked and page loaded successfully");
	}

	public void myWorkInbox() {
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkInbox);
		waitForInvisibility(loaderIcon);
		System.out.println("My Work Inbox Menu is clicked and page loaded successfully");
	}

	public void invoiceApproval() {
		waitForInvisibility(loaderIcon);
		clickElementJS(payableWorkflow);
		System.out.println("Payable Workflow Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceApproval);
		waitForInvisibility(loaderIcon);
		System.out.println("Invoice Approval Menu is clicked and page loaded successfully");
	}

	public void metrics() {
		waitForInvisibility(loaderIcon);
		clickElementJS(metrics);
		waitForInvisibility(loaderIcon);
		System.out.println("Metrics Menu is clicked and page loaded successfully");
	}

	public void processInvoice() {
		waitForInvisibility(loaderIcon);
		clickElementJS(processInvoice);
		System.out.println("Process Invoice Menu is clicked and page loaded successfully");
		if(isElementDisplayed(errorPopupTitle)) {
			clickElement(closeErrorPopupTitle);

		}
		waitForInvisibility(loaderIcon);
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
		clickElementJS(payableWorkflow);
		waitForInvisibility(loaderIcon);
		System.out.println("Payable Workflow label is closed");
	}

	public void annualBudgetPreparation() {
		waitForInvisibility(loaderIcon);
		scrollToElement(processTracker);
		clickElement(processTracker);
		System.out.println("Process Tracker Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(annualBudgetPreparation);
		waitForInvisibility(loaderIcon);
		System.out.println("Annual Budget Preparation Menu is clicked and page loaded successfully");
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
	}

	public void annualCouponOrder() {
		waitForInvisibility(loaderIcon);
		scrollToElement(annualCouponOrder);
		clickElementJS(annualCouponOrder);
		waitForInvisibility(loaderIcon);
		System.out.println("Annual Coupon Order Menu is clicked and page loaded successfully");
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
	}

	public void annualStatementGenerationProcess() {
		waitForInvisibility(loaderIcon);
		scrollToElement(annualStatementGenarationProcess);
		clickElementJS(annualStatementGenarationProcess);
		waitForInvisibility(loaderIcon);
		System.out.println("Annual Statement Genaration Process Menu is clicked and page loaded successfully");
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
	}

	public void financialReportPublishing() {
		waitForInvisibility(loaderIcon);
		scrollToElement(financialReportPublishing);
		clickElement(financialReportPublishing);
		waitForInvisibility(loaderIcon);
		System.out.println("Financial Report Publishing Menu is clicked and page loaded successfully");
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
	}

	public void managementReportPublishing() {
		waitForInvisibility(loaderIcon);
		scrollToElement(managementReportPublishing);
		clickElement(managementReportPublishing);
		waitForInvisibility(loaderIcon);
		System.out.println("Financial Report Publishing Menu is clicked and page loaded successfully");
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
		clickElement(processTracker);
		waitForInvisibility(loaderIcon);
		System.out.println("Process Tracker Label is closed");
	}

	public void projectTask() {
		waitForInvisibility(loaderIcon);
		scrollToElement(projectTask);
		waitForInvisibility(loaderIcon);
		System.out.println("Project Task Menu is clicked and page loaded successfully");
	}

	public void bankReturns() {
		waitForInvisibility(loaderIcon);
		scrollToElement(receivableLockbox);
		clickElement(receivableLockbox);
		waitForInvisibility(loaderIcon);
		System.out.println("Receivable Lockbox Menu is clicked and page loaded successfully");
		scrollToElement(bankReturns);
		clickElement(bankReturns);
		System.out.println("Bank Returns Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
	}

	public void orderAnnualCoupon() {
		waitForInvisibility(loaderIcon);
		scrollToElement(orderAnnualCoupon);
		clickElement(orderAnnualCoupon);
		waitForInvisibility(loaderIcon);
		System.out.println("Project Task Menu is clicked and page loaded successfully");
	}

	public void paymentPostError() {
		waitForInvisibility(loaderIcon);
		scrollToElement(paymentPostError);
		clickElement(paymentPostError);
		waitForInvisibility(loaderIcon);
		System.out.println("payment Post Error Menu is clicked and page loaded successfully");
	}

	public void statementApproval() {
		waitForInvisibility(loaderIcon);
		scrollToElement(statementApprovel);
		clickElement(statementApprovel);
		System.out.println("Statement Approvel Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(receivableLockbox);
		waitForInvisibility(loaderIcon);
		System.out.println("Receivable Lockbox Label is closed");
	}




	public void ciraBooksModule()  
	{
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(ciraBooksWorkspaceMenu);
		waitForElementToBeClickable(ciraBooksWorkspaceMenu);
		clickElementJS(ciraBooksWorkspaceMenu);
		waitForInvisibility(loaderIcon);
	}

	public void accountsPayablePageLanding()  
	{
		scrollToElement(accountsPayableMenu);
		waitForElementToBeClickable(accountsPayableMenu);
		clickElementJS(accountsPayableMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(apBatchesMenu);
		waitForElementToBeClickable(apBatchesMenu);
		clickElementJS(apBatchesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void apBillAnalysisPageLanding()  
	{

		scrollToElement(apBillAnalysisMenu);
		waitForElementToBeClickable(apBillAnalysisMenu);
		clickElementJS(apBillAnalysisMenu);
		waitForInvisibility(loaderIcon);
	}

	public void apLedgerPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);
	}

	public void apUnappliedPaymentsPageLanding() 
	{

		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(apUnappliedPaymentsMenu);
		waitForElementToBeClickable(apUnappliedPaymentsMenu);
		clickElementJS(apUnappliedPaymentsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void checkPrintingManagementPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(checkPrintingManagementMenu);
		waitForElementToBeClickable(checkPrintingManagementMenu);
		clickElementJS(checkPrintingManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	public void eftPaymentManagementPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(eftPaymentManagementMenu);
		waitForElementToBeClickable(eftPaymentManagementMenu);
		clickElementJS(eftPaymentManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	public void localOfficeOnlyCheckPrintingPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);
	}

	public void manageAAPWorkflowVendorEditLanding() 
	{	
		scrollToElement(manageAAPWorkflowVendorEditMenu);
		waitForElementToBeClickable(manageAAPWorkflowVendorEditMenu);
		clickElementJS(manageAAPWorkflowVendorEditMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(manageAAPWorkflowVendorEditMenu);
		clickElementJS(manageAAPWorkflowVendorEditMenu);
		waitForInvisibility(loaderIcon);
	}

	public void mySubmittedInvoicesPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(mySubmittedInvoicesMenu);
		clickElementJS(mySubmittedInvoicesMenu);
		waitForInvisibility(loaderIcon);

	}

	public void reimbursementRequestPageLanding() 
	{	
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(reimbursementRequestMenu);
		waitForElementToBeClickable(reimbursementRequestMenu);
		clickElementJS(reimbursementRequestMenu);
		waitForInvisibility(loaderIcon);
	}

	public void searchInvoicesPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void submitInvoicePageLanding() 
	{	
		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void vendor1099PageLanding() 
	{
		scrollToElement(vendor1099Menu);
		waitForElementToBeClickable(vendor1099Menu);
		clickElementJS(vendor1099Menu);
		waitForInvisibility(loaderIcon);
	}

	public void vendorAgingPageLanding() 
	{
		scrollToElement(vendorAgingMenu);
		waitForElementToBeClickable(vendorAgingMenu);
		clickElementJS(vendorAgingMenu);
		waitForInvisibility(loaderIcon);
	}

	public void vendorMissingBillsPageLanding() 
	{
		scrollToElement(vendorMissingBillsMenu);
		waitForElementToBeClickable(vendorMissingBillsMenu);
		clickElementJS(vendorMissingBillsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void accountsReceivablePageLanding() 
	{
		scrollToElement(accountsPayableMenu);
		waitForElementToBeClickable(accountsPayableMenu);
		clickElementJS(accountsPayableMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(accountsReceivableMenu);
		waitForElementToBeClickable(accountsReceivableMenu);
		clickElementJS(accountsReceivableMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(arBatchesMenu);
		waitForElementToBeClickable(arBatchesMenu);
		clickElementJS(arBatchesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void arCollectionPageLanding()  
	{
		scrollToElement(arCollectionMenu);
		waitForElementToBeClickable(arCollectionMenu);
		clickElementJS(arCollectionMenu);
		waitForInvisibility(loaderIcon);
	}

	public void arInvoiceAnalysisPageLanding()
	{
		scrollToElement(arInvoiceAnalysisMenu);
		waitForElementToBeClickable(arInvoiceAnalysisMenu);
		clickElementJS(arInvoiceAnalysisMenu);
		waitForInvisibility(loaderIcon);

	}

	public void arLedgerPageLanding()
	{
		scrollToElement(arLedgerMenu);
		waitForElementToBeClickable(arLedgerMenu);
		clickElementJS(arLedgerMenu);
		waitForInvisibility(loaderIcon);
	}

	public void addPaymentsPageLanding()
	{
		scrollToElement(addPaymentsMenu);
		waitForElementToBeClickable(addPaymentsMenu);
		clickElementJS(addPaymentsMenu);
		waitForInvisibility(loaderIcon);

	}

	public void customerAgingPageLanding()
	{
		scrollToElement(customerAgingMenu);
		waitForElementToBeClickable(customerAgingMenu);
		clickElementJS(customerAgingMenu);
		waitForInvisibility(loaderIcon);
	}

	public void generateBuilderStatementsPageLanding()
	{
		scrollToElement(generateBuilderStatementsMenu);
		waitForElementToBeClickable(generateBuilderStatementsMenu);
		clickElementJS(generateBuilderStatementsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void lotPaymentAllocationPageLanding()
	{
		scrollToElement(lotPaymentAllocationMenu);
		waitForElementToBeClickable(lotPaymentAllocationMenu);
		clickElementJS(lotPaymentAllocationMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(accountsReceivableMenu);
		waitForElementToBeClickable(accountsReceivableMenu);
		clickElementJS(accountsReceivableMenu);
		waitForInvisibility(loaderIcon);
	}

	//=============================== Cash Management page code starts here ===========================
	public void cashManagementPageLanding() 
	{
		scrollToElement(cashManagementMenu);
		waitForElementToBeClickable(cashManagementMenu);
		clickElementJS(cashManagementMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(bankAccountsMenu);
		waitForElementToBeClickable(bankAccountsMenu);
		clickElementJS(bankAccountsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void bankReconciliationPageLanding() 
	{
		scrollToElement(bankReconciliationMenu);
		waitForElementToBeClickable(bankReconciliationMenu);
		clickElementJS(bankReconciliationMenu);
		waitForInvisibility(loaderIcon);
	}

	public void cmBatchesPageLanding() 
	{	
		scrollToElement(cmBatchesMenu);
		waitForElementToBeClickable(cmBatchesMenu);
		clickElementJS(cmBatchesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void cashReceiptsPageLanding() 
	{
		scrollToElement(cashReceiptsMenu);
		waitForElementToBeClickable(cashReceiptsMenu);
		clickElementJS(cashReceiptsMenu);
		waitForInvisibility(loaderIcon);

	}

	public void createCashReceiptsPageLanding() 
	{	
		scrollToElement(createCashReceiptsMenu);
		waitForElementToBeClickable(createCashReceiptsMenu);
		clickElementJS(createCashReceiptsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void depositsPageLanding() 
	{
		scrollToElement(depositsMenu);
		waitForElementToBeClickable(depositsMenu);
		clickElementJS(depositsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void fundsTransferPageLanding() 
	{
		scrollToElement(fundsTransferMenu);
		waitForElementToBeClickable(fundsTransferMenu);
		clickElementJS(fundsTransferMenu);
		waitForInvisibility(loaderIcon);
	}

	public void lockboxPaymentFilePageLanding() 
	{	
		scrollToElement(lockboxPaymentFileMenu);
		waitForElementToBeClickable(lockboxPaymentFileMenu);
		clickElementJS(lockboxPaymentFileMenu);
		waitForInvisibility(loaderIcon);
	}

	public void manageBankStatementsPageLanding() 
	{
		scrollToElement(manageBankStatementsMenu);
		waitForElementToBeClickable(manageBankStatementsMenu);
		clickElementJS(manageBankStatementsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void unmatchedTransactionsPageLanding() 
	{	
		scrollToElement(unmatchedTransactionsMenu);
		waitForElementToBeClickable(unmatchedTransactionsMenu);
		clickElementJS(unmatchedTransactionsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(cashManagementMenu);
		waitForElementToBeClickable(cashManagementMenu);
		clickElementJS(cashManagementMenu);
		waitForInvisibility(loaderIcon);
	}

	//=============================== CiraBooks Entity page code starts here ===========================
	public void ciraBooksEntityPageLanding() 
	{	
		scrollToElement(ciraBooksEntityMenu);
		waitForElementToBeClickable(ciraBooksEntityMenu);
		clickElementJS(ciraBooksEntityMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(auditLogMenu);
		waitForElementToBeClickable(auditLogMenu);
		clickElementJS(auditLogMenu);
		waitForInvisibility(loaderIcon);
	}

	public void configurationPageLanding() 
	{
		scrollToElement(configurationMenu);
		waitForElementToBeClickable(configurationMenu);
		clickElementJS(configurationMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(ciraBooksEntityMenu);
		waitForElementToBeClickable(ciraBooksEntityMenu);
		clickElementJS(ciraBooksEntityMenu);
		waitForInvisibility(loaderIcon);
	}

	public void financialReportsPageLanding()  
	{
		scrollToElement(financialReportsMenu);
		waitForElementToBeClickable(financialReportsMenu);
		clickElementJS(financialReportsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(actualBudgetMenu);
		waitForElementToBeClickable(actualBudgetMenu);
		clickElementJS(actualBudgetMenu);
		waitForInvisibility(loaderIcon);
	}

	public void benchmarkReportPageLanding() 
	{
		scrollToElement(benchmarkReportMenu);
		waitForElementToBeClickable(benchmarkReportMenu);
		clickElementJS(benchmarkReportMenu);
		waitForInvisibility(loaderIcon);
	}

	public void financialSummaryPageLanding() 
	{
		scrollToElement(financialSummaryMenu);
		waitForElementToBeClickable(financialSummaryMenu);
		clickElementJS(financialSummaryMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(financialReportsMenu);
		waitForElementToBeClickable(financialReportsMenu);
		clickElementJS(financialReportsMenu);
		waitForInvisibility(loaderIcon);
	}

	//=============================== General Ledger page code starts here ===========================
	public void generalLedgerPageLanding()
	{
		scrollToElement(generalLedgerMenu);
		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(budgetMenu);
		waitForElementToBeClickable(budgetMenu);
		clickElementJS(budgetMenu);
		waitForInvisibility(loaderIcon);
	}

	public void generalLedgerReportPageLanding()
	{
		scrollToElement(generalLedgerReportMenu);
		waitForElementToBeClickable(generalLedgerReportMenu);
		clickElementJS(generalLedgerReportMenu);
		waitForInvisibility(loaderIcon);
	}

	public void journalEntriesPageLanding()
	{	
		scrollToElement(journalEntriesMenu);
		waitForElementToBeClickable(journalEntriesMenu);
		clickElementJS(journalEntriesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void journalEntryTemplatesPageLanding()
	{	
		scrollToElement(journalEntryTemplatesMenu);
		waitForElementToBeClickable(journalEntryTemplatesMenu);
		clickElementJS(journalEntryTemplatesMenu);
		waitForInvisibility(loaderIcon);
	}

	public void openCloseBooksPageLanding()
	{
		scrollToElement(openCloseBooksMenu);
		waitForElementToBeClickable(openCloseBooksMenu);
		clickElementJS(openCloseBooksMenu);
		waitForInvisibility(loaderIcon);
	}

	public void trialBalancePageLanding()
	{
		scrollToElement(trialBalanceMenu);
		waitForElementToBeClickable(trialBalanceMenu);
		clickElementJS(trialBalanceMenu);
		waitForInvisibility(loaderIcon);
	}

	public void uploadBudgetsPageLanding()
	{	
		scrollToElement(uploadBudgetsMenu);
		waitForElementToBeClickable(uploadBudgetsMenu);
		clickElementJS(uploadBudgetsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void uploadJesPageLanding() 
	{

		scrollToElement(uploadJEsMenu);
		waitForElementToBeClickable(uploadJEsMenu);
		clickElementJS(uploadJEsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(generalLedgerMenu);
		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);
	}


	//Corporate Cirabook Pages
	public void corporateCirabook() {

		waitForInvisibility(loaderIcon);
		scrollToElement(corporateCiraBook);
		waitForElementToBeClickable(corporateCiraBook);
		clickElementJS(corporateCiraBook);
		waitForInvisibility(loaderIcon);

		System.out.println("Corporate CiraBook Label is clicked");

	}

	public void apBatches() {

		waitForInvisibility(loaderIcon);
		scrollToElement(accountPayable);
		clickElement(accountPayable);
		System.out.println("Account Receivalble Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAPBatches);
		waitForInvisibility(loaderIcon);
		System.out.println("AP Batches Label is clicked and page open successfully");

	}

	public void apBillAnalysis() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAPBillAnalysis);
		System.out.println("AP Bill Analysis Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void apLedger() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAPLedger);
		System.out.println("AP Ledger Label is clicked and page open successfully");

	}

	public void ccbCheckPrintingManagement() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCheckPrintingManagement);
		System.out.println("CCBCheck Printing Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElement(hamburger);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbEFTPaymentManagement() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbEFTPaymentManagement);
		System.out.println("EFT Payment Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbNewAPBill() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewAPBill);
		System.out.println("New AP Bill Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void selectBillstoPay() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbSelectBillstiPay);
		waitForInvisibility(loaderIcon);
		System.out.println("Select Bills to PAy Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbVendor1099() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbVendor1099);
		waitForInvisibility(loaderIcon);
		System.out.println("Vendor 1099 Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbVendorAging() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbVendorAging);
		waitForInvisibility(loaderIcon);
		System.out.println("Vendor Aging Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbVendorManagement() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbVendorManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("Vendor Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbVendorWorkQueueManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbWorkQueueManagement);
		System.out.println("Work Queue Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(accountPayable);
		System.out.println("Account Payable label is closed");
		waitForInvisibility(loaderIcon);
	}

	public void ccbARBatches() {
		waitForInvisibility(loaderIcon);
		scrollToElement(accountReceivable);
		clickElement(accountReceivable);
		System.out.println("Account Receivalble Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbARBatches);
		System.out.println("CCB AP Batches Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbARInvoiceAnalysis() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbARInvoiceAnalysis);
		System.out.println("CCB AR Invoice Analysis Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbARLedger() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbARLedger);
		System.out.println("CCB AR Ledger Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbCustomerAging() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCustomerAging);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Customer Aging Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbCustomerManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCustomerManagement);
		System.out.println("CCB Customer MAnagement Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbNewARAdjustment() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewARAdjustment);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB New AR Adjustment Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbNewARInvoice() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewARInvoice);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB New AR Invoice Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbNewARPayment() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewARPayment);
		System.out.println("CCB New AR Payment Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(accountReceivable);
		System.out.println("Account Receivalble label is closed");
		waitForInvisibility(loaderIcon);

	}

	public void ccbBankAccounts() {
		waitForInvisibility(loaderIcon);
		clickElementJS(cashManagement);
		System.out.println("Cash Managemnet Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBankAccount);
		System.out.println("CCB Bank Account Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbCMBatches() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCMBatches);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB CM Batches Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbCashReceipts() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCashReceipts);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB CM Receipts Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbDeposits() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbDeposits);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Deposits Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbReconcileBankAccount() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbReconcileBankAccount);
		System.out.println("CCB Reconcile Bank Account Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(cashManagement);
		System.out.println("Cash Management label is closed");
		waitForInvisibility(loaderIcon);

	}

	public void ccbAuditLog() {
		waitForInvisibility(loaderIcon);
		clickElementJS(entity);
		System.out.println("Entity Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAuditLog);
		System.out.println("CCB Audit Log Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbConfiguration() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbConfiguration);
		System.out.println("CCB Configuration Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(hamburgerMenu);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(entity);
		System.out.println("Entity label is closed");
		waitForInvisibility(loaderIcon);
	}

	public void ccbBudget() {
		waitForInvisibility(loaderIcon);
		clickElementJS(genaralLedger);
		System.out.println("Genaral Ledger Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBudget);
		System.out.println("CCB Budget Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbGeneralLedgerReports() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbGeneralLedgerReport);
		System.out.println("CCB General Ledger Report Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbJournalEntries() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbJournalEntries);
		System.out.println("CCB Journal Entries Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbJournalEntryTemplate() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbGenaralEntryTemplate);
		System.out.println("CCB Journal Entry Template Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbOpenCloseBook() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbOpenCloseBook);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Open Close Book Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbTrialBalance() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTrialBalance);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Trial Balance Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbUploadBudgets() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbUploadBudgets);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Upload Budgets Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbUploadJE() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbUploadJE);
		System.out.println("CCB Upload JE Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(genaralLedger);
		System.out.println("General Ledger Reports label is closed");
		waitForInvisibility(loaderIcon);
	}

	public void ccbReports() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbReports);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Reports Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbBillingItemManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueManagement);
		System.out.println("CCB Revenue Management Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBillingItemManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Billing Item Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbBillingQueueManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBillingQueueManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Billing Queue Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbCuctomerContracts() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCustomerContracts);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Customer Contracts Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbSetupBillingItemCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenumManagementSetup);
		System.out.println("CCB Revenue Management Setup Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueBillingItemCategory);
		System.out.println("CCB Billing Item Category Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbBillingRules() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueBillingRules);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Billing Rules Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbContractForms() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueCotractForms);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Contract Forms Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbCustomerCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueCustomerCategories);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Customer Category Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbProductCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueProductCategories);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Product Category Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbProduct() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueProducts);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Product Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbSubscription() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueSubscriptions);
		System.out.println("CCB Subscription Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Revenue Management Label is closed");
		waitForInvisibility(loaderIcon);

	}

	public void ccbTimeExpenseManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTimeExpenseManagement);
		System.out.println("CCB Time & Eepense Management Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbPayrollReimbeursement);
		System.out.println("CCB Payroll Reibeursement Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
	}

	public void ccbChargeCodeCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTimeExpenseManagementsetup);
		System.out.println("CCB Time & Eepense Management Set Up Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeCodeCategory);
		System.out.println("CCB Charge Code Category Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbChargeCodes() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeCodes);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Charge Codes Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbChargeRateCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeRateCategory);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Charge Rate Category Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);

	}

	public void ccbChargeRates() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeRates);
		System.out.println("CCB Charge Rates Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTimeExpenseManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Time & Expense Management Label is closed");
		waitForInvisibility(loaderIcon);

	}

	public void moduleClicked() 
	{
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);
	}
	
	//Footer Tool bar
	public void advancedSearch() {
		waitForInvisibility(loaderIcon);
		clickElement(advancedSearch);
		System.out.println("advanced Search icon is	 clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void userDirectory() {
		waitForInvisibility(loaderIcon);
		clickElement(userDirectory);
		System.out.println("User Directory icon is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
	}

	public void contactUs() {
		waitForInvisibility(loaderIcon);
		clickElement(contactUs);
		System.out.println("Contact Us icon is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
	}

	public void calendar() {
		waitForInvisibility(loaderIcon);
		clickElement(calendar);
		System.out.println("Calendar icon is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));

	}

	public void ciramailMenu() 
	{
		ciraMailIcon.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void logcallCreateCaseIconClick() 
	{
		logCallCreateCaseIcon.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void timeAndExpenseManagementIconClick() 
	{
		timeAndExpensesIcon.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void helpIcon() 
	{
		helpiconMenu.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

}
