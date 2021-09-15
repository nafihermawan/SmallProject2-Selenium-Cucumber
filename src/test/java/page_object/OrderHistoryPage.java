package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderHistoryPage extends BaseClass{

	public OrderHistoryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(id = "order-list")
	private WebElement table;
	
	@FindBy(xpath = "//tr[@class='first_item ']//span[contains(.,'Details')]")
	private WebElement btnDetail;
	
	@FindBy(xpath = "//span[contains(.,'Home')]")
	private WebElement btnHome;
	
	@FindBy(xpath = "//span[contains(.,'Back to Your Account')]")
	private WebElement btnBackToAccount;
	
}
