package com.Bdt.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bdt.qa.Base.Basepage;

public class Coursespage extends Basepage {

	@FindBy(xpath = "//a[contains(text(),'MS.NET Courses (Includes Live Project)')]")
	WebElement DotNetCourseslink;

	@FindBy(xpath = "//li/a[contains(text(),'Complete C#, OOPs and Windows Programing')]")
	WebElement CompleteCSharplink;

	@FindBy(xpath = "//li/a[contains(text(),'ASP.NET Core 8')]")
	WebElement ASPDotNetCore8link;

	@FindBy(xpath = "//li/a[contains(text(),'ASP.NET MVC Online Training')]")
	WebElement AspDotNetMvclink;

	@FindBy(xpath = "//li/a[contains(text(),'ASP.NET WebForms ')]")
	WebElement AspDotNetWebformslink;

	@FindBy(xpath = "//li/a[contains(text(),'WCF incl. Web Services and Remoting')]")
	WebElement Wcflink;

	@FindBy(xpath = "//li/a[contains(text(),'WPF incl. MVVM and Prism')]")
	WebElement WPFlink;

	@FindBy(xpath = "//li/a[contains(text(),'LINQ and Entity Framework')]")
	WebElement LINQandEntityFrameworklink;

	@FindBy(xpath = "//li/a[contains(text(),'Live Project Training for Developing Enterprise Application')]")
	WebElement DevelopingEnterpriseApplicationlink;

	@FindBy(xpath = "//li/a[contains(text(),'Live Project using Ntier Arch (.NET5 + EF Core + Angular)')]")
	WebElement LiveProjectUsingNtierArchlink;

	@FindBy(xpath = "//li/a[contains(text(),'Microservices using .NET Core')]")
	WebElement MicroservicesUsingDotNetCorelink;

	@FindBy(xpath = "//li/a[contains(text(),'Client-side UI Technologies')]")
	WebElement ClientsideUITechnologieslink;

	@FindBy(xpath = "//li/a[contains(text(),'Building Static Web Pages using HTML and CSS')]")
	WebElement BuildingStaticWebPagesusingHTMlandCSSlink;

	@FindBy(xpath = "//li/a[contains(text(),'JavaScript and HTML DOM')]")
	WebElement JavaScriptandHTMLDOMlink;

	@FindBy(xpath = "//li/a[contains(text(),'jQuery, AJAX and JSON')]")
	WebElement jQuery_AJAXandJSONlink;

	@FindBy(xpath = "//li/a[contains(text(),'Building Interactive Web Pages using HTML5 and CSS3')]")
	WebElement BuildingInteractiveWebPagesusingHTML5andCSS3link;

	@FindBy(xpath = "//li/a[contains(text(),'BootStrap + Live Examples')]")
	WebElement BootStraplink;

	@FindBy(xpath = "//li/a[contains(text(),'AngularJS + Live Project')]")
	WebElement AngularJSlink;

	@FindBy(xpath = "//li/a[contains(text(),'Angular + Typescript')]")
	WebElement Angular_Typescriptlink;

	@FindBy(xpath = "//li/a[contains(text(),'ReactJS')]")
	WebElement ReactJSlink;

	@FindBy(xpath = "//li/a[contains(text(),'KnockoutJS')]")
	WebElement KnockoutJSlink;

	@FindBy(xpath = "//li/a[contains(text(),'Xamarin')]")
	WebElement Xamarinlink;

	@FindBy(xpath = "//li/a[contains(text(),'SQL Server + MSBI')]")
	WebElement SQLServer_MSBIlink;

	@FindBy(xpath = "//li/a[contains(text(),'SQL Server 2017')]")
	WebElement SQLServer2017link;

	@FindBy(xpath = "//li/a[contains(text(),'Querying Data with Transact-SQL(70-761)')]")
	WebElement QueryingDatawithTransactSQLlink;

	@FindBy(xpath = "//li/a[contains(text(),'SQL Server Integration Service (SSIS)')]")
	WebElement SSISlink;

	@FindBy(xpath = "//li/a[contains(text(),'SQL Server Reporting Service (SSRS)')]")
	WebElement SSRSlink;

	@FindBy(xpath = "//li/a[contains(text(),'SQL Service Analysis Service (SSAS)')]")
	WebElement SSASlink;

	@FindBy(xpath = "//li/a[contains(text(),'Cloud Computing / Azure / AWS ')]")
	WebElement CloudComputinglink;

	@FindBy(xpath = "//li/a[contains(text(),'AZ-900: Microsoft Azure Fundamentals')]")
	WebElement AZ_900link;

	@FindBy(xpath = "//li/a[contains(text(),'Azure Suite (AZ-104+AZ-204+AZ-305+ AZ-500)')]")
	WebElement AzureSuitelink;

	@FindBy(xpath = "//li/a[contains(text(),' AZ-104: Microsoft Azure Administrator')]")
	WebElement AZ_104link;

	@FindBy(xpath = "//li/a[contains(text(),'AZ-204: Developing Solutions for Microsoft Azure')]")
	WebElement AZ_204link;

	@FindBy(xpath = "//li/a[contains(text(),'AZ-305: Microsoft Azure Architect Technologies and Design')]")
	WebElement AZ_305link;

	@FindBy(xpath = "//li/a[contains(text(),'DP-203: Data Engineering on Microsoft Azure')]")
	WebElement DP_203link;

	@FindBy(xpath = "//li/a[contains(text(),'Amazon Web Services (AWS)')]")
	WebElement AWSlink;

	@FindBy(xpath = "//li/a[contains(text(),'DevOps Expert')]")
	WebElement DevOpsExpertlink;

	@FindBy(xpath = "//li/a[contains(text(),'AZ-400: Microsoft Azure DevOps')]")
	WebElement AZ_400link;

	@FindBy(xpath = "//li/a[contains(text(),'Docker by Sandeep Soni')]")
	WebElement Dockerlink;

	@FindBy(xpath = "//li/a[contains(text(),'Kubernetes by Sandeep Soni')]")
	WebElement Kuberneteslink;

	@FindBy(xpath = "//li/a[contains(text(),'Docker & Kubernetes by Rahul Rampurkar')]")
	WebElement Docker_Kuberneteslink;

	@FindBy(xpath = "//li/a[contains(text(),'IaC Using Terraform')]")
	WebElement Terraformlink;

	@FindBy(xpath = "//li/a[contains(text(),'Powershell')]")
	WebElement Powershelllink;

	@FindBy(xpath = "//li/ul/li[2]/a[contains(text(),'Microsoft Power Platform')]")
	WebElement MicrosoftPowerPlatformnewlink;

	@FindBy(xpath = "//li/a[contains(text(),'//li/a[@class='coursecategory'][contains(text(),'Microsoft Power Platform')]')]")
	WebElement MicrosoftPowerPlatformPremiunlink;

	@FindBy(xpath = "//li/a[contains(text(),'Data Analytics using PowerBI (DA-100)')]")
	WebElement DA_100link;

	@FindBy(xpath = "//li/a[contains(text(),'Testing Tools')]")
	WebElement TestingToolslink;

	@FindBy(xpath = "//li/a[contains(text(),'Manual Testing')]")
	WebElement ManualTestinglink;

	@FindBy(xpath = "//li/a[contains(text(),'Selenium Testing with Java(Live Training)')]")
	WebElement SeleniumTestingwithJavalink;

	@FindBy(xpath = "//li/a[contains(text(),'Selenium Testing with C#(Live Training)')]")
	WebElement SeleniumTestingwithCsharplink;

	@FindBy(xpath = "//li/a[contains(text(),'Python Programming')]")
	WebElement PythonProgramminglink;

	@FindBy(xpath = "//li/a[contains(text(),'C and Data Structure')]")
	WebElement CandDataStructurelink;

	@FindBy(xpath = "//li/a[contains(text(),'Core Java')]")
	WebElement CoreJavalink;

	@FindBy(xpath = "//li/a[contains(text(),'OOPs and C++')]")
	WebElement OOPsandCpluspluslink;

	@FindBy(xpath = "//li/a[contains(text(),'Advance Java')]")
	WebElement AdvanceJavalink;

	public Coursespage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRequiredCourse(String Coursename) {

		WebElement course = driver.findElement(By.xpath("//li/a[contains(text(),'" + Coursename + "')]"));
		course.click();

	}

	public MsNetCoursePage ms_NET_Courses() {
		DotNetCourseslink.click();

		return new MsNetCoursePage(driver);

	}

	public String complete_Csharp_and_Windows_Programing() throws InterruptedException {
		CompleteCSharplink.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='heading_2']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='videoHeader_11 videonew']/a[1]")).click();

		Alert alt = driver.switchTo().alert();
		String Actual = alt.getText();
		System.out.println(Actual);
		alt.accept();
		return Actual;
	}

	public void asp_NET_Core8() {
		ASPDotNetCore8link.click();

	}

	public void asp_NET_MVC() {
		AspDotNetMvclink.click();

	}

	public void asp_NET_WebForms() {
		AspDotNetWebformslink.click();

	}

	public void wcf_incl_Web_Services_and_Remoting() {
		Wcflink.click();

	}

	public void wpf_incl_MVVM_and_Prism() {
		WPFlink.click();

	}

	public void linq_and_Entity_Framework() {
		LINQandEntityFrameworklink.click();

	}

	public void live_Project_Training_for_Developing_Enterprise_application() {
		DevelopingEnterpriseApplicationlink.click();

	}

	public void live_Project_using_Ntier_Arch() {
		LiveProjectUsingNtierArchlink.click();

	}

	public void microservices_using_NET_Core() {
		MicroservicesUsingDotNetCorelink.click();

	}

	public void client_side_UI_technologies() {
		ClientsideUITechnologieslink.click();

	}

	public void building_StsticWebpagesusingHTMLandCSS() {
		BuildingStaticWebPagesusingHTMlandCSSlink.click();

	}

	public void javascriptAndHTMLdom() {

		JavaScriptandHTMLDOMlink.click();

	}

	public void jquery_AjaxandJson() {
		jQuery_AJAXandJSONlink.click();

	}

	public void buildingInteractiveWbpagesUsingHTML5andCSS3() {

		BuildingInteractiveWebPagesusingHTML5andCSS3link.click();

	}

	public void bootstrap() {
		BootStraplink.click();

	}

	public void angularJS() {
		AngularJSlink.click();

	}

	public void angular_Typescript() {
		Angular_Typescriptlink.click();

	}

	public void reactJS() {
		ReactJSlink.click();

	}

	public void knockoutJS() {
		KnockoutJSlink.click();
	}

	public void xamarin() {

		Xamarinlink.click();
	}

	public void sqlServerandMSBI() {
		SQLServer_MSBIlink.click();

	}

	public void sqlServer2017() {
		SQLServer2017link.click();

	}

	public void queringDataWithTransactSql() {
		QueryingDatawithTransactSQLlink.click();

	}

	public void ssis() {
		SSISlink.click();

	}

	public void ssrs() {
		SSRSlink.click();

	}

	public void ssas() {

		SSASlink.click();

	}

	public void cloudComputing() {
		CloudComputinglink.click();

	}

	public void az_900() {
		AZ_900link.click();

	}

	public void azureSuite() {

		AzureSuitelink.click();

	}

	public void az_104() {
		AZ_104link.click();

	}

	public void az_204() {
		AZ_204link.click();

	}

	public void az_305() {
		AZ_305link.click();

	}

	public void dp_203() {
		DP_203link.click();

	}

	public void aws() {
		AWSlink.click();
	}

	public void devopsExpertMicroservices() {
		DevOpsExpertlink.click();

	}

	public void az_400() {
		AZ_400link.click();

	}

	public void docker() {
		Dockerlink.click();

	}

	public void kubernetes() {
		Kuberneteslink.click();

	}

	public void dockerandKubernetes() {
		Docker_Kuberneteslink.click();

	}

	public void iacUsingTerraform() {
		Terraformlink.click();

	}

	public void powershell() {
		Powershelllink.click();

	}

	public void msPowerPlatform_premiun() {
		MicrosoftPowerPlatformPremiunlink.click();

	}

	public void msPowerplatform_new() {
		MicrosoftPowerPlatformnewlink.click();

	}

	public void da_100() {
		DA_100link.click();

	}

	public void testing_tools() {
		TestingToolslink.click();

	}

	public void manualTesting() {
		ManualTestinglink.click();

	}

	public void seleniumWithJAVA() {
		SeleniumTestingwithJavalink.click();

	}

	public void seleniumWithCSharp() {
		SeleniumTestingwithCsharplink.click();

	}

	public void pythonProgramming() {
		PythonProgramminglink.click();

	}

	public void CandDataStructure() {
		CandDataStructurelink.click();

	}

	public void coreJAVA() {
		CoreJavalink.click();

	}

	public void oopsAndCplusplus() {
		OOPsandCpluspluslink.click();

	}

	public void advanceJAVA() {
		AdvanceJavalink.click();
	}
}
