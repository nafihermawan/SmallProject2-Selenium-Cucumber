package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.AccountPage;
import page_object.HomePage;
import page_object.LoginPage;

@SuppressWarnings("deprecation")
public class LoginStep {

	private WebDriver webDriver;

	public LoginStep(WebDriver webDriver) {
		super();
		this.webDriver = Hooks.webDriver;
	}

	public LoginStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("User open the web page and User click SignIn")
	public void openHomePage() {
		HomePage homePage = new HomePage(webDriver);
		Assert.assertTrue(homePage.isDisplayed());
		homePage.clickSignIn();
	}

	@When("User input \"(.*)\" as username and \"(.*)\" as password")
	public void inputCredential(String email, String password) {
		LoginPage loginPage = new LoginPage(webDriver);
		loginPage.setEmail(email);
		loginPage.setPassword(password);
		loginPage.clickLogin();
	}

	@Then("User see error message")
	public void errorMassage() {
		LoginPage loginPage = new LoginPage(webDriver);
		Assert.assertEquals("Authentication failed.", loginPage.getErrorMassageLogin());
	}
	
	@Then("user see MyAccount page")
	public void loginSucces() {
		AccountPage accountPage = new AccountPage(webDriver);
		Assert.assertTrue(accountPage.isDisplayed());
		Assert.assertEquals("Userdua", accountPage.getUser());
		accountPage.clickBackHome();
	}
}
