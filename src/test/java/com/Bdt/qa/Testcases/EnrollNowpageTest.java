package com.Bdt.qa.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Enrollnowpage;
import com.Bdt.qa.Pages.Homepage;
import com.Bdt.qa.Pages.Landingpage;

public class EnrollNowpageTest extends Basepage {
	public WebDriver driver;
	
	public Enrollnowpage enrollnow;

	public EnrollNowpageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() {
		driver = initializeBrowserAndOpenApplication(properties.getProperty("browser"));
		Landingpage landingpage = new Landingpage(driver);
		Homepage homepage =  landingpage.loginWithValidCredentials();
		 enrollnow =  homepage.enrollnow();
		
		
	}
	
	@Test(priority = 1)
	public void validateSelectToggleButton() {
		enrollnow.clickOnSelectToggle();
		
	}
	

	@Test(priority = 2)
	public void verifySelectCourses() throws InterruptedException{
		
		enrollnow.selectCourses();
	}
	
	@Test(priority = 3)
	public void verifyEnrollButtonForSelectedCourse() throws InterruptedException {
		
		enrollnow.enrollbuttonForSelectedCourse();
		
		Assert.assertEquals(driver.getTitle(), "Payment");
	}
	
	@Test(priority = 4)
	public void verifyCourseDetailsButtonForSelectedCourse() throws InterruptedException {
		
		enrollnow.courseDetailsButtonForSelectedCourse();
		
		Assert.assertEquals(driver.getTitle(), "AZ 104 Microsoft Azure Administrator - Bestdotnettraining");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
			
	}
}
