package com.Bdt.qa.Utils;

import java.io.File;
import java.util.Date;

import com.Bdt.qa.Base.Basepage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporters extends Basepage{
	
	public static ExtentReports generateExtentReports() {
		
		ExtentReports extentreports = new ExtentReports();
		
		Date date = new Date();
		
		String filename  = date.toString().replaceAll(" " , "_").replaceAll(":", "_");
		
		File Filepath =  new File(System.getProperty("user.dir")+"\\extentreports\\extent"+filename+".html");
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(Filepath);
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setReportName("BDT AUTOMATION");
		sparkReporter.config().setDocumentTitle("Bdt Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentreports.attachReporter(sparkReporter);
		extentreports.setSystemInfo("Project Name", "BdtAutomation.pom");
		extentreports.setSystemInfo("Author", "Uma Maheswari");		
		extentreports.setSystemInfo("Application URL", properties.getProperty("url"));
		extentreports.setSystemInfo("Browser Name", properties.getProperty("browser"));
		extentreports.setSystemInfo("Operating system", System.getProperty("os.name"));
		extentreports.setSystemInfo("Java Version", System.getProperty("java.version"));
		
		return extentreports;
		
		
		
		
	}
	
	

}
