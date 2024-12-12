package com.aas.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.aas.customeexceptions.InvalidBrowserExeption;
import com.aas.utilities.Config;



public class TestBase {
	public WebDriver driver;
	Config config;

	public WebDriver setUp() throws Exception {
		config = new Config();

		if (config.getBrowser().equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--disable-notifications");
			driver = new ChromeDriver(chromeOptions);
		} else if (config.getBrowser().equalsIgnoreCase("firefox")) {
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--start-maximized");
			firefoxOptions.addArguments("--disable-notifications");
			driver = new FirefoxDriver(firefoxOptions);
		} else {
			throw new InvalidBrowserExeption(config.getBrowser());
		}

		driver.get(config.launchUrl());
		return driver;
	}

	
}
