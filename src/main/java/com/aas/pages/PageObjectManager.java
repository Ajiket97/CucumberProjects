package com.aas.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public HomePage hp;
	public SignInPage sip;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public void getHomePage() {
		hp = new HomePage(driver);

	}

	public SignInPage getSignInPage() {
		return sip = new SignInPage(driver);

	}
}
