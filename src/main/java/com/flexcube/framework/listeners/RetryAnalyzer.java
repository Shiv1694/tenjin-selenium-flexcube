package com.flexcube.framework.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult arg0) {

		int count = 0, max = 2;
		if (count < max) {
			count++;
			return true;
		}
		return false;
	}

}
