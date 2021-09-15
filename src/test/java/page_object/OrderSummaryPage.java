package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderSummaryPage extends BaseClass{
	
	public OrderSummaryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	private WebElement btnConfirmOrder;
	
	@FindBy(xpath = "//div[@class='box cheque-box']")
	private WebElement infoBankWirePayment;
	
	public void clickConfirmOrder() {
		btnConfirmOrder.click();
	}
	
	public boolean isDisplayed() {
		infoBankWirePayment.isDisplayed();
		btnConfirmOrder.isDisplayed();
		return true;
	}
}
