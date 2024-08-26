package com.ciranet.loginpage.pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;
import com.ciranet.boardmembers.pages.BoardMemberNavigation;
import com.ciranet.cirabooks.accountspayable.pages.APExpenseDetailPage;
import com.ciranet.cirabooks.cashmanagement.pages.DepositsPage;
import com.ciranet.community.compliance.pages.OpenViolationsLogPage;
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
import com.ciranet.corporatecirabooks.accountsreceivable.pages.NewARPaymentPage;
import com.ciranet.corporatecirabooks.generalledger.pages.UploadBudgetsPage;
import com.ciranet.homepage.pages.HomePage;
import com.ciranet.internaluser.pages.InternalUserNavigation;
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
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='login-portal-header']")
	private WebElement lblManagementBoardPortal;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement txtPassword;

	@FindBy(xpath = "//dx-button[@aria-label='Log in']//div[@class='dx-button-content']")
	private WebElement btnSignIn;

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgInvalidCredentials;

	@FindBy(xpath = "//div[@class='dx-overlay dx-widget dx-visibility-change-handler dx-toast']")
	private WebElement msgTxtLoginError;

	@FindBy(xpath = "//i[contains(@class,'dx-icon fas fa-eye')]")
	private WebElement showEyeIconPassword;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-eye-slash']")
	private WebElement hideEyeIconPassword;

	@FindBy(xpath = "(//input[@role='textbox'])[2]")
	private WebElement getPassword;

	@FindBy(xpath = "//dx-button[@aria-label='Forgot Password']//div[@class='dx-button-content']") // "//span[normalize-space()='Forgot
																									// Password']")
	private WebElement btnForgotPassword;

	@FindBy(xpath = "//a[@class='choose-portal-hyperlink']")
	private WebElement linkChooseDiffPortal;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtUserNameOnFP;

	@FindBy(xpath = "//div[@id='rc-anchor-container']")
	private WebElement captchaContainer;

	@FindBy(xpath = "//div[@class='reset-button-content']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//dx-button[@aria-label='Back to Login']//div[@class='dx-button-content']")
	private WebElement btnBackToLogin;

	// This method check the Valid userName and Valid password
	public boolean verifyLogin(String userName, String password) {
		LoggerManager.info("======== into verifyLogin() ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyLogin() +++++++++ " + e.getMessage());
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");
			assertEquals(driver.getTitle(), "Management Portal Sandbox");
			LoggerManager.info("======== End verifyLogin() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// This method is used to verify Visibility of Login Page Components
	public boolean visibilityOfLoginPageComponents() {
		try {
			waitForElementToBeVisible(txtUsername);
			LoggerManager.info("============  Verifying Visibility Of Login Page Components ============");

			boolean allComponentsVisible = lblManagementBoardPortal.isDisplayed() && txtUsername.isDisplayed()
					&& txtPassword.isDisplayed() && btnSignIn.isDisplayed() && btnForgotPassword.isDisplayed()
					&& linkChooseDiffPortal.isDisplayed();

			if (allComponentsVisible) {
				LoggerManager.info("============  Login Page verified ============");
				return true;
			} else {
				LoggerManager.info("============  Login Page verification failed ============");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// This method is used - KeyPress event after Password is entered
	public boolean verifyLoginWithEnterKeyPress(String userName, String password) {
		LoggerManager.info("======== into verifyLoginEnterKeyPress() ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			txtPassword.sendKeys(Keys.ENTER);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyLoginEnterKeyPress() +++++++++ " + e.getMessage());
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");
			assertEquals(driver.getTitle(), "Management Portal Sandbox");
			LoggerManager.info("======== End verifyLoginEnterKeyPress() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// Method is used for checking Browser's Back
	public boolean clickBrowserBack(String userName, String password) {
		LoggerManager.info("======== into clickBrowserBackTest() ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in clickBrowserBackTest() +++++++++ " + e.getMessage());
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");

			driver.navigate().back();
			LoggerManager.info("======== End clickBrowserBackTest() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// This method retrieves the border color of a WebElement using JavaScript
	// (experimental)
	public String getUsernameBorderColor() {
		clickElement(btnSignIn);

		String script = "return window.getComputedStyle(arguments[0]).getPropertyValue('border-color');";

		return (String) ((JavascriptExecutor) driver).executeScript(script,
				driver.findElement(By.xpath("//input[@type='text']")));
	}

	// Method checks invalid Login
	public boolean invalidLogin(String username, String password) {
		LoggerManager.info("======== Into invalidLogin() ========");
		try {
			enterText(txtUsername, username);
			LoggerManager.info("======== Username: " + username + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			if (btnSignIn.isEnabled()) {
				clickElement(btnSignIn);
			} else {
				LoggerManager.debug("======== Button is disabled ========");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in invalidLogin() +++++++++ " + e.getMessage());
		}

		if (!driver.getCurrentUrl().endsWith("/home") && msgInvalidCredentials.isDisplayed()) {
			LoggerManager.info("======== invalidLogin() Fail ========");
			return false;
		} else {
			LoggerManager.info("======== invalidLogin() Pass ========");
			return true;
		}
	}

	// Method checks Visibility of Components of Forgot password page
	public boolean visibilityOfForgotPasswordPageComponents() {
		try {
			clickElement(btnForgotPassword);

			waitForElementToBeVisible(txtUserNameOnFP);

			LoggerManager.info("============ Verifying Visibility Of Forgot Password Page Components ============");

			boolean allComponentsVisible = txtUserNameOnFP.isDisplayed() &&
			// captchaContainer.isDisplayed() &&
					btnSubmit.isDisplayed() && btnBackToLogin.isDisplayed();

			if (allComponentsVisible) {
				LoggerManager.info("============ Forgot Password Page verified ============");
				return true;
			} else {
				LoggerManager.info("============ Forgot Password Page verification failed ============");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyShowPassword(String username, String password) {
		LoggerManager.info("======== View Password() ========");
		try {
			enterText(txtUsername, username);
			LoggerManager.info("======== Username: " + username + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(showEyeIconPassword);

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in invalidLogin() +++++++++ " + e.getMessage());
		}

		if (isElementDisplayed(getPassword)) {
			clickElement(hideEyeIconPassword);
			return true;
		} else {
			LoggerManager.debug("======== Button is disabled ========");
			return false;
		}
	}

	public String verifyDifferentPortalLink() {
		LoggerManager.info("======== Verify Different Link() ========");
		try {
			if (isElementDisplayed(linkChooseDiffPortal)) {
				clickElement(linkChooseDiffPortal);

			} else {
				LoggerManager.debug("======== Link is not displayed ========");
			}

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in invalidLogin() +++++++++ " + e.getMessage());
		}
		return getCurrentPageURL();

	}

	public String verifyForgotPasswordPage() {
		LoggerManager.info("======== Verify Forgot PAssword Link() ========");
		try {
			if (isElementDisplayed(btnForgotPassword)) {
				clickElement(btnForgotPassword);
				waitForElementToBeVisible(btnBackToLogin);
			} else {
				LoggerManager.debug("========Forgot Password Link is not displayed ========");
			}

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in Forgotpassword() +++++++++ " + e.getMessage());
		}
		return getCurrentPageURL();
	}

	// Method checks the Simultaneous login on Same browser
	public boolean verifySimultaneousLoginOnSameBrowser(String userName, String password) {
		LoggerManager.info("======== into verifySimultaneousLoginOnSameBrowser() ========");

		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);

			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));
		} catch (Exception e) {
			LoggerManager
					.error("+++++++++ Exception in verifySimultaneousLoginOnSameBrowser() +++++++++ " + e.getMessage());
			return false;
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");
			assertEquals(driver.getTitle(), "Management Portal Sandbox");
			LoggerManager.info("======== End verifySimultaneousLoginOnSameBrowser() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// Method is used to check the application of Different Browsers
	public boolean verifyLoginDiffUsersOnDifferentBrowsers(String userName, String password) {
		LoggerManager.info("======== into verifyLoginDiffUsersOnDifferentBrowsers() ========");

		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		} catch (Exception e) {
			LoggerManager.error(
					"+++++++++ Exception in verifyLoginDiffUsersOnDifferentBrowsers() +++++++++ " + e.getMessage());
			return false;
		}

		// Different browser code
		FirefoxDriver ffDriver = new FirefoxDriver();
		String applicationURL = EnvironmentConfig.environmentSetup().get("APPLICATIONURL");

		try {
			ffDriver.get(applicationURL);
			ffDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			LoggerManager.debug("------- Page load timeout is set to: 40");

			ffDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			LoggerManager.debug("------- Implicit Wait time is set to: 15");

			enterText(txtUsername, userName);
			enterText(txtPassword, password);

			clickElement(btnSignIn);

			String expectedUrl = EnvironmentConfig.environmentSetup().get("ApplicationURL") + "/home";
			waitForUrlToBe(driver, expectedUrl);

			String actualUrl = ffDriver.getCurrentUrl();

			if (expectedUrl.equals(actualUrl)) {
				LoggerManager.info("======== Login on different browser Success ========");
				LoggerManager.info("======== End verifyLoginDiffUsersOnDifferentBrowsers() ========");
				assertEquals(expectedUrl, actualUrl);

				ffDriver.quit();
				return true;
			} else {
				LoggerManager.debug("======== verifyLoginDiffUsersOnDifferentBrowsers Unsuccessful ========");
				ffDriver.quit();
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception during different browser operations +++++++++ " + e.getMessage());
			ffDriver.quit();
			return false;
		}
	}

	// Method is used to open HomePage
	public HomePage verifyHomePage(String userName, String password) {
		try {
			doLogin(userName, password, "verifyHomePage()");
			LoggerManager.info("======== Login successful for verifyHomePage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyHomePage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyHomePage()", e);
		}

		return new HomePage(driver);
	}

	// Method for Internal Task page
	public InternalTasksPage verifyInternalTaskPage(String userName, String password) {
		LoggerManager.info("======== into verifyInternalTaskPage() ========");

		try {
			doLogin(userName, password, "verifyInternalTaskPage()");
			LoggerManager.info("======== Login successful for verifyInternalTaskPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyInternalTaskPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyInternalTaskPage()", e);
		}

		return new InternalTasksPage(driver);
	}

	public ProjectsTasksPage verifyProjectTaskPage(String userName, String password) {
		LoggerManager.info("======== into verifyProjectTaskPage() ========");

		try {
			doLogin(userName, password, "verifyProjectTaskPage()");
			LoggerManager.info("======== Login successful for verifyProjectTaskPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyProjectTaskPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyProjectTaskPage()", e);
		}

		return new ProjectsTasksPage(driver);
	}

	public BillingItemManagementPage verifyBillingItemManagementPage(String userName, String password) {
		LoggerManager.info("======== into verifyBillingItemManagementPage() ========");

		try {
			doLogin(userName, password, "verifyBillingItemManagementPage()");
			LoggerManager.info("======== Login successful for verifyBillingItemManagementPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyBillingItemManagementPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyBillingItemManagementPage()", e);
		}

		return new BillingItemManagementPage(driver);
	}

	public CommunityBlocksPage verifyCommunityBlocksPage(String userName, String password) {
		LoggerManager.info("======== into verifyCommunityBlocksPage() ========");

		try {
			doLogin(userName, password, "verifyCommunityBlocksPage()");
			LoggerManager.info("======== Login successful for verifyCommunityBlocksPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyCommunityBlocksPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyCommunityBlocksPage()", e);
		}

		return new CommunityBlocksPage(driver);
	}

	public CommonLotsAppraisalPage verifyComMgmtCommonLotsAppraisalPage(String userName, String password) {
		LoggerManager.info("======== into verifyComMgmtCommonLotsAppraisalPage() ========");

		try {
			doLogin(userName, password, "verifyComMgmtCommonLotsAppraisalPage()");
			LoggerManager.info("======== Login successful for verifyComMgmtCommonLotsAppraisalPage() ========");
		} catch (Exception e) {
			LoggerManager
					.error("+++++++++ Exception in verifyComMgmtCommonLotsAppraisalPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyComMgmtCommonLotsAppraisalPage()", e);
		}

		return new CommonLotsAppraisalPage(driver);
	}

	public BoardApprovalsPage verifyComMgmtBoardApprovalsPage(String userName, String password) {
		LoggerManager.info("======== into verifyComMgmtBoardApprovalsPage() ========");

		try {
			doLogin(userName, password, "verifyComMgmtBoardApprovalsPage()");
			LoggerManager.info("======== Login successful for verifyComMgmtBoardApprovalsPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyComMgmtBoardApprovalsPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyComMgmtBoardApprovalsPage()", e);
		}

		return new BoardApprovalsPage(driver);
	}

	public FulfillmentQueuePage verifyComMgmtFulfillmentQueuePage(String username, String password) {
		LoggerManager.info("======== into verifyComMgmtFulfillmentQueuePage() ========");

		try {
			doLogin(username, password, "verifyComMgmtFulfillmentQueuePage()");
			LoggerManager.info("======== Login successful for verifyComMgmtFulfillmentQueuePage() ========");
		} catch (Exception e) {
			LoggerManager
					.error("+++++++++ Exception in verifyComMgmtFulfillmentQueuePage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyComMgmtFulfillmentQueuePage()", e);
		}

		return new FulfillmentQueuePage(driver);
	}

	public MaintenanceWorkOrdersPage verifyMaintenanceWorkOrdersPage(String userName, String password) {
		LoggerManager.info("======== into verifyComMgmtMaintenanceWorkOrdersPage() ========");

		try {
			doLogin(userName, password, "verifyWorkOrdersPage()");
			LoggerManager.info("======== Login successful for verifyComMgmtMaintenanceWorkOrdersPage() ========");
		} catch (Exception e) {
			LoggerManager.error(
					"+++++++++ Exception in verifyComMgmtMaintenanceWorkOrdersPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyComMgmtMaintenanceWorkOrdersPage()", e);
		}

		return new MaintenanceWorkOrdersPage(driver);
	}

	public ClosingRequestsPage verifyDiscloProcessingClosingRequestsPage(String userName, String password) {
		LoggerManager.info("======== into verifyDiscloProcessingClosingRequestsPage() ========");

		try {
			doLogin(userName, password, "VerifyBillingItemManagementPage()");
			LoggerManager.info("======== Login successful for verifyDiscloProcessingClosingRequestsPage() ========");
		} catch (Exception e) {
			LoggerManager.error(
					"+++++++++ Exception in verifyDiscloProcessingClosingRequestsPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyDiscloProcessingClosingRequestsPage()", e);
		}

		return new ClosingRequestsPage(driver);
	}

	public UploadBudgetsPage verifyUploadBudgetsPage(String username, String password) {
		LoggerManager.info("======== into verifyGLUploadBudgetsPage() ========");

		try {
			doLogin(username, password, "verifyUploadBudgetsPageURL()");
			LoggerManager.info("======== Login successful for verifyGLUploadBudgetsPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyGLUploadBudgetsPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyGLUploadBudgetsPage()", e);
		}

		return new UploadBudgetsPage(driver);
	}

	public PropertyConveyancePage verifyPropertyConveyanceWorkQueuePage(String username, String password) {

		try {
			doLogin(username, password, "verifyPropertyConveyanceWorkQueuePage()");
			LoggerManager.info("======== Login successful for verifyPropertyConveyanceWorkQueuePage() ========");
		} catch (Exception e) {
			LoggerManager.error(
					"+++++++++ Exception in verifyPropertyConveyanceWorkQueuePage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyPropertyConveyanceWorkQueuePage()", e);
		}

		return new PropertyConveyancePage(driver);
	}

	public NewARPaymentPage verifyNewARPaymentPageURL(String username, String password) {

		try {
			doLogin(username, password, "verifyNewARPaymentPageURL()");
			LoggerManager.info("======== Login successful for verifyNewARPaymentPageURL() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyNewARPaymentPageURL() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyNewARPaymentPageURL()", e);
		}

		return new NewARPaymentPage(driver);
	}

	public StatementApprovalQueuePage verifyStatementApprovalQueuePage(String username, String password) {
		try {
			doLogin(username, password, "verifyStatementApprovalQueuePage()");
			LoggerManager.info("======== Login successful for verifyStatementApprovalQueuePage() ========");
		} catch (Exception e) {
			LoggerManager
					.error("+++++++++ Exception in verifyStatementApprovalQueuePage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyStatementApprovalQueuePage()", e);
		}
		return new StatementApprovalQueuePage(driver);
	}

	public ViolationReviewPage verifyViolationReviewPage(String username, String password) {
		try {
			doLogin(username, password, "verifyViolationReviewPage()");
			LoggerManager.info("======== Login successful for verifyViolationReviewPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyViolationReviewPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyViolationReviewPage()", e);
		}
		return new ViolationReviewPage(driver);
	}

	public InternalUserNavigation verifyInternalUserPage(String username, String password) {

		try {
			doLogin(username, password, "verifyInternalUserPage()");
			LoggerManager.info("======== Login successful for verifyInternalUserPage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyInternalUserPage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyInternalUserPage()", e);
		}

		return new InternalUserNavigation(driver);
	}

	public BoardMemberNavigation verifyBoardMemberHomePage(String userName, String password) {
		try {
			doLogin(userName, password, "verifyBoardMemberHomePage()");
			LoggerManager.info("======== Login successful for verifyBoardMemberHomePage() ========");
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyBoardMemberHomePage() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyBoardMemberHomePage()", e);
		}
		return new BoardMemberNavigation(driver);
	}

	public BatchJobEmailsPage verifyBatchJobEmailConfigurations(String userName, String password) {
		try {
			doLogin(userName, password, "verifyBatchJobEmailConfigPage()");
			LoggerManager.info("======== Login successful for verifyBatchJobEmailConfigurations() ========");
		} catch (Exception e) {
			LoggerManager
					.error("+++++++++ Exception in verifyBatchJobEmailConfigurations() +++++++++ " + e.getMessage());
			throw new RuntimeException("Login failed in verifyBatchJobEmailConfigurations()", e);
		}
		return new BatchJobEmailsPage(driver);
	}

	public boolean userLogout() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

			// Wait for user panel to be visible
			WebElement userPanel = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cc-user-panel-name']")));

			// Click on the user panel
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", userPanel);

			// Wait for logout button to be visible and click on it
			WebElement logoutButton = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Logout')]")));
			logoutButton.click();

			LoggerManager.info("======== Logout successful ========");
			return true;

		} catch (TimeoutException | ElementNotInteractableException e) {
			LoggerManager.error("+++++++++ Exception in userLogout() +++++++++ " + e.getMessage());
			return false;
		}
	}

	public ModulesPage verifyModulesPages(String userName, String password) {
		doLogin(userName, password, "verifyModulesPages()");
		return new ModulesPage(driver);
	}

	public ResponseTemplatesPage verifyResponseTemplatesPage(String userName, String password) {
		doLogin(userName, password, "verifyResponseTemplatesPage()");
		return new ResponseTemplatesPage(driver);
	}

	public ClosingPortalPage verifyClosingPortalConfigClickPages(String userName, String password) {
		doLogin(userName, password, "verifyCommunityConfigClickPages()");
		return new ClosingPortalPage(driver);
	}

	public CommunityPage verifyCommunityConfigPage(String userName, String password) {
		doLogin(userName, password, "verifyCommunityConfigPage()");
		return new CommunityPage(driver);
	}

	public EnforcementPage verifyEnforcementPage(String userName, String password) {
		doLogin(userName, password, "verifyEnforcementPage()");
		return new EnforcementPage(driver);
	}

	public ProcessTrackerPage verifyProcessTrackerPages(String userName, String password) {
		doLogin(userName, password, "verifyProcessTrackerPages()");
		return new ProcessTrackerPage(driver);
	}

	public ReportTemplatesPage verifyReportTemplatesPages(String userName, String password) {
		doLogin(userName, password, "verifyReportTemplatesPages()");
		return new ReportTemplatesPage(driver);
	}

	public ServicesPage verifyServicesPage(String userName, String password) {
		doLogin(userName, password, "verifyServicesPage()");
		return new ServicesPage(driver);
	}

	public CommunityAccountingPage verifyCommunityAccountingPage(String userName, String password) {
		doLogin(userName, password, "verifyCommunityAccountingPage()");
		return new CommunityAccountingPage(driver);
	}

	public DepositsPage verifyDepositsPage(String userName, String password) {
		doLogin(userName, password, "verifyDepositsPage()");
		return new DepositsPage(driver);
	}

	public MyCustomerChargesPage verifyMyCustomerChargesPage(String userName, String password) {
		doLogin(userName, password, "verifyMyCustomerChargesPage()");
		return new MyCustomerChargesPage(driver);
	}

	public APExpenseDetailPage verifyAPExpenseDetailPage(String userName, String password) {
		doLogin(userName, password, "verifyAPExpenseDetailPage()");
		return new APExpenseDetailPage(driver);
	}

	public OpenViolationsLogPage verifyOpenViolationsLogPage(String userName, String password) {
		doLogin(userName, password, "verifyOpenViolationsLogPage()");
		return new OpenViolationsLogPage(driver);
	}

	// This is a common method to do the login
	private void doLogin(String userName, String password, String methodName) {
		LoggerManager.info("======== into " + methodName + " ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in " + methodName + " +++++++++ " + e.getMessage());
		}

		if (!driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.debug("======== Login Unsuccessful ========");
		}
	}
}
