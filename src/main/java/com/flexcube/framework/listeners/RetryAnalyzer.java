package com.flexcube.framework.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult arg0) {
		System.out.println("The retry analyser starts");
		int count = 0, max = 2;
		if (count < max) {
			count++;
			return true;
		}
		System.out.println("The retry analyser ends");
		return false;
	}

}
