package com.Bdt.qa.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bdt.qa.Base.Basepage;

public class Enrollnowpage extends Basepage {

	@FindBy(xpath = "//select[@id='ddlCourse']")
	WebElement SelectToggle;

	@FindBy(xpath = "//select[@name='ddlcourse']//option")
	List<WebElement> Courses;

	@FindBy(xpath = "//div[@class='col-lg-3 ']/a[contains(text(),'Course Details')]")
	WebElement courseDetails;

	@FindBy(xpath = "//a[@class='btn btn-success pointer pay']")
	WebElement Enrollbtn;

	@FindBy(xpath = "//select[@id='ddlCourse']//option[@value='204']")
	WebElement SelectedCourse;

	public Enrollnowpage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void clickOnSelectToggle() {

		SelectToggle.click();
	}

	public void selectCourses() throws InterruptedException {
		for (WebElement Course : Courses) {

			Course.click();

//			if(Course.equals("AZ-204: Microsoft Azure Developer")) {
//				
//				System.out.println("THis is a selected course");
//			}
//

		}
		System.out.println(SelectToggle.getText());

	}

	public void enrollbuttonForSelectedCourse() throws InterruptedException {

		// WebElement selectedCourse =
		// driver.findElement(By.xpath("//select[@id='ddlCourse']//option[@value='204']"));
		SelectedCourse.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");
		Enrollbtn.click();

	}

	public void courseDetailsButtonForSelectedCourse() throws InterruptedException {
		// WebElement selectedCourse =
		// driver.findElement(By.xpath("//select[@id='ddlCourse']//option[@value='204']"));
		SelectedCourse.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");

		courseDetails.click();

		Thread.sleep(1000);

	}
}
