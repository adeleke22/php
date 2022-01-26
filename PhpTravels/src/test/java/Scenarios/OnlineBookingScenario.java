package Scenarios;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import com.app.pageHelper.DashboardPageHelper;
import com.app.pageHelper.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnlineBookingScenario {

	BasePage basePage;
	DashboardPageHelper dashboard;
	LoginPage loginPage;
	WebDriver driver;

	static boolean msgResultNew;
	String emailAddress= "admin@phptravels.com";
	String password= "demoadmin";

	public OnlineBookingScenario(BasePage baseRef) {
		basePage = new BasePage();
		dashboard = new DashboardPageHelper(basePage.getWebDriver());
		loginPage= new LoginPage(basePage.getWebDriver());
	}

	@Given("^User is on dashboard$")
	public void UserIsOnDashboard() throws Throwable {
	   
		loginPage.loginIntoApplication(emailAddress, password);
		
	}

	@When("^Add the booking$")
	public void ClickOnAddBookingButton() throws Throwable {
		dashboard.mouseHoverOnHotelAndClickOnBooking();
		dashboard.clickOnAddBooking();
	}

	@When("^Provide First Name \"([^\"]*)\" Last Name \"([^\"]*)\" Mobile \"([^\"]*)\" and Email \"([^\"]*)\"$")
	public void provideCustomerDetails(String firstName, String lastName, String mobile, String emailAddress) throws Throwable {
	   
		dashboard.selectServiceType();
		dashboard.selectCustomer();
		dashboard.enterFirstName(firstName);
		dashboard.enterLastName(lastName);
		dashboard.enterMobileNumber(mobile);
		dashboard.enterEmailAddress(emailAddress);
	
		
	}

	@When("^Provide the check-in \"([^\"]*)\" and check-out \"([^\"]*)\"$")
	public void provide_the_check_in_and_check_out(String CheckInday, String CheckOutday) throws Throwable {
		//String CheckInday = "18";
		//String CheckOutday = "20";
		dashboard.selectCheckInDate(CheckInday);
		dashboard.selectCheckOutDate(CheckOutday);
		dashboard.selectHotel();
		dashboard.selectRoomName();
		

		dashboard.selectAdults();
		dashboard.selectChildren();
		dashboard.enterGuest1FirstName();
		dashboard.enterGuest1LastName();
		dashboard.enterGuest2FirstName();
		dashboard.enterGuest2LastName();
		
		dashboard.enterChild1Age();
		dashboard.enterChild1FirstName();
		dashboard.enterChild1LastName();
		
	}

	@Then("^Verify the GrandTotal$")
	public void verify_the_GrandTotal_message() throws Throwable {
		String roomTotalPrice= dashboard.getTotalRoomPrice();
	
		String grandTotal= dashboard.getGrandTotalPrice();
		
		assertEquals(roomTotalPrice, grandTotal);
		loginPage.Logout();
		assertTrue(loginPage.isLoginButtonDisplayed(), "Verify that login button is displayed after logout from the application");
		
	}

	@Given("^User is on location screen$")
	public void user_is_on_location_screen() throws Throwable {
		loginPage.loginIntoApplication(emailAddress, password);
		dashboard.mouseHoverOnCarAndClickOnLocation();
	}

	@When("^Select the cityOne \"([^\"]*)\", cityTwo \"([^\"]*)\", cityThree \"([^\"]*)\"$")
	public void SelectThreeRandomCities(String city1, String city2, String city3)throws Throwable {
	   
		dashboard.selectDubaiCity(city1);
		dashboard.selectAcapulcoCity(city2);
		dashboard.selectAlanyaCity(city3);
		dashboard.clickOnEditButtonAgainstDubai(city1);
	}

	@Then("^Verify that populated data is correct$")
	public void verify_that_populated_data_is_correct() throws Throwable {
	  
		String country = dashboard.getSelectedCountry();
		String city= dashboard.getSelectedCity();
		
		
		assertEquals("United Arab Emirates", country);
		assertEquals("Dubai", city);
		
		dashboard.clickOnSubmitButton();
		loginPage.Logout();
		assertTrue(loginPage.isLoginButtonDisplayed(), "Verify that login button is displayed after logout from the application");
		
	}


}
