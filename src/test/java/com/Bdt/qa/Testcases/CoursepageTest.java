package com.Bdt.qa.Testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Bdt.qa.Base.Basepage;
import com.Bdt.qa.Pages.Coursespage;
import com.Bdt.qa.Pages.Homepage;
import com.Bdt.qa.Pages.Landingpage;
import com.Bdt.qa.Utils.TestUtility;

public class CoursepageTest extends Basepage{
	
	public WebDriver driver;
	public Coursespage coursespage;
	
	public String Sheetname = "Sheet1";

	public CoursepageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		 driver =initializeBrowserAndOpenApplication(properties.getProperty("browser"));
		 
		 Landingpage landingpage = new Landingpage(driver);
		 Homepage homepage = landingpage.loginWithValidCredentials();
		 
		 
		  coursespage = homepage.courses();   
		
	}
	
	@DataProvider
	public Object[][] getTestData() throws InvalidFormatException{
		Object[][] data = TestUtility.getTestData(Sheetname); 
		return data;
	}
	
	

	@Test(priority = 1)
	public void validate_ms_NET_Coursespage_Title() {
		coursespage.ms_NET_Courses();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "MS.NET Full Stack Developer | MS.NET Full Stack Developer Online Training");

	}

	@Test(priority = 2)
	public void validate_complete_Csharp_and_Windows_Programingpage_Title() throws InterruptedException {
		coursespage.complete_Csharp_and_Windows_Programing();;
		/*
		 * String Title = driver.getTitle(); System.out.println(Title);
		 * 
		 * Assert.assertEquals(Title,
		 * "C# online training | Csharp training for beginners |C# online course");
		 */
	}

	@Test(priority = 3 )
	public void validate_asp_NET_Core8page_Title() {
		coursespage.asp_NET_Core8();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "ASP.NET Core 8 training by Experts | ASP.NET Core Online Training");

	}

	@Test(priority = 4)
	public void validate_asp_NET_MVCpage_Title() {
		coursespage.asp_NET_MVC();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "ASP.NET MVC Online Training for beginners | MVC Online training");

	}
	
	@Test(priority = 5)	
	public void validate_asp_NET_WebFormspage_Title() {
		coursespage.asp_NET_WebForms();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "ASP.NET Online training by MCT | ASP.NET Training for beginners");
	}

	@Test(priority = 6)
	public void validate_wcf_incl_Web_Services_and_Remotingpage_Title() {
		coursespage.wcf_incl_Web_Services_and_Remoting();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "WCF Online Training | WCF Corporate Training | WCF Certification");
	}

	@Test(priority = 7)
	public void validate_wpf_incl_MVVM_and_Prismpage_Title() {
		coursespage.wpf_incl_MVVM_and_Prism();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "WPF Online Training | WPF Corporate Training | WPF Certification");
	}

	@Test(priority = 8)
	public void validate_linq_and_Entity_Frameworkpage_Title() {
		coursespage.linq_and_Entity_Framework();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Online LinQ Training | LinQ Corporate Training");
	}

	@Test(priority = 9)
	public void validate_live_Project_Training_for_Developing_Enterprise_applicationpage_Title() {
		coursespage.live_Project_Training_for_Developing_Enterprise_application();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Live Project Training");
	}

	@Test(priority = 10)
	public void validate_live_Project_using_Ntier_Archpage_Title() {
		coursespage.live_Project_using_Ntier_Arch();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Live Project Workshop");
	}
	
	@Test(priority = 11)
	public void validate_microservices_using_NET_Corepage_Title() {
		coursespage.microservices_using_NET_Core();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Microservices using .NET Core | Microservices Online Training");

	}

	@Test(priority = 12)
	public void validate_client_side_UI_technologiespage_Title() {
		coursespage.client_side_UI_technologies();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "UI / Web Development Online Training | UI Developer Online Training");

	}
	
	@Test(priority = 13)
	public void validate_building_StsticWebpagesusingHTMLandCSSpage_Title() {
		coursespage.building_StsticWebpagesusingHTMLandCSS();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "HTML and CSS Online Training | CSS Online Training");

	}

	@Test(priority = 14)
	public void validate_javascriptAndHTMLdompage_Title() {

		coursespage.javascriptAndHTMLdom();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Top JavaScript Online Courses | JavaScript Online Training");
	}

	@Test(priority = 15)
	public void validate_jquery_AjaxandJsonpage_Title() {
		coursespage.jquery_AjaxandJson();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "jQuery, Json, Ajax and JavaScript Online Training");

	}

	@Test(priority = 16)
	public void validate_buildingInteractiveWbpagesUsingHTML5andCSS3page_Title() {

		coursespage.buildingInteractiveWbpagesUsingHTML5andCSS3();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "HTML5 & CSS3 Online Training | HTML5 & CSS3 Corporate Training");
	}
	
	@Test(priority = 17)
	public void validate_bootstrappage_Title() {
		coursespage.bootstrap();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Bootstrap Online Training | Bootstrap Corporate Training");
	}

	@Test(priority = 18)
	public void validate_angularJSpage_Title() {
		coursespage.angularJS();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "AngularJS Online Training | AngularJS Tutorial for beginners");
	}

	@Test(priority = 19)
	public void angular_Typescriptpage_Title() {
		coursespage.angular_Typescript();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Angular online course | Angular7 training | Learn Angular7");
	}
	
	@Test(priority = 20)
	public void reactJSpage_Title() {
		coursespage.reactJS();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "React JS Online Training | Best Online ReactJS Course | Bestdotnettraining");

	}
	
	@Test(priority = 21)
	public void knockoutJSpage_Title() {
		coursespage.knockoutJS();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Knockout js Online Training | Knock js Corporate Training");
	}

	@Test(priority = 22)
	public void xamarinpage_Title() {

		coursespage.xamarin();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Xamarin Online Training");
	}

	@Test(priority = 23)
	public void sqlServerandMSBIpage_Title() {
		coursespage.sqlServerandMSBI();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "SQL Server or MSBI Developer, MSBI Training");

	}

	@Test(priority = 24)
	public void validate_sqlServer2017page_Title() {
		coursespage.sqlServer2017();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "SQL Online Training in Hyderabad – Online SQL Training Courses");

	}
	
	@Test(priority = 25)
	public void validate_queringDataWithTransactSqlpage_Title() {
		coursespage.queringDataWithTransactSql();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "SQL Online Training in Hyderabad – Online SQL Training Courses");
	}

	@Test(priority = 26)
	public void validate_ssispage_Title() {
		coursespage.ssis();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Online SSIS Training | SQL Server Integration Services Online Training");

	}

	@Test(priority = 27)
	public void validate_ssrspage_Title() {
		coursespage.ssrs();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Online SSRS Training |SQL Server Reporting Services Online Training ");

	}

	@Test(priority = 28)
	public void validate_ssaspage_Title() {

		coursespage.ssas();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Online SSAS Training | SQL Server Analysis Services");

	}
	
	@Test(priority = 29)
	public void validate_cloudComputingpage_Title() {
		coursespage.cloudComputing();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Microsoft Azure Online Training | Learn Azure from the Best");

	}

	@Test(priority = 30)
	public void validate_az_900page_Title() {
		coursespage.az_900();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "AZ 900 - Azure Fundamentals Training - Bestdotnettraining");

	}

	@Test(priority = 31)
	public void validate_azureSuitepage_Title() {

		coursespage.azureSuite();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Complete Microsoft Azure Certification - Bestdotnettraining");

	}

	@Test(priority = 32)
	public void validate_az_104page_Title() {
		coursespage.az_104();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "AZ 104 Microsoft Azure Administrator - Bestdotnettraining");

	}

	@Test(priority = 33)
	public void validate_az_204page_Title() {
		coursespage.az_204();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "AZ-204 Training Online | AZ-204 Developing Azure Solution Online Training");

	}

	@Test(priority = 34)
	public void validate_az_305page_Title() {
		coursespage.az_305();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "AZ-305 online training | AZ-305 Online tutorial");

	}
	

	@Test(priority = 35)
	public void validate_dp_203page_Title() {
		coursespage.dp_203();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Azure Data Analytics Online Training | DP-200 & DP-201");

	}

	@Test(priority = 36)
	public void validate_awspage_Title() {
		coursespage.aws();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "AWS Online Training and Certification");
	}

	@Test(priority = 37)
	public void validate_devopsExpertMicroservicespage_Title() {
		coursespage.devopsExpertMicroservices();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "DevopsExpertPlus");

	}

	@Test(priority = 38)
	public void validate_az_400page_Title() {
		coursespage.az_400();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Azure DevOps Online Training| Best AZ-400 Azure DevOps Training");
	}

	@Test(priority = 39)
	public void validate_dockerpage_Title() {
		coursespage.docker();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Docker Online Training & Tutorial | Docker Online Training");

	}

	@Test(priority = 40)
	public void validate_kubernetespage_Title() {
		coursespage.kubernetes();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Kubernetes Online Training | Kubernetes Courses");

	}

	@Test(priority = 41)
	public void validate_dockerandKubernetespage_Title() {
		coursespage.dockerandKubernetes();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Docker and Kubernetes Online Training for beginners | learn docker + Kubernetes Online");

	}

	@Test(priority = 42)
	public void validate_iacUsingTerraformpage_Title() {
		coursespage.iacUsingTerraform();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Terraform Online Training | Best Terraform Training ");

	}

	@Test(priority = 43)
	public void validate_powershellpage_Title() {
		coursespage.powershell();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "PowerShell Training");

	}

	@Test(priority = 44)
	public void validate_msPowerPlatform_premiumpage_Title() {
		coursespage.msPowerPlatform_premiun();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "NewPowerPlatform");

	}

	@Test(priority = 45)
	public void validate_msPowerplatform_newpage_Title() {
		coursespage.msPowerplatform_new();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Pl-100 & Pl-200");

	}

	@Test(priority = 46)
	public void validate_da_100page_Title() {
		coursespage.da_100();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "DA-100 Online training | Exam:DA-100 Online training ");

	}

	@Test(priority = 47)
	public void validate_testing_toolspage_Title() {
		coursespage.testing_tools();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Software Testing Online Training | Manual Testing Online Training");

	}

	@Test(priority = 48)
	public void validate_manualTestingpage_Title() {
		coursespage.manualTesting();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Manual Testing Training");

	}

	@Test(priority = 49)
	public void validate_seleniumWithJAVApage_Title() {
		coursespage.seleniumWithJAVA();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Selenium and Manual Testing Training");

	}

	@Test(priority = 50)
	public void validate_seleniumWithCSharppage_Title() {
		coursespage.seleniumWithCSharp();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Selenium with C# online tutorial | Selenium Testing Training ");

	}

	@Test(priority = 51)
	public void validate_pythonProgrammingpage_Title() {
		coursespage.pythonProgramming();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Python Training");

	}

	@Test(priority = 52)
	public void validate_CandDataStructurepage_Title() {
		coursespage.CandDataStructure();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "C Programming for Beginners  | Learn Online C Programming | Bestdotnettraining");

	}

	@Test(priority = 53)
	public void validate_coreJAVApage_Title() {
		coursespage.coreJAVA();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Java Online Training for Beginners | core Java Online Training by Expert");    

	}

	
	@Test(priority = 54)
	public void validate_oopsAndCpluspluspage_Title() {
		coursespage.oopsAndCplusplus();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Best C++ Online Training | OOPs  Online Tutorials");    

	}
	
	@Test(priority = 55)
	public void validate_advanceJAVApage_Title() {
		coursespage.advanceJAVA();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Advance Java Online Training | Corporate Java Training | Bestdotnettraining");    
	}


	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
