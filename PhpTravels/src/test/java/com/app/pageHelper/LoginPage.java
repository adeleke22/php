package com.app.pageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}



	public void enterEmailAddress(String emailAddress) {
		WebElement email = driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys(emailAddress);
	}

	public void enterPassword(String password) {
		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys(password);
	}


	public void clickOnLoginButton() {

		WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

	public void loginIntoApplication(String emailAddress, String password) throws InterruptedException {
		enterEmailAddress(emailAddress);
		enterPassword(password);
		clickOnLoginButton();
	}
	
	
	public void Logout() throws InterruptedException
	{
		WebElement loginButton= driver.findElement(By.xpath("//strong[contains(text(),'Logout')]"));
		loginButton.click();
		Thread.sleep(2000);
	}
	
	
	public boolean isLoginButtonDisplayed()
	{
		WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
		return loginButton.isDisplayed();
	}
	
}
