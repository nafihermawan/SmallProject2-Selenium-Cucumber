package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(xpath = "//span[@class='hide_xs']")
	private WebElement btnSignIn;
	
	@FindBy(id = "hotel_location")
	private WebElement txtHotelLocation;
	
	@FindBy(id = "hotel_cat_name")
	private WebElement btnSelectHotel;
	
	@FindBy(id = "check_in_time")
	private WebElement btnCheckIn;
	
	@FindBy(id = "check_out_time")
	private WebElement btnCheckOut;
	
	@FindBy(id = "search_room_submit")
	private WebElement btnSearchNow;
	
	@FindBy(xpath = "//h1[@class='header-hotel-name']")
	private WebElement headerText;
	
	@FindBy(css = ".search_result_li")
	private WebElement hotelPrime;
	
	@FindBy(xpath = "//a[contains(text(),'19')]")
	private WebElement checkIndate20;
	
	@FindBy(xpath = "//a[contains(text(),'20')]")
	private WebElement checkOutDate21;
	
	public boolean isDisplayed() {
		headerText.isDisplayed();
		btnSignIn.isDisplayed();
		btnSearchNow.isDisplayed();
		btnCheckIn.isDisplayed();
		btnCheckOut.isDisplayed();
		btnSignIn.isDisplayed();		
		return true;
	}
	
	public void inputHotelLocation(String hotelLocation) {
		txtHotelLocation.sendKeys(hotelLocation);
	}
	
	public void selectHotel() {
		btnSelectHotel.click();
		hotelPrime.click();
	}
	
	public void checkInDate() {
		btnCheckIn.click();
	}
	
	public void checkOutDate() {
		btnCheckOut.click();
	}
	
	public void setDate1() {
		checkIndate20.click();
	}
	
	public void setDate2() {
		checkOutDate21.click();
	}
	
	public void searchHotelNow() {
		btnSearchNow.click();
	}
	
	public void clickSignIn() {
		btnSignIn.click();
	}
	
}