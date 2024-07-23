package com.Bdt.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Bdt.qa.Utils.TestUtility;

public class Basepage {

	public static WebDriver driver;
	public static Properties properties;

	public Basepage() { 
		properties = new Properties();

		File propertiesFile = new File(
				"C:\\Users\\UmaMaheswari\\Downloads\\Maven projects\\Maven projects\\BdtAutomation.pom\\src\\main\\java\\com\\Bdt\\qa\\config\\config.properties");

		try {
			FileInputStream fileInputStream = new FileInputStream(propertiesFile);
			properties.load(fileInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WebDriver initializeBrowserAndOpenApplication(String browsername) {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();

		}

		else if (browsername.equals("edge")) {

			driver = new EdgeDriver();
		}

		else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtility.PAGE_LOADOUT_TIME));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtility.IMPLICIT_TIMEOUT));

		// open the application

		driver.get(properties.getProperty("url"));
		
		return driver;

	}

}
