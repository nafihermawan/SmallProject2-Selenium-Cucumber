package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class UserAddressPage extends BaseClass {

	public UserAddressPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement inputFirstName;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement inputLastName;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement inputCompany;

	@FindBy(id = "address1")
	private WebElement inputAddress1;

	@FindBy(id = "address2")
	private WebElement inputAddress2;

	@FindBy(id = "postcode")
	private WebElement inputPostCode;

	@FindBy(id = "city")
	private WebElement inputCity;

	@FindBy(id = "id_state")
	private WebElement inputState;

	@FindBy(id = "id_country")
	private WebElement inputCountry;

	@FindBy(id = "phone")
	private WebElement inpurHomePhone;

	@FindBy(id = "phone_mobile")
	private WebElement inputMobilePhone;

	@FindBy(id = "other")
	private WebElement inputOtherInfo;

	@FindBy(id = "alias")
	private WebElement inputAddressTitle;

	@FindBy(id = "submitAddress")
	private WebElement btnSubmit;

	public void setFirstName(String firstName) {
		inputFirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		inputLastName.sendKeys(lastName);
	}

	public void setCompany(String company) {
		inputCompany.sendKeys(company);
	}

	public void setAddressFirst(String addressFirst) {
		inputAddress1.sendKeys(addressFirst);
	}

	public void setAddressNd(String addressNd) {
		inputAddress2.sendKeys(addressNd);
	}

	public void setPostCode(String postCode) {
		inputPostCode.sendKeys(postCode);
	}

	public void setCity(String city) {
		inputCity.sendKeys(city);
	}

	public void setState(String state) {
		selectValue(inputState, state);
	}

	public void setCountry(String country) {
		selectValue(inputCountry, country);
	}

	public void setPhone(String homeNumber) {
		inpurHomePhone.sendKeys(homeNumber);
	}

	public void setMobileNumber(String mobileNumber) {
		inputMobilePhone.sendKeys(mobileNumber);
	}

	public void setOtherInfo(String info) {
		inputOtherInfo.sendKeys(info);
	}
	
	public void setAddressTitle(String addressTitle) {
		inputAddressTitle.sendKeys(addressTitle);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}
}