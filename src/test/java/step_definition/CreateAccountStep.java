package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.AccountCreationPage;
import page_object.AccountPage;
import page_object.HomePage;
import page_object.LoginPage;

@SuppressWarnings("deprecation")
public class CreateAccountStep {

	private WebDriver webDriver;

	public CreateAccountStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("User open Web Page and click SignIn")
	public void openHomePage() throws InterruptedException {
		HomePage homePage = new HomePage(webDriver);
		Assert.assertTrue(homePage.isDisplayed());
		Thread.sleep(2000);
		homePage.clickSignIn();
	}	

	@When("User input \"(.*)\" as email address and click button Create Account")
	public void inputEmail(String setEmail) {
		LoginPage loginPage = new LoginPage(webDriver);
		loginPage.setEmailCreateAccount(setEmail);
		loginPage.clickCreateAccount();
	}

	@Then("The User see error message")
	public void invalidLogin() throws Throwable 
	{
		LoginPage loginPage = new LoginPage(webDriver);
		Assert.assertTrue(loginPage.isDisplayed());
	}
	
	@When("User input \"(.*)\" as first name, User input \"(.*)\" as last name and \"(.*)\" as password")
	public void inputName(String firstName, String lastName, String password) throws InterruptedException {
		Thread.sleep(2000);
		AccountCreationPage accountCreationPage = new AccountCreationPage(webDriver);
		accountCreationPage.clickRadioMr();
		accountCreationPage.setFirstName(firstName);
		accountCreationPage.setLastName(lastName);
		accountCreationPage.setPassword(password);
	}
	
	@When("User select \"(.*)\" as day, \"(.*)\" as january and \"(.*)\" as year")
	public void setDateOfBirth(String days, String month, String year) {
		AccountCreationPage accountCreationPage = new AccountCreationPage(webDriver);
		accountCreationPage.setDayOfBirth(days);
		accountCreationPage.setMonthOfBirth(month);
		accountCreationPage.setYearOfBirth(year);
		accountCreationPage.clickRegister();
	}
	
	@Then("Account already created")
	public void accountCreated() {
		AccountPage accountPage = new AccountPage(webDriver);
		Assert.assertTrue(accountPage.isDisplayed());
	}
}
