package com.Bdt.qa.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Utils.TestUtility;

public class Landingpage extends Basepage {

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement LoginMenu;

	@FindBy(id = "EmailId")
	WebElement Email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement Loginbutton;

	

	public Landingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public Homepage loginWithValidCredentials() {

		LoginMenu.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtility.IMPLICIT_TIMEOUT));
		
		Email.sendKeys(properties.getProperty("email"));
		
		password.sendKeys(properties.getProperty("PassWord"));
		
		 Loginbutton.click();
		 
		 return new Homepage(driver);
		
		
	}
	
	public void loginwithInvalidEmailandValidPassword() {
		LoginMenu.click();
		
		//invalid email and valid password
		Email.sendKeys("umamaheswari@deccan");
		password.sendKeys(properties.getProperty("PassWord"));
		Loginbutton.click();
		
		
	}
	
	public void loginWithValidEmailandInvalidPassword() {
		LoginMenu.click();
		
		//valid email and invalid password
		Email.sendKeys(properties.getProperty("email"));
		password.sendKeys("Test2");
		Loginbutton.click();
	}
	
	public void LoginwithInvalidCrredentials() {
		
		LoginMenu.click();
		//Invalid email and password
		Email.sendKeys("umamaheswari.ch");
		password.sendKeys("Tesr@");
		Loginbutton.click();
	}

}
