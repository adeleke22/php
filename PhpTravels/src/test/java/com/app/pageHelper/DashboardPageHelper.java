package com.app.pageHelper;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DashboardPageHelper {

	WebDriver driver;

	public DashboardPageHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void mouseHoverOnHotelAndClickOnBooking() throws InterruptedException {
		WebElement tooltipLink = driver.findElement(By.xpath("//a[contains(text(),'hotels')]"));
		Actions action = new Actions(driver);
		action.moveToElement(tooltipLink).click().perform();
		WebElement booking = driver.findElement(By.xpath("//ul[@id='hotelsmodule']//a[contains(text(),'Bookings')]"));
		booking.click();
	}
	
	
	public void mouseHoverOnCarAndClickOnLocation() throws InterruptedException {
		WebElement tooltipLink = driver.findElement(By.xpath("//a[contains(text(),'cars')]"));
		Actions action = new Actions(driver);
		action.moveToElement(tooltipLink).click().perform();
		WebElement booking = driver.findElement(By.xpath("//ul[@id='carsmodule']//a[contains(text(),'Locations')]"));
		booking.click();
	}

	public void clickOnAddBooking() {
		WebElement addBooking = driver.findElement(By.xpath("//div[contains(text(),'Add Booking')]"));
		addBooking.click();
	}

	public void selectServiceType() throws InterruptedException {
		WebElement serviceType = driver.findElement(By.id("servicetype"));
		Select sl = new Select(serviceType);
		sl.selectByVisibleText("Hotels");
		Thread.sleep(2000);
	}

	public void selectCustomer() throws InterruptedException {
		WebElement customer = driver.findElement(By.id("selusertype"));
		Select sl = new Select(customer);
		sl.selectByVisibleText("Guest");
		Thread.sleep(2000);
	}
	
	
	public void enterFirstName(String firstName) {
		WebElement fName = driver.findElement(By.id("fname"));
		fName.clear();
		fName.sendKeys(firstName);
		
	}
	
	
	public void enterLastName(String LastName) {
		WebElement lName = driver.findElement(By.id("lname"));
		lName.clear();
		lName.sendKeys(LastName);
		
	}
	
	
	public void enterMobileNumber(String MobileNo) {
		WebElement cellNumber = driver.findElement(By.id("mobile"));
		cellNumber.clear();
		cellNumber.sendKeys(MobileNo);
		
	}

	
	public void enterEmailAddress(String emailAddress) {
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys(emailAddress);
		
	}
	
	public void selectCheckInDate(String day) throws InterruptedException
	{
		JavascriptExecutor js=  (JavascriptExecutor) (driver);
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		WebElement checkIn = driver.findElement(By.xpath("//div//input[@name='checkin' and @placeholder='Date']"));
		checkIn.click();
		Thread.sleep(2000);

		String month = "Nov";
		String year = "2021";
		//datePicker(month, day, year);
		
		selectTheDay(day);
	}
	
	
	
	public void selectCheckOutDate(String day) throws InterruptedException
	{
		String month = "Nov";
		//String day = "15";
		String year = "2021";
		selectTheDay(day);
	}
	
	
	
	public void selectHotel() throws InterruptedException {
		WebElement hotel = driver.findElement(By.xpath("//select[@name='item']"));
		Select sl = new Select(hotel);
		sl.selectByVisibleText("Rendezvous Hotels");
		Thread.sleep(2000);
	}
	
	
	public void selectRoomName() throws InterruptedException {
		WebElement room = driver.findElement(By.xpath("//select[@name='subitemid']"));
		Select sl = new Select(room);
		sl.selectByVisibleText("Delux Room");
		Thread.sleep(3000);
	}
	
	
	
	public String getTotalRoomPrice()
	{
		WebElement roomPrice = driver.findElement(By.id("totalroomprice"));
	
		String roomTotalPrice= roomPrice.getAttribute("value");
		double  ss= Double.valueOf(roomTotalPrice);
		System.out.println("double : " + String.format("%.2f", ss));
		String formatedPrice= String.format("%.2f", ss);
		return formatedPrice ;

	}
	
	
	public void selectAdults() throws InterruptedException {
		WebElement adult = driver.findElement(By.id("adultscount"));
		Select sl = new Select(adult);
		sl.selectByVisibleText("2");
		Thread.sleep(2000);
	}
	
	public void selectChildren() throws InterruptedException {
		WebElement child = driver.findElement(By.id("childcount"));
		Select sl = new Select(child);
		sl.selectByVisibleText("1");
		Thread.sleep(2000);
	}
	
	
	public void enterGuest1FirstName() throws InterruptedException {
		WebElement guest1 = driver.findElement(By.xpath("//input[contains(@name,'first_name_traveller_0')]"));
		guest1.clear();
		guest1.sendKeys("GFname001");
		
	}
	
	public void enterGuest1LastName() throws InterruptedException {
		WebElement guest1 = driver.findElement(By.xpath("//input[contains(@name,'last_name_traveller_0')]"));
		guest1.clear();
		guest1.sendKeys("GLname001");
		
	}

	public void enterGuest2FirstName() throws InterruptedException {
		WebElement guest2 = driver.findElement(By.xpath("//input[contains(@name,'first_name_traveller_1')]"));
		guest2.clear();
		guest2.sendKeys("GFname002");
		
	}
	
	public void enterGuest2LastName() throws InterruptedException {
		WebElement guest2 = driver.findElement(By.xpath("//input[contains(@name,'last_name_traveller_1')]"));
		guest2.clear();
		guest2.sendKeys("GLname002");
		
	}
	
	
	public void enterChild1FirstName() throws InterruptedException {
		WebElement child1 = driver.findElement(By.xpath("//input[contains(@name,'first_name_traveller_chlid_0')]"));
		child1.clear();
		child1.sendKeys("CFname001");
		
	}
	
	public void enterChild1LastName() throws InterruptedException {
		WebElement child1 = driver.findElement(By.xpath("//input[contains(@name,'last_name_traveller_chlid_0')]"));
		child1.clear();
		child1.sendKeys("CLname001");
		
	}
	
	
	public void enterChild1Age() throws InterruptedException {
		WebElement child1Age = driver.findElement(By.xpath("//input[contains(@name,'child_age_0')]"));
		child1Age.clear();
		child1Age.sendKeys("5");
		
	}
	
	
	public String getGrandTotalPrice()
	{
		WebElement grandTotal = driver.findElement(By.id("grandtotal"));
		String str= grandTotal.getText();
		String newStr = str.replaceAll("[$,]", "");
		System.out.println(newStr);
		return newStr;

	}
	
	
	
	public void selectDubaiCity(String city1)
	{
		WebElement dubai = driver.findElement(By.xpath("//td[contains(text(),'"+city1+"')]/preceding-sibling::td/input[@type='checkbox']"));
		dubai.click();
	}
	
	
	public void selectAcapulcoCity(String city2)
	{
		WebElement dubai = driver.findElement(By.xpath("//td[contains(text(),'"+city2+"')]/preceding-sibling::td/input[@type='checkbox']"));
		dubai.click();
	}
	
	
	public void selectAlanyaCity(String city3)
	{
		WebElement dubai = driver.findElement(By.xpath("//td[contains(text(),'"+city3+"')]/preceding-sibling::td/input[@type='checkbox']"));
		dubai.click();
	}
	
	public void clickOnEditButtonAgainstDubai(String city3)
	{
		WebElement dubai = driver.findElement(By.xpath("//td[contains(text(),'"+city3+"')]/following-sibling::td[5]/span/a[1]"));
		dubai.click();
	}
	
	public String getSelectedCountry()
	{
		WebElement country = driver.findElement(By.xpath("//span[@class='select2-chosen']"));
		return country.getText();
	}
	
	
	public String getSelectedCity()
	{
		WebElement country = driver.findElement(By.id("location"));
		return country.getAttribute("value");
	}
	
	public void clickOnSubmitButton()
	{
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}
	

	
	public void datePicker(String month, String day, String year) throws InterruptedException {

		// get the year
		String finalYear;
		WebElement yearElement;
		yearElement = driver.findElement(By.xpath("(//th[@class='switch'])[1]"));
		String yearText = yearElement.getText();
		String[] yearArray = yearText.split(" ");
		//System.out.println("Years is: " + yearArray[0] + " : " + yearArray[1]);
		finalYear = yearArray[1];

		// select the year
		// 2024.equal(2021)
		while (!(finalYear.equalsIgnoreCase(year))) {
			WebElement nextIcon = driver.findElement(By.xpath("(//th[contains(@class,'next')])[1]"));
			nextIcon.click();
			Thread.sleep(1000);

			yearElement = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
			String yearText1 = yearElement.getText();
			String[] yearArray1 = yearText1.split(" ");
			//System.out.println("Years is1: " + yearArray1[0] + " : " + yearArray1[1]);

			finalYear = yearArray1[1];
		}

		yearElement.click();
		Thread.sleep(1000);

		// select the month
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='datepicker-months']/table/tbody/tr/td/span"));
		for (int i = 0; i < rows.size(); i++) {
			String monthText = rows.get(i).getText();
			//System.out.println("Month name is: " + monthText);
			if (monthText.equals(month)) {
				rows.get(i).click();
				break;
			}
		}

		// select the day
		boolean result = false;
		List<WebElement> dayRows = driver.findElements(By.xpath("//div[@class='datepicker dropdown-menu'][1]//div[@class='datepicker-days']/table/tbody/tr"));
		for (int i = 0; i < dayRows.size(); i++) {
			List<WebElement> columns = dayRows.get(i).findElements(By.xpath("//td[@class='day']"));
			//System.out.println("column size is: " + columns.size());
			for (int j = 0; j < columns.size(); j++) {
				//System.out.println("Date is: " + columns.get(j).getText());

				if (day.equalsIgnoreCase(columns.get(j).getText())) {
					columns.get(j).click();
					result = true;
					break;
				}

			}
			if (result) {
				break;
			}
		}

	}

	
	
	public void selectTheDay(String day)
	{
		// select the day
				boolean result = false;
				List<WebElement> dayRows = driver.findElements(By.xpath("//div[@class='datepicker dropdown-menu'][1]//div[@class='datepicker-days']/table/tbody/tr"));
				for (int i = 0; i < dayRows.size(); i++) {
					List<WebElement> columns = dayRows.get(i).findElements(By.xpath("//td[contains(@class,'day')]"));
					//System.out.println("column size is: " + columns.size());
					for (int j = 0; j < columns.size(); j++) {
						//System.out.println("Date is: " + columns.get(j).getText());

						if (day.equalsIgnoreCase(columns.get(j).getText())) {
							columns.get(j).click();
							result = true;
							break;
						}

					}
					if (result) {
						break;
					}
				}
	}
	
	
	
	
}
