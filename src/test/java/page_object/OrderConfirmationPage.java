package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderConfirmationPage extends BaseClass{

	public OrderConfirmationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(xpath = "//div[@class='box']")
	private WebElement boxInfo;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement infoSucces;
	
	@FindBy(xpath = "//a[.='View your order history']")
	private WebElement btnViewOrderHistory;
	
	public boolean isDisplayed() {
		return infoSucces.isDisplayed();
	} 
}
