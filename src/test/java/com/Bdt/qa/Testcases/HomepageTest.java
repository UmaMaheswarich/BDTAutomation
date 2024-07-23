package com.Bdt.qa.Testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Homepage;
import com.Bdt.qa.Pages.Landingpage;

public class HomepageTest extends Basepage {

	public WebDriver driver;

	public Homepage homepage;

	public HomepageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {

		driver = initializeBrowserAndOpenApplication(properties.getProperty("browser"));
		Landingpage landingpage = new Landingpage(driver);
		homepage = landingpage.loginWithValidCredentials();
	}
	
	

	@Test(priority = 1)
	public void vaildateTitleofNewBatchespage() {

		// Courses and Webinars | Software Technology Training online
		homepage.newBatchesandWebinars();
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Courses and Webinars | Software Technology Training online");

	}
	
	

	@Test(priority = 2)
	public void validateTitleofPackagespage() {
		homepage.packages();

	}
	
	

	@Test(priority = 3)
	public void validateTitleOfCoursespage() {
		homepage.courses();

	}
	
	

	@Test(priority = 4)
	public void validateTitleofEnrollnowPage() {

		// .net course fees - BestDotNetTraining Pricing| Bestdotnettraining

		homepage.enrollnow();
		String title = driver.getTitle();
		Assert.assertEquals(title, ".net course fees - BestDotNetTraining Pricing| Bestdotnettraining");

	}
	
	

	@Test(priority = 5)
	public void validateTitleOfVideospage() {

		// YoutubeVideos
		homepage.videos();
		String title = driver.getTitle();
		Assert.assertEquals(title, "YoutubeVideos");

	}
	
	

	@Test(priority = 6)
	public void validateTitleofTestimonialspage() {

		// Testimonials

		homepage.testimonials();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Testimonials");
	}
	
	

	@Test(priority = 7)
	public void validateTitleOfAzurecertificationPage() {

		homepage.azureCertification();
		ArrayList<String> tab =  new ArrayList<String> (driver.getWindowHandles());
		
		
		String title = driver.switchTo().window(tab.get(1)).getCurrentUrl();
		System.out.println(title);
	
		

	}
	
	

	@Test(priority = 8)
	public void validateTitleofContactuspage() {

		// Bestdotnettraining, ContactUs

		homepage.contactus();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Bestdotnettraining, ContactUs");

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
