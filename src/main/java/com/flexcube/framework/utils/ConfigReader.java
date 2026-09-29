package com.flexcube.framework.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties properties;

	static {
		try {
			properties = new Properties();

			FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
			properties.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
