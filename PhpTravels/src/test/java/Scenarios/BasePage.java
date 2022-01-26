package Scenarios;

import java.io.File;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BasePage {
	
	public static WebDriver driver;

	@Before
	public void TestSetup()
	{
	   	String chromePath= System.getProperty("user.dir")+ File.separator + "Drivers" + File.separator + "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/api/admin");
	   
	}
	
	
	@After
	public void TestDown() {
		driver.quit();
		
	}
	

	public WebDriver getWebDriver()
	{
		return driver;
	
	}
	
	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom rnd = new SecureRandom();

	String randomString(int len){
	   StringBuilder sb = new StringBuilder(len);
	   for(int i = 0; i < len; i++)
	      sb.append(AB.charAt(rnd.nextInt(AB.length())));
	   System.out.println(sb.toString());
	   return sb.toString();
	}
}
