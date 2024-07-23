package com.Bdt.qa.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bdt.qa.Base.Basepage;

public class Homepage extends Basepage {

	@FindBy(linkText = "NewBatches/Webinars")
	WebElement newBatchesMenu;

	@FindBy(linkText = "Packages")
	WebElement packagesMenu;

	@FindBy(linkText = "Courses")
	WebElement coursesMenu;

	@FindBy(xpath = "//a[contains(text(),'Enroll Now')]")
	WebElement EnrollMenu;

	@FindBy(xpath = "//a[contains(text(),'Videos')]")
	WebElement videosMenu;

	@FindBy(xpath = "//li[@class ='nav-item']/a[contains(text(),'Testimonials')]")
	WebElement testimonialsMenu;

	@FindBy(xpath = "//a[contains(text(),'Azure Certification')]")
	WebElement azureCertificationMenu;

	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	WebElement contactUsMenu;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);

	}

	public NewBatchespage newBatchesandWebinars() {

		newBatchesMenu.click();
		return  new NewBatchespage(driver);

	}

	public Packagespage packages() {
		packagesMenu.click();
		return new Packagespage(driver);

	}

	public Coursespage courses() {
		coursesMenu.click();
		return new Coursespage(driver);
	}

	public Enrollnowpage enrollnow() {
		EnrollMenu.click();
		return new Enrollnowpage(driver);

	}

	public Videospage videos() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		videosMenu.click();
		return  new Videospage(driver);

	}

	public void testimonials() {
		testimonialsMenu.click();

	}

	public void azureCertification() {

		azureCertificationMenu.click();
	}

	public void contactus() {
		contactUsMenu.click();

	}

}
