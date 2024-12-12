package com.aas.stepdefinations;

import com.aas.base.TestContextSetUp;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	TestContextSetUp testContextSetup;

	public Hooks(TestContextSetUp tcs) {
		this.testContextSetup = tcs;

	}

	@Before
	public void beforeScenario() {

		System.out.println("Executing Before Scenario");
	}

	@After
	public void afterScenario() {

		System.out.println("Executing After Scenario");
		if (testContextSetup.testBase.driver != null) {
			testContextSetup.testBase.driver.quit();
		}
	}
}
