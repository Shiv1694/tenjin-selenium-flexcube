package com.flexcube.framework.utils;

public class JavaUtils {

	public static String generateRandomString(int length) {
		String randomName = java.util.UUID.randomUUID().toString().substring(0, length);
		return randomName;
	}
}
