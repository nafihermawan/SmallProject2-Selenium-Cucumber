package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.HomePage;
import page_object.OrderConfirmationPage;
import page_object.OrderSummaryPage;
import page_object.SearchResultPage;
import page_object.SummaryPage;

@SuppressWarnings("deprecation")
public class ReservationStep {

	private WebDriver webDriver;

	public ReservationStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("User on the home page")
	public void openHomePage() {
		HomePage homePage = new HomePage(webDriver);
		Assert.assertTrue(homePage.isDisplayed());
	}

	@When("User input \"(.*)\" as hotel location, select Prime Hotel, User select check in date and select check out date")
	public void inputHotelDetail(String hotelLocation) {
		HomePage homePage = new HomePage(webDriver);
		homePage.inputHotelLocation(hotelLocation);
		homePage.selectHotel();
		homePage.checkInDate();
		homePage.setDate1();
		homePage.checkOutDate();
		homePage.setDate2();
		homePage.searchHotelNow();
	}

	@When("User input \"(.*)\" as Qyt, click book now button, click procces to checkout")
	public void setQyt(String qyt) throws InterruptedException {
		SearchResultPage searchResult = new SearchResultPage(webDriver);
		Assert.assertTrue(searchResult.isDisplayed());
		searchResult.setQyt(qyt);
		searchResult.clickBookNow();
		searchResult.windowHandle();
		Thread.sleep(2000);
		searchResult.clickProccesToCheckout();
	}

	@When("User see rooms and summary room click procces, user input \"(.*)\" as password and \"(.*)\", User see Guest information and click procced, User select pay by bank wire as payment")
	public void checkDetailandSummary(String email, String password) throws InterruptedException {
		SummaryPage summaryPage = new SummaryPage(webDriver);
		summaryPage.windowHandle();
		summaryPage.clickProcces();
		summaryPage.clickLoginNow();
		summaryPage.setEmail(email);
		summaryPage.setPassword(password);
		summaryPage.clickSignIn();
		Thread.sleep(2000);
		summaryPage.clickProccedGuest();
		summaryPage.clickSelectTNC();
		Thread.sleep(2000);
		summaryPage.payBankWire();
	}
	
	@When("User see order summary page")
	public void checkOrderSummary() {
		OrderSummaryPage orderSummary = new OrderSummaryPage(webDriver);
		Assert.assertTrue(orderSummary.isDisplayed());
		orderSummary.clickConfirmOrder();
	}

	@Then("User see search result")
	public void resultPage() {
		OrderConfirmationPage orderConfirmation = new OrderConfirmationPage(webDriver);
		Assert.assertTrue(orderConfirmation.isDisplayed());
	}

}