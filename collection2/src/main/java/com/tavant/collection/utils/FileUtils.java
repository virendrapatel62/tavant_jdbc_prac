package com.tavant.collection.utils;

import java.io.InputStream;
import java.util.Properties;


public class FileUtils {
	private static FileUtils fileUtils;

	private FileUtils() {

	}

	public static FileUtils getInstance() {
		if (fileUtils != null) {
			synchronized (FileUtils.class) {
				if (fileUtils != null) {
					fileUtils = new FileUtils();
				}
			}
		} else {
			fileUtils = new FileUtils();
		}

		return fileUtils;
	}

	public Properties getProperties() {
		Properties properties = new Properties();
		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties")) {

			if (inputStream == null) {
				System.out.println("File is not Available");
			} else {
				properties.load(inputStream);
				return properties;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties;
	}
}
