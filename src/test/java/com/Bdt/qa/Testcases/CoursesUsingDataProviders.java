package com.Bdt.qa.Testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Coursespage;
import com.Bdt.qa.Pages.Homepage;
import com.Bdt.qa.Pages.Landingpage;
import com.Bdt.qa.Utils.TestUtility;

public class CoursesUsingDataProviders extends Basepage {
	public WebDriver driver;
	public Coursespage coursespage;
	
	public String Sheetname = "Sheet1";


	public CoursesUsingDataProviders() {
		super();
		
	}

	@BeforeMethod
	public void setup() {
		
		 driver =initializeBrowserAndOpenApplication(properties.getProperty("browser"));
		 
		 TestUtility testUtils = new TestUtility();
		 
		 Landingpage landingpage = new Landingpage(driver);
		 Homepage homepage = landingpage.loginWithValidCredentials();
		 
		 
		  coursespage = homepage.courses();   
		
	}
	
	@DataProvider(name = "courseDataProvider")
	public Object[][] getTestData() throws InvalidFormatException{
		Object[][] data = TestUtility.getTestData(Sheetname); 
		return data;
	}
	
	@Test (dataProvider = "courseDataProvider")
	 public void validateCourses(String Coursename) {
		 coursespage.clickRequiredCourse(Coursename);
		 
		 	 
	 }
	
}
