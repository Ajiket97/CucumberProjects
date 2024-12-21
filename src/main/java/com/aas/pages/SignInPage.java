package com.aas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aas.utilities.WaitUtility;

public class SignInPage {
	public WebDriver driver;
	public WaitUtility waitUtility;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		this.waitUtility = new WaitUtility(driver);
	}

	By signInBtn = By.xpath("//button[text() = 'Sign in']");
	By emailTxt = By.xpath("//input[@name=\"email\"]");
	By continueBtn = By.xpath("//button[text() = 'Continue']");
	By pwdTxt = By.xpath("//input[@name=\"password\"]");
	By sInCheckBox = By.xpath("//span[contains(text(),'Keep me')]");
	By logInBtn = By.xpath("//button[text() = 'Log in']");

	public void clickOnSignInBtn() {
		WebElement element = waitUtility.waitForElementToBeClickable(signInBtn);
		element.click();
	}

	public void enterEmail(String object) {
		WebElement element = waitUtility.waitForElementToBeVisible(emailTxt);
		element.sendKeys(object);

	}

	public void clickOnContinueBtn() {
		WebElement element = waitUtility.waitForElementToBeClickable(continueBtn);
		element.click();

	}

	public void enterPwd(String object) {
		WebElement element = waitUtility.waitForElementToBeVisible(pwdTxt);
		element.sendKeys(object);

	}

	public void clickOnSignInCheckBox() {
		WebElement element = waitUtility.waitForElementToBeClickable(sInCheckBox);
		element.click();

	}

	public void clickOnLogInBtn() {
		WebElement element = waitUtility.waitForElementToBeClickable(logInBtn);
		element.click();

	}

	public String getLandinPageTitle() {
		return driver.getTitle();
	}

	
}
