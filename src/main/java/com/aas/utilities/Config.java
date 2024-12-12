package com.aas.utilities;

public class Config {
	public String readPropFile(String key) {
		String baseDir = System.getProperty("user.dir");
		String filePath = baseDir + "/src/main/resources/config.properties";

		PropUtil pu = new PropUtil(filePath);
		return pu.readPropertyFile(filePath, key);

	}

	public String getBrowser() {
		return readPropFile("BrowserName");

	}

	public String launchUrl() {
		return readPropFile("URL");

	}
}
