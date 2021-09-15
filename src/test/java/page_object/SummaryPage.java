package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SummaryPage extends BaseClass{

	public SummaryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//p[.='ROOMS']/following-sibling::p")
	private WebElement totalRoom;
	
	@FindBy(xpath = "//div[@class='room-xs-info']//a[contains(.,'Executive Rooms')]")
	private WebElement titleHotel;

	@FindBy(xpath = "//div[@id='collapse-shopping-cart']/div/div[2]/div[2]/div/a")
	private WebElement btnProcced;
	
	@FindBy(xpath = "//p[@class='cart_final_total_block']/span[@class='cart_total_values']")
	private WebElement finalTotalPrice;

	@FindBy(id = "id_gender")
	private WebElement selectGender;

	@FindBy(id = "customer_firstname")
	private WebElement inputFirstName;

	@FindBy(id = "customer_lastname")
	private WebElement inputLastName;

	@FindBy(id = "login_email")
	private WebElement inputEmail;
	
	@FindBy(id = "login_passwd")
	private WebElement inputPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement btnSubmitLogin;
	
	@FindBy(id = "phone_mobile")
	private WebElement inputPhoneNumber;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSave;
	
	@FindBy(id = "openLoginFormBlock")
	private WebElement btnLoginNow;
	
	@FindBy(xpath = "//div[.='Name']/following-sibling::div")
	private WebElement guestName;
	
	@FindBy(xpath = "//div[.='Email']/following-sibling::div")
	private WebElement guestEmail;
	
	@FindBy(xpath = "//div[@id='collapse-guest-info']//div[@class='row margin-btm-10']/div[contains(.,'Mobile Number')]/following-sibling::div")
	private WebElement guestPhoneNumber;
	
	@FindBy(xpath = "//div[@id='collapse-guest-info']//span[contains(.,'Proceed')]")
	private WebElement btnProccedGuest;
	
	@FindBy(id = "cgv")
	private WebElement selectCGV;
	
	@FindBy(xpath = "//a[contains(.,'Pay by bank wire (order processing will be longer)')]")
	private WebElement payByBankWire;
	
	@FindBy(xpath = "//a[contains(.,'Pay by check (order processing will be longer)')]")
	private WebElement payByCheck;
	
	@FindBy(xpath = "//a[contains(.,'Pay with your card or your PayPal account')]")
	private WebElement payByPayPal;
	
	
	public void clickProcces() {
		btnProcced.click();
	}
	
	public void clickProccedGuest() {
		btnProccedGuest.click();
	}
	
	public void setGenderMr(String gender) {
		selectValue(selectGender, gender);
	}
	
	public void setFirstName(String firstName) {
		inputFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		inputLastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickSignIn() {
		btnSubmitLogin.click();
	}
	
	public void setPhoneNumber(String phoneNumber) {
		inputPhoneNumber.sendKeys(phoneNumber);
	}
	
	public void clickSave() {
		btnSave.click();
	}
	
	public void clickLoginNow() {
		btnLoginNow.click();
	}
	
	public void clickSelectTNC() {
		selectCGV.click();
	}
	
	public void payBankWire() {
		payByBankWire.click();
	}
	
	public void windowHandle() {
		webDriver.getWindowHandle();	
	}
	
}
