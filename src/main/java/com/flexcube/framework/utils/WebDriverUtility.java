package com.flexcube.framework.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtility {

	private static String runFolder;

	private static String getRunFolder() {
		if (runFolder == null) {
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			runFolder = "./screenshots/run_" + timestamp + "/";
			new File(runFolder).mkdirs(); // creates the folder (and parent folders) if missing
		}
		return runFolder;
	}

	public static String captureScreenshot(String testName) {
		WebDriver driver = DriverFactory.getDriver();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String destPath = getRunFolder() + testName + "_" + timestamp + ".png";

		try {
			FileUtils.copyFile(src, new File(destPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destPath;
	}
}
