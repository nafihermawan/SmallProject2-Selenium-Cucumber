package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class AccountCreationPage extends BaseClass{

	public AccountCreationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "id_gender1")
	private WebElement radioMr;

	@FindBy(id = "id_gender2")
	private WebElement radioMrs;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement inputFirstName;

	@FindBy(id = "customer_lastname")
	private WebElement inputLastName;

	@FindBy(id = "email")
	private WebElement inputEmail;

	@FindBy(id = "passwd")
	private WebElement createPassword;

	@FindBy(id = "days")
	private WebElement days;

	@FindBy(id = "months")
	private WebElement months;

	@FindBy(id = "years")
	private WebElement years;

	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAccount;

	@FindBy(id = "//h1[@class='page-heading']")
	private WebElement headCreateAccount;

	public void clickRadioMr() {
		radioMr.click();
	}

	public void clickRadioMrs() {
		radioMrs.click();
	}

	public void setFirstName(String firstName) {
		inputFirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		inputLastName.sendKeys(lastName);
	}

	public void setPassword(String password) {
		createPassword.sendKeys(password);
	}
	
	public void setDayOfBirth(String day) {
		selectValue(days, day);
	}
	
	public void setMonthOfBirth(String month) {
		selectValue(months, month);
	}
	
	public void setYearOfBirth(String year) {
		selectValue(years, year);
	}

	public void clickRegister() {
		btnSubmitAccount.click();
	}

	public boolean isDisplayed() {
		return headCreateAccount.isDisplayed();
	}
}
