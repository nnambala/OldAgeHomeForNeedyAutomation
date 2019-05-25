package com.sforce.oldAgeHomeAutomation.testutils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.ehoffman.testing.fixture.FixtureContainer;
import org.ehoffman.testng.extensions.Fixture;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sforce.cd.kumonium.extensions.testng.SalesforceEnforcer;
import com.sforce.cd.kumonium.extensions.webdriver.KumoniumWebDriverExtension;

public class TestBase {

	public static WebDriver driver = null;
	public static String siteName = null;
	public static String userid = null;
	public static String pass = null;
	public static String type = null;
	public static String testNGFileName = null;
	private String webDriverType = null; 

	protected final static Logger logger = LoggerFactory.getLogger(TestBase.class);

	/**
	 * Constructor
	 */
	public TestBase() {

		try {
			loadSystemProperties();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Method to set System properties
	 * 
	 * @throws IOException
	 */
	public void loadSystemProperties() throws IOException {

		testNGFileName = System.getProperty("suiteXmlFile");
		siteName = System.getProperty("salesForce.SiteName");

	}
	
	@BeforeClass
	public WebDriver browserLaunch(String siteName) {
        	navigateToUrl(siteName);
        return driver;
    }
	
	/**
	 * Method to navigate to the given URL
	 * @param siteName
	 * @throws Exception
	 */
	  public void navigateToUrl(String siteName) {
		  		driver.manage().window().maximize();
		  		driver.get(siteName);

	        } 

}
