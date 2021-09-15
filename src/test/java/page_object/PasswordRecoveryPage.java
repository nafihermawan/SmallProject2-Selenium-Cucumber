package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PasswordRecoveryPage extends BaseClass{
	
	public PasswordRecoveryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "email")
	private WebElement inputEmail;
	
	@FindBy(xpath = "//div[@class='box']")
	private WebElement box;
	
	@FindBy(xpath = "//span[contains(.,'Retrieve Password')]")
	private WebElement btnRetrievePassword;
	
	public void setEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void clickBtnRetrievePassword() {
		btnRetrievePassword.click();
	}
	
	public boolean isDisplayed() {
		inputEmail.isDisplayed();
		box.isDisplayed();
		btnRetrievePassword.isDisplayed();
		return true;
	}
}
