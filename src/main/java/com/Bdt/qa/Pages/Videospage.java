package com.Bdt.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bdt.qa.Base.Basepage;

public class Videospage extends Basepage {

	@FindBy(xpath = "//div/h3[contains(text(),'Microsoft Azure - Latest Live Events Recordings')]//following::div[@id='dc0dff27-a425-4813-944a-e421c1153597']/div/descendant::a")
	List<WebElement> LatestEvents;

	@FindBy(xpath = "//body/div[9]/div[2]/a[2]/span[1]")
	WebElement LatestEventsNextNavBtn;
	
	@FindBy(xpath = "//body/div[8]/div[2]/a[2]/span[1]")
	WebElement WebinarVediosNextNavBtn;
	
	@FindBy(xpath = "//body/div[8]/div[1]/h3[contains(text(),'Webinar Videos')]//following::div[@id='8586353d-6403-41ee-9cb5-370634106342']//h5")
	List<WebElement> Webinarvideos;

	public Videospage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void playLatestEvents() throws InterruptedException {

		int videosClicked = 0;

		for (int i = 0; i < LatestEvents.size(); i++) {

			Thread.sleep(2000);

			System.out.println(LatestEvents.size());

			// System.out.println(LatestEvent.getText());
			LatestEvents.get(i).click();

			Thread.sleep(2000);

			videosClicked++;

			if (videosClicked % 4 == 0) {

				LatestEventsNextNavBtn.click();
				Thread.sleep(2000);
			}

		}

	}

	public void playWebinarVideos() throws InterruptedException {
		
		int videosclicked=0;
		
		for (WebElement Webinarvideo : Webinarvideos) {
			
			Webinarvideo.click();
			Thread.sleep(1000);
			
			videosclicked++;
			
			if(videosclicked%4 ==0) {
				
				WebinarVediosNextNavBtn.click();
				Thread.sleep(2000);
			}
			
			
			
		}

	}

}
