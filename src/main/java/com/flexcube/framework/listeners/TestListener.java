package com.flexcube.framework.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.flexcube.framework.reports.ExtentManager;
import com.flexcube.framework.utils.WebDriverUtility;

public class TestListener implements ITestListener {

	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {

		test = ExtentManager.getExtentReports().createTest(result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentManager.getExtentReports().flush();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String path = WebDriverUtility.captureScreenshot(result.getName());
		test.pass("Test passed");
		test.addScreenCaptureFromPath(path);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String path = WebDriverUtility.captureScreenshot(result.getName());
		test.fail("Test failed: " + result.getThrowable());
		test.addScreenCaptureFromPath(path);
	}

}
