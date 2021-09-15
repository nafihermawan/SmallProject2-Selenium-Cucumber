package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public AccountPage(WebDriver webDriver) {
		super();
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement headerInfoTxt;
	
	@FindBy(xpath = "//span[contains(.,'Home')]")
	private WebElement btnHome;
	
	@FindBy(xpath = "//span[.='Add my first address']")
	private WebElement addAddress;

	@FindBy(xpath = "//span[.='Order history and details']")
	private WebElement btnOrderHistory;
	
	@FindBy(xpath = "//span[.='Order history and details']")
	private WebElement btnCreditSlip;
	
	@FindBy(xpath = "//span[.='My addresses']")
	private WebElement btnUserddress;
	
	@FindBy(xpath = "//span[.='My personal information']")
	private WebElement btnPersonalInfo;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement pageHeading;
	
	@FindBy(xpath = "//button[@id='user_info_acc']")
	private WebElement userAcc;
	
	public void clickAddAddress() {
		addAddress.click();
	}
	
	public void clickHistory() {
		btnOrderHistory.click();
	}
	
	public void clickCreditSlip() {
		btnCreditSlip.click();
	}
	
	public void clickUserAddres() {
		btnUserddress.click();
	}
	
	public void clickBackHome() {
		btnHome.click();
	}
	
	public boolean isDisplayed(){
		headerInfoTxt.isDisplayed();	
		return true;
	}
	
	public String getUser() {
		return userAcc.getText();
	}
}
