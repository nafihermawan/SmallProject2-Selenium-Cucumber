package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "email_create")
	private WebElement inputCreateEmail;

	@FindBy(id = "SubmitCreate")
	private WebElement btnCreateAccount;

	@FindBy(id = "email")
	private WebElement inputEmail;

	@FindBy(id = "passwd")
	private WebElement inputPassword;

	@FindBy(id = "SubmitLogin")
	private WebElement btnLogin;

	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement pageHeading;

	@FindBy(id = "create-account_form")
	private WebElement createAccountForm;

	@FindBy(id = "login_form")
	private WebElement loginForm;

	@FindBy(xpath = "//li[contains(.,'An account using this email address has already been registered. Please enter a')]")
	private WebElement errorMessageCreateAccount;

	@FindBy(xpath = "//li[.='Authentication failed.']")
	private WebElement errorMessageLogin;

	public void setEmail(String email) {
		inputEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void setEmailCreateAccount(String setEmail) {
		inputCreateEmail.sendKeys(setEmail);
	}

	public void clickCreateAccount() {
		btnCreateAccount.click();
	}

	public String getErrorMessage() {
		return errorMessageCreateAccount.getText();
	}
	
	public boolean isDisplayed() {
		pageHeading.isDisplayed();
		createAccountForm.isDisplayed();
		loginForm.isDisplayed();
		errorMessageCreateAccount.isDisplayed();
		return true;
	}
}
