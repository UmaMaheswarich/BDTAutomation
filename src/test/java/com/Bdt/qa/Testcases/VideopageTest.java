package com.Bdt.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Homepage;
import com.Bdt.qa.Pages.Landingpage;
import com.Bdt.qa.Pages.Videospage;

public class VideopageTest extends Basepage {

	public Videospage videospage;

	public VideopageTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() {
		driver = initializeBrowserAndOpenApplication(properties.getProperty("browser"));

		Landingpage landingpage = new Landingpage(driver);

		Homepage homepage = landingpage.loginWithValidCredentials();
		videospage = homepage.videos();

	}

	@Test(priority = 1)
	public void verifyVideosUnderLatestEvents() throws InterruptedException {

		videospage.playLatestEvents();
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();

		System.out.println(title);
		

	}
	
	@Test(priority = 2)
	public void verifyWebninarVedios() throws InterruptedException {
		
		videospage.playWebinarVideos();
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
