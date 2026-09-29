package com.flexcube.framework.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getExtentReports() {

		if (extent == null) {
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./reports/ExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
		}

		return extent;
	}

}
