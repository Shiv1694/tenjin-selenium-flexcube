package com.flexcube.framework.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.flexcube.framework.utils.ConfigReader;
import com.flexcube.framework.utils.DriverFactory;

public class BaseTest {

	@BeforeMethod
	public void setUp() {

		String browser = ConfigReader.getProperty("browser");
		DriverFactory.initDriver(browser);

		String url = ConfigReader.getProperty("url");
		DriverFactory.getDriver().get(url);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.tearDown();
	}
}
