package com.Bdt.qa.Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Landingpage;


public class LoginTest extends Basepage {
	
	public WebDriver driver;
	
	public Landingpage landingpage;

	public LoginTest() {
		super();
	
	}
	
	@BeforeMethod
	public void Setup() {
		
		driver = initializeBrowserAndOpenApplication(properties.getProperty("browser"));
	}
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		
		landingpage = new Landingpage(driver);
		landingpage.loginWithValidCredentials();
		
		String homepageTitle =  driver.getTitle();
		
		Assert.assertEquals(homepageTitle, "Realtime Software Training Online | Best Software Courses for Beginners");
		
	}
	
	@Test(priority = 2)
	public void verifyLoginwithInvalidEmailandValidPassword() {
		landingpage = new Landingpage(driver);
		
		landingpage.loginwithInvalidEmailandValidPassword();
		Alert alt = driver.switchTo().alert();
		
		String Warnmessage = alt.getText();
		
		alt.accept();
		
		Assert.assertEquals(Warnmessage, "Invalid EmailId or password! Please try again.");
	}
	
	@Test(priority = 3)
	public void verifyLoginwithValidEmailandInvalidPassword() {
		landingpage = new Landingpage(driver);
		landingpage.loginWithValidEmailandInvalidPassword();;
		Alert alt = driver.switchTo().alert();
		
		String Warnmessage = alt.getText();
		
		alt.accept();
		
		Assert.assertEquals(Warnmessage, "Invalid EmailId or password! Please try again.");
		
	}
	
	@Test(priority = 4)
	public void verifyLoginWithInvalidEmailandPassword() {
		landingpage = new Landingpage(driver);
	
		landingpage.loginwithInvalidEmailandValidPassword();;
		Alert alt = driver.switchTo().alert();
		
		String Warnmessage = alt.getText();
		
		alt.accept();
		
		Assert.assertEquals(Warnmessage, "Invalid EmailId or password! Please try again.");
	
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	

}
