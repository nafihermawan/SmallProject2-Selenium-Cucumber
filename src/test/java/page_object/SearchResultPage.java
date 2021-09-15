package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SearchResultPage extends BaseClass {
	public SearchResultPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//div[@id='category_data_cont']/div[1]//span[.='Book Now']")
	private WebElement btnBookNow;

	@FindBy(id = "cat_quantity_wanted_1")
	private WebElement inputQyt;

	@FindBy(xpath = "//div[@id='category_data_cont']/div[1]//div[@class='rm_qty_cont pull-right clearfix']//a[1]")
	private WebElement btnAddQyt;

	@FindBy(xpath = "//div[@id='category_data_cont']/div[1]//a[2]")
	private WebElement btnMinQyt;

	@FindBy(xpath = "//p[.='General Rooms']")
	private WebElement generalRoom;
	
	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	private WebElement hoverBtnProcces;
	
	@FindBy(xpath = "//a[contains(.,'Proceed to checkout')]") 
	private WebElement btnProccesToCheckout;
		
	@FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']/span[contains(.,'Continue shopping')]")
	private WebElement btnCountinueShoping;

	@FindBy(xpath = "//h2[contains(.,'Room successfully added to your cart')]")
	private WebElement addSuccesInfo;
	
	@FindBy(xpath = "//li[contains(.,'An account using this email address has already been registered. Please enter a')]")
	private WebElement rowCount;

	public void setQyt(String qyt) {
		inputQyt.sendKeys(qyt);
	}
	
	public void setAddQyt() {
		btnAddQyt.click();
	}
	
	public void setMinQyt() {
		btnMinQyt.click();
	}

	public void clickBookNow() {
		btnBookNow.click();
	}

	public void clickProccesToCheckout() {
		btnProccesToCheckout.click();
	}

	public boolean isDisplayed() {
	addSuccesInfo.isDisplayed();
	rowCount.isDisplayed();
	inputQyt.isDisplayed();
	btnAddQyt.isDisplayed();
	btnMinQyt.isDisplayed();
	btnBookNow.isDisplayed();
	return true;
	}
	
	public void windowHandle() {
		webDriver.getWindowHandle();	
	}
}
