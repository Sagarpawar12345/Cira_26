package com.ciranet.testbase;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

// for Extent Reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ciranet.basepage.BasePage;
import com.ciranet.boardmembers.pages.BoardMemberNavigation;
import com.ciranet.cirabooks.cashmanagement.pages.DepositsPage;
import com.ciranet.configurations.pages.BatchJobEmailsPage;
import com.ciranet.configurations.pages.ClosingPortalPage;
import com.ciranet.configurations.pages.CommunityAccountingPage;
import com.ciranet.configurations.pages.CommunityPage;
import com.ciranet.configurations.pages.EnforcementPage;
import com.ciranet.configurations.pages.ModulesPage;
import com.ciranet.configurations.pages.ProcessTrackerPage;
import com.ciranet.configurations.pages.ReportTemplatesPage;
import com.ciranet.configurations.pages.ResponseTemplatesPage;
import com.ciranet.configurations.pages.ServicesPage;
import com.ciranet.constants.Constants;
import com.ciranet.corporatecirabooks.accountsreceivable.pages.NewARPaymentPage;
import com.ciranet.corporatecirabooks.generalledger.pages.UploadBudgetsPage;
import com.ciranet.homepage.pages.HomePage;
import com.ciranet.internaluser.pages.InternalUserNavigation;
import com.ciranet.loginpage.pages.LoginPage;
import com.ciranet.myportfolio.revenuemanagement.pages.BillingItemManagementPage;
import com.ciranet.myportfolio.revenuemanagement.pages.MyCustomerChargesPage;
import com.ciranet.myworkqueue.communitymanagement.pages.BoardApprovalsPage;
import com.ciranet.myworkqueue.communitymanagement.pages.CommonLotsAppraisalPage;
import com.ciranet.myworkqueue.communitymanagement.pages.FulfillmentQueuePage;
import com.ciranet.myworkqueue.communitymanagement.pages.MaintenanceWorkOrdersPage;
import com.ciranet.myworkqueue.communitymanagement.pages.ViolationReviewPage;
import com.ciranet.myworkqueue.disclosureprocessing.pages.ClosingRequestsPage;
import com.ciranet.myworkqueue.disclosureprocessing.pages.CommunityBlocksPage;
import com.ciranet.myworkqueue.disclosureprocessing.pages.PropertyConveyancePage;
import com.ciranet.myworkqueue.pages.InternalTasksPage;
import com.ciranet.myworkqueue.pages.ProjectsTasksPage;
import com.ciranet.myworkqueue.receivableslockbox.pages.StatementApprovalQueuePage;
import com.ciranet.cirabooks.accountspayable.pages.APExpenseDetailPage;
import com.ciranet.community.compliance.pages.OpenViolationsLogPage;
import com.ciranet.utilities.CommonUtilities;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestBase 
{
	public WebDriver driver;
	// For Extent Report and used in TestListener.java class
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test; 
	public LoginPage loginPage = new LoginPage(driver);
	public HomePage homePage = new HomePage(driver);
	public InternalTasksPage internalTasksPage = new InternalTasksPage(driver);
	public BoardApprovalsPage boardApprovalsPage = new BoardApprovalsPage(driver);
	public CommonLotsAppraisalPage commonLotsAppraisalPage = new CommonLotsAppraisalPage(driver);
	public FulfillmentQueuePage fulfillmentQueuePage = new FulfillmentQueuePage(driver);
	public MaintenanceWorkOrdersPage workOrdersPage = new MaintenanceWorkOrdersPage(driver);
	public ClosingRequestsPage closingRequestsPage = new ClosingRequestsPage(driver);
	public ProjectsTasksPage projectsTasksPage = new ProjectsTasksPage(driver);
	public PropertyConveyancePage propertyConveyanceWorkQueuePage = new PropertyConveyancePage(driver);
	public NewARPaymentPage newARPaymentPage = new NewARPaymentPage(driver);
	public UploadBudgetsPage uploadBudgets = new UploadBudgetsPage(driver);
	public StatementApprovalQueuePage statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
	public InternalUserNavigation internalUserPage = new InternalUserNavigation(driver);
	public BillingItemManagementPage billingItemManagementPage = new BillingItemManagementPage(driver);
	public CommunityBlocksPage communityBlocksPage = new CommunityBlocksPage(driver);
	public BatchJobEmailsPage configurationsPage = new BatchJobEmailsPage(driver);
	public ModulesPage configModulesClickPages = new ModulesPage(driver);
	public ClosingPortalPage closingPortalconfigurationsPage = new ClosingPortalPage(driver);
	public CommunityPage communityconfigurationsPage = new CommunityPage(driver);
	public EnforcementPage configEnforcementClickPages = new EnforcementPage(driver);
	public ProcessTrackerPage configProcessTrackerClickPages =new ProcessTrackerPage(driver);
	public CommunityAccountingPage communityAccountingPage = new CommunityAccountingPage(driver);
	public BoardMemberNavigation boardMemberHomePage = new BoardMemberNavigation(driver);
	public ModulesPage modulesPage = new ModulesPage(driver);
	public EnforcementPage enforcementPage = new EnforcementPage(driver);
	public ProcessTrackerPage processTrackerPage =new ProcessTrackerPage(driver);
	public ReportTemplatesPage reportTemplatesPage = new ReportTemplatesPage(driver);
	public ServicesPage servicesPage = new ServicesPage(driver);
	public ResponseTemplatesPage responseTemplatesPage = new ResponseTemplatesPage(driver);
	public DepositsPage depositsPage = new DepositsPage(driver);
	public MyCustomerChargesPage myCustomerChargesPage = new MyCustomerChargesPage(driver);
	public ViolationReviewPage violationReviewPage = new ViolationReviewPage(driver);

	public APExpenseDetailPage apExpenseDetailPage = new APExpenseDetailPage(driver);
	public OpenViolationsLogPage openViolationsLogPage = new OpenViolationsLogPage(driver);



	// For Storing Extent Report location in String
	private String extentReportLocation;


	DesiredCapabilities dc = new DesiredCapabilities();

	protected XMLCredentialsReader.userCredentials credentials;

	// Perform login here if you want to do it only once before any test method
	@BeforeClass(alwaysRun = true)
	public void loginSetup() {

		if (Constants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			LoggerManager.debug("------- Chrome browser loaded -------");
		} else if (Constants.BROWSER_TYPE.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
			LoggerManager.debug("------- FireFox browser loaded -------");
		} else if (Constants.BROWSER_TYPE.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			LoggerManager.debug("------- Edge browser loaded -------");
		} else if (Constants.BROWSER_TYPE.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
			LoggerManager.debug("------- Safari browser loaded -------");
		}  else {
			// Default browser set to Chrome driver Instance.
			driver = new ChromeDriver();
			LoggerManager.debug("------- Chrome browser loaded as default browser -------");
		}

		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(EnvironmentConfig.environmentSetup().get("APPLICATIONURL"));
			LoggerManager.debug("------- Application URL set to: " + EnvironmentConfig.environmentSetup().get("APPLICATIONURL"));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
			LoggerManager.debug("------- Page load timeout is set to: " + Constants.PAGE_LOAD_TIMEOUT);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
			LoggerManager.debug("------- Implicit Wait time is set to: " + Constants.IMPLICIT_WAIT);


		} else {
			driver.close();
			LoggerManager.debug("------- Browser closed");
			// Null browser Instance when close.
			driver = null;
			LoggerManager.debug("------- Browser set as NULL");
		}

		credentials = getCredentials();  // Method to fetch credentials

		LoginPage loginPageStart = createPage(LoginPage.class);
		loginPageStart.verifyLogin(credentials.getUsername(), credentials.getPassword());
	}


	// Initializing pages here
	@BeforeMethod(alwaysRun = true)
	public void pageSetup() {

		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		internalTasksPage = new InternalTasksPage(driver);
		commonLotsAppraisalPage = new CommonLotsAppraisalPage(driver);
		boardApprovalsPage = new BoardApprovalsPage(driver);
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		workOrdersPage = new MaintenanceWorkOrdersPage(driver);
		closingRequestsPage = new ClosingRequestsPage(driver);
		projectsTasksPage = new ProjectsTasksPage(driver);
		propertyConveyanceWorkQueuePage = new PropertyConveyancePage(driver);
		newARPaymentPage = new NewARPaymentPage(driver);
		uploadBudgets = new UploadBudgetsPage(driver);
		internalUserPage = new InternalUserNavigation(driver);
		billingItemManagementPage = new BillingItemManagementPage(driver);
		communityBlocksPage = new CommunityBlocksPage(driver);
		configurationsPage = new BatchJobEmailsPage(driver);
		closingPortalconfigurationsPage = new ClosingPortalPage(driver);
		communityAccountingPage = new CommunityAccountingPage(driver);
		boardMemberHomePage = new BoardMemberNavigation(driver);
		modulesPage = new ModulesPage(driver);
		communityconfigurationsPage = new CommunityPage(driver);
		processTrackerPage= new ProcessTrackerPage(driver);
		reportTemplatesPage = new ReportTemplatesPage(driver);
		enforcementPage = new EnforcementPage(driver);
		servicesPage = new ServicesPage(driver);
		responseTemplatesPage = new ResponseTemplatesPage(driver);
		depositsPage = new DepositsPage(driver);
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		violationReviewPage = new ViolationReviewPage(driver);

		apExpenseDetailPage = new APExpenseDetailPage(driver);
		openViolationsLogPage = new OpenViolationsLogPage(driver);


	}

	@BeforeSuite(alwaysRun=true)
	public WebDriver setup() throws UnknownHostException  {
		// Code For the Extent Reports
		htmlReporter = new ExtentSparkReporter(EnvironmentConfig.environmentSetup().get("REPORT_LOCATION")	
				+ "AutomationExtentReport_" + CommonUtilities.getCurrentDateTime() + ".html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("HostName : ", InetAddress.getLocalHost().getHostName());
		extent.setSystemInfo("ProjectName : ", "Cira Automation Test Automation");
		extent.setSystemInfo("Test Environment: ", System.getProperty("env").toUpperCase());
		extent.setSystemInfo("Operating System : ", System.getProperty("os.name"));
		extent.setSystemInfo("QA Name : ", System.getProperty("user.name"));

		// To set Report properties
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Cira Test Automation Report");
		htmlReporter.config().setReportName("Cira Automation Test Execution Report ");
		htmlReporter.config().setEncoding("utf-8");

		String strExtentReport = ""; 
		strExtentReport = EnvironmentConfig.environmentSetup().get("REPORT_LOCATION");
		strExtentReport = strExtentReport.substring(1, strExtentReport.length()); 
		strExtentReport = strExtentReport.replaceAll("\\/", "//");
		extentReportLocation = System.getProperty("user.dir") + strExtentReport + 
				"AutomationExtentReport_" + CommonUtilities.getCurrentDateTime() + ".html";
		extentReportLocation=extentReportLocation.replaceAll("\\//", "\\\\");
		extentReportLocation=extentReportLocation.replaceAll("\\\\", "\\\\\\\\");

		return driver;
	}

	// This is a Common Method to set the Extent Report for Each Test Case.
	public static void setExtentReportSettings(String strCreateTest, String strAssignCategory, String strCreateNode, String statusInfo) 
	{
		TestBase.test = TestBase.extent.createTest(strCreateTest);//"Home Page Test"
		TestBase.test.assignCategory(strAssignCategory); //"Test Type" 
		TestBase.test = TestBase.test.createNode(strCreateNode); //
		TestBase.test.log(Status.INFO, statusInfo); //"Verifying Home Page"
	}

	// This module is used to capture a screenshot
	public static String captureScreenshot(WebDriver driver, String screenShotName) throws Exception {
		Screenshot screenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + screenShotName + "_" + dateName + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}

		ImageIO.write(screenShot.getImage(), "PNG", new File(destination));
		return destination;
	}

	@DataProvider(name = "boardMemberProvider")
	public Object[][] credentialsProvider() {
		String boardmemberUserPath = System.getProperty("user.dir") + "\\src\\test\\java\\com\\ciranet\\testdata\\boardmembers.xml";
		List<XMLCredentialsReader.userCredentials> credentialsList = XMLCredentialsReader.readCredentials(boardmemberUserPath);

		Object[][] data = new Object[credentialsList.size()][1];
		for (int i = 0; i < credentialsList.size(); i++) {
			data[i][0] = credentialsList.get(i);
		}
		return data;
	}

	@DataProvider(name = "internalUserProvider")
	public Object[][] credentialsInternalUserProvider() {
		String internalUserPath = System.getProperty("user.dir") + "\\src\\test\\java\\com\\ciranet\\testdata\\internalusers.xml";
		List<XMLCredentialsReader.userCredentials> credentialsList = XMLCredentialsReader.readCredentials(internalUserPath);

		Object[][] data = new Object[credentialsList.size()][1];
		for (int i = 0; i < credentialsList.size(); i++) {
			data[i][0] = credentialsList.get(i);
		}
		return data;
	}

	// Method to create page objects
	protected <T extends BasePage> T createPage(Class<T> pageClass) {
		try {
			// Use reflection to create a new instance of the page class
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
		} catch (Exception e) {
			throw new RuntimeException("Page object creation failed", e);
		}
	}

	// Utility method to fetch credentials, could be overridden or customized
	protected XMLCredentialsReader.userCredentials getCredentials() {
		System.out.println("in getCredentials");
		// Return default or configured credentials
		Object[][] data = credentialsInternalUserProvider();
		return (XMLCredentialsReader.userCredentials) data[0][0];
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		tearDown();
	}


	@AfterSuite(alwaysRun=true)
	public void tearDown() {
		LoggerManager.info("----- Quitting browser -----");

		if (!(driver==null)) {
			driver.quit();}
		LoggerManager.debug("------- Browser quit successfully -------");
		// This will generate the Extent Report
		extent.flush();
	}
}
