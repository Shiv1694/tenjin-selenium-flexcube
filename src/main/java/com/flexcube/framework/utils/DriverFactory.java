package com.flexcube.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static void initDriver(String BrowserName) {

		WebDriver webDriver = null;

		switch (BrowserName.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			driver.set(webDriver);
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			webDriver = new EdgeDriver();
			webDriver.manage().window().maximize();
			driver.set(webDriver);
			break;
		default:
			throw new IllegalArgumentException("Browser not supported: " + BrowserName);
		}

	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void tearDown() {
		getDriver().quit();
		driver.remove();
	}

}
