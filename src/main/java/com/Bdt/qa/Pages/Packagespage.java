package com.Bdt.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bdt.qa.Base.Basepage;

public class Packagespage extends Basepage {

	// Gold Membership

	@FindBy(xpath = "//div[@class='dropdown-menu navbarmtall show']/a[contains(text(),'Gold Membership')]")
	WebElement GoldMembershipbtn;

	// Microsoft Azure Suite & Suite Plus
	@FindBy(linkText = "Microsoft Azure Suite & Suite Plus")
	WebElement MsAzureSuitebtn;

	// Azure DevOps Expert & Expert Plus
	@FindBy(linkText = "Azure DevOps Expert & Expert Plus")
	WebElement AzureDevopsExpertbtn;

	// DotNet Developers Expert
	@FindBy(xpath = "//div/a[contains(text(),'DotNet Developers Expert')]")
	WebElement DotNetDevelopersbtn;

	// Power Platform Acadamy
	@FindBy(xpath = "//div[@class='dropdown-menu navbarmtall show']/a[contains(text(),'Power Platform Acadamy')]")
	WebElement PowerPlatformAcademybtn;

	// MS.NET Foundation For Beginners
	@FindBy(linkText = "MS.NET Foundation For Beginners")
	WebElement MsDotNetFoundationbtn;

	// MS.NET Full Stack Developer
	@FindBy(linkText = "MS.NET Full Stack Developer")
	WebElement MsDotNetFullStackbtn;

	// UI / Web Development
	@FindBy(linkText = "UI / Web Development")
	WebElement UIorWebDevelopmentbtn;

	// SQL Server & MSBI Tools
	@FindBy(linkText = "SQL Server & MSBI Tools")
	WebElement SQLserverandMSBIToolsbtn;

	// Software Testing
	@FindBy(linkText = "Software Testing")
	WebElement SoftwareTestingbtn;

	public Packagespage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goldMembership() {

		GoldMembershipbtn.click();

	}

	public void ms_AzureSuite_and_Suiteplus() {

		MsAzureSuitebtn.click();
	}

	public void azureDevopsExpert_and_Expertplus() {

		AzureDevopsExpertbtn.click();
	}

	public void dotNetDevelopersExpert() {

		DotNetDevelopersbtn.click();
	}

	public void powerPlatformAcademy() {
		PowerPlatformAcademybtn.click();

	}

	public void ms_net_foundationForBeginners() {

		MsDotNetFoundationbtn.click();
	}

	public void ms_net_fullStackDeveloper() {

		MsDotNetFullStackbtn.click();
	}

	public void ui_Or_WebDevelopment() {

		UIorWebDevelopmentbtn.click();
	}

	public void sqlServer_MsbiTools() {

		SQLserverandMSBIToolsbtn.click();
	}

	public void softwareTesting() {
		SoftwareTestingbtn.click();

	}

}
