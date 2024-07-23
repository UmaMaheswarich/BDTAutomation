package com.Bdt.qa.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Homepage;
import com.Bdt.qa.Pages.Landingpage;
import com.Bdt.qa.Pages.Packagespage;

public class PackagepageTest extends Basepage {

	public WebDriver driver;
	public Packagespage packagepage;

	public PackagepageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {

		driver = initializeBrowserAndOpenApplication(properties.getProperty("browser"));

		Landingpage landingpage = new Landingpage(driver);
		Homepage homepage = landingpage.loginWithValidCredentials();
		packagepage = homepage.packages();

	}

	@Test(priority = 1)
	public void validateGoldMemberspageTitle() {
		packagepage.goldMembership();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Gold Membership | Learn all Software Technologies at one place");
	}
	
	@Test(priority = 2)
	public void validateMsAzureSuiteAndSuitepluspageTitle() {
		packagepage.ms_AzureSuite_and_Suiteplus();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Microsoft Azure Online Training | Learn Azure from the Best");

	}
	
	@Test(priority = 3)
	public void validateAzureDevopsExpertpageTitle() {
		packagepage.azureDevopsExpert_and_Expertplus();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "DevopsExpertPlus");

	}
	
	
	@Test(priority = 4)
	public void validateDotNetDevelopersExpertpageTitle() {
		packagepage.dotNetDevelopersExpert();;

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "DotNetDevelopersExpert");

	}
	
	
	@Test(priority = 5)
	public void validatePowerplatformAcademypageTitle() {
		packagepage.powerPlatformAcademy();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "NewPowerPlatform");

	}
	
	@Test(priority = 6)
	public void validateMsDotNetFoundationForBeginnerspageTitle() {
		packagepage.ms_net_foundationForBeginners();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "NET Foundation for Beginners, MS.Net Online Training");

	}
	
	
	@Test(priority = 7)
	public void validateMsDotNetFullStackDeveloperpageTitle() {
		packagepage.ms_net_fullStackDeveloper();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "MS.NET Full Stack Developer | MS.NET Full Stack Developer Online Training");

	}
	
	
	@Test(priority = 8)
	public void validateUIorWebDevelopmentpageTitle() {
		packagepage.ui_Or_WebDevelopment();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "UI / Web Development Online Training | UI Developer Online Training");

	}
	
	
	@Test(priority = 9)
	public void validateSQLServerandMSBIToolspageTitle() {
		packagepage.sqlServer_MsbiTools();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "SQL Server or MSBI Developer, MSBI Training");

	}
	
	@Test(priority = 10)
	public void validateSoftwareTestingpageTitle() {
		packagepage.softwareTesting();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Software Testing Online Training | Manual Testing Online Training");

	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
