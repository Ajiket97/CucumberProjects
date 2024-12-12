package com.aas.utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public WebDriver driver;
	public WebDriverWait wait;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public WebElement waitForElementToBeVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementToBeClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement waitForElementPresence(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void waitForAlert() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public boolean waitForElementToBeSelected(By locator) {
		return wait.until(ExpectedConditions.elementToBeSelected(locator));
	}
}
