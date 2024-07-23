package com.Bdt.qa.Listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Bdt.qa.Utils.ExtentReporters;
import com.Bdt.qa.Utils.Screenshots;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyListeners implements ITestListener {
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	public String testname;

	@Override
	public void onStart(ITestContext context) {

		extentReports = ExtentReporters.generateExtentReports();

	}

	@Override
	public void onTestStart(ITestResult result) {
		testname = result.getName();
		extentTest = extentReports.createTest(testname);
		extentTest.log(Status.INFO, testname + " -----   gets started execution");

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		extentTest = extentReports.createTest(testname);
		extentTest.log(Status.PASS, testname + " ----- got  execution successfully");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		extentTest = extentReports.createTest(testname);

		WebDriver driver = null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (NoSuchFieldException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		}
		
		 String destinationScreenshotpath =Screenshots.captureScreenshots(driver, testname);

		extentTest.addScreenCaptureFromPath(destinationScreenshotpath);

		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL, testname + " ----- got  failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		extentTest = extentReports.createTest(testname);

		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.SKIP, testname + "got skipped");

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
		//auto-launching the extent report i.e., automatically opening the extent report on desktop
		
		try {
			
			
			Desktop.getDesktop().browse(new File("D:\\java works\\Maven projects\\BdtAutomation.pom\\extentreports").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
