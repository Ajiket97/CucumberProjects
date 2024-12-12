package com.aas.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	private String fPath;

	public PropUtil(String path) {
		this.fPath = path;
	}

	FileInputStream fis = null;

	public String readPropertyFile(String filePath, String key) {
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);

	}
}
